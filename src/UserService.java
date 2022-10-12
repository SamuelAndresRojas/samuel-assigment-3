import java.io.IOException;

public class UserService {
	
	public User validateUser(String username, String password) throws IOException {
		DataToArray userArray = new DataToArray();
		for (User user : userArray.dataArray()) {
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

}