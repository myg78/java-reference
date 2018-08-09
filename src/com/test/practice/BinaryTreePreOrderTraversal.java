package com.test.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.test.Node;

public class BinaryTreePreOrderTraversal {

	
	public static void main(String[] args) {
			
		//			6
		//		4		8
		//	  3   5   7   9
		
		//int[] arr = {6,4,3,5,8,7,9};
		int[] arr = {6,4,5,3,8,7,9};
//		boolean valid = isValidPreOrderTraversal(arr, arr.length);
		
		boolean valid = isValidPreOrderTraversal2(arr);
		System.out.println("valid: " + valid);
	}
	
	private static boolean isValidPreOrderTraversal(int[] pre, int length) {
		
		Stack<Integer> stack = new Stack<>();
		
		int root = 0;

		for (int i = 0; i < length; i++) {
			
			System.out.println("~~~~~~~~~~~");
			System.out.println("i: " + pre[i]);
			System.out.println("root: " + root);
			
			if(pre[i] < root) {
				return false;
			}

			while(!stack.isEmpty() && stack.peek() < pre[i]) {
				System.out.println("peek: " + stack.peek());
				root = stack.peek();
				stack.pop();
			}
			
			System.out.println("push: " + pre[i]);
			stack.push(pre[i]);
		}
		
		return true;
	}
	
	private static boolean isValidPreOrderTraversal2(int[] arr) {
		
		printArrayLine(arr);
		
		//convert array to binary tree
		BinaryTree1 binaryTree = new BinaryTree1();
		for (int i = 0; i < arr.length; i++) {
			binaryTree.add(arr[i]);
		}
		
		//traverse binary tree using pre-order traversal
		int[] preOrder = traversePreOrder(binaryTree.getRoot());
		printArrayLine(preOrder);
		
		//compare 2 arrays
		boolean valid = compareArrays(arr, preOrder);
		
		return valid;
	}
	
	private static int[] traversePreOrder(Node node) {
		
		List<Integer> list = new ArrayList<>();
		traverseNode(node, list);
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
	
	private static void traverseNode(Node node, List<Integer> list) {
		
		if(node!=null) {
			list.add(node.getValue());
			//System.out.println(node.getValue());
			traverseNode(node.getLeft(), list);
			traverseNode(node.getRight(), list);
		}
	}
	
	private static boolean compareArrays(int[] arr1, int[] arr2) {
		
		if(arr1==null || arr2==null) {
			return false;
		}
		if(arr1.length!=arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	private static void printArrayLine(int[] array) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
