package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AddteqTest.ReadUsersFromFile;

import Modal.UserNameRepository;
import Modal.UserNames;

@RestController
@RequestMapping("/api/v1")
public class UsernameController {
	@Autowired
	private UserNameRepository usernamerepoistry;
	
	@GetMapping("/usernames")
    public List<UserNames> getAllEmployees() {
        return usernamerepoistry.findAll();
    }

	

}