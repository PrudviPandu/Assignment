import java.util.*;
public class Count{
    public int prime(int x){
        int sum=0;
        int count;
        for (int i=0;i<x;i++)
     {
    	 count=0;
    		 for (int a=1;a<=i;a++)
    		 {
     			if (i%a==0)
     				count++;
     		 }
    	 if (count==2)
    	 	{
    	 			System.out.println(i);
    	 				sum+=i;
			 }
    	
    		
     }
    return sum;
    }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int sum;
		int n=sc.nextInt();
		Count s=new Count();
	    sum=s.prime(n);
	    System.out.println("Sum is ="+sum);
	
	}
}