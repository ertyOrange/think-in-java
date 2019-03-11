package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import java.io.FileOutputStream;
 
public class ZipInputStreamZipOutputStream
{  
    public static void main(String[] args) throws Exception
    {
        // ����Ҫѹ�����ļ�
        File file = new File("C:" + File.separator + "in.txt");    
        // ����ѹ���ļ�����
        File zipFile = new File("C:" + File.separator + "in.zip"); 
        /*
         * FileInputStream(File file) 
         * Creates a FileInputStream by opening a connection to an actual file, the file named by the File object file in the file system.
         * �����ļ��������� 
        */
        InputStream input = new FileInputStream(file);
        // ����ѹ��������
        ZipOutputStream zipOut = null;    
        /*
         * ZipOutputStream(OutputStream out) 
         * Creates a new ZIP output stream.
         * �ٴ�������Java���������ܹ��е�"װ�������ģʽ"��ǿ��֮�������ǿ��Ը������ǶԹ��ܵ�
         * ��Ҫ������ϡ�����������Ҫ��������ͨ�׵Ļ���˵�������ǲ�������һ��
        */
        zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
        /*
         * putNextEntry(ZipEntry e) 
         * Begins writing a new ZIP file entry and positions the stream to the start of the entry data. 
         * ����ZipEntry����
        */
        zipOut.putNextEntry(new ZipEntry(file.getName()));     
        int temp = 0;
        /*
         * read() 
         * Reads a byte of data from this input stream. 
         * ���ļ����ж�ȡ����
        */
        while((temp = input.read()) != -1)
        {    
            // ѹ�����
            zipOut.write(temp);    
        }
        // �ر�������
        input.close();    
        // �ر������
        zipOut.close();    
        
         
        // read zip file as input stream
        InputStream is= new FileInputStream("C:" + File.separator + "in.zip");
        //zip is read by ZipInputStream
        ZipInputStream zis= new ZipInputStream(is);
        // now write zip file in extracted file
        ZipEntry ze;
        byte[] buff = new byte[1024];
        /*
         * getNextEntry() 
         * Reads the next ZIP file entry and positions the stream at the beginning of the entry data. 
        */
        while((ze = zis.getNextEntry()) != null)
        {
            // get file name
            FileOutputStream fos= new FileOutputStream("C:" + File.separator + "out.txt");
            int l=0;
            // write buffer to file
            while((l = zis.read(buff)) > 0)
            {
                fos.write(buff,0, l);
            }
        }
        zis.close();
    }
}