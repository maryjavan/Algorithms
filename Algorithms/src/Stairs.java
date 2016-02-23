
public class Stairs {
	
public int climbStairs(int n) {
	
	int[] lst= new int[n+1];
	lst[0]=0;
	if (n>0) lst[1]=1;
	if (n>1) lst[2]=2;
	
	for (int i=3;i<=n;i++){
		lst[i]=lst[i-1]+lst[i-2];
	}
	
	return lst[n];
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
