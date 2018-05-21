import java.util.HashSet;
import java.util.Set;

public class UserRunerSet implements UserRunner {
    public  void run() {
        Set<User> users=new HashSet<User>();

        users.add(new User("5", "five" ));
        users.add(new User("6", "six" ));
        users.add(new User("5", "five" ));

        for (User user : users) {
            System.out.println(user);
            
        }
        System.out.println("List created by Set ");
    }
    

    
}
