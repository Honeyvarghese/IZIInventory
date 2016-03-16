/**
 * 
 */
package utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * @author Honey Varghese
 * Utility class for file operations
 */
public class FileOperations {

	/**
	 * All members are static
	 */
	private FileOperations() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param path
	 * @param lines
	 * @throws IOException
	 * Writes the content in lines
	 */
	public static void writeFile(String path, List<String> lines) throws IOException{
		FileUtils.writeLines(new File(path), lines);
	}
	
	/**
	 * @param path
	 * @return
	 * @throws IOException
	 * Reads the file specified in the path.
	 */
	public static List<String> readFile(String path) throws IOException{
		return FileUtils.readLines(new File(path));
	}

}
