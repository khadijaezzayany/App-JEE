package ConnctPostg;

import java.sql.SQLException;

public class TestConnct {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ConnectionClass connt = new ConnectionClass();
		connt.getMyConnexion();
	}

}
