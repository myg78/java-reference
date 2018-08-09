package com.test.practice;

import com.test.Node;

public class BinaryTree1 {

	private Node root;
	
	public static void main(String[] args) {
	
		BinaryTree1 binaryTree = new BinaryTree1();
		binaryTree.add(6);
		binaryTree.add(4);
		binaryTree.add(8);
		binaryTree.add(3);
		binaryTree.add(5);
		binaryTree.add(7);
		binaryTree.add(9);
		
		binaryTree.traverse();
	}

	public void add(int num) {
		root = add(root, num);
	}
	
	private Node add(Node node, int num) {
		
		if(node==null) {
			return new Node(num);
		}
		
		int currentValue = node.getValue();
		if(num == currentValue) {
			System.out.println("Match do nothing");
		}
		else if(num < currentValue) {
			node.setLeft(add(node.getLeft(), num));
		}
		else if(num > currentValue) {
			node.setRight(add(node.getRight(), num));
		}
		
		return node;
	}
	
	private void traverse() {
		traverse(this.root);
	}
	
	private void traverse(Node node) {
		
		if(node!=null) {
			traverse(node.getLeft());
			traverse(node.getRight());
			System.out.println("node=" + node.getValue());
		}
	}
	
}

