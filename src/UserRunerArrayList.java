import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRunerArrayList implements UserRunner  {
    public  void run() {
        List< User> users= new ArrayList<User>();
        users.add(new User("1", "first" ));
        users.add(new User("2", "second" ));
        users.add(new User("1", "first" ));

        for (User user : users) {
            System.out.println(user);
            
        }
        System.out.println("List created by ArrayList ");
    }
}
