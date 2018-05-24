import java.util.LinkedList;
import java.util.List;

public class UserRunnerLinkedList implements UserRunner {


    private List< User> users= new LinkedList<User>();

        public  void addUsers() {
            users.add(new User(1, "LinkedList"));
        }

        public  void removeUsers() {
            users.remove(new User(1, "LinkedList"));}

        public void printUsers () {
            System.out.println();
            for (int i = 0; i < (users.size() - (users.size() - 5)); i++) {
                System.out.println(users.get(i));
            }
            System.out.println();
            System.out.println("List created by LinkedList");
        }

}
