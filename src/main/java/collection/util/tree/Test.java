package collection.util.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试组装树结构方法
 * @Author: Rebecca Zhong
 * @Description:
 * @Date: Created in 2019/3/7 10:31
 * @Modified By:
 */
public class Test {
    public static void main(String[] args) {
        List<TreeNode> singleNodes = new ArrayList<TreeNode>();
        singleNodes.add(new TreeNode("a","1","节点1"));
        singleNodes.add(new TreeNode("b","2","节点2"));
        singleNodes.add(new TreeNode("c","3","节点3"));
        singleNodes.add(new TreeNode("1","4","节点1-1"));
        singleNodes.add(new TreeNode("2","5","节点2-1"));
        singleNodes.add(new TreeNode("1","6","节点1-3"));
        singleNodes.add(new TreeNode("1","7","节点1-2"));
        singleNodes.add(new TreeNode("2","8","节点2-2"));
        List<TreeNode> treeNodes = AssmTreeUtil.assmTree(singleNodes);
        outputResult(treeNodes);
    }

    private static void outputResult(List<TreeNode> treeNodes) {
        for (TreeNode treeNode : treeNodes) {
            System.out.println("nodeId: " + treeNode.getNodeId() + "; pid: " + treeNode.getPid() + "; name: "+treeNode.getNodeName());
            List<TreeNode> childrenNode = treeNode.getChildren();
            if (childrenNode != null) {
                outputResult(childrenNode);
            }
        }
    }
}
