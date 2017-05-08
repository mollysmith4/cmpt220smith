import javax.swing.*; //Import all the classes in the util package   

public class Auburn {
	//Define variables
	JFrame a;
	JFrame b;
	JFrame c;
	JFrame d;
	
	//Create Auburn Game
	Auburn() {
	//Game 6: Auburn multi-dimensional array for stats
	a = new JFrame();
	
	//Create rows for stats table
	String auburnStats[][] = {{"AUBURN"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ",},
								{" ","01","39","2","5","0.4000","2","4","0.5000","3","4","0.3750","9","0","2","2","4","1","4","0","1"},
				 				{" ","04","00","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
								{" ","05","30","1","9","0.1111","1","6","0.1667","4","4","1.0000","7","0","7","7","4","1","3","2","1"},
								{" ","10","36","3","9","0.3333","0","1","0.0000","0","0","0.0000","6","1","5","0","2","2","6","0","0"},
								{" ","11","2","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
								{" ","14","2","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
								{" ","15","14","0","1","0.0000","0","0","0.0000","0","0","0.0000","0","1","1","2","0","0","4","1","0"},
								{" ","20","30","4","7","0.5714","4","7","0.5714","2","2","1.0000","14","4","5","9","4","2","6","0","0"},
								{" ","22","14","1","2","0.5000","1","1","1.0000","2","2","1.0000","5","0","2","2","0","0","1","0","0"},
								{" ","23","37","2","9","0.2222","2","7","0.2857","4","4","1.0000","10","1","4","5","2","3","6","1","2"}
	};
	//Create columns for stats table
	String column1[]={"GAME","NUMBER","MP","FG","FGA","FG PCT","3FG","3FGA","3FG PCT","FT","FTA","FT PCT","TP","OF","DE","TOT","A","TO","BLK","S"};
	JTable jt1=new JTable(auburnStats,column1);
	jt1.setBounds(30,40,200,300);
	JScrollPane sp1=new JScrollPane(jt1);
	a.add(sp1);
	a.setSize(300, 400);
	a.setVisible(true);
		 
	//Auburn multi-dimensional array for outside factors
	b = new JFrame();
	//Create rows for outside factors table
	String auburnFood[][] = {{"AUBURN"," "," "," "," "," "},
		 					{" ","01","#3 Totally Tuna ","lemonade","8","1"},
		 					{" ","04","Italian Night Club, no onions, add hot peppers","lemonade","8","1"},
		 					{" ","05","#12 beach club on wheat bread, no mayo","lemonade","8","1"},
		 					{" ","10","beach club, light mayo","iced tea","8","1"},
		 					{" ","11","club lulu no tomato","water","8","1"},
		 					{" ","14","Club lulu add onions","Sprite","8","1"},
		 					{" ","15","club lulu, no tomatoes","water","8","1"},
		 					{" ","20","#1 Pepe with no tomatoes and mayo","water","8","1"},
		 					{" ","22","country club, no tomoates or mayo","water","8","1"},
		 					{" ","23","club lulu no tomato","water","8","1"}
	};
	//Create columns for outside factors table
	String column2[] = {"GAME","PLAYER","MEAL","DRINK","SLEEP HRS","RECOVERY DAYS B/W GAMES"};
	JTable jt2 = new JTable(auburnFood, column2);
	jt2.setBounds(10,10,5000,20);
	JScrollPane sp2 = new JScrollPane(jt2);
	b.add(sp2);
	b.setSize(300, 400);
	b.setVisible(true);
		 
	//Auburn multi-dimensional array for stat leaders
	c = new JFrame();
	//Create rows for stat leaders table
	String auburnLeaders[][] = {{"AUBURN"," "," "},
								{" ","H. HAND - 14","H. HAND - 9"}	
	};
	//Create columns for stat leaders table
	String column3[] = {"GAME","POINTS","REBOUNDS"};
	JTable jt3 = new JTable(auburnLeaders,column3);
	jt3.setBounds(30,40,200,300);
	JScrollPane sp3 = new JScrollPane(jt3);
	c.add(sp3);
	c.setSize(300, 400);
	c.setVisible(true);
			 
	//Auburn multi-dimensional array for scouting report 
	d = new JFrame();
	//Create rows for scouting report table
	String auburnReport[][] = {{"AUBURN"," "},
								{" ","OPPONENT OFFENSE: "},	
								{" ","OPPONENT DEFENSE: "},	
								{" ","OPPONENT ROSTER: "},	
								{" ","OPPONENT OFFENSE: "},	
								{" ","OUR GAME PLAN OFFENSE: "},
								{" ","OUR GAME PLAN DEFENSE: "}	
	};
	//Create columns for scouting report table
	String column4[] = {"GAME","SCOUTING REPORT"};
	JTable jt4 = new JTable(auburnReport,column4);
	jt4.setBounds(30,40,200,300);
	JScrollPane sp4 = new JScrollPane(jt4);
	d.add(sp4);
	d.setSize(300, 400);
	d.setVisible(true);
}
}
