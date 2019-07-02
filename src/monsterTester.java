/*Author: Dustin Cox
 * Version 1
 * The Monster Test class contains all of the instance variables and 
 * methods for a monster
 */
import javax.swing.JOptionPane;
public class monsterTester
{
	
	public static void main(String [] args)
	{
		//Test if the user wants to finish attribute edit
		String endProgram = "not";
		
		//Monsters objects
		monster m1 = new monster("Jason Voorhees","Machete","Camp Crystal", 77, .85);
		monster m2 = new monster("Michael Myers","Chef's knife","Haddonfield, Illinois", 80, .75);
		monster m3 = new monster("Pennywise","Dark magic","Sewers of Derry, Maine",77, .95);
		monster m4 = new monster("Freddy Krueger","Finger knifes","Elm Street, Los Angeles", 69.5, .80);
		monster m5 = new monster("Valak (The Nun)","Demon power","Hell",72, .99);
		
		//Ask what monster to view
		String[] choices = {"Jason Voorhees","Michael Myers","Pennywise","Freddy Krueger","Valak (The Nun)"};
		String input = (String) JOptionPane.showInputDialog(null, "Choose your monster.",
				"Monster Information", JOptionPane.QUESTION_MESSAGE, null,
				choices, choices[0]);
		
		//Display monster information depending choice 
		do
		{
			if (input.contentEquals("Jason Voorhees")) {
				//Option to edit the monsters attributes
				String[] monsterInfo = {"Edit Power", "Edit Height", "Finished"};
				//displays monster stats
				String monsterUpdated = (String) JOptionPane.showInputDialog(null,
						"Your monster is " + m1.getMonster() + ". \n" +
				        m1.getMonster() + " weapon is a " + m1.getWeapon() + ".\n" +
						m1.getMonster() + " home is " + m1.getHome() + ".\n" +
				        m1.getMonster() + " height is " + m1.getHeight() + " feet.\n" +
						m1.getMonster() + " power level is " + m1.getPower() + " %.\n",
						"Monster stats",
						JOptionPane.QUESTION_MESSAGE,
						null,
						monsterInfo,
						monsterInfo[2]);
				
				//edits power attribute
				if (monsterUpdated.contentEquals("Edit Power")) {
					String p = JOptionPane.showInputDialog(m1.getMonster() + " was killed. How much power "
							+ "should the monster's new power level be?");
					double mPower=Double.parseDouble(p);
					m1.updatePower(mPower/100.0);
				}
				//edits height attribute
				else if (monsterUpdated.contentEquals("Edit Height")) {
					String h = JOptionPane.showInputDialog(m1.getMonster() + " legs where chopped off. " +
							"How many inches did the monster loose?");
					double mHeight=Double.parseDouble(h);
					m1.updateHeight(mHeight);
				}
				//no edits made set endprogram to done
				else{
					endProgram = "done";
				}
				
			}
			
			else if (input.contentEquals("Michael Myers")) {
				String[] monsterInfo = {"Edit Power", "Edit Height", "Finished"};
				//displays monster stats
				String monsterUpdated = (String) JOptionPane.showInputDialog(null,
						"Your monster is " + m2.getMonster() + ". \n" +
				        m2.getMonster() + " weapon is a " + m2.getWeapon() + ".\n" +
						m2.getMonster() + " home is " + m2.getHome() + ".\n" +
				        m2.getMonster() + " height is " + m2.getHeight() + " feet.\n" +
						m2.getMonster() + " power level is " + m2.getPower() + " %.\n",
						"Monster stats",
						JOptionPane.QUESTION_MESSAGE,
						null,
						monsterInfo,
						monsterInfo[2]);
				//edits power attribute
				if (monsterUpdated.contentEquals("Edit Power")) {
					String p = JOptionPane.showInputDialog(m2.getMonster() + " was killed. How much power "
							+ "should the monster's new power level be?");
					double mPower=Double.parseDouble(p);
					m2.updatePower(mPower/100.0);
				}
				//edits height attribute
				else if (monsterUpdated.contentEquals("Edit Height")) {
					String h = JOptionPane.showInputDialog(m2.getMonster() + " was cut in half. " +
							"How many inches did the monster loose?");
					double mHeight=Double.parseDouble(h);
					m2.updateHeight(mHeight);
				}
				//no edits made set endprogram to done
				else{
					endProgram = "done";
				}
				
			}
			
			else if (input.contentEquals("Pennywise")) {
				String[] monsterInfo = {"Edit Power", "Edit Height", "Finished"};
				//displays monster stats
				String monsterUpdated = (String) JOptionPane.showInputDialog(null,
						"Your monster is " + m3.getMonster() + ". \n" +
				        m3.getMonster() + " weapon is " + m3.getWeapon() + ".\n" +
						m3.getMonster() + " home is " + m3.getHome() + ".\n" +
				        m3.getMonster() + " height is " + m3.getHeight() + " feet.\n" +
						m3.getMonster() + " power level is " + m3.getPower() + " %.\n",
						"Monster stats",
						JOptionPane.QUESTION_MESSAGE,
						null,
						monsterInfo,
						monsterInfo[2]);
				//edits power attribute
				if (monsterUpdated.contentEquals("Edit Power")) {
					String p = JOptionPane.showInputDialog(m3.getMonster() + " was killed. How much power "
							+ "should the monster's new power level be?");
					double mPower=Double.parseDouble(p);
					m3.updatePower(mPower/100.0);
				}
				//edits height attribute
				else if (monsterUpdated.contentEquals("Edit Height")) {
					String h = JOptionPane.showInputDialog(m3.getMonster() + " feet where cut off. " +
							"How many inches did the monster loose?");
					double mHeight=Double.parseDouble(h);
					m3.updateHeight(mHeight);				}
				//no edits made set endprogram to done
				else
				{
					endProgram = "done";
				}
				
			}
			
			else if (input.contentEquals("Freddy Krueger")) {
				String[] monsterInfo = {"Edit Power", "Edit Height", "Finished"};
				//displays monster stats
				String monsterUpdated = (String) JOptionPane.showInputDialog(null,
						"Your monster is " + m4.getMonster() + ". \n" +
				        m4.getMonster() + " weapon is " + m4.getWeapon() + ".\n" +
						m4.getMonster() + " home is " + m4.getHome() + ".\n" +
				        m4.getMonster() + " height is " + m4.getHeight() + " feet.\n" +
						m4.getMonster() + " power level is " + m4.getPower() + " %.\n",
						"Monster stats",
						JOptionPane.QUESTION_MESSAGE,
						null,
						monsterInfo,
						monsterInfo[2]);
				
				//edits power attribute
				if (monsterUpdated.contentEquals("Edit Power")) {
					String p = JOptionPane.showInputDialog(m4.getMonster() + " was killed. How much power "
							+ "should the monster new power level be?");
					double mPower=Double.parseDouble(p);
					m4.updatePower(mPower/100.0);
				}
				//edits height attribute
				else if (monsterUpdated.contentEquals("Edit Height")) {
					String h = JOptionPane.showInputDialog(m4.getMonster() + " head was smash into his body. " +
							"How many inches did the monster loose?");
					double mHeight=Double.parseDouble(h);
					m4.updateHeight(mHeight);				}
				//no edits made set endprogram to done
				else{
					endProgram = "done";
				}
	
			}
			
			else {
				String[] monsterInfo = {"Edit Power", "Edit Height", "Finished"};
				//displays monster stats
				String monsterUpdated = (String) JOptionPane.showInputDialog(null,
						"Your monster is " + m5.getMonster() + ". \n" +
				        m5.getMonster() + " weapon is " + m5.getWeapon() + ".\n" +
						m5.getMonster() + " home is " + m5.getHome() + ".\n" +
				        m5.getMonster() + " height is " + m5.getHeight() + " feet.\n" +
						m5.getMonster() + " power level is " + m5.getPower() + " %.\n",
						"Monster stats",
						JOptionPane.QUESTION_MESSAGE,
						null,
						monsterInfo,
						monsterInfo[2]);
				//edits power attribute
				if (monsterUpdated.contentEquals("Edit Power")) {
					String p = JOptionPane.showInputDialog(m5.getMonster() + " was killed. How much power "
							+ "should the monster new power level be?");
					double mPower=Double.parseDouble(p);
					m5.updatePower(mPower/100.0);
				}
				//edits height attribute
				else if (monsterUpdated.contentEquals("Edit Height")) {
					String h = JOptionPane.showInputDialog(m5.getMonster() + " was crush by a church bell. " +
							"How many inches did the monster loose?");
					double mHeight=Double.parseDouble(h);
					m5.updateHeight(mHeight);
				}
				//no edits made set endprogram to done
				else{
					endProgram = "done";
				}
	
			}	
		} while (endProgram.contentEquals("not")); //do while loop ends once endProgram equals done
	}
	
}