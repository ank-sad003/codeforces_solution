import java.util.*;
 public class turtle_fingers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0)
		{
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int l=sc.nextInt();
		    Set<Integer> st=new HashSet<>();
		    int x=(int)(Math.log(l)/Math.log(a));
		    int y=(int)(Math.log(l)/Math.log(b));
		    for(int i=0;i<x+2;i++)
		    {
		        for(int j=0;j<y+2;j++)
		        {
		            int k=(int)Math.pow(a,i)*(int)Math.pow(b,j);
		            if(k==0)
		            continue;
		            if(l%k==0 && l>=k)
		            st.add(l/k);
		        }
		    }
		    System.out.println(st.size());
		}
		
	}

}
