
import java.util.*;

public class UserRunerMap  {
    public  void run() {
        Map<String, User> users= new HashMap<String, User>();
        users.put("1",new User(7, "seven" ));
        users.put("2",new User(8, "eight" ));
        users.put("3",new User(7, "seven" ));

        for (Map.Entry<String,User> user : users.entrySet()) {
            System.out.println(user);
            
        }
        System.out.println("List created by Map ");
    }
    

    
}
