package com.test.practice;

import java.util.LinkedList;
import java.util.Queue;

import com.test.Node;

public class BinaryTree1 {

	private Node root;
	
	public static void main(String[] args) {

		//			6
		//		4		8
		//	  3   5   7   9
		BinaryTree1 binaryTree = new BinaryTree1();
		binaryTree.add(6);
		binaryTree.add(4);
		binaryTree.add(8);
		binaryTree.add(3);
		binaryTree.add(5);
		binaryTree.add(7);
		binaryTree.add(9);
		
		//System.out.println(binaryTree.isValidBST());
		//System.out.println(binaryTree.isValidBST(getData(), Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY));
		
		System.out.println(binaryTree.contains(20));
		
		binaryTree.traverse();
	}
	
	private static Node getData() {
		
		//		10
		//	12
		Node n1 = new Node(10);
		n1.setLeft(new Node(12));
		
		//		10
		//	6
		Node n2 = new Node(10);
		n2.setLeft(new Node(6));
		
		//		10
		//			6
		Node n3 = new Node(10);
		n3.setRight(new Node(6));
		
		//		10
		//			12
		Node n4 = new Node(10);
		n4.setRight(new Node(12));
		
		//			10
		//		6		 15
		//	 4	  8   11	20
		Node nd10 = new Node(10);
		Node nd6 = new Node(6);
		Node nd4 = new Node(4);
		Node nd8 = new Node(8);
		Node nd15 = new Node(15);
		Node nd11 = new Node(11);
		Node nd20 = new Node(20);
		
		nd10.setLeft(nd6);
		nd10.setRight(nd15);
		
		nd6.setLeft(nd4);
		nd6.setRight(nd8);
		
		nd15.setLeft(nd11);
		nd15.setRight(nd20);
		
		return nd10;
	}
	
	public Node getRoot() {
		return root;
	}
	
	public void add(int num) {
		root = addNode(root, num);
	}
	
	public Node addNode(Node node, int num) {
		
		if(node == null) {
			return new Node(num);
		}
		
		int currentValue = node.getValue();
		
		if(num == currentValue) {
			//do nothing since already present
			System.out.println("Match found");
		}
		else if(num < currentValue) {
			node.setLeft(addNode(node.getLeft(), num));
		}
		else if(num > currentValue) {
			node.setRight(addNode(node.getRight(), num));
		}
		
		return node;
	}
	
	public void traverse() {
		traverseNode(root);
	}
	
	private void traverseNode(Node node) {
		
		if(node!=null) {
			System.out.println(node.getValue());
			traverseNode(node.getLeft());
			traverseNode(node.getRight());
		}
	}
	
	public void traverseLevelOrder() {
		
		//use queue for FIFO
		Queue<Node> nodes = new LinkedList<>();
		
		//add root
		nodes.add(root);
		
		while(!nodes.isEmpty()) {
			
			//get current node
			Node node = nodes.remove();
			System.out.println(node.getValue());
			
			//add children
			if(node.getLeft()!=null) {
				nodes.add(node.getLeft());
			}
			if(node.getRight()!=null) {
				nodes.add(node.getRight());
			}
		}
	}
	
	public boolean contains(int num) {
		return containsNode(root, num);
	}
	
	private boolean containsNode(Node node, int num) {
		
		int currentValue = node.getValue();
		if(num == currentValue) {
			return true;
		}
		else if(num < currentValue) {
			if(node.getLeft()!=null) {
				return containsNode(node.getLeft(), num);
			}
			else {
				return false;
			}
		}
		else if(num > currentValue) {
			if(node.getRight()!=null) {
				return containsNode(node.getRight(), num);
			}
			else {
				return false;
			}
		}
		
		return false;
	}
	
	public boolean isValidBST() {
		return isValidBST(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
	}
	
	public boolean isValidBST(Node node, double min, double max) {
		
		if(node==null) {
			return true;
		}
		
		int currentValue = node.getValue();
		System.out.println("currentValue: " + currentValue + " min: " + min + " max: " + max);
		
		if(currentValue <= min || currentValue >= max) {
			return false;
		}
		
		return isValidBST(node.getLeft(), min, currentValue) && isValidBST(node.getRight(), currentValue, max);
	}
	
	
}

