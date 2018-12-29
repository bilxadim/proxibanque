package sn.objis.livrable06test.utils;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionMyBDD {
	
	/*
	static ResourceBundle bundle = ResourceBundle.getBundle("sn.objis.livrable06test.utils.properties.config.properties");
	public static String url = bundle.getString("sgbd.url");
	public static String driver = bundle.getString("sgbd.driver");
	public static String utilisateur = bundle.getString("sgbd.login");
	public static String motDePass = bundle.getString("sgbd.password");
	
	
	//private static String driver="com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/proxybanquebdd?useSSL=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static String utilisateur="objis";
	private static String motDePass="objis";
	*/
	public ConnectionMyBDD() {
		super();
		// TODO Auto-generated constructor stub
	}
	private static Connection connection;

	public static Connection getInstanceConnetionMyBDD(){
		try {
			if (connection == null) {
				// Creation d'une instance de la classe Properties
				Properties prop = new Properties();
				// Etablissement entre le programme et le fichier
				InputStream input = new FileInputStream("config.properties");
				// Chargement du fichier dans l'objet prop
				prop.load(input);
				// Proprietes du fichier et r�cup�ration des valeurs des cl�s
				String driver = prop.getProperty("driver");
				String url = prop.getProperty("url");
				String login = prop.getProperty("user");
				String pwd = prop.getProperty("password");
				// Chargement du driver
				//Class.forName(driver).newInstance();
				// Cr�ation de la connection avec la base de donn�es
				connection = DriverManager.getConnection(url, login, pwd);
				// Class.forName(driver).newInstance();

				// connection=DriverManager.getConnection(url, utilisateur, motDePass);
			}
		} catch (SQLException | IOException  e) {
			// TODO Auto-generated catch block
			System.out.println("Probleme de connection\n" + e);
		}finally {
			
		}
		return connection;
	}
}
