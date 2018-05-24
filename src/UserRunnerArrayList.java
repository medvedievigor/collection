import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class UserRunnerArrayList implements UserRunner  {

   private List< User> users= new ArrayList<User>();
    public  void addUsers() {
        users.add(new User(1, "ArrayList"));}

    public  void removeUsers() {
        users.remove(new User(1, "ArrayList"));}

    public void printUsers (){
        System.out.println();
        for (int i = 0; i < (users.size()-(users.size()-5)); i++) {
            System.out.println(users.get(i));
        }
        System.out.println();
        System.out.println("List created by ArrayList ");

    }

}
