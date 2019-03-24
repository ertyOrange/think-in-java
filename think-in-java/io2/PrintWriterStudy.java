package io2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * printwriter是向文本输出流打印对象的格式化表示形式，它允许以一种格式化的方式进行数据流的写入，类似C语言中的printf()函数
 *
 */
public class PrintWriterStudy {
	public static void main(String[] args) throws Exception {
		String filename = "C:\\Users\\yy263\\Desktop\\think in java\\test_output.txt";
		/*
		 * PrintWriter(Writer out) Creates a new PrintWriter, without automatic
		 * line flushing.
		 */
		PrintWriter pw = new PrintWriter(new FileWriter(filename));
		String[] words = new String[] { "hello", "world", "!" };

		for (int i = 0; i < words.length; i++) {
			/*
			 * format(String format, Object... args) Writes a formatted string
			 * to this writer using the specified format string and arguments.
			 */
			pw.format("words: %s\n", words[i]);
		}
		/*
		 * flush() Flushes the stream.
		 */
		pw.flush();
	}
}