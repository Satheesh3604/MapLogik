package seleniumEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {

	public static void main(String[] args) {
		// BufferWriterExample
		String location = "WritingExcelExample.txt";
		String enter = "satheesh3604@gmail.com";
		FileWriter fw;
		try {
			fw = new FileWriter(location);
			BufferedWriter bf = new BufferedWriter(fw);
			bf.write(enter);
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
