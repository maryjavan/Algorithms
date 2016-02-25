
public class Paths {

public static int uniquePaths(int m, int n) {
	
int[][] grid = new int[m][n];
	
	
	for (int i=1; i<=m; i++){
		for (int j=1; j<=n; j++){
			if (i==1 || j==1) grid[i-1][j-1]=1;
			else grid[i-1][j-1]=grid[i-1][j-2]+grid[i-2][j-1];
			}
		
	}
	
	return grid[m-1][n-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(uniquePaths(1,2));

	}

}
