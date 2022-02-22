package lambdafunctions;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class AssignmentQ4 {
	public String name;
	public static  ArrayList<String> removeOddLength(ArrayList<String> employeeList)
	{
		ArrayList<String> employeeList_filtered = employeeList.stream()
				.filter(p->p.length()%2==0)
				.collect(Collectors.toCollection(ArrayList::new));
		return employeeList_filtered;
	}

	public static void main(String[] args)
	{
		ArrayList<String> employeeList = new ArrayList<String>();
		employeeList.add("mani");
		employeeList.add("surya");
		employeeList.add("pavan");
		employeeList.add("naveen");
		ArrayList<String> employeeList2=removeOddLength(employeeList);
		for(String a: employeeList2 )
		{
			System.out.println(a);
		}

	}

}
