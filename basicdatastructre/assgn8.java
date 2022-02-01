package basicdatastructre;
class BubbleSort{

    public int[] bubbleSort(int arr[]) 
    {
    	
    	for(int i=0;i<arr.length-1;i++)
    	{	
    		for(int j=0;j<arr.length-i-1;j++)
    		{
    			int temp;
    			
    			if(arr[j]>arr[j+1])
    			{
    				temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    			}		
    		}
    	}
    	return arr;
    }
}

public class assgn8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		BubbleSort bubble = new BubbleSort();
		int arr1[]=bubble.bubbleSort(arr);
		for(int k=0;k<arr1.length;k++)
		{
			System.out.print(arr1[k]+" ");
		}
	}

}
