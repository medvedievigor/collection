import java.util.HashSet;
import java.util.Set;

public class UserRunnerHashSet implements UserRunner {

        private HashSet<User> users=new HashSet<User>();
        private int j=0;
        public  void addUsers() {
            users.add(new User(1+j, "HashSet"));
            j++;
        }

        public  void removeUsers() {
            users.remove(new User( j, "HashSet"));
            j--;

        }

        public void printUsers () {
            System.out.println();
             int k =5;                   //Выводит 5 элементов из всего списка на печать
            for (User user : users) {
                if (k > 0) {
                    System.out.println(user);
                    k--;
                }
            }
            System.out.println();
            System.out.println("List created by HashSet ");

        }
    
}
