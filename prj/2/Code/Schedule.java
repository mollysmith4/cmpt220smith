import javax.swing.*; //Import all the classes in the util package

public class Schedule {
		//Define variables
		JFrame a;
		
		//Create Schedule
		Schedule() {
			//Schedule multi-dimensional array
		    a=new JFrame();
		    
		    //Create rows for table
		    String roster[][]={{" ","FRI., NOV. 11","HOFSTRA","@ HEMPSTEAD, NY","5:00 PM","L, 62-42","1"},
		    				{" ","SUN., NOV. 13","RHODE ISLAND","@ KINGSTON, RI","2:00 PM","L, 82-61","2"},
		    				{" ","TUE., NOV. 15","SETON HALL","POUGHKEEPSIE, NY","7:00 PM","L, 76-63","3"},
		    				{" ","SAT., NOV. 19","HOLY CROSS","@ WORCESTER, MA","1:05 PM","L, 50-46","4"},
		    				{" ","TUE., NOV. 22","EAST CAROLINA","@ SAVANNAH, GA","2:00 PM","L, 70-68","5"},
		    				{" ","WED., NOV. 23","AUBURN","@ SAVANNAH, GA","7:00 PM","L, 52-51","6"},
		    				{" ","THU., NOV. 24","NORTH CAROLINA A&T","@ SAVANNAH, GA","2:00 PM","W, 69-64","7"},
		    				{" ","TUE., NOV. 29","MANHATTAN","@ RIVERDALE, NY","7:00 PM","W, 62-47","8"},
		                          };    
		    //Create columns for table
		    String column[]={"SCHEDULE","DATE","OPPONENT","LOCATION","TIME(EST)","RESULTS","GAME#"};         
		    JTable jt=new JTable(roster,column);    
		    jt.setBounds(30,40,200,300);          
		    JScrollPane sp=new JScrollPane(jt);    
		    a.add(sp);          
		    a.setSize(300,400);    
		    a.setVisible(true);
		}
		

}
