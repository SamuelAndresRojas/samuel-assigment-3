import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assigment3 {

	public static void main(String[] args) throws IOException {
		
		User[] users = new User[4];
		UserService userService = new UserService();
		BufferedReader fileReader = null;
		String txt = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome");
		System.out.println("Enter your Email:");
		String emailInput = scanner.nextLine();
		System.out.println("Enter your Password:");
		String passwordInput = scanner.nextLine();

		fileReader = new BufferedReader(new FileReader("data.txt"));

		int i = 0;
		while ((txt = fileReader.readLine()) != null) {
			String[] values = txt.split(",");
			User user = userService.createUser(values[0], values[1], values[2]);
			
			users[i] = user;
			i++;
		}

	}

}
