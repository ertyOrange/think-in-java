package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamFileOutputStream {

	public static void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\yy263\\Desktop\\..txt");
		// ���ļ���д��"Hello"�ַ���.
		try {
			// Ҫд�������ת�����ֽ�����
			byte[] buf = "Hello".getBytes();
			/*
			 * FileOutputStream(File file) Creates a file output stream to write
			 * to the file represented by the specified File object.
			 * ���1.txt����,��ɾ��1.txt���������,�ı��������ݱ�ΪHello
			 * ���1.txt������,���½�1.txt�ı�,д��Hello
			 */
			FileOutputStream out = new FileOutputStream(f);
			/*
			 * write(byte[] b) Writes b.length bytes from the specified byte
			 * array to this file output stream.
			 */
			out.write(buf);
			out.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		// ��ȡ�ļ��е�����
		try {
			/*
			 * FileInputStream(File file) Creates a FileInputStream by opening a
			 * connection to an actual file, the file named by the File object
			 * file in the file system.
			 */
			FileInputStream in = new FileInputStream(f);
			byte[] buf = new byte[1024];
			/*
			 * read(byte[] b) Reads up to b.length bytes of data from this input
			 * stream into an array of bytes. �����ж�ȡ����
			 */
			int len = in.read(buf);
			in.close();
			
			String str = new String(buf, 0, len);
			// ��ӡf�ļ�������.
			System.out.println(str);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
