import javax.swing.*; //Import all the classes in the util package   

public class Roster {
	JFrame a;
	Roster() {
		//Roster multi-dimensional array
	    a=new JFrame();    
	    
	    //Create rows for table
	    String roster[][]={{" ","01","OBERDORF","CLAIRE","GUARD","66","000"},
	    				{" ","04","CLEMENT","ALLIE","GUARD","68","000"},
	    				{" ","05","HENNINGSDOTTIR","LOVISA","FORWARD","74","000"},
	    				{" ","10","FITZPATRICK","MAURA","GUARD","71","000"},
	    				{" ","14","JOSSART","JORDYN","GUARD","68","000"},
	    				{" ","15","BAAB","KENDALL","FORWARD","74","000"},
	    				{" ","20","HAND","HANNAH","GUARD","70","000"},
	    				{" ","22","BARTNER","MORGAN","FORWARD","74","000"},
	    				{" ","23","HAND","REBEKAH","GUARD","71","000"}
	                          };    
	    //Create columns for table
	    String column[]={"ROSTER","NUMBER","LAST NAME","FIRST NAME","POSITION","HEIGHT(in.)","WEIGHT(lbs.)"};         
	    JTable jt=new JTable(roster,column);    
	    jt.setBounds(30,40,200,300);          
	    JScrollPane sp=new JScrollPane(jt);    
	    a.add(sp);          
	    a.setSize(300,400);    
	    a.setVisible(true);
	}
	
	
		
		
}

