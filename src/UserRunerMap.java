
import java.util.*;

public class UserRunerMap implements UserRunner {
    public  void run() {
        //Set<User> users=new HashSet<User>();
        Map<String, User> users= new HashMap<String, User>();
        users.put("1",new User("7", "seven" ));
        users.put("2",new User("9", "eight" ));
        users.put("3",new User("7", "seven" ));

        for (Map.Entry<String,User> user : users.entrySet()) {
            System.out.println(user);
            
        }
        System.out.println("List created by Map ");
    }
    

    
}
