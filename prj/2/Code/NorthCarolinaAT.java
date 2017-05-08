import javax.swing.*; //Import all the classes in the util package

public class NorthCarolinaAT {
	//Define variables
	JFrame a;
	JFrame b;
	JFrame c;
	JFrame d;
	
	//Create North Carolina A&T Game
	NorthCarolinaAT() {
	//Game 7: North Carolina A&T multi-dimensional array for stats table
	a = new JFrame();
	
	//Create rows for stats table
	String northCarolinaATStats[][] = {{"NORTH CAROLINA A&T"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ",},
									{" ","01","40","0","6","0.0000","0","5","0.0000","13","16","0.8125","13","1","4","5","2","3","6","0","2"},
				 					{" ","04","00","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","05","24","0","4","0.0000","0","3","0.0000","0","0","0.0000","0","0","3","3","4","3","1","2","0"},
									{" ","10","24","2","4","0.5000","0","1","0.0000","2","2","1.0000","6","0","1","1","5","0","2","0","0"},
									{" ","11","2","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","14","4","0","2","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","15","8","1","3","0.3333","0","1","0.0000","0","0","0.0000","2","0","0","0","1","0","0","0","0"},
									{" ","20","37","5","9","0.5555","1","3","0.3333","2","2","1.0000","13","2","2","4","1","2","2","0","1"},
									{" ","22","26","3","8","0.3750","1","1","1.0000","0","1","0.0000","7","1","6","7","2","1","0","2","0"},
									{" ","23","37","9","18","0.5000","5","11","0.4545","5","5","1.0000","28","4","8","12","2","3","1","1","0"}
	};
	//Create columns for stats table
	String column1[]={"GAME","NUMBER","MP","FG","FGA","FG PCT","3FG","3FGA","3FG PCT","FT","FTA","FT PCT","TP","OF","DE","TOT","A","TO","BLK","S"};
	JTable jt1=new JTable(northCarolinaATStats,column1);
	jt1.setBounds(30,40,200,300);
	JScrollPane sp1=new JScrollPane(jt1);
	a.add(sp1);
	a.setSize(300, 400);
	a.setVisible(true);
	
	//North Carolina A&T multi-dimensional array for outside factors table
	b = new JFrame();
	//Create rows for outside factors table
	String northCarolinaATFood[][] = {{"NORTH CAROLINA A&T"," "," "," "," "," "},
		 								{" ","01","tuna melt on wheat bread, garden side salad w italian dressing","lemonade","8","1"},
		 								{" ","04","steak & cheese sub with mushrooms, peppers, onions, chili cheese fries","lemonade","8","1"},
		 								{" ","05","Chicken caesar wheat wrap, small fries, side ranch","lemonade","8","1"},
		 								{" ","10","phat chick sandwich on a sub, sweet potatoe fries","iced tea","8","1"},
		 								{" ","11","Turkey Club, no tomato, wheat toast","water","8","1"},
		 								{" ","14","Phat chick wrap, tater tots, side of ranch","Sprite","8","1"},
		 								{" ","15","phat chick sub, no bacon, small steak fries, side ranch","water","8","1"},
		 								{" ","20","turkey delight with no tomatoes/side of ranch","water","8","1"},
		 								{" ","22","greek grilled chicken salad","water","8","1"},
		 								{" ","23","BBQ crispy wrap (wheat) and cheese fries","water","8","1"}
	};
	//Create columns for outside factors table
	String column2[] = {"GAME","PLAYER","MEAL","DRINK","SLEEP HRS","RECOVERY DAYS B/W GAMES"};
	JTable jt2 = new JTable(northCarolinaATFood, column2);
	jt2.setBounds(10,10,5000,20);
	JScrollPane sp2 = new JScrollPane(jt2);
	b.add(sp2);
	b.setSize(300, 400);
	b.setVisible(true);
	
	//North Carolina A&T multi-dimensional array for stat leaders table
	c = new JFrame();
	//Create rows for stat leaders table
	String northCarolinaATLeaders[][] = {{"NORTH CAROLINA A&T"," "," "},
										{" ","R. HAND - 28","R. HAND - 12"}	
	};
	//Create columns for stat leaders table
	String column3[] = {"GAME","POINTS","REBOUNDS"};
	JTable jt3 = new JTable(northCarolinaATLeaders,column3);
	jt3.setBounds(30,40,200,300);
	JScrollPane sp3 = new JScrollPane(jt3);
	c.add(sp3);
	c.setSize(300, 400);
	c.setVisible(true);
			 
	//North Carolina A&T multi-dimensional array for scouting report table
	d = new JFrame();
	//Create rows for scouting report table
	String northCarolinaATReport[][] = {{"NORTH CAROLINA A&T"," "},
										{" ","OPPONENT OFFENSE: "},	
										{" ","OPPONENT DEFENSE: "},	
										{" ","OPPONENT ROSTER: "},	
										{" ","OPPONENT OFFENSE: "},	
										{" ","OUR GAME PLAN OFFENSE: "},
										{" ","OUR GAME PLAN DEFENSE: "}	
	};
	//Create columns for scouting report table
	String column4[] = {"GAME","SCOUTING REPORT"};
	JTable jt4 = new JTable(northCarolinaATReport,column4);
	jt4.setBounds(30,40,200,300);
	JScrollPane sp4 = new JScrollPane(jt4);
	d.add(sp4);
	d.setSize(300, 400);
	d.setVisible(true);
}

}
