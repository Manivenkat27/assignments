package basicdatastructre;

public class assgn3 {
	public static void main(String[] args) {
		SiCi obj = new SiCi();
		System.out.println(obj.simpleInterest(100000, 3, 3.0));
		System.out.println(obj.compoundInterest(100000, 3, 3.0));
		
		

	}

}
class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate)
    {
    	double simpleIntrest;
    	simpleIntrest=(double)(principalAmount*time*interestRate)/100;
    	return simpleIntrest;
    	
    }
    public double compoundInterest(double principalAmount,int time,double interestRate)
    {
    	double compundIntrest;
    	compundIntrest=(principalAmount*Math.pow(1+(interestRate/100),time))-principalAmount;
    	return compundIntrest;
    }

}
