package com.sree.Trees;

public class BinaryTreeMain {

	
	public static void main(String args[]){
		
		Node rootnode = new Node("A");
		
		Node b = new Node("B");
		
		rootnode.leftChild = b;
		
		Node c = new Node("C");
		
		rootnode.rightChild = c;
		
		Node d = new Node("D");
		
		rootnode.leftChild.leftChild = d;
		
		Node e = new Node("E");

		rootnode.leftChild.rightChild = e;
	
		TraverseTreeImpl root = new TraverseTreeImpl("A");
		
		root.preordertraverse(rootnode);
		
		root.inordertraverse(rootnode);
		
		root.printPath(b);
	}
	
}
