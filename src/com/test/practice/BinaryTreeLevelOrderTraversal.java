package com.test.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.test.Node;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		
		List<List<Integer>> levels = levelOrder(getData2());
		
		System.out.println(levels);
	}
	
	public static List<List<Integer>> levelOrder(Node root) {
        
		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);
		
		List<Integer> nodesByLevel = new ArrayList<>();
		List<List<Integer>> levels = new ArrayList<>();
		
		while(!nodes.isEmpty()) {
			
			System.out.println("~~~~~~~~~~~~~~~");
			
			int size = nodes.size();
			System.out.println("size: " + size);
			
			for (int i = 0; i < size; i++) {
				
				Node node = nodes.remove();
				System.out.println("node: " + node.getValue());
				nodesByLevel.add(node.getValue());
				
				if(node.getLeft()!=null) {
					nodes.add(node.getLeft());
				}
				if(node.getRight()!=null) {
					nodes.add(node.getRight());
				}
			}
			
			levels.add(nodesByLevel);
			nodesByLevel = new ArrayList<>();
		}
		
		return levels;
    }
	
	private static Node getData1() {
		//			3
		//		9		 20
		//			 15	 	  7
		Node nd3 = new Node(3);
		Node nd9 = new Node(9);
		Node nd20 = new Node(20);
		Node nd15= new Node(15);
		Node nd7 = new Node(7);
		
		nd3.setLeft(nd9);
		nd3.setRight(nd20);
		
		nd20.setLeft(nd15);
		nd20.setRight(nd7);
		
		return nd3;
	}
	
	private static Node getData2() {
		//			3
		//		9		 20
		//  5		 15	 	  7
		//		  12     	
		Node nd3 = new Node(3);
		Node nd9 = new Node(9);
		Node nd20 = new Node(20);
		Node nd15= new Node(15);
		Node nd7 = new Node(7);
		Node nd12 = new Node(12);
		Node nd5 = new Node(5);
		
		nd3.setLeft(nd9);
		nd3.setRight(nd20);
		
		nd9.setLeft(nd5);
		
		nd20.setLeft(nd15);
		nd20.setRight(nd7);
		
		nd15.setLeft(nd12);
			
		return nd3;
	}
	
}
