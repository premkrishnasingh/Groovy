package groovysql;
import java.sql.*;
import groovy.sql.Sql

class GroovySpringApplication {
   static void main(String[] args) {
	  // Creating a connection to the database
	  def sql = Sql.newInstance('jdbc:mysql://localhost:3306/testdb',
		 'root', 'root', 'com.mysql.jdbc.Driver')
			
	  // Executing the query SELECT VERSION which gets the version of the database
	  // Also using the eachROW method to fetch the result from the database
   
	  sql.eachRow('SELECT VERSION()'){ row ->
		 println row[0]
	  }
		
	  sql.close()
   }
}