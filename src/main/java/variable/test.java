package variable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class test {
	public static String getData(String key) {
		Properties p = new Properties();
		File file = new File(System.getProperty("user.dir") + "\\CropAI.properties");
		FileReader filereader = null;
		try {
			filereader = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			p.load(filereader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p.getProperty(key);
	}
}
