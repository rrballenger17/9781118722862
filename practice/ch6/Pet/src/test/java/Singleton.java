



public class Singleton {

    private static Singleton INSTANCE;

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

    private String databaseConnection;

    public void setDatabaseConnection(String conn){
        databaseConnection = conn;
    }

    public String getDatabaseConnection(){
        return databaseConnection;
    }

}




