package basicdatastructre;

public class assgn2 {
	public static void main(String[] args) {
		ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange();
		int a[]=obj.armstrongNumbersInRange(100, 999);
		for (int k=0;k<4;k++)
		{
			System.out.print(a[k]+" ");
		}
	}

}

class ArmstrongNumBetweenRange{
	public int temp,sum=0,count=0,Givennum,num,j=0;
	int array[]= new int[4];
    public int[] armstrongNumbersInRange(int min , int max){
    	int i;
        	
        	for(i=min;i<=max;i++) 
        	{
        		num=i;
        		while (num>0)
        		{
        			temp=num%10;
        			sum=(int)(sum+(Math.pow(temp,3)));
        			num=num/10;
        		}
        		if (sum==i)
        		{
        				array[j]=i;
        				j++;
        		}
        		sum =0;
        	}
        	
        	return array;
    }

}
