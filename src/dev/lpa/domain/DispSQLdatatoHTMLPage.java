package dev.lpa.domain;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DispSQLdatatoHTMLPage {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sakila","root","Nidhi6@us1234");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM SSF.SUMMERBLK");
        String data="<html><body><h1> SSF Information On All Residents </h1></hr><table BORDER=\"7\" style=\"background-color:yellow;\">";
        data = data + "<tr><td>FLAT_NO</td><td>BLK_NAME</td><td>FLT_TYPE</td><td>OWNER_NAME</td><td>TENANT_NAME</td><td>TTL_RESIDENTS</td><td>STATUS</td></tr>";
        while(rs.next()) {
        //data=data+"<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+
        	data=data+"<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getInt(6)+"</td><td>"+rs.getString(7)+"</td></tr>";    		     
        }
        data = data + "</table></body></html>";
        FileOutputStream fos=new FileOutputStream("C:\\Users\\somne\\OneDrive\\Desktop\\ssf.html");
        byte[] b=data.getBytes();
        fos.write(b);
        fos.flush();
        System.out.println("Open the file to see table represantation");
        
	}

}
