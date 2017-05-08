import javax.swing.*; //Import all the classes in the util package   

public class Manhattan1 {
	//Define variables
	JFrame a;
	JFrame b;
	JFrame c;
	JFrame d;
	
	//Create Manhattan1 Game
	Manhattan1() {
	//Game 8: Manhattan1 multi-dimensional array for stats table
	a = new JFrame();
	
	//Create rows for stats table
	String manhattan1Stats[][] = {{"MANHATTAN1"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "},
									{" ","01","37","1","6","0.1667","1","4","0.2500","2","2","1.0000","5","0","6","6","1","3","1","0","1"},
				 					{" ","04","00","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","05","31","3","7","0.4286","1","4","0.2500","0","0","0.0000","7","1","7","8","3","2","2","2","2"},
									{" ","10","39","3","9","0.3333","2","4","0.5000","5","6","0.8333","13","3","4","7","0","1","1","0","0"},
									{" ","11","0","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","14","0","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
									{" ","15","10","0","2","0.0000","0","0","0.0000","0","0","0.0000","0","1","1","2","1","2","0","0","0"},
									{" ","20","33","4","10","0.4000","3","6","0.5000","1","2","0.5000","12","1","6","7","3","4","2","0","0"},
									{" ","22","13","0","2","0.0000","0","0","0.0000","0","0","0.0000","0","1","3","4","0","1","0","0","1"},
									{" ","23","37","9","18","0.5000","4","10","0.4000","3","3","1.0000","25","3","4","7","3","2","4","2","1"}
	};
	//Create columns for stats table
	String column1[]={"GAME","NUMBER","MP","FG","FGA","FG PCT","3FG","3FGA","3FG PCT","FT","FTA","FT PCT","TP","OF","DE","TOT","A","TO","BLK","S"};
	JTable jt1=new JTable(manhattan1Stats,column1);
	jt1.setBounds(30,40,200,300);
	JScrollPane sp1=new JScrollPane(jt1);
	a.add(sp1);
	a.setSize(300, 400);
	a.setVisible(true);
		 
	//Manhattan1 multi-dimensional array for outside factors table 
	b = new JFrame();
	//Create rows for outside factors table
	String manhattan1Food[][] = {{"MANHATTAN1"," "," "," "," "," "},
		 						{" ","01","tuna melt on wheat bread, garden side salad w italian dressing","lemonade","8","5"},
		 						{" ","04","steak & cheese sub with mushrooms, peppers, onions, chili cheese fries","lemonade","8","5"},
		 						{" ","05","Chicken caesar wheat wrap, small fries, side ranch","lemonade","8","5"},
		 						{" ","10","phat chick sandwich on a sub, sweet potatoe fries","iced tea","8","5"},
		 						{" ","11","Turkey Club, no tomato, wheat toast","water","8","5"},
		 						{" ","14","Phat chick wrap, tater tots, side of ranch","Sprite","8","5"},
		 						{" ","15","phat chick sub, no bacon, small steak fries, side ranch","water","8","5"},
		 						{" ","20","turkey delight with no tomatoes/side of ranch","water","8","5"},
		 						{" ","22","greek grilled chicken salad","water","8","5"},
		 						{" ","23","BBQ crispy wrap (wheat) and cheese fries","water","8","5"}
	};
	//Create columns for outside factors table
	String column2[] = {"GAME","PLAYER","MEAL","DRINK","SLEEP HRS","RECOVERY DAYS B/W GAMES"};
	JTable jt2 = new JTable(manhattan1Food, column2);
	jt2.setBounds(10,10,5000,20);
	JScrollPane sp2 = new JScrollPane(jt2);
	b.add(sp2);
	b.setSize(300, 400);
	b.setVisible(true);
		 
	//Manhattan1 multi-dimensional array for stat leaders table
	c = new JFrame();
	//Create rows for stat leaders table
	String manhattan1Leaders[][] = {{"MANHATTAN1"," "," "},
									{" ","R. HAND - 25","HENNINGSDOTTIR - 8"}	
	};
	//Create columns for stat leaders table
	String column3[] = {"GAME","POINTS","REBOUNDS"};
	JTable jt3 = new JTable(manhattan1Leaders,column3);
	jt3.setBounds(30,40,200,300);
	JScrollPane sp3 = new JScrollPane(jt3);
	c.add(sp3);
	c.setSize(300, 400);
	c.setVisible(true);
			 
	//Manhattan1 multi-dimensional array for scouting report table
	d = new JFrame();
	//Create rows for scouting report table
	String manhattan1Report[][] = {{"MANHATTAN1"," "},
									{" ","OPPONENT OFFENSE: "},	
									{" ","OPPONENT DEFENSE: "},	
									{" ","OPPONENT ROSTER: "},	
									{" ","OPPONENT OFFENSE: "},	
									{" ","OUR GAME PLAN OFFENSE: "},
									{" ","OUR GAME PLAN DEFENSE: "}	
	};
	//Create columns for scouting report table
	String column4[] = {"GAME","SCOUTING REPORT"};
	JTable jt4 = new JTable(manhattan1Report,column4);
	jt4.setBounds(30,40,200,300);
	JScrollPane sp4 = new JScrollPane(jt4);
	d.add(sp4);
	d.setSize(300, 400);
	d.setVisible(true);
}
}
