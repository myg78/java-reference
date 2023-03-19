package com.test.hackerrank.preordertraversal;

import java.util.*;
import java.io.*;

/***
 * Depth-first search (DFS) - difference in order between root, left, right
 * - Preorder Traversal
 * - Inorder Traversal
 * - Postorder Traversal
 */
public class Solution {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void preOrder(Node root) {
        StringBuilder sb = new StringBuilder();
        preOrder(sb, root);
        System.out.println(sb);
    }

    public static void preOrder(StringBuilder sb, Node node) {
        sb.append(node.data);
        sb.append(" ");
        if (node.left != null) preOrder(sb, node.left);
        if (node.right != null) preOrder(sb, node.right);
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        preOrder(root);
    }




}
