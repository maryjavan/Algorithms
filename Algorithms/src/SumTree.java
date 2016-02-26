import java.util.ArrayList;
import java.util.List;

public class SumTree {

private	List<List<Integer>> finRes= new ArrayList<List<Integer>>();
	
public List<List<Integer>> pathSum(TreeNode root, int sum) {
	recpath(new ArrayList<Integer>(),root,sum);
	return finRes;
     
}

private void recpath (List<Integer> res, TreeNode node, int sum){
	
	if (node==null) return;
	res.add(node.val);
	if (node.left==null && node.right==null){
		if (sum-node.val==0)finRes.add(res);
		return;
	}
	
	recpath(new ArrayList<Integer>(res), node.left, sum-node.val);
	recpath(new ArrayList<Integer>(res), node.right, sum-node.val);

	
}
	
	
	
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
