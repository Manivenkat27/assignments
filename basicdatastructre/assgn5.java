package basicdatastructre;

public class assgn5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TaxAmount obj = new TaxAmount();
		int ctc;
		ctc = sc.nextInt();
		System.out.println("The tax that should be paid for the ctc "+ctc+" is "+obj.calculateTaxAmount(ctc));

	}

}
class TaxAmount{
	double tax;
    public double calculateTaxAmount(int ctc)
    {
    	if (ctc>0&&ctc<=180000)
    	{
    		tax=(0*ctc)/100;
    	}
    	else if(ctc>181001&&ctc<=300000)
    	{
    		tax=(10*ctc)/100;
    	}
    	else if(ctc>300001&&ctc<=500000)
    	{
    		tax=(20*ctc)/100;
    	}
    	else if(ctc>500001&&ctc<=1000000)
    	{
    		tax=(30*ctc)/100;
    	}
    	return tax;		
    }
	

}
