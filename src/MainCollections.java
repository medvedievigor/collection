import java.util.concurrent.TimeUnit;

public abstract class MainCollections  {
    public static void main (String[] args) {

        UserRunner userRunner = null;

        if (args[0].equals("ARRAY")) {

            userRunner = new UserRunnerArrayList();

        } else if (args[0].equals("LINKED")) {

            userRunner = new UserRunnerLinkedList();

        }else if (args[0].equals("HASHSET")) {

            userRunner = new UserRunnerHashSet();

        }else if (args[0].equals("TREESET")) {

            userRunner = new UserRunnerTreeSet();

        }
            int amountOfObjectsToAdding = 9000009;   //Задаем кол-во обЪектов в списке для добовления
            long startAdd = System.nanoTime();
            for (int i = 0; i < amountOfObjectsToAdding; i++) {
                userRunner.addUsers();
            }
            long endAdd = System.nanoTime();
            long secondsAdd = TimeUnit.NANOSECONDS.toSeconds(endAdd - startAdd);
            System.out.println("EXECUTION TIME OF ADDING of " + amountOfObjectsToAdding + " objects: " + secondsAdd + "sec");

            int amountOfObjectsToRemoving = 900;    //Задаем кол-во обЪектов для удаления из списка
            long startRemove = System.nanoTime();
                for (int i = 0; i < amountOfObjectsToRemoving; i++) {
                userRunner.removeUsers();
            }
            long endRemove = System.nanoTime();
             long secondsRemove = TimeUnit.NANOSECONDS.toSeconds(endRemove - startRemove);
             System.out.println("EXECUTION TIME OF REMOVING of " + amountOfObjectsToRemoving + " objects: " + secondsRemove + "sec");

                 userRunner.printUsers();


    }
}

