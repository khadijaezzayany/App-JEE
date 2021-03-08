package ConnctPostg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {

	static Connection connection = null;

	static String url = "jdbc:postgresql://localhost:5432/pharmacie";
	static String utilisateur = "postgres";
	static String password = "khadija1997";

	public static Connection getMyConnexion() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		connection = DriverManager.getConnection(url, utilisateur, password);
		System.out.println("La connexion a est bien etablie");
		return connection;
	}

}
