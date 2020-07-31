package model;

public class Skill{
	private int skilld;
	private String skillName;
	public int getSkilld() {
		return skilld;
	}
	public void setSkilld(int skilld) {
		this.skilld = skilld;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public Skill(int skilld, String skillName) {
		this.skilld = skilld;
		this.skillName = skillName;
	}
}