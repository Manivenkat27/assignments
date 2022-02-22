package collections;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class AssignmentQ3 {
	public static void main(String args[]){
	Employee E1= new Employee(11803304,"Pavan Kumar","CSE",400000);
	Employee E2= new Employee(11904656,"Mani venkat","MEC",100000);
	Employee E3= new Employee(11702345,"Jai Surya","ECE",200000);
	Employee E4= new Employee(11904125,"Naveen","EEE",300000);
	Employee E5= new Employee(11906657,"Vinay","MEC",500000);
	Employee E6= new Employee(11900988,"Mutthada Vinay","CSE",600000);
	Employee E7= new Employee(11901435,"Akhil","CSE",700000);
	Employee E8= new Employee(11906785,"Bhargav","MEC",800000);
	Employee E9= new Employee(11900065,"Rohith","ECE",900000);
	Employee E10= new Employee(11906745,"Harsha","EEE",1000000);
	 Scanner sc = new Scanner(System.in);
	 System.out.println("a) ID"+"\n"+"b) Name"+"\n"+"c) Department"+"\n"+"d) Salary"+"\n");
	 System.out.println("enter your choice: ");
	 String Choice;
	 Choice=sc.nextLine();
	 TreeSet<Employee> TS = new TreeSet<Employee>(Collections.reverseOrder());
	 TS.add(E1);
	 TS.add(E2);
	 TS.add(E3);
	 TS.add(E4);
	 TS.add(E5);
	 TS.add(E6);
	 TS.add(E7);
	 TS.add(E8);
	 TS.add(E9);
	 TS.add(E10);
	 if (Choice.equalsIgnoreCase("a"))
	 {
		 for(Employee E: TS)
		 {
			 System.out.println(E.ID);
		 }
	 }
	 else if (Choice.equalsIgnoreCase("b"))
	 {
		 for(Employee E: TS)
		 {
			 System.out.println(E.Name);
		 }
	 }
	 else if (Choice.equalsIgnoreCase("c"))
	 {
		 for(Employee E: TS)
		 {
			 System.out.println(E.Department);
		 }
	 }
	 else if (Choice.equalsIgnoreCase("d"))
	 {
		 for(Employee E: TS)
		 {
			 System.out.println(E.Salary);
		 }
	 }
	 
	 
}

}

class Employee implements Comparable<Employee>
{
int ID;
String Name;
String Department;
double Salary;
public Employee()
{
	
}
public Employee(int ID,String Name,String Department,double Salary)
{
	this.ID=ID;
	this.Name=Name;
	this.Department=Department;
	this.Salary=Salary;
}
public int compareTo(Employee E)
{
    if (ID >E.ID) {
        return 1;
    }
    else if (ID < E.ID) {
        return -1;
    }
    else {
        return 0;
    }
}

}
