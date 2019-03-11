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
         * �����������������  
        */
        pin.connect(pout); 
          
        ReadThread readTh   = new ReadThread(pin);  
        WriteThread writeTh = new WriteThread(pout);  
        new Thread(readTh).start();  
        new Thread(writeTh).start();  
    } 
    
    public static void sop(Object obj) //��ӡ  
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
    
    //���ڱ���Ҫ����run����,�������ﲻ����,ֻ��try 
    public void run()  
    {  
        try  
        {  
            sop("R:��ȡǰû������,������...�ȴ����ݴ����������������̨...");  
            byte[] buf = new byte[1024];  
            int len = pin.read(buf);  //read����  
            sop("R:��ȡ���ݳɹ�,�������...");  
        
            String s= new String(buf,0,len);  
            sop(s);    //����ȡ�����������ַ������ַ�����ӡ����  
            pin.close();       
        }  
        catch(Exception e)  
        {  
            throw new RuntimeException("R:�ܵ���ȡ��ʧ��!");  
        }     
    }  
    
    public static void sop(Object obj) //��ӡ  
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
            sop("W:��ʼ������д��:���ȸ�5�������ǹ۲�...");  
            Thread.sleep(5000);  //�ͷ�cpuִ��Ȩ5��  
            /*
             * write(int b) 
             * Writes the specified byte to the piped output stream. 
             * ��ܵ�д�����ݣ�ͬʱ����ܵ��ϵ�����״̬
            */
            pout.write("W: writePiped ����...".getBytes());    
            pout.close();  
        }  
        catch(Exception e)  
        {  
            throw new RuntimeException("W:WriteThreadд��ʧ��...");  
        }  
    }  
    //��ӡ 
    public static void sop(Object obj)  
    {  
        System.out.println(obj);  
    }  
}