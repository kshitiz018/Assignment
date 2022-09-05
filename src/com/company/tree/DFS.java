package com.company.tree;

import java.util.Scanner;

class Node1 {
    int data;
    Node left, right;

    Node1(int value) {
        data = value;
        left = right = null;
    }
}

class Tree1 {
    Node root;

    Tree1() {
        root = null;
    }
    // Method to construct a binary tree from the given array
    public Node insertNode(int[] elementsArr, Node node, int i) {
        if(i < elementsArr.length){
            node = new Node(elementsArr[i]);
            node.left = insertNode(elementsArr,node.left,2 * i + 1);
            node.right = insertNode(elementsArr,node.right,2 * i + 2);
        }
        return node;
    }
    // Method to find the height of a binary tree
    public int findHeight(Node node) {
        if (node == null)
            return 0;
        int leftHeight = 1 + findHeight(node.left);
        int rightHeight = 1 + findHeight(node.right);

        if (leftHeight > rightHeight)
            return leftHeight;
        else
            return rightHeight;
    }
    // Method to print the tree in pre-order traversal
    void preOrderDFS(Node node) {
        if (node == null)
            return;

        // visit the parent node (parent of left & right children)
        System.out.print(node.data + " ");

        // recursively go to left subtree
        preOrderDFS(node.left);

        // recursively go to right subtree
        preOrderDFS(node.right);
    }

    // Method to print the tree in in-order traversal
    void inOrderDFS(Node node) {
        if (node == null)
            return;

        // recursively go to left subtree
        inOrderDFS(node.left);

        // visit the parent node (parent of left & right children)
        System.out.print(node.data + " ");

        // recursively go to right subtree
        inOrderDFS(node.right);
    }

    // Method to print the tree in post-order traversal
    void postOrderDFS(Node node) {
        if (node == null)
            return;

        // recursively go to left subtree
        postOrderDFS(node.left);

        // recursively go to right subtree
        postOrderDFS(node.right);

        // visit the parent node (parent of left & right children)
        System.out.print(node.data + " ");
    }
}

public class DFS {
    public static void main(String[] args) {
        Tree1 tree = new Tree1();
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the tree : ");
        size = sc.nextInt();
        if (size < 0) {
            System.out.println("Size should be a positive integer");
        } else {
            System.out.print("Enter Tree Elements : ");
            int[] elementsArr = new int[size];
            for (int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
            }

            tree.root = tree.insertNode(elementsArr, tree.root, 0);
            System.out.print("Post Order Traversal is : ");
            tree.postOrderDFS(tree.root);
            System.out.println();
            System.out.print("In Order Traversal is : ");
            tree.inOrderDFS(tree.root);
            System.out.println();
            System.out.print("Pre Order Traversal ia : " );
            tree.preOrderDFS(tree.root);
            System.out.println();
            System.out.print("Height of the tree is : "+tree.findHeight(tree.root));
        }
    }
}

