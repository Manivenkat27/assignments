package collections;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class AssignmentQ4 {
	public static void main(String args[])
	{
	DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 
	LocalDate date1 = LocalDate.of(1995, 11, 17);
	LocalDate date2 = LocalDate.of(1980, 5, 14);
	LocalDate date3 = LocalDate.of(2000, 9, 1);
	LocalDate date4 = LocalDate.of(1963, 1, 25);

	LinkedList<LocalDate> d=new LinkedList<>();  
	d.add(date1);  
	d.add(date2);  
	d.add(date3);  
	d.add(date4);  
  
    Iterator itr=d.descendingIterator();  
    while(itr.hasNext()){ 
	    LocalDate date = itr.next();
	    System.out.print("Your date of birth is : "+date.format(f));
   
        if(date.isLeapYear()) {
	        System.out.println(" and it was a leap year.");
        }
        else {
	    System.out.println(" and it was not a leap year.");
        }
    }  
}

	
}
