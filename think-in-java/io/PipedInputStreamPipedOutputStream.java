package io;

import java.io.*;  

public class PipedInputStreamPipedOutputStream
{  
    public static void main(String[] args) throws Exception
    {
        /*
         * PipedInputStream() 
         * Creates a PipedInputStream so that it is not yet connected. 
        */
        PipedInputStream pin = new PipedInputStream();  
        PipedOutputStream pout = new PipedOutputStream();  
        /*
         * connect(PipedOutputStream src) 
         * Causes this piped input stream to be connected to the piped output stream src. 
         * 输入流与输出流连接  
        */
        pin.connect(pout); 
          
        ReadThread readTh   = new ReadThread(pin);  
        WriteThread writeTh = new WriteThread(pout);  
        new Thread(readTh).start();  
        new Thread(writeTh).start();  
    } 
    
    public static void sop(Object obj) //打印  
    {  
        System.out.println(obj);  
    }  
}
 

class ReadThread implements Runnable  
{  
    private PipedInputStream pin;  
    ReadThread(PipedInputStream pin)   //  
    {  
        this.pin=pin;  
    }  
    
    //由于必须要覆盖run方法,所以这里不能抛,只能try 
    public void run()  
    {  
        try  
        {  
            sop("R:读取前没有数据,阻塞中...等待数据传过来再输出到控制台...");  
            byte[] buf = new byte[1024];  
            int len = pin.read(buf);  //read阻塞  
            sop("R:读取数据成功,阻塞解除...");  
        
            String s= new String(buf,0,len);  
            sop(s);    //将读取的数据流用字符串以字符串打印出来  
            pin.close();       
        }  
        catch(Exception e)  
        {  
            throw new RuntimeException("R:管道读取流失败!");  
        }     
    }  
    
    public static void sop(Object obj) //打印  
    {  
        System.out.println(obj);  
    }  
}  
  
class WriteThread implements Runnable  
{  
    private PipedOutputStream pout;  
    WriteThread(PipedOutputStream pout)  
    {  
        this.pout=  pout;  
    }  
    
    public void run()  
    {  
        try  
        {  
            sop("W:开始将数据写入:但等个5秒让我们观察...");  
            Thread.sleep(5000);  //释放cpu执行权5秒  
            /*
             * write(int b) 
             * Writes the specified byte to the piped output stream. 
             * 向管道写入数据，同时解除管道上的阻塞状态
            */
            pout.write("W: writePiped 数据...".getBytes());    
            pout.close();  
        }  
        catch(Exception e)  
        {  
            throw new RuntimeException("W:WriteThread写入失败...");  
        }  
    }  
    //打印 
    public static void sop(Object obj)  
    {  
        System.out.println(obj);  
    }  
}