package victor.first.domain;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public User getUserById() {
		return new User("jdoe", "John", "Doe", 13L);
	}
}
