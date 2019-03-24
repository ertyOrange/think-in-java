package io2;

import java.io.*;  

public class FileReaderFileWriter
{  
    public static void main(String[] args) throws Exception
    {
        /*
         * FileReader(String fileName)
         * Creates a new FileReader, given the name of the file to read from. 
        */
        Reader reader = new FileReader("C:\\Users\\yy263\\Desktop\\think in java\\test_output.txt"); 
        int data = reader.read();
        while(data != -1) 
        { 
            char theChar = (char) data;
            System.out.print(theChar);
            data = reader.read();
        }
        reader.close();
        
        
        Writer writer = new FileWriter("C:\\Users\\yy263\\Desktop\\think in java\\test_output.txt"); 
        writer.write("Hello World"); 
        writer.close();
    }
}
