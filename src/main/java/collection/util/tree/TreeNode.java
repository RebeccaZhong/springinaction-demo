package collection.util.tree;

import java.util.List;

public class TreeNode {
    /**
     * 父节点ID
     */
    private String pid;
    /**
     * 节点ID
     */
    private String nodeId;
    /**
     * 节点名称
     */
    private String nodeName;
    /**
     * 子节点
     */
    private List<TreeNode> children;

    public TreeNode() {
    }

    public TreeNode(String pid, String nodeId, String nodeName) {
        this.pid = pid;
        this.nodeId = nodeId;
        this.nodeName = nodeName;
    }

    public String getPid() {
        return pid;
    }
    public void setPid(String pid) {
        this.pid = pid;
    }
    public String getNodeId() {
        return nodeId;
    }
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }
    public String getNodeName() {
        return nodeName;
    }
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }
    public List<TreeNode> getChildren() {
        return children;
    }
    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
}
