import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assigment3 {

	public static void main(String[] args) {
			
		BufferedReader fileReader = null;
		String txt = "";
		
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			
			while((txt = fileReader.readLine()) != null){
//				System.out.println(txt);
				
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
