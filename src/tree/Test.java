package tree;

public class Test {
    public static void main(String[] args) {
        Node node=new Node();
        node.setDate(6);
        Tree tree=new Tree(node);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(4);
        tree.insert(7);
        tree.insert(9);
        System.out.println("原二叉树：");
        tree.print();
        System.out.println("对称的为");
        tree.reverse();
        tree.print();
    }
}
