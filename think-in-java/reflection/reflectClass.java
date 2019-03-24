package reflection;

import java.lang.reflect.Field;

public class reflectClass {

	public static <T> void main(String[] args) throws ClassNotFoundException {
		Class classTest = Class.forName("reflection.User");

		Field[] field = classTest.getDeclaredFields();

		for (Field fielTest : field) {
			System.out.println(fielTest.getName());
		}
	}

}
