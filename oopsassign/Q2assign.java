package oopsassign;

import java.util.ArrayList;

/*class Employee{

}*/
class Manager extends Q2assign
{ public int getSalary(int salary)
	{ int incentive =5000;
	int totals=incentive+salary;
	return totals;
	}}
class Labour extends Q2assign
{
	public int getSalary(int salary)
	{ int overtime=500;
	int totals=salary+overtime;
		return totals;
	}
}
public class Q2assign {
	int salary=10000;
	public int getsalary(int salary) {
		this.salary=salary;
		return salary;
		
	}
	public int
	totalEmployeesSalary(ArrayList<Integer>employeesalaries)
	{
		int totals=0;
		for(int i:employeesalaries)
		{
			totals+=i;
		}
		return totals;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q2assign q=new Q2assign ();
		Manager m=new Manager();
		int ms=m.getSalary(q.salary);
		Labour l=new Labour();
		int ls=l.getSalary(q.salary);
		ArrayList<Integer> employeesalariesList=new ArrayList<>();
		employeesalariesList.add(ms);
		employeesalariesList.add(ls);
		int total=q.totalEmployeesSalary(employeesalariesList);
		System.out.println(total);
		}
	}

