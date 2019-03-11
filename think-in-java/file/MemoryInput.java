package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {

	public static void main(String[] args) throws IOException {
		StringReader in=	new StringReader(
		BufferedInputFile.read("MemoryInput.java"));
		
		int c;
		
		while((c=in.read())!=-1){
			System.out.println(c);
		}

	}
	
	public static class BufferedInputFile {
		  // Throw exceptions to console:
		  public static String
		  read(String filename) throws IOException {
		    // Reading input by lines:
		    BufferedReader in = new BufferedReader(
		      new FileReader(filename));
		    String s;
		    StringBuilder sb = new StringBuilder();
		    while((s = in.readLine())!= null)
		      sb.append(s + "\n");
		    in.close();
		    return sb.toString();
		  }
		  public static void main(String[] args)
		  throws IOException {
		    System.out.print(read("BufferedInputFile.java"));
		  }
		} /* (Execute to see output) *///:~
	

}
