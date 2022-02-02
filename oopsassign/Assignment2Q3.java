package oopsassign;

import java.util.ArrayList;

public class Assignment2Q3 {
	public int getCash()
    {
    	return 0;

    }
	public static void main(String[] args) 
	{
		Assignment2Q3 objA =new Assignment2Q3();
		ArrayList<Integer> Cash = new ArrayList<Integer>();
		CurrentAccount objC = new CurrentAccount();
		System.out.println(objC.getCash());
		SavingsAccount objS = new SavingsAccount();
		System.out.println(objS.getCash());
		Cash.add(objC.getCash());
		Cash.add(objS.getCash());
		System.out.println(objA.totalCashInBank(Cash));
	}
	 public int totalCashInBank(ArrayList<Integer> cash)
	 {
		 int sum=0;
		 for(int i: cash)
		 {
			 sum=sum+i;
		 }
		 return sum;
	 }

}
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() 
    {
    	return totalDeposits-creditLimit;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash()
    {
    	return totalDeposits+fixedDepositAmount;
    }

}
