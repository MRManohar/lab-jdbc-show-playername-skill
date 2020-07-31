package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	 public Skill getSkillBylD(int id) throws SQLException, Exception
	 {
		 String sql = "SELECT * FROM SKILL";
		 PreparedStatement stmt = ConnectionManager.getConnection().prepareStatement(sql);
		 ResultSet rs = stmt.executeQuery();
		 while(rs.next()) {
			 int skillId = rs.getInt(1);
			 String skillName = rs.getString(2);
			 Skill skill = new Skill(skillId,skillName);
			 System.out.println(skillId+"\t"+skillName);
			 return skill;
		 }
		 return null;
	 }
}