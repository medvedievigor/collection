import java.util.Objects;

public class User implements Comparable {  //необходим метод compareTo для отображения элементов в treeSet
    private   int id;
    private String name;
    public User (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId () {
        return id;
    }



    public String getName () {
        return name;
    }
    @Override
    public String toString () {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode () {

        return Objects.hash(id, name);
    }

   @Override
    public int compareTo (Object o) {
        return 1;
    }
}
