package io;

import java.io.*; 

public class ByteArrayInputStreamByteArrayOutputStream
{  
    public static void main(String[] args) throws Exception
    {
        int a=0;
        int b=1;
        int c=2;
        /*
         * ByteArrayOutputStream() 
         * Creates a new byte array output stream.
        */
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        /*
         * write(int b) 
         * Writes the specified byte to this byte array output stream. 
        */
        bout.write(a);
        bout.write(b);
        bout.write(c);
        /*
         * toByteArray() 
         * Creates a newly allocated byte array. 
         * 返回内部保存的临时byte缓存数组
        */
        byte[] buff = bout.toByteArray();
        for(int i=0; i<buff.length; i++)
        {
            System.out.println(buff[i]);
        } 
        System.out.println("***********************");
        /*
         * ByteArrayInputStream(byte[] buf) 
         * Creates a ByteArrayInputStream so that it uses buf as its buffer array. 
        */
        ByteArrayInputStream bin = new ByteArrayInputStream(buff);
        /*
         * read() 
         * Reads the next byte of data from this input stream. 
        */
        while((b = bin.read()) != -1) 
        {
            System.out.println(b);
        }
    }
}