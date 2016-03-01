import java.util.ArrayList;


public class FlattenTree {

	
public void flatten(TreeNode root) {
	
	
	if (root==null) return;
	
	
	flatten(root.left);
	flatten(root.right);
	TreeNode temp=root.left;
	
	if (temp!=null){
	while (temp.right!=null)
		temp=temp.right;
	
	temp.right=root.right;
	root.right=root.left;
	root.left=null;
	}
        
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
