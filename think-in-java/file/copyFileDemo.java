package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class copyFileDemo {
	
	public static void main(String[] args) throws IOException {
		File  inPut=  new File("C:\\Users\\yy263\\Desktop\\think in java\\test_input.txt");
		
		File  outPut=  new File("C:\\Users\\yy263\\Desktop\\think in java\\test_output.txt");
		
		//select stream
		
		InputStream fileInPut =new FileInputStream(inPut);
		OutputStream fileOutPut =new FileOutputStream(outPut);
		
		byte [] flush = new byte[1024]; 
		
		int lenth=0;
		while(-1!=(lenth=fileInPut.read(flush))){
			fileOutPut.write(flush, 0, lenth);;
		}
		
		fileOutPut.flush();
		
		
		
		fileOutPut.close();
		fileInPut.close();
		
		BufferedInputStream bufferedInputStream =new BufferedInputStream(fileInPut);
		
		//bufferedInputStream.
		
	}
}
	
