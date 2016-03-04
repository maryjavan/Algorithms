import java.util.Arrays;


public class BSTNum {
	
	 public static int numTrees(int n) {
		 
		 int[] ls=new int[n+1];
		 Arrays.fill(ls, 0);
		 ls[1]=1;
		 if (n<2) return ls[n];
		 
		 for (int i=2;i<=n;i++){
			 for (int j=1;j<=i;j++){
				if (i!=j && j!=1) ls[i]=ls[i]+(ls[j-1]*ls[i-j]);
				else ls[i]=ls[i]+ls[j-1]+ls[i-j];
			 }
		 }
	
		 return ls[n+1];
	    }
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		 System.out.println(numTrees(3));

		}

}
