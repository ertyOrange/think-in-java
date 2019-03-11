package file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2 {

	public static void main(String[] args) {
		File path = new File("C://Users//yy263//Desktop//think in java//i.o");

		String[] list = path.list(filter(".*"));

		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

		for (String dirItem : list) {

			System.out.println(dirItem);
		}
	}

	public static FilenameFilter filter(//final 
			String regex) {

		// create of anonymose inner class

		return new FilenameFilter() {
			private Pattern pattern = Pattern.compile(regex);

			@Override
			public boolean accept(File file, String name) {
				return pattern.matcher(name).matches();
			}

		};
	}
}
