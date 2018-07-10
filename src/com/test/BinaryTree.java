package com.test;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	
	private Node root;
	
	public static void main(String[] args) {
		
		//try search using dummy data
//		Node root = new Node(6);
//		Node n4 = new Node(4);
//		Node n8 = new Node(8);
//		root.setLeft(n4);
//		root.setRight(n8);
//		
//		Node n7 = new Node(7);
//		Node n9 = new Node(9);
//		n8.setLeft(n7);
//		n8.setRight(n9);
//		
//		Node n3 = new Node(3);
//		Node n5 = new Node(5);
//		n4.setLeft(n3);
//		n4.setRight(n5);
		
		BinaryTree binaryTree = new BinaryTree();
		
		binaryTree.add(6);
		binaryTree.add(4);
		binaryTree.add(8);
		binaryTree.add(3);
		binaryTree.add(5);
		binaryTree.add(7);
		binaryTree.add(9);
		
//		boolean match = binaryTree.contains(4);
//		System.out.println("match=" + match);
		
		binaryTree.traverse();
		binaryTree.traverseLevelOrder();
		System.out.println();
	}
	
	private void add(int num) {
		root = addNode(root, num);
	}
	
	private Node addNode(Node node, int num) {//TODO return type
		
		System.out.println("~~~~~~~~~~~~");
		System.out.println("addNode=" + num);
		if(node == null) {
			System.out.println("new node");
			return new Node(num);
		}
		
		int currentValue = node.getValue();
		System.out.println("current=" + currentValue);
		
		if(num == currentValue) {
			System.out.println("match current");
		}
		else if(num < currentValue) {
			System.out.println("check left");
			node.setLeft(addNode(node.getLeft(), num));
		}
		else if(num > currentValue) {
			System.out.println("check right");
			node.setRight(addNode(node.getRight(), num));
		}
		
		return node;
	}
	
	private boolean contains(int num) {
		return containsNode(this.root, num);
	}
	
	private boolean containsNode(Node node, int num) {
		
		System.out.println("~~~~~~~~~~~~~");
		int value = node.getValue();
		System.out.println("node=" + value + " num=" + num);
		
		if(num==value) {
			System.out.println("found at current node");
			return true;
		}
		else if (num>value) {//search right
			System.out.println("search right");
			if(node.getRight()!=null) {
				return containsNode(node.getRight(), num);
			}
			else {
				return false;
			}
		} 
		else if (num<value) {//search left
			System.out.println("search left");
			if(node.getLeft()!=null) {
				return containsNode(node.getLeft(), num);
			}
			else {
				return false;
			}
		} 
		
		return false;
	}
	
	private void traverse() {
		System.out.println("traverse:");
		traverseNode(this.root);
	}
	
	private void traverseNode(Node node) {
		
		if(node!=null) {
			System.out.println("node=" + node.getValue());
			traverseNode(node.getLeft());
			traverseNode(node.getRight());
		}
	}
	
	private void traverseLevelOrder() {
		
		System.out.println("traverseLevelOrder:");
		
	    if (this.root == null) {
	        return;
	    }
	 
	    Queue<Node> nodes = new LinkedList<>();
	    nodes.add(this.root);
	 
	    while (!nodes.isEmpty()) {
	 
	        Node node = nodes.remove();
	 
	        System.out.print(" " + node.getValue());
	 
	        if (node.getLeft() != null) {
	            nodes.add(node.getLeft());
	        }
	 
	        if (node.getRight() != null) {
	            nodes.add(node.getRight());
	        }
	    }
	}
	
}
