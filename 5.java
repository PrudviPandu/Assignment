import java.util.*;
public class Count{
    public void reverse(String []arr){
        
			for(int i=0;i<arr.length;i++){
			 
			 
			 StringBuilder s = new StringBuilder("");
			    x=arr[i].length()-1;
			   
			    for (int j=0;j<=x;j++){
			      s.append(arr[i].charAt(x-j));
			      
			    }
			    
			    return s;
			}
            re	
    }
    
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Sentence");
		while(sc.hasNext()){
			String p=sc.nextLine();
			String[] arr=p.split(" ");
			
			int x,h;
			int word=0;
			Count a=new Count();
			 System.out.print(a.reverse(arr));
			
		}
	}
}