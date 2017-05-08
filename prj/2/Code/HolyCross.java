import javax.swing.*; //Import all the classes in the util package

public class HolyCross {
	//Define variables
	JFrame a;
	JFrame b;
	JFrame c;
	JFrame d;
	
	//Create Holy Cross Game
	HolyCross() {
	//Game 4: Holy Cross multi-dimensional array for stats table
	a = new JFrame();
	
	//Create rows for stats table
	String holyCrossStats[][] = {{"HOLY CROSS"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ",},
									{" ","01","39","1","7","0.1429","0","3","0.0000","8","10","0.8000","10","0","5","5","2","0","3","0","0"},
				 					{" ","04","00","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","05","28","1","8","0.1250","1","4","0.2500","0","0","0.0000","3","2","6","8","2","3","3","2","3"},
									{" ","10","36","3","12","0.2500","0","2","0.0000","3","5","0.6000","9","2","1","3","1","2","2","0","0"},
									{" ","11","00","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","14","00","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","15","11","4","0.2500","0","3","0.0000","0","0","0.0000","2","0","2","2","1","1","1","0","1"},
									{" ","20","32","0","3","0.0000","0","2","0.0000","0","0","0.0000","0","1","3","4","5","2","4","0","2"},
									{" ","22","18","1","2","0.5000","0","1","0.0000","0","0","0.0000","2","0","4","4","1","0","2","0","0"},
									{" ","23","36","5","13","0.3846","1","5","0.2000","9","11","0.8182","20","4","7","11","3","2","3","0","0"}
	};
	//Create columns for stats table
	String column1[]={"GAME","NUMBER","MP","FG","FGA","FG PCT","3FG","3FGA","3FG PCT","FT","FTA","FT PCT","TP","OF","DE","TOT","A","TO","BLK","S"};
	JTable jt1=new JTable(holyCrossStats,column1);
	jt1.setBounds(30,40,200,300);
	JScrollPane sp1=new JScrollPane(jt1);
	a.add(sp1);
	a.setSize(300, 400);
	a.setVisible(true);
		 
	//Holy Cross multi-dimensional array for outside factors table
	b = new JFrame();
	//Create rows for outside factors table
	String holyCrossFood[][] = {{"HOLY CROSS"," "," "," "," "," "},
		 						{" ","01","small pepperoni pizza, side of ranch","water","8","4"},
		 						{" ","04","SMall BLT, small garden salad w italian","iced tea","8","4"},
		 						{" ","05","small pepperoni pizza, side of ranch","water","8","4"},
		 						{" ","10","greek grilled chicken sub","iced tea","8","4"},
		 						{" ","11","small bbq chicken pizza, side of ranch","water","8","4"},
		 						{" ","14","Small Hawaiian pizza, side of bbq sauce","Ginger Ale","8","4"},
		 						{" ","15","little italy calzone","water","8","4"},
		 						{" ","20","chef salad with ranch","water","8","4"},
		 						{" ","22","chef salad, no tomatoes with vinegar and oil","water","8","4"},
		 						{" ","23","small italian sub","water","8","4"}
	};
	//Create columns for outside factors table
	String column2[] = {"GAME","PLAYER","MEAL","DRINK","SLEEP HRS","RECOVERY DAYS B/W GAMES"};
	JTable jt2 = new JTable(holyCrossFood, column2);
	jt2.setBounds(10,10,5000,20);
	JScrollPane sp2 = new JScrollPane(jt2);
	b.add(sp2);
	b.setSize(300, 400);
	b.setVisible(true);
	
	//Holy Cross multi-dimensional array for stat leaders table
	c = new JFrame();
	//Create rows for stat leaders table
	String holyCrossLeaders[][] = {{"HOLY CROSS"," "," "},
									{" ","R. HAND - 20","R. HAND - 11"}	
	};
	//Create columns for stat leaders table
	String column3[] = {"GAME","POINTS","REBOUNDS"};
	JTable jt3 = new JTable(holyCrossLeaders,column3);
	jt3.setBounds(30,40,200,300);
	JScrollPane sp3 = new JScrollPane(jt3);
	c.add(sp3);
	c.setSize(300, 400);
	c.setVisible(true);
			 
	//Holy Cross multi-dimensional array for scouting report table
	d = new JFrame();
	//Create rows for scouting report table
	String holyCrossReport[][] = {{"HOLY CROSS"," "},
									{" ","OPPONENT OFFENSE: "},	
									{" ","OPPONENT DEFENSE: "},	
									{" ","OPPONENT ROSTER: "},	
									{" ","OPPONENT OFFENSE: "},	
									{" ","OUR GAME PLAN OFFENSE: "},
									{" ","OUR GAME PLAN DEFENSE: "}	
	};
	//Create columns for scouting report table
	String column4[] = {"GAME","SCOUTING REPORT"};
	JTable jt4 = new JTable(holyCrossReport,column4);
	jt4.setBounds(30,40,200,300);
	JScrollPane sp4 = new JScrollPane(jt4);
	d.add(sp4);
	d.setSize(300, 400);
	d.setVisible(true);
}

}
