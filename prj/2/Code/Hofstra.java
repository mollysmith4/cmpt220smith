import javax.swing.*; //Import all the classes in the util package

public class Hofstra {
	//Define variables
	JFrame a;
	JFrame b;
	JFrame c;
	JFrame d;
	
	//Create Hofstra Game
	Hofstra() {
	//Game 1: Hofstra multi-dimensional array for stats
    a = new JFrame();
    //Create rows for stats table
	String hofstraStats[][] = {{"HOFSTRA"," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," ",},
								{" ","01","28","1","3","0.3333","0","1","0.0000","1","2","0.5000","2","1","2","3","1","0","2","0","0"},
			 					{" ","04","27","3","13","0.2308","1","7","0.1429","3","4","0.7500","10","2","3","5","3","1","5","0","2"},
								{" ","05","12","1","2","0.5000","1","2","0.5000","0","0","0.0000","3","0","2","2","2","0","3","0","0"},
								{" ","10","34","4","10","0.4000","0","1","0.0000","4","6","0.6667","12","5","5","10","4","1","2","0","1"},
								{" ","11","2","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
								{" ","14","2","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","0","0","0","0","0","0","0"},
								{" ","15","7","0","0","0.0000","0","0","0.0000","0","0","0.0000","0","0","1","1","4","0","1","0","0"},
								{" ","20","31","3","6","0.5000","0","3","0.0000","2","5","0.4000","8","1","7","8","2","2","1","0","1"},
								{" ","22","24","0","2","0.0000","0","1","0.0000","0","0","0.0000","0","0","5","5","3","3","1","0","2"},
								{" ","23","33","1","9","0.1111","0","5","0.0000","4","4","1.0000","6","0","4","4","1","3","0","0","0"}
	 };
	//Create columns for stats table
	String column1[] = {"GAME","NUMBER","MP","FG","FGA","FG PCT","3FG","3FGA","3FG PCT","FT","FTA","FT PCT","TP","OF","DE","TOT","A","TO","BLK","S"};
	JTable jt1 = new JTable(hofstraStats,column1);
	jt1.setBounds(30,40,200,300);
	JScrollPane sp1 = new JScrollPane(jt1);
	a.add(sp1);
	a.setSize(300, 400);
	a.setVisible(true);
	 
	//Hofstra multi-dimensional array for outside factors
	b = new JFrame();
	//Create rows for outside factors table
	String hofstraOutside[][] = {{"HOFSTRA"," "," "," "," "," "},
	 							{" ","01","small Build Your Own Sandwich- Foccacia bread, breaded chicken cutlet, provolone, spinach,roasted peppers, and basil pesto","water","8","0"},
	 							{" ","04","small - focaccia w chicken cutlet MOZZARELLA, TOMATO & BASIL pesto panini","lemonade","8","0"},
	 							{" ","05","Small Build Your Own Sandwich - Foccacia bread, breaded chicken cutlet, mozzarella, basil pesto","water","8","0"},
	 							{" ","10","small - Build Your Own Sandwich- Foccacia bread, breaded chicken cutlet, mozzarella, roasted peppers, artichoke hearts, spinach, and basil pesto","water","8","0"},
	 							{" ","11","small - Chicken Cutlet and Prosciutto, fresh mozzarela, roasted peppers, balsamic on foccacia panini","water","8","0"},
	 							{" ","14","Small Build Your Own Sandwich - Foccacia bread, breaded chicken cutlet, mozzarella, spinach, basil pesto","water","8","0"},
	 							{" ","15","Small Build Your Own Sandwich - Foccacia bread, breaded chicken cutlet, mozzarella, spinach, basil pesto","water","8","0"},
	 							{" ","20","Small Build Your Own Sandwich - Foccacia bread, breaded chicken cutlet, mozzarella, basil pesto","water","8","0"},
	 							{" ","22","Small Build Your Own Sandwich - Foccacia bread, breaded chicken cutlet, mozzarella, spinach, basil pesto","water","8","0"},
	 							{" ","23","Small Build Your Own Sandwich - Foccacia bread, breaded chicken cutlet, mozzarella, basil pesto","water","8","0"}
	};
	//Create columns for outside factors table
	String column2[] = {"GAME","PLAYER","MEAL","DRINK","SLEEP HRS","RECOVERY DAYS B/W GAMES"};
	JTable jt2 = new JTable(hofstraOutside, column2);
	jt2.setBounds(10,10,5000,20);
	JScrollPane sp2 = new JScrollPane(jt2);
	b.add(sp2);
	b.setSize(300, 400);
	b.setVisible(true);
	 
	//Hofstra multi-dimensional array for stat leaders
	c = new JFrame();
	//Create rows for stat leaders table
	String hofstraLeaders[][] = {{"HOFSTRA"," "," "},
								{" ","FITZPATRICK - 12","FITZPATRICK - 10"}	
	};
	//Create columns for stat leaders table
	String column3[] = {"GAME","POINTS","REBOUNDS"};
	JTable jt3 = new JTable(hofstraLeaders,column3);
	jt3.setBounds(30,40,200,300);
	JScrollPane sp3 = new JScrollPane(jt3);
	c.add(sp3);
	c.setSize(300, 400);
	c.setVisible(true);
	 
	//Hofstra multi-dimensional array for scouting report
	d = new JFrame();
	//Create rows for scouting report table
	String hofstraReport[][] = {{"HOFSTRA"," "},
								{" ","OPPONENT OFFENSE: "},	
								{" ","OPPONENT DEFENSE: "},	
								{" ","OPPONENT ROSTER: "},	
								{" ","OPPONENT OFFENSE: "},	
								{" ","OUR GAME PLAN OFFENSE: "},
								{" ","OUR GAME PLAN DEFENSE: "}	
	};
	//Create columns for scouting report table
	String column4[] = {"GAME","SCOUTING REPORT"};
	JTable jt4 = new JTable(hofstraReport,column4);
	jt4.setBounds(30,40,200,300);
	JScrollPane sp4 = new JScrollPane(jt4);
	d.add(sp4);
	d.setSize(300, 400);
	d.setVisible(true);
	
	}
}
