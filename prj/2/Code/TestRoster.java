import java.util.*; //Import all the classes in the util package

import javax.swing.JFrame;
public class TestRoster {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//Prompt the user for the calendar
		JFrame.setDefaultLookAndFeelDecorated(true);
		System.out.println("Do you want the calendar y/n? ");
		if (s.next().equals("y")) {
		SwingCalendar sc = new SwingCalendar();
		}
		
		//Prompt the user for the roster
		System.out.println("Do you want the roster y/n? ");
			if (s.next().equals("y")) {
				new Roster(); //Displays roster
			}
				else {
					System.out.println("ok");
				}
		
			/**Prompt the user for the schedule
			 * If the user wants the schedule, then prompt for a specific game using a switch statement
			 * If the user correctly types game, then that game's tables appear
			 */
		System.out.println("Do you want the schedule y/n? ");
			if (s.next().equals("y")) {
				new Schedule(); //Displays schedule
				System.out.println("Enter specific game (use game#): ");
				int game = s.nextInt();
				switch (game) {
				case 1: new Hofstra(); //Displays Hofstra game
				break;
				case 2: new RhodeIsland(); //Displays Rhode Island game
				break;
				case 3: new SetonHall(); //Displays Seton Hall game
				break;
				case 4: new HolyCross(); //Displays Holy Cross game
				break;
				case 5: new EastCarolina(); //Displays East Carolina game
				break;
				case 6: new Auburn(); //Displays Auburn game
				break;
				case 7: new NorthCarolinaAT(); //Displays North Carolina A&T game
				break;
				case 8: new Manhattan1(); //Displays Manhattan1 game
				break;
				default: System.out.println("Invalid input");
				break;
				}
				
				//Prompt the user for another game
				System.out.println("Do you want to look at another game y/n?");
				if (s.next().equals("y")) {
					System.out.println("Enter specific game (use game#): ");
					int game2 = s.nextInt();
					switch (game2) {
					case 1: new Hofstra(); //Displays Hofstra game
					break;
					case 2: new RhodeIsland(); //Displays Rhode Island game
					break;
					case 3: new SetonHall(); //Displays Seton Hall game
					break;
					case 4: new HolyCross(); //Displays Holy Cross game
					break;
					case 5: new EastCarolina(); //Displays East Carolina game
					break;
					case 6: new Auburn(); //Displays Auburn game
					break;
					case 7: new NorthCarolinaAT(); //Displays North Carolina A&T game
					break;
					case 8: new Manhattan1(); //Displays Manhattan1 game
					break;
					default: System.out.println("Invalid input");
					break;
				}
			}
			else {
					System.out.println("ok");
			}
			
				
			}
			
	}
		
}



