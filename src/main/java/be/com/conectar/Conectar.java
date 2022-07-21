package be.com.conectar;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
	public static Connection obterConexao() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/sitecasal", "root", "123456") ;
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
