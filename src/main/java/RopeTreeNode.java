class RopeTreeNode {
    int len;
    String val;
    RopeTreeNode left;
    RopeTreeNode right;

    public RopeTreeNode() {
    }

    public RopeTreeNode(String val) {
        this.len = 0;
        this.val = val;
    }

    public RopeTreeNode(int len) {
        this.len = len;
        this.val = "";
    }

    public RopeTreeNode(int len, RopeTreeNode left, RopeTreeNode right) {
        this.len = len;
        this.val = "";
        this.left = left;
        this.right = right;
    }
}
