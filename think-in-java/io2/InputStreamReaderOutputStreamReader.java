package io2;

import java.io.*;
import java.nio.charset.Charset;  

public class InputStreamReaderOutputStreamReader
{  
    public static void main(String[] args) throws Exception
    {
        InputStream inputStream = new FileInputStream("C:\\Users\\yy263\\Desktop\\think in java\\test_output.txt");
        /*
         * InputStreamReader(InputStream in) 
         * Creates an InputStreamReader that uses the default charset. 
         * 在字节型输入流之上包裹一层字符型输入流
        */
        //Charset.defaultCharset();
        
        //System.out.println(Charset.defaultCharset());
        Reader reader = new InputStreamReader(inputStream);
        /*
         * read() 
         * Reads a single character. 
        */
        int data = reader.read();
        while(data != -1)
        { 
            char theChar = (char) data;
            System.out.print(theChar);
            data = reader.read();
        } 
        reader.close(); 
        
        
        OutputStream outputStream = new FileOutputStream("C:\\Users\\yy263\\Desktop\\think in java\\test_output.txt");
        /*
         * OutputStreamWriter(OutputStream out) 
         * Creates an OutputStreamWriter that uses the default character encoding. 
         * 在字节型输出流之上包裹一层字符型输出流
        */
        Writer writer = new OutputStreamWriter(outputStream);
        /*
         * write(String str, int off, int len) 
         * Writes a portion of a string. 
        */
        writer.write("Hello World");

        writer.close();
    }
}