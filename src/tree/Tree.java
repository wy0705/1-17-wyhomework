package tree;

import java.util.ArrayList;

class Node{
    private int date;
    private Node left=null;
    private Node right=null;
    private int hight;
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public Node(int hight) {
        this.hight = hight;
    }

    public Node(){}

}
public class Tree {
    private Node root;

    public Tree(Node root) {
        this.root = root;
        this.root.setHight(0);
    }
    //构建树

    public void insert(int date){
        Node node=new Node(0);
        node.setDate(date);
        insert(node,root);
    }

    public void insert(Node node,Node pronode){

            if (node.getDate() == pronode.getDate()) {
                System.out.println("该节点已存在");
                return;
            } else {
                node.setHight(node.getHight()+1);
                if (node.getDate() >pronode.getDate()){
                    if (pronode.getRight()==null){
                        pronode.setRight(node);
                        return;
                    }else {
                        insert(node,pronode.getRight());
                    }
                }else {
                    if (pronode.getLeft()==null){
                        pronode.setLeft(node);
                        return;
                    }else {
                        insert(node,pronode.getLeft());
                    }
                }
            }

    }
    //遍历
    public ArrayList<Node> traverse(){
        ArrayList<Node> arrayList=new ArrayList<Node>();
        traverse(root,arrayList);
        return arrayList;
    }
    public void traverse(Node node,ArrayList<Node> arrayList){
        if (node!=null){
            arrayList.add(node);
            traverse(node.getLeft(),arrayList);
            traverse(node.getRight(),arrayList);
        }
        return;
    }
    //反向
    public void reverse(){
        ArrayList<Node> arrayList=traverse();
        Node t=new Node();
        for (Node node:arrayList){
            t=node.getLeft();
            node.setLeft(node.getRight());
            node.setRight(t);
        }
    }
    //输出
    public void print(){
        ArrayList<Node> arrayList=traverse();
        int maxhight=0;
        for(Node node:arrayList){
            if (node.getHight()>maxhight){
                maxhight=node.getHight();
            }
        }
        for (int i = 0; i <=maxhight; i++) {
            for (Node node:arrayList){
                if (node.getHight()==i)
                    System.out.print(node.getDate()+"\t");
            }
            System.out.println();
        }
    }
}
