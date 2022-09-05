package com.company.tree;

// class representing a node (element) in a tree
class Node {
    int data; // value contained inside a node
    Node left, right; // left & right children of a node

    // constructor to set the data of a node to the passed value and make it a leaf node
    Node(int value) {
        data = value;
        left = right = null;
    }
}

// class representing a binary tree
class tree {
    Node root; // root node of the binary tree

    // constructor to create an empty tree with no root node
    tree() {
        root = null;
    }
}

// driver class to create tree and test code
public class Tree {

    public static void main(String[] args) {
        tree tree = new tree(); // constructing an empty tree

        tree.root = new Node(1); // adding the root node

        tree.root.left = new Node(2); // adding left child of root node
        tree.root.right = new Node(3); // adding right child of root node

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
    }
}