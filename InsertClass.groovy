package groovysql;

import java.sql.*;
import groovy.sql.Sql;

class InsertClass {
	static void main(String[] args) {
		// Creating a connection to the database
		def sql = Sql.newInstance('jdbc:mysql://localhost:3306/TESTDB', 'root',
		   'root', 'com.mysql.jdbc.Driver')
			  
		sql.connection.autoCommit = false
		  
		def sqlstr = """INSERT INTO CUST(FIRST_NAME, LAST_NAME, EMAIL) VALUES ('Mac', 'Mohan', 20)""" 
		try {
		   sql.execute(sqlstr);
		   sql.commit()
		   println("Successfully committed")
		}catch(Exception ex) {
		   sql.rollback()
		   println("Transaction rollback")
		}
		  
		sql.close()
	 }
}
