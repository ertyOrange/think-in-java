package enumTest;

import java.lang.reflect.*;
import java.util.Set;
import java.util.TreeSet;

public class Reflection {
	public static Set<String > analyze(Class <?> enumClass){
	System.out.println("analyze" +enumClass+"----------");
	System.out.println("interfaces");
	
	for ( Type p:enumClass.getGenericInterfaces()) {
		System.out.println(enumClass.getSuperclass());
		System.out.println("methods");
	}
	
	Set<String> method =new TreeSet<String>();
	for (Method m:enumClass.getMethods()) 
		method.add(m.getName());
	return method;
	}
	
	public static void main (String [] args) {
		Set<String> exploreMethods =analyze(Explore.class);
		
		Set<String> enumMethods =analyze(Enum.class);
		
		System.out.println("explore.containAll(enum)"+exploreMethods.containsAll(enumMethods));
		System.out.println("explore.removeALL");
		exploreMethods.remove(enumMethods);
		System.out.println(exploreMethods);
		
		
		
		
	}
}
