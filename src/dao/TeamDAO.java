package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.City;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO {

	
	public void createTeam(Team team) throws Exception {
		
		String name=team.getName();
		String coach=team.getCoach();
		City city=team.getCity();
		Long id=city.getCityId();
		String cityName=city.getCityName();
		
		ConnectionManager cm=new ConnectionManager();
		Connection con=ConnectionManager.getConnection();
		
		String sqlteam="insert into team2(name,coach) values(?,?)";
		PreparedStatement st=con.prepareStatement(sqlteam);
		
		st.setString(1,name);
		st.setString(2,coach);
		
		String sqlcity="insert into city(cityid,cityname)values(?,?)";
		PreparedStatement st1=con.prepareStatement(sqlcity);
		st1.setLong(1,id);
		st1.setString(2,cityName);
		
		st.executeUpdate();
		st1.executeUpdate();
		ConnectionManager.getConnection().close();
		
		
		
	}
}

