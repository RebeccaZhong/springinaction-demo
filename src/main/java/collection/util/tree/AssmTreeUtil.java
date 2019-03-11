package collection.util.tree;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 组装树结构数据类
 * @Author: Rebecca Zhong
 * @Description:
 * @Date: Created in 2019/3/7 10:28
 */
public class AssmTreeUtil {
    /**
     * 组装树结构数据的方法
     */
    public static List<TreeNode> assmTree(List<TreeNode> singleTreeNodes) {
        // 判断排序数据是否为空
        if(singleTreeNodes == null || singleTreeNodes.isEmpty()) {
            return null;
        }
        // 用有序Map把传参组装起来
        Map<String,TreeNode> nodeId2treeNodes = new LinkedHashMap<String,TreeNode>();
        for(TreeNode node : singleTreeNodes){
            TreeNode treeNode = new TreeNode();
            treeNode.setNodeId(node.getNodeId());
            treeNode.setNodeName(node.getNodeName());
            treeNode.setPid(node.getPid());
            nodeId2treeNodes.put(node.getNodeId(), treeNode);
        }
        // 用来保存组装好的数据, 作为返回值
        List<TreeNode> topNodeTrees = new ArrayList<TreeNode>();
        // 遍历所有节点
        for(String nodeId : nodeId2treeNodes.keySet()){
            TreeNode treeNode = nodeId2treeNodes.get(nodeId);
            String pid = treeNode.getPid();
            // 当前节点的父id为空 或 整个列表中没有以此父id作为自己的id的情况
            // 即当前节点是根节点
            if(pid==null || pid.length()==0 || !nodeId2treeNodes.containsKey(pid)){
                // treeNode.setPid(""); // 此处可以根据需要调整父id的值
                topNodeTrees.add(treeNode);
            }else{ // 不是父节点, 作为子节点添加进去
                TreeNode parentTreeNode = nodeId2treeNodes.get(pid);
                if(parentTreeNode.getChildren()==null){
                    parentTreeNode.setChildren(new ArrayList<TreeNode>());
                }
                parentTreeNode.getChildren().add(treeNode);
            }
        }
        return topNodeTrees;
    }
}
