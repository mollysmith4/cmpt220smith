import javax.swing.*; //Import all the classes in the util package

public class RhodeIsland {
	//Define variables
	JFrame a;
	JFrame b;
	JFrame c;
	JFrame d;
	
	//Create Rhode Island Game
	RhodeIsland() {
	//Game 2: Rhode Island multi-dimensional array for stats table
	a = new JFrame();
	
	//Create rows for stats table
	String rhodeIslandStats[][] = {{"RHODE ISLAND"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ",},
									{" ","01","35","3","8","0.3750","2","5","0.4000","9","12","0.3750","17","0","2","2","3","2","0","0","1"},
				 					{" ","04","29","8","17","0.4706","3","8","0.3750","0","0","0.0000","19","1","6","7","2","3","2","0","1"},
									{" ","05","30","4","11","0.3636","0","2","0.0000","0","1","0.0000","8","4","0","4","1","0","2","0","1"},
									{" ","10","35","2","9","0.2222","0","4","0.0000","0","0","0.0000","4","3","3","6","2","2","3","0","0"},
									{" ","11","2","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","14","2","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","15","11","2","5","0.4000","1","2","0.5000","0","0","0.0000","5","0","1","1","2","0","1","0","0"},
									{" ","20","13","1","3","0.3333","0","1","0.0000","0","0","0.0000","2","0","1","1","3","1","4","0","1"},
									{" ","22","12","0","1","0.0000","0","1","0.0000","0","0","0.0000","0","0","2","2","2","1","0","0","0"},
									{" ","23","31","2","9","0.2222","0","4","0.0000","2","5","0.4000","6","2","8","10","3","1","3","0","0"}
	};
	//Create columns for stats table
	String column1[]={"GAME","NUMBER","MP","FG","FGA","FG PCT","3FG","3FGA","3FG PCT","FT","FTA","FT PCT","TP","OF","DE","TOT","A","TO","BLK","S"};
	JTable jt1=new JTable(rhodeIslandStats,column1);
	jt1.setBounds(30,40,200,300);
	JScrollPane sp1=new JScrollPane(jt1);
	a.add(sp1);
	a.setSize(300, 400);
	a.setVisible(true);
		
	//Rhode Island multi-dimensional array for outside factors table
	b = new JFrame();
	//Create rows for outside factors table
	String rhodeIslandFood[][] = {{"RHODE ISLAND"," "," "," "," "," "},
		 							{" ","01","tuna melt on wheat bread, garden side salad w italian dressing","lemonade","8","2"},
		 							{" ","04","steak & cheese sub with mushrooms, peppers, onions, chili cheese fries","lemonade","8","2"},
		 							{" ","05","Chicken caesar wheat wrap, small fries, side ranch","lemonade","8","2"},
		 							{" ","10","phat chick sandwich on a sub, sweet potatoe fries","iced tea","8","2"},
		 							{" ","11","Turkey Club, no tomato, wheat toast","water","8","2"},
		 							{" ","14","Phat chick wrap, tater tots, side of ranch","Sprite","8","2"},
		 							{" ","15","phat chick sub, no bacon, small steak fries, side ranch","water","8","2"},
		 							{" ","20","turkey delight with no tomatoes/side of ranch","water","8","2"},
		 							{" ","22","greek grilled chicken salad","water","8","2"},
		 							{" ","23","BBQ crispy wrap (wheat) and cheese fries","water","8","2"}
	};
	//Create columns for outside factors table
	String column2[] = {"GAME","PLAYER","MEAL","DRINK","SLEEP HRS","RECOVERY DAYS B/W GAMES"};
	JTable jt2 = new JTable(rhodeIslandFood, column2);
	jt2.setBounds(10,10,5000,20);
	JScrollPane sp2 = new JScrollPane(jt2);
	b.add(sp2);
	b.setSize(300, 400);
	b.setVisible(true);
		 
	//Rhode Island multi-dimensional array for stat leaders table
	c = new JFrame();
	//Create rows for stat leaders table
	String rhodeIslandLeaders[][] = {{"RHODE ISLAND"," "," "},
									{" ","CLEMENT - 19","R. HAND - 10"}	
	};
	//Create columns for stat leaders table
	String column3[] = {"GAME","POINTS","REBOUNDS"};
	JTable jt3 = new JTable(rhodeIslandLeaders,column3);
	jt3.setBounds(30,40,200,300);
	JScrollPane sp3 = new JScrollPane(jt3);
	c.add(sp3);
	c.setSize(300, 400);
	c.setVisible(true);
			 
	//Rhode Island multi-dimensional array for scouting report table
	d = new JFrame();
	//Create rows for scouting report table
	String rhodeIslandReport[][] = {{"RHODE ISLAND"," "},
									{" ","OPPONENT OFFENSE: "},	
									{" ","OPPONENT DEFENSE: "},	
									{" ","OPPONENT ROSTER: "},	
									{" ","OPPONENT OFFENSE: "},	
									{" ","OUR GAME PLAN OFFENSE: "},
									{" ","OUR GAME PLAN DEFENSE: "}	
	};
	//Create columns for scouting report table
	String column4[] = {"GAME","SCOUTING REPORT"};
	JTable jt4 = new JTable(rhodeIslandReport,column4);
	jt4.setBounds(30,40,200,300);
	JScrollPane sp4 = new JScrollPane(jt4);
	d.add(sp4);
	d.setSize(300, 400);
	d.setVisible(true);
}

}
