package problemsolving.tree;

import lombok.Getter;

@Getter
public class BinaryTreeNode {

    private final int data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    public BinaryTreeNode(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public BinaryTreeNode getLeft(){
        return left;
    }

    public BinaryTreeNode getRight(){
        return right;
    }

    public BinaryTreeNode addLeft(int value){
        this.left = new BinaryTreeNode(value);
        return this.left;
    }

    public BinaryTreeNode addLeft(BinaryTreeNode leftChild){
        this.left = leftChild;
        return this.left;
    }

    public BinaryTreeNode addRight(int value) {
        this.right = new BinaryTreeNode(value);
        return this.right;
    }

    public BinaryTreeNode addRight(BinaryTreeNode rightChild){
        this.right = rightChild;
        return this.right;
    }

}
