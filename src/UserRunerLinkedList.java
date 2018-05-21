import java.util.LinkedList;
import java.util.List;

public class UserRunerLinkedList implements UserRunner {
    public  void run() {

        List< User> users= new LinkedList<User>();
        users.add(new User("3", "three" ));
        users.add(new User("4", "four" ));
        users.add(new User("3", "three" ));

        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("List created by LinkedList");

    }
    

    
}
