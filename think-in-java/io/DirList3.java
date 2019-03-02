package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList3 {

	public static void main(String[] args) {
		File path = new File("C://Users//yy263//Desktop//think in java//i.o");
		// filter(".*")
		String[] list = path.list(
		new FilenameFilter() {
			private Pattern pattern = Pattern.compile(".*");
			@Override
			public boolean accept(File file, String name) {
				// TODO Auto-generated method stub
				return pattern.matcher(name).matches();
			}
		}

		);
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

		for (String dirItem : list) {

			System.out.println(dirItem);
		}
	}

}
