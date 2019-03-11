package io;

import java.io.*; 
public class BufferedInputStreamBufferedInputStream
{  
    public static void main(String[] args) throws Exception
    {
        File filein = new File("C:/1.png");
        File fileout = new File("C:/out.png");
        try 
        {
            //ǰ��˵����File�������������ݵ������������ר��������������ļ���Ŀ¼
            if (fileout.exists() == false) 
            { 
                fileout.createNewFile();
            }
            //Ҫʹ���ļ�������ȻҪʹ���ļ���ȡ������
            FileInputStream in = new FileInputStream(filein);
            FileOutputStream out = new FileOutputStream(fileout);
            byte[] b = new byte[1];
            //���ļ��������һ�㻺������ȡ����
            BufferedInputStream bin = new BufferedInputStream(in);
            BufferedOutputStream bout = new BufferedOutputStream(out);
            //�����ȡ������д��
            while (bin.read(b) != -1)
            {
                bout.write(b);
            }
            bout.close();
            bin.close();
            out.close();
            in.close();
        } 
        catch (Exception e) 
        {
              e.printStackTrace();
        }
    }
}
