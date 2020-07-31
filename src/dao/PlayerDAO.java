package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;

public class PlayerDAO
{
	public List<Player> getAllPlayers() throws Exception{
		String sName = null;
		String sqlPlayer = "SELECT * FROM player";
		PreparedStatement stmtPlayer = ConnectionManager.getConnection().prepareStatement(sqlPlayer);
		ResultSet rsPlayer = stmtPlayer.executeQuery();
		String sql = "SELECT * FROM SKILL";
		PreparedStatement stmt = ConnectionManager.getConnection().prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		Skill skill = null;
		while(rsPlayer.next()) {
			while(rs.next()) {
				skill = new Skill(rs.getInt(1),rs.getString(2));
				if(rsPlayer.getInt(4) == rs.getInt(1)) {
					sName = rs.getString(2);
					break;
				}
			}
			System.out.println(rsPlayer.getInt(1)+"\t"+rsPlayer.getString(2)+"\t"+rsPlayer.getString(3)+sName);
			Player player = new Player(rsPlayer.getInt(1),rsPlayer.getString(2),rsPlayer.getString(3),skill);
			List<Player> list = new ArrayList<>();
			list.add(player);
			return list;
		}
		return null;
	}
}