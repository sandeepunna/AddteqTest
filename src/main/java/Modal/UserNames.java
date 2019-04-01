package Modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class UserNames {
	public UserNames() {
		  
    }
	private String name;
	private String username;
	
	public UserNames(String name, String username) {
        this.name = name;
        this.username = username;
        
   }

	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "username", nullable = false)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
    public String toString() {
        return "UserNames [ name=" + name + ", username=" + username + 
        "]";
    }
	
	
}
