import java.util.Arrays;

public class CoinChange {
	
	
public int coinChange(int[] coins, int amount) {
	
	int[] ls= new int[amount+1];
	Arrays.fill(ls, Integer.MAX_VALUE);
	ls[0]=0;
	
	for (int i=1; i<=amount; i++){
		for (int j=0; j<coins.length;j++){
			
			if (i==coins[j]) ls[i]=1;
			else if (i> coins[j] && ls[i-coins[j]]!=Integer.MAX_VALUE && ls[i-coins[j]]+1 < ls[i])
				ls[i]=ls[i-coins[j]]+1;
		}
		
	}
	if (ls[amount]==Integer.MAX_VALUE) return -1;
	return ls[amount];
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
