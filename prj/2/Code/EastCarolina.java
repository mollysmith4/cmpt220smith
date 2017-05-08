import javax.swing.*; //Import all the classes in the util package

public class EastCarolina {
	//Define variables
	JFrame a;
	JFrame b;
	JFrame c;
	JFrame d;
	
	//Create East Carolina Game
	EastCarolina() {
	//Game 5: East Carolina multi-dimensional array for stats
	a = new JFrame();
	
	//Create rows for stats table
	String eastCarolinaStats[][] = {{"EAST CAROLINA"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ",},
									{" ","01","32","3","4","0.7500","2","3","0.6667","2","2","1.0000","10","3","1","4","3","2","4","0","1"},
				 					{" ","04","00","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","05","29","6","11","0.5455","3","5","0.6000","0","0","0.0000","15","3","1","4","1","3","2","0","0"},
									{" ","10","36","5","11","0.4545","0","3","0.0000","2","2","1.0000","12","3","2","5","2","4","1","0","0"},
									{" ","11","2","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","14","2","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","15","14","1","5","0.2000","0","1","0.0000","0","0","0.0000","2","0","2","2","3","1","1","0","2"},
									{" ","20","36","2","8","0.2500","1","3","0.3333","1","4","0.2500","6","1","1","2","0","8","0","0","2"},
									{" ","22","14","1","2","0.5000","0","1","0.0000","0","0","0.0000","2","2","2","4","0","0","0","0","1"},
									{" ","23","39","6","17","0.3529","3","9","0.3333","6","8","0.7500","21","2","4","6","1","3","1","1","1"}
	};
	//Create columns for stats table
	String column1[]={"GAME","NUMBER","MP","FG","FGA","FG PCT","3FG","3FGA","3FG PCT","FT","FTA","FT PCT","TP","OF","DE","TOT","A","TO","BLK","S"};
	JTable jt1=new JTable(eastCarolinaStats,column1);
	jt1.setBounds(30,40,200,300);
	JScrollPane sp1=new JScrollPane(jt1);
	a.add(sp1);
	a.setSize(300, 400);
	a.setVisible(true);
		 
	//East Carolina multi-dimensional array for outside factors
	b = new JFrame();
	//Create rows for outside factors table
	String eastCarolinaFood[][] = {{"EAST CAROLINA"," "," "," "," "," "},
		 							{" ","01","Southwest Salad, add chicken, cilantro vin dressing","lemonade","8","3"},
		 							{" ","04","Bacon Egg and Cheese Pizza - avocado fries","lemonade","8","3"},
		 							{" ","05","southwest chicken salad with ranch on the side, no olives and no tomatoes","water","8","3"},
		 							{" ","10","psouthwest chicken salad, no olives, cilantro vin dressing on the side","iced tea","8","3"},
		 							{" ","11","Southwest Salad, no tomato","lemonade","8","3"},
		 							{" ","14","Southwest chicken Salad, cilantro vin dressing on side","water","8","3"},
		 							{" ","15","southwest chicken salad, no olives with ranch on the side","water","8","3"},
		 							{" ","20","smoked salmon caeser with ranch","water","8","3"},
		 							{" ","22","smoked salmon caeser with dressing on the side","water","8","3"},
		 							{" ","23","southwest chicken salad with ranch on the side","water","8","3"}
	};
	//Create columns for outside factors table
	String column2[] = {"GAME","PLAYER","MEAL","DRINK","SLEEP HRS","RECOVERY DAYS B/W GAMES"};
	JTable jt2 = new JTable(eastCarolinaFood, column2);
	jt2.setBounds(10,10,5000,20);
	JScrollPane sp2 = new JScrollPane(jt2);
	b.add(sp2);
	b.setSize(300, 400);
	b.setVisible(true);
		 
	//East Carolina multi-dimensional array for stat leaders
	c = new JFrame();
	//Create rows for stat leaders table
	String eastCarolinaLeaders[][] = {{"EAST CAROLINA"," "," "},
										{" ","R. HAND - 21","R. HAND - 6"}	
	};
	//Create columns for outside factors table
	String column3[] = {"GAME","POINTS","REBOUNDS"};
	JTable jt3 = new JTable(eastCarolinaLeaders,column3);
	jt3.setBounds(30,40,200,300);
	JScrollPane sp3 = new JScrollPane(jt3);
	c.add(sp3);
	c.setSize(300, 400);
	c.setVisible(true);
			 
	//East Carolina multi-dimensional array for scouting report
	d = new JFrame();
	//Create rows for scouting report table
	String eastCarolinaReport[][] = {{"EAST CAROLINA"," "},
									{" ","OPPONENT OFFENSE: "},	
									{" ","OPPONENT DEFENSE: "},	
									{" ","OPPONENT ROSTER: "},	
									{" ","OPPONENT OFFENSE: "},	
									{" ","OUR GAME PLAN OFFENSE: "},
									{" ","OUR GAME PLAN DEFENSE: "}	
	};
	//Create columns for scouting report table
	String column4[] = {"GAME","SCOUTING REPORT"};
	JTable jt4 = new JTable(eastCarolinaReport,column4);
	jt4.setBounds(30,40,200,300);
	JScrollPane sp4 = new JScrollPane(jt4);
	d.add(sp4);
	d.setSize(300, 400);
	d.setVisible(true);
}
}
