package basicdatastructre;

import java.util.Scanner;

public class assgn4 {
	public static void main(String[] args) {
		Scanner sc = new S55canner(System.in);
		ResultDeclaration obj = new ResultDeclaration();
		System.out.println("Enter the number of test cases:");
		int testcase;
		testcase=sc.nextInt();
		int nums[]=new int[3];
		for (int i =0;i<testcase;i++)
		{
			for (int j=0;j<3;j++)
			{
				nums[j]=sc.nextInt();
			}
			System.out.println(obj.declareResults(nums[0],nums[1],nums[2]));
		}
	}

}
class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks)
    {
    	String s="";
    	if(subject1Marks>=60&&subject2Marks>=60&&subject3Marks>=60)
    	{
    		s=s+"Passed";
    	}
    	else if((subject1Marks>=60&&subject2Marks>=60)||(subject2Marks>=60&&subject3Marks>=60)||(subject3Marks>=60&&subject1Marks>=60))
    	{
    		s=s+"Promoted";
    	}
    	else if (((subject1Marks>=60&&subject2Marks<60&&subject3Marks<60)||(subject2Marks>=60&&subject3Marks<60&&subject1Marks<60)||(subject3Marks>=60&&subject1Marks<60&&subject2Marks<60))||(subject1Marks<60&&subject2Marks<60&&subject3Marks<60))
    	{
    		s=s+"Failed";
    	}
    	return s;
    	
    }

}
