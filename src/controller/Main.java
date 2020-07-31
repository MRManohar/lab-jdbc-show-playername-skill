package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;

public class Main
{
	public static void main(String[] args) throws SQLException, Exception
	{
		System.out.println("Skills based on ID:");
		System.out.println("Enter Skill ID to check the details");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		SkillDAO skillDao = new SkillDAO();
		skillDao.getSkillBylD(id);
		
		System.out.println("\nPlayers Details:");
		PlayerDAO playerDao = new PlayerDAO();
		List<Player> list = playerDao.getAllPlayers();
		int i=1;
		for(Player player : list)
		{
			System.out.println(i++ + ".  " + player.getPlayerld() + " " + player.getName() + " "+ player.getCountry() + " "+ player.getSkill().getSkilld() + " "+ player.getSkill().getSkillName());
		}
		sc.close();
	}
}
