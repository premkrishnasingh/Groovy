package groovysql;

import java.sql.*;
import groovy.sql.Sql;
 
class ReadTable {
   static void main(String[] args) {
	  // Creating a connection to the database
	  def sql = Sql.newInstance('jdbc:mysql://localhost:3306/TESTDB', 'root',
		 'root', 'com.mysql.jdbc.Driver')
			
	  sql.eachRow('select * from CUST') {
		 tp ->
		 println([tp.FIRST_NAME,tp.LAST_NAME,tp.EMAIL])
	  }
		
	  sql.close()
   }
}
