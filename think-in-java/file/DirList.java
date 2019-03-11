/**
 * 
 */
/**
 * @author yy263
 *
 */
package file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {

	public static void main(String[] args) {
		File path = new File("C://Users//yy263//Desktop//think in java//i.o");
		
		//String[] list = path.list(new DirFilter(args[0]));
		String[] list = path.list(new DirFilter(".*"));
		
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		
		for (String dirItem : list) {

			System.out.println(dirItem);
		}
	}

	public static class DirFilter implements FilenameFilter {

		private Pattern pattern;

		public DirFilter(String regex) {
			super();
			this.pattern = Pattern.compile(regex);
		}

		@Override
		public boolean accept(File dir, String name) {
			return pattern.matcher(name).matches();
		}
	}
}