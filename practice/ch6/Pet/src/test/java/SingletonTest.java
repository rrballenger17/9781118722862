import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonTest {

    @Test
    public void singletonTest() {
        Singleton s = Singleton.getInstance();


        s.setDatabaseConnection("AWS-OPTION");

        String y = s.getDatabaseConnection();

        Singleton x = Singleton.getInstance();

        assertEquals(x.getDatabaseConnection(), y);

    }


}


