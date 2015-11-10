package metier;

import java.sql.*;

public class ClientsManager {
	
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/french_chic";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "";
	   
	public ClientsManager() {
		
		Connection conn = null;
		Statement stmt = null;
		
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
	
			//STEP 3: Open a connection
			System.out.println("Connecting to selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");
	  
			//STEP 4: Execute a query
			System.out.println("Creating table in given database...");
						stmt = conn.createStatement();
	  
			// Creation de la table client si elle n'existe pas
			String sql = "CREATE TABLE IF NOT EXISTS CLIENT " + 
				"(id INTEGER not NULL AUTO_INCREMENT, " +
				" nom VARCHAR(255), " + 
				" prenom VARCHAR(255), " + 
				" password VARCHAR(255), " + 
				" pseudo VARCHAR(255), " +
				" PRIMARY KEY ( id ))";
	
			stmt.executeUpdate(sql);
			System.out.println("Created table in given database if not exist...");
			
			String sqlInsert = "INSERT INTO CLIENT (nom, prenom, password, pseudo) VALUES('Gauche', 'Nicolas', 'pass', 'NicoG')";
			
			stmt.executeUpdate(sqlInsert);
			System.out.println("Insert a line in client table...");
			
		}
		catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
		finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					conn.close();
			}
			catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Database closed");
	}

	public Client rechercherClientParPseudo(String pseudo, String motDePasse) {
		
		Connection conn = null;
		Statement stmt = null;
		
		String nomClient = "";
		String prenomClient = "";
		
		try{
			//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
	
			//STEP 3: Open a connection
			System.out.println("Connecting to selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");
			stmt = conn.createStatement();
			
			//STEP 4: Execute a query
			String sql = "SELECT nom, prenom FROM CLIENT WHERE pseudo = '" + pseudo + "' AND password = '" + motDePasse +"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			//STEP 5: Extract data from result set
			while(rs.next()) {
			    //Retrieve by column name
				prenomClient = rs.getString("prenom");
				nomClient = rs.getString("nom");
			}
			rs.close();
			
		}
		catch(SQLException se){
			//Handle errors for JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Handle errors for Class.forName
			e.printStackTrace();
		}
		finally{
			//finally block used to close resources
			try{
				if(stmt!=null)
					conn.close();
			}
			catch(SQLException se){
			}
			try{
				if(conn!=null)
					conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Database closed");
		
		Client clientSelect = new Client();
		
		if(!nomClient.isEmpty() && !prenomClient.isEmpty()) {
			clientSelect.setNom(nomClient);
			clientSelect.setPrenom(prenomClient);
		}
		
		return clientSelect;
	}
}
