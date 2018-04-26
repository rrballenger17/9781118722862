
import java.sql.SQLException;
import org.junit.*;
import java.sql.*;
import static org.junit.Assert.*;
import java.util.*;


public class DatabaseTest {


    @Test
	public void connectToDb() throws SQLException {
    	final Connection connection = DriverManager.getConnection(
           "jdbc:mysql://localhost:3306/pets", "root", "root");
    	assertFalse(connection.isClosed());
    	connection.close();
    	assertTrue(connection.isClosed());
	}

	@Test
	public void queryParameters() throws SQLException {
        
        final Connection conn = DriverManager.getConnection(
           "jdbc:mysql://localhost:3306/pets", "root", "root");
        
        assertFalse(conn.isClosed());

    	final PreparedStatement pStmt = conn.prepareStatement(
            "insert into office_locations values (?, ?, ?, NULL)");

    	final Map<String, String> locations = new HashMap<String, String>() {{
        	put("London", "Picadilly Square");
        	put("New York", "Union Plaza");
        	put("Paris", "Revolution Place");
    	}};

    	int i = 1;
    	for (String location : locations.keySet()) {
        	pStmt.setInt(1, i);
        	pStmt.setString(2, location);
        	pStmt.setString(3, locations.get(location));
        	pStmt.execute();
        	i++;
    	}

    	pStmt.close();

    	final Statement stmt = conn.createStatement();
    	final ResultSet rs = stmt.executeQuery(
            "select count(*) from office_locations " +
            "where City in ('London', 'New York', 'Paris')");
    	assertTrue(rs.next());
    	assertEquals(3, rs.getInt(1));

    	rs.close();
    	stmt.close();

        conn.close();
        assertTrue(conn.isClosed());
	}


    @Test
    public void connectToH2() throws SQLException {

        final Connection conn = DriverManager.getConnection(
            "jdbc:h2:mem:test;MODE=MySQL", "nm", "password");

        final Statement stmt = conn.createStatement();
        stmt.executeUpdate("create table teams (id INTEGER, name VARCHAR(100))");
        stmt.executeUpdate("insert into teams values (1, 'Red Team')");
        stmt.executeUpdate("insert into teams values (2, 'Blue Team')");
        stmt.executeUpdate("insert into teams values (3, 'Green Team')");

        final ResultSet rs = stmt.executeQuery("select count(*) from teams");
        assertTrue(rs.next());
        assertEquals(3, rs.getInt(1));
    }



    @After
    public void deleteData() throws SQLException {

        final Connection conn = DriverManager.getConnection(
           "jdbc:mysql://localhost:3306/pets", "root", "root");
        
        assertFalse(conn.isClosed());

        final PreparedStatement pStmt = conn.prepareStatement(
            "DELETE FROM office_locations");

        pStmt.execute();

        pStmt.close();

        conn.close();
        assertTrue(conn.isClosed());
    }

}