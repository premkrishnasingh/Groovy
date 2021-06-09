package groovysql;

import java.sql.*;
import groovy.sql.Sql;

class CreateTable {
   static void main(String[] args) {
	  // Creating a connection to the database
	  def sql = Sql.newInstance('jdbc:mysql://localhost:3306/TESTDB', 'root',
		 'root', 'com.mysql.jdbc.Driver')
			
	  def sqlstr = """CREATE TABLE CUST (
         FIRST_NAME CHAR(20) NOT NULL,
         LAST_NAME CHAR(20),
         EMAIL INT)""" 
							
	  sql.execute(sqlstr);
	  sql.close()
   }
}
