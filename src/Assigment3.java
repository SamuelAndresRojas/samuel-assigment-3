import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assigment3 {

	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {

		User[] users = new User[4];
		UserService userService = new UserService();
		BufferedReader fileReader = null;
		String txt;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome");

		fileReader = new BufferedReader(new FileReader("data.txt"));

			while ((txt = fileReader.readLine()) != null) {
				
			}
			
			int i = 0;
			int tries = 0;
			while (tries < 2) {
				
				String[] values = txt.split(",");
				User user = userService.createUser(values[0], values[1], values[2]);
				users[i] = user;
				i++;
				System.out.println("Enter your Email:");
				String emailInput = scanner.nextLine();
				System.out.println("Enter your Password:");
				String passwordInput = scanner.nextLine();
						
				if (emailInput.equalsIgnoreCase(values[0]) && passwordInput.equals(values[1])) {
					System.out.println("Welcome: " + values[2]);
				} else {
					System.out.println("Invalid login, please try again");
					tries++;

				}
			}
			if (tries == 2) {
				System.out.println("Too many failed login attempts, you are now locked out.");
			}

		}

	}
