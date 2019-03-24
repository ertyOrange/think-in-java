package io2;

import java.io.*;

/**
 * 
 * 和BufferedInputStream、BufferedOutputStream不同的是，
 * 
 * BufferedReader、BufferedWriter提供了ReadLine、newLine()这种以行为单位的字符读写机制
 * 
 * @author yy263
 *
 */
public class BufferedReaderBufferedWriter {
	public static void main(String[] args) throws Exception {
		/*
		 * FileReader(String fileName) Creates a new FileReader, given the name
		 * of the file to read from.
		 */
		Reader reader = new FileReader("C:\\Users\\yy263\\Desktop\\think in java\\test_output.txt");
		/*
		 * BufferedReader(Reader in) Creates a buffering character-input stream
		 * that uses a default-sized input buffer. 在Reader之上再包一层Buffer缓冲区的功能
		 */
		BufferedReader brd = new BufferedReader(reader);

		String data = brd.readLine();
		while (data != null) {
			System.out.print(data);
			data = brd.readLine();
		}
		brd.close();
		reader.close();

		Writer writer = new FileWriter("C:\\Users\\yy263\\Desktop\\think in java\\test_output.txt");
		/*
		 * BufferedWriter(Writer out) Creates a buffered character-output stream
		 * that uses a default-sized output buffer.
		 */
		BufferedWriter bwd = new BufferedWriter(writer);
		/*
		 * write(String s, int off, int len) Writes a portion of a String.
		 */
		bwd.write("Hello World");
		/*
		 * newLine() Writes a line separator.
		 */
		bwd.newLine();
		bwd.close();
		writer.close();
	}
}