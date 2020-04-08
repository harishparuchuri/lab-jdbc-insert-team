package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import model.City;
import utility.ConnectionManager;

public class CityDAO{
	public City getCityByName(String name) throws Exception {
		ConnectionManager cm=new ConnectionManager();
		Connection con=cm.getConnection();
		
		String sql="SELECT team2.NAME,team2.COACH,city.CITYNAME FROM team2,city";
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(sql);
		
		System.out.println("Team Details are :");
		
		while(rs.next()) {
			System.out.println(rs.getString("name")+" "+rs.getString("coach")+" "+rs.getString("cityname"));
		}
		rs.close();
		st.close();
		con.close();
		return null;
		
	}
}
