public abstract class MainCollections  {
    public static void main (String[] args) {
        UserRunner userRunner = null;
        if (args[0].equals("ARRAY")) {

            userRunner = new UserRunerArrayList();

        } else if (args[0].equals("LINKED")) {

            userRunner = new UserRunerLinkedList();

        }else if (args[0].equals("SET")) {

            userRunner = new UserRunerSet();

        }else if (args[0].equals("MAP")) {

            userRunner = new UserRunerMap();

        }
        userRunner.run();



    }
}

