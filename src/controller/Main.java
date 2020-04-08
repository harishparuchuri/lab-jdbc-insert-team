package controller;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import dao.TeamDAO;
import model.City;
import model.Team;
import dao.CityDAO;

public class Main {
	public static void main(String args[]) throws Exception {
		
		
		//objects
		Team team=new Team();
		City city=new City();
		TeamDAO teamdao=new TeamDAO();
		CityDAO citydao=new CityDAO();
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Team Name");
		String name=br.readLine();
		System.out.println("Enter Coach name");
		String coach=br.readLine();
		System.out.println("Enter City name");
		String cityName=br.readLine();
		System.out.println("Enter City id");
		long CityId=Long.parseLong(br.readLine());
		System.out.println("Team has been created");
		
		city.setCityName(cityName);
		city.setCityId(CityId);
		team.setName(name);
		team.setCoach(coach);
		team.setCity(city);
		teamdao.createTeam(team);
		citydao.getCityByName(cityName);
		
		

}
}

