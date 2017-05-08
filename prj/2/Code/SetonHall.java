import javax.swing.*; //Import all the classes in the util package  

public class SetonHall {
	//Define variables
	JFrame a;
	JFrame b;
	JFrame c;
	JFrame d;
	
	//Create Seton Hall Game
	SetonHall() {
	//Game 3: Seton Hall multi-dimensional stats array
	a = new JFrame();
	//Create rows for stats table
	String setonHallStats[][] = {{"SETON HALL"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ",},
								{" ","01","32","3","8","0.3750","2","6","0.3333","1","2","0.5000","9","1","1","2","2","4","9","1","1"},
						 		{" ","04","18","3","13","0.2308","2","9","0.4000","0","0","0.0000","8","0","2","2","0","2","0","0","1"},
								{" ","05","25","4","7","0.5714","0","2","0.0000","0","1","0.0000","8","1","5","6","3","4","3","2","1"},
								{" ","10","35","4","8","0.5000","0","1","0.0000","2","5","0.4000","10","3","1","10","11","3","4","0","2"},
								{" ","11","0","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
								{" ","14","3","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","1","0","0","0","0"},
								{" ","15","8","1","4","0.2500","0","1","0.0000","0","0","0.0000","2","0","3","3","1","2","2","0","1"},
								{" ","20","23","5","7","0.7143","2","4","0.5000","0","0","0.0000","12","2","1","3","2","5","3","0","0"},
								{" ","22","12","0","1","0.0000","0","1","0.0000","0","0","0.0000","0","0","2","2","2","1","0","0","0"},
								{" ","23","18","0","0","0.0000","0","0","0.0000","3","4","0.7500","3","3","2","5","1","1","2","0","1"}
	};
	//Create columns for stats table
	String column1[]={"GAME","NUMBER","MP","FG","FGA","FG PCT","3FG","3FGA","3FG PCT","FT","FTA","FT PCT","TP","OF","DE","TOT","A","TO","BLK","S"};
	JTable jt1=new JTable(setonHallStats,column1);
	jt1.setBounds(30,40,200,300);
	JScrollPane sp1=new JScrollPane(jt1);
	a.add(sp1);
	a.setSize(300, 400);
	a.setVisible(true);
		
	//Seton Hall multi-dimensional outside factors array
	b = new JFrame();
	//Create rows for outside factors table
	String setonHallFood[][] = {{"SETON HALL"," "," "," "," "," "},
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
	JTable jt2 = new JTable(setonHallFood, column2);
	jt2.setBounds(10,10,5000,20);
	JScrollPane sp2 = new JScrollPane(jt2);
	b.add(sp2);
	b.setSize(300, 400);
	b.setVisible(true);
		 
	//Seton Hall multi-dimensional stat leaders array
	c = new JFrame();
	//Create rows for stat leaders table
	String setonHallLeaders[][] = {{"SETON HALL"," "," "},
									{" ","H. HAND - 12","FITZPATRICK - 11"}	
	};
	//Create columns for stat leaders table
	String column3[] = {"GAME","POINTS","REBOUNDS"};
	JTable jt3 = new JTable(setonHallLeaders,column3);
	jt3.setBounds(30,40,200,300);
	JScrollPane sp3 = new JScrollPane(jt3);
	c.add(sp3);
	c.setSize(300, 400);
	c.setVisible(true);

	//Seton Hall multi-dimensional scouting report array
	d = new JFrame();
	//Create rows for scouting report table
	String setonHallReport[][] = {{"SETON HALL"," "},
									{" ","OPPONENT OFFENSE: "},	
									{" ","OPPONENT DEFENSE: "},	
									{" ","OPPONENT ROSTER: "},	
									{" ","OPPONENT OFFENSE: "},	
									{" ","OUR GAME PLAN OFFENSE: "},
									{" ","OUR GAME PLAN DEFENSE: "}	
	};
	//Create columns for scouting report table
	String column4[] = {"GAME","SCOUTING REPORT"};
	JTable jt4 = new JTable(setonHallReport,column4);
	jt4.setBounds(30,40,200,300);
	JScrollPane sp4 = new JScrollPane(jt4);
	d.add(sp4);
	d.setSize(300, 400);
	d.setVisible(true);
	}
}
