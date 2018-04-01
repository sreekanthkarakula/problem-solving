package com.sree.Trees;

public class Node {
	
	public Node(String value){
		
		this.value = value;
	}

    Node leftChild;

    Node rightChild;

    String value;

    public Node getLeftChild() { return leftChild; }

    public Node getRightChild() { return rightChild; }

    public String getValue() { return value; }

}