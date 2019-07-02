/* Author: Dustin Cox
 * Version 1
 * Monster class contains all of the instance variable and 
 * methods for a monster
 */

public class monster{
	private String myMonster;
	private String myMonstersWeapon;
	private String myMonstersHome;
	private double myMonstersHeight;
	private double myMonstersPower;
	
	//constructor for the monster object
	public monster(String monster, String weapon, String home,
			double height, double power) 
	{
		myMonster = monster;
		myMonstersWeapon = weapon;
		myMonstersHome = home;
		myMonstersHeight =  height;
		myMonstersPower = power;
	}
	
	
	//getter methods for monster object
	public String getMonster() {
      return myMonster;
	}
	
	public String getWeapon() {
		return myMonstersWeapon;
	}
	
	public String getHome() {
		return myMonstersHome;
	}
	
	public double getHeight() {
		myMonstersHeight = Math.round((myMonstersHeight / 12) * 10) / 10;
		return myMonstersHeight;
	}
	
	public double getPower() {
		myMonstersPower = Math.round((myMonstersPower * 100) * 10) / 10;
		return myMonstersPower;
	}
	
	
	//setter methods for monster object
	public void setMonster(String newMonster) {
		myMonster = newMonster;
	}
	
	public void setMonstersWeapon(String newWeapon) {
		myMonstersWeapon = newWeapon;
	}
	
	public void setMonstersHome(String newHome) {
		myMonstersHome = newHome;
	}
	
	public void setMonstersHeight(double newHeight) {
		myMonstersHeight = newHeight;
	}
	
	public void setMonstersWeight(double newPower) {
		myMonstersPower = newPower;
	}
		
	//settler methods to update attributes		
	public void updateHeight(double mHeight) {
      myMonstersHeight = Math.round(((myMonstersHeight * 12) * 10) / 10) - mHeight;
      myMonstersPower = myMonstersPower/100;
	}
	
	public void updatePower(double mPower) {
	 myMonstersPower = mPower;
	 myMonstersHeight = ((myMonstersHeight * 12) * 10) / 10;
	}
	
}