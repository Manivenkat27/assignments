package basicdatastructre;

public class assgn1 {
	public static void main(String[] args) {
		boolean check;
		ArmstrongOrNot obj1 = new ArmstrongOrNot();
		check=obj1.armstrongCheck(371);
		System.out.println(check);

	}
}
class ArmstrongOrNot {
	public int temp,sum=0,length,count=0,Givennum;
	public int len(int num)
	{
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
    public boolean armstrongCheck(int num) {
    	Givennum=num;
    	length=len(num);
    	while(num>0)
    	{
    	temp=num%10;
    	sum=(int)(sum+(Math.pow(temp,length)));
    	num=num/10;
    	}
    	if (sum==Givennum)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    	
    }

}
