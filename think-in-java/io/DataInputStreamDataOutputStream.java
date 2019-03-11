package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class DataInputStreamDataOutputStream
{  
    public static void main(String[] args) throws Exception
    {
        writeDemo();
        readDemo();
    }
    
    public static void readDemo() throws IOException 
    {
        DataInputStream dos = new DataInputStream(new FileInputStream("C:\\Users\\yy263\\Desktop\\think in java\\test_input.txt"));
        String s = dos.readUTF();
        System.out.println(s);        
    }

    public static void writeDemo() throws IOException 
    {
        /*
         * DataOutputStream(OutputStream out) 
         * Creates a new data output stream to write data to the specified underlying output stream. 
        */
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\yy263\\Desktop\\think in java\\test_input.txt"));
        /*
         * writeUTF(String str) 
         * Writes a string to the underlying output stream using modified UTF-8 encoding in a machine-independent manner.
        */
        dos.writeUTF("ÄãºÃ°¡");//UTF-8ÐÞ¸Ä°æ         
    }
}