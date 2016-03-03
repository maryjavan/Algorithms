
public class LCA {

public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
     
	if (root==null || root==p || root==q)
		return root;
	
	TreeNode r=lowestCommonAncestor(root.right,p,q);
	TreeNode l=lowestCommonAncestor(root.left,p,q);
	
	if (r!=null && l!=null) return root;
	if (r==null) return l;
	else return r;
	
    }
}
