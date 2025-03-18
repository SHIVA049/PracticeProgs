package dev.lpa.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EstablishJDBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//int x=0;
		Scanner sc=new Scanner(System.in);
		//int count=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila","root","Nidhi6@us1234");
        Statement st=con.createStatement();
        
        int numOfRecords=st.executeUpdate("UPDATE SSF.SUMMERBLK SET BLKNAME='SUMMER-B' WHERE OWNER_NAME='JITU'");
        //int tbname=st.executeUpdate("CREATE TABLE SSF.SSF_SUMMER (FLAT_NO int, OWNER_NAME VARCHAR(10),PHONE_NUM INT)");
        //int numOfRecords=st.executeUpdate("INSERT INTO SSF.SSF_SUMMER VALUES(116,\"AVINASH\",78293);");
        /*while(count<2) {
        	System.out.println("Enter Flat Number");
        	int FlatNo=sc.nextInt();
        	System.out.println("Enter Owner Name");
        	String ownerName=sc.next();
        	System.out.println("Enter Phone Number");
        	int phoneNo=sc.nextInt();
        	String SqlQuery="INSERT INTO SSF.SSF_SUMMER VALUES ("+FlatNo+",\'"+ownerName+"\',"+phoneNo+");";
        	int numOfRecords=st.executeUpdate(SqlQuery);
        	count++;
        } */
        //String sqlQuery="INSERT INTO SSF.SUMMERBLK VALUES ("+Flat_NO+",\'"+Blk_Name+"\',\'"+flttype+"\',\'"+ownerName+"\',\'"+tenantName+"\',"+ttlresidents+",\'"+Status+"\');";

        //int numOfRecords=0;
        //int TotalRecords=0
         //int numOfRecords= st.executeUpdate("INSERT INTO SSF.SUMMERBLK VALUES(116,\"SUMMER-B\",\"2BHK\", \"AVINASH B C\",\"\",4,\"OCCUPIED\")");
       /* while(true) {
        	System.out.println("Enter Flat Number");
        	int Flat_NO=sc.nextInt();
        	System.out.println("Enter Block Name");
        	String Blk_Name=sc.next();
        	System.out.println("Enter Flat Type");
        	String flttype=sc.next();
        	System.out.println("Enter Owner Name");
        	String ownerName=sc.next();
        	System.out.println("Enter Tenant Name");
        	String tenantName=sc.next();
        	System.out.println("Enter Total no of residents");
        	int ttlresidents=sc.nextInt();
        	System.out.println("Enter Flat Status");
        	String Status=sc.next();
        	String sqlQuery="INSERT INTO SSF.SUMMERBLK VALUES ("+Flat_NO+",\'"+Blk_Name+"\',\'"+flttype+"\',\'"+ownerName+"\',\'"+tenantName+"\',"+ttlresidents+",\'"+Status+"\');";
        	numOfRecords=st.executeUpdate(sqlQuery);
        	System.out.println("Record Inserted Successfully");
        	numOfRecords=numOfRecords+1;
        	System.out.println("Do you want to Insert Another Record [Yes/No]");
        	String option=sc.next();
        	if(option.equalsIgnoreCase("NO")) {
        		break;
        	} 
        	//count++;
        	//st.executeUpdate("INSERT INTO SSF.SUMMERBLK VALUES ("+Flat_NO+",\'"+Blk_Name+"','"+flttype+"\',\'"+ownerName+"\',\"+tenantName+"\',"+ttlresidents+",\'"+Status+"\');");
        }  */
         
        //int numOfRecords=st.executeUpdate(sc.nextLine());    		
        /*int tbname=st.executeUpdate("Create Table SSF.SPRINGBLK (FLAT_NO int(3) not null,\r\n"
        		+ "      BLKNAME varchar(10) not null,\r\n"
        		+ "      FLTTYPE varchar(6) not null,\r\n"
        		+ "      OWNER_NAME varchar(20) not null,\r\n"
        		+ "      TENANT_NAME varchar(20),\r\n"
        		+ "      TTL_RESIDENTS int,\r\n"
        		+ "      STATUS varchar(10))"); */
        		
        //System.out.println(numOfRecords);
        //ResultSet rs=st.executeQuery("Select * From Sakila.actor");
        //int dbName=st.executeUpdate("CREATE DATABASE SSF");
        
        /*while(rs.next()) {
        	int x=0;
        	System.out.println(rs.getInt(1)+".."+rs.getString(2)+"..");
        	if(rs.getString(2).equalsIgnoreCase("RAHUL SINGH")) {
        		
        		 x=st.executeUpdate("Update sakila.actor SET first_name='JULIA' where first_name='RAHUL SINGH'");
        	}
        	
        	System.out.println("No of rows Update is "+x);
        	
        } */
        
        System.out.println("No of rows Update is "+numOfRecords);
        con.close();
	}

}
