
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataToArray {

		
		public User[] dataArray() throws IOException {
			
			User[] users = new User[4];

			BufferedReader dataReader = null;
			try {
				dataReader = new BufferedReader(new FileReader("data.txt"));
				String info;
				int i = 0;
				while ((info = dataReader.readLine()) != null) {
					users[i] = new User(info.split(","));
					i = i + 1;
				}
			} finally {
				if (dataReader != null) 
					dataReader.close();
			}
			return users;
		}
	}