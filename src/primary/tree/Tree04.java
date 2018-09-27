package primary.tree;

import java.util.LinkedList;
import java.util.List;

public class Tree04 {
    public List<List<Integer>> levelOrder(TreeNode root){
        add(root,0);
        return list;
    }

    private  List<List<Integer>> list = new LinkedList<>();

    private  void add(TreeNode node,int level){
        if(node == null)return;
        if(level<list.size())list.get(level).add(node.val);
        else{
            list.add(new LinkedList<>());
            list.get(level).add(node.val);
        }
        add(node.left,level+1);
        add(node.right,level+1);
    }
}
