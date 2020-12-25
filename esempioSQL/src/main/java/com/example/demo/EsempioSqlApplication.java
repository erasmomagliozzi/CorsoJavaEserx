package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import javax.swing.plaf.nimbus.State;
		import java.sql.*;
@SpringBootApplication
public class EsempioSqlApplication {
	public static void main(String[] args) {
		Connection db = null;
		try {
			//Class.forName("org.postgresql.Driver");
			db = DriverManager.getConnection("jdbc:mysql://localhost:8889/esempioProject", "root", "root");

			Statement st = db.createStatement();
			st.executeUpdate("CREATE TABLE esempioProject.esami(" +
					"nome character varying(50));");
			st.executeUpdate("CREATE TABLE esempioProject.studenti("+
					"ID SERIAL PRIMARY KEY"+
					")");
			/*ResultSet resultSet = st.executeQuery("SELECT * FROM \"Studenti\"");

			while(resultSet.next()) {
				System.out.println(resultSet.getString("getNome"));
			}*/

			db.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.print("Hello!");
	}
}
