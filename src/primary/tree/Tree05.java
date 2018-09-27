package primary.tree;

/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树
 */
public class Tree05 {
    public TreeNode sortedArrayToBST(int[] nums){
        if(nums == null || nums.length ==0)return null;
        return getTree(nums,0,nums.length-1);//二分查找
    }

    private TreeNode getTree(int[] nums, int l, int r) {
        if(l <= r){
           int mid = (l+r)/2;
           TreeNode node = new TreeNode(nums[mid]);
           node.left = getTree(nums,l,mid-1);
           node.right=getTree(nums,mid+1,r);
           return node;
        }else{
            return null;
        }
    }

}
