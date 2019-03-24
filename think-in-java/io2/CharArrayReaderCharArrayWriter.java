package io2;

import java.io.*;

/**
 * 
 * CharArrayReader
 * ���ַ�����������������ByteArrayInputStream���ƣ�ֻ����ByteArrayInputStream���ֽ���������������CharArray���ַ�������������CharArrayReader
 * �����ڶ�ȡ�ַ����飬���̳���Reader�����������������ַ�Ϊ��λ
 *
 */
public class CharArrayReaderCharArrayWriter {
	public static void main(String[] args) throws Exception {
		char a = 'a';
		char b = 'b';
		char c = 'c';
		/*
		 * CharArrayWriter() Creates a new CharArrayWriter.
		 */
		CharArrayWriter carrWrt = new CharArrayWriter();
		/*
		 * write(int c) Writes a character to the buffer.
		 */
		carrWrt.write(a);
		carrWrt.write(b);
		carrWrt.write(c);
		/*
		 * toCharArray() Returns a copy of the input data.
		 */
		char[] buff = carrWrt.toCharArray();
		for (int i = 0; i < buff.length; i++) {
			System.out.println(buff[i]);
		}
		System.out.println("***********************");

		/*
		 * CharArrayReader(char[] buf) Creates a CharArrayReader from the
		 * specified array of chars.
		 */
		CharArrayReader carrRed = new CharArrayReader(buff);
		/*
		 * read() Reads the next byte of data from this input stream.
		 */
		int data;
		while ((data = carrRed.read()) != -1) {
			System.out.println(data);
		}
	}
}