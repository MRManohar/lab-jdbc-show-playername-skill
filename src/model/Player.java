package model;

public class Player{
	private int playerld;
	private String name; 
	private String country;
	private Skill skill;
	public int getPlayerld() {
		return playerld;
	}
	public void setPlayerld(int playerld) {
		this.playerld = playerld;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public Player(int playerld, String name, String country, Skill skill) {
		this.playerld = playerld;
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
}