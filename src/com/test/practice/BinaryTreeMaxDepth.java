package com.test.practice;

import java.util.LinkedList;
import java.util.Queue;

import com.test.Node;

public class BinaryTreeMaxDepth {

	public static void main(String[] args) {
		
		//			3
		//		9		 20
		//	5		 15	 	  7
		//						8
		Node nd3 = new Node(3);
		Node nd9 = new Node(9);
		Node nd20 = new Node(20);
		Node nd15= new Node(15);
		Node nd7 = new Node(7);
		Node nd8 = new Node(8);
		Node nd5 = new Node(5);
		
		nd3.setLeft(nd9);
		nd3.setRight(nd20);
		
		nd20.setLeft(nd15);
		nd20.setRight(nd7);
		
		nd7.setRight(nd8);
		nd9.setLeft(nd5);
		
		int maxDepth = maxDepth2(nd3);
		System.out.println("maxDepth: " + maxDepth);
	}
	
	public static int maxDepth(Node root) {
        
		if(root==null) {
			return 0;
		}
		
		System.out.println("~~~~~~~~~~~");
		System.out.println("root: " + root.getValue());
		
		int left = maxDepth(root.getLeft());
		int right = maxDepth(root.getRight());
		
		int larger = Math.max(left, right);
		
		//System.out.println("left: " + left);
		//System.out.println("right: " + right);

		return larger+1;
    }
	
	public static int maxDepth2(Node root) {
		
		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);
		
		int count = 0;
		
		while(!nodes.isEmpty()) {
			
			System.out.println("~~~~~~~~~~~");
			
			int size = nodes.size();
			System.out.println("size: " + size);
			count++;
			
			for (int i = 0; i < size; i++) {
				
				Node node = nodes.remove();
				System.out.println("node: " + node.getValue());
				
				if(node.getLeft()!=null) {
					nodes.add(node.getLeft());
				}
				if(node.getRight()!=null) {
					nodes.add(node.getRight());
				}
			}
		}
		
		return count;
	}
	
}
