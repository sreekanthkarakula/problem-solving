package com.sree.Trees;

public class TraverseTreeImpl implements TraverseTree{
	
	public Node root = null;
	
	public StringBuilder preorder_path;
	
	public StringBuilder inorder_path;
	
	
	public TraverseTreeImpl(String init){
		
		preorder_path = new StringBuilder();
		
		inorder_path = new StringBuilder();
		
	}
	
	public void display(){
		//display the elements of an array
	}

	@Override
	public Node getParent(Node referenceNode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printPath(Node ref) {
		
		System.out.println("this is the inorder traversal path " + inorder_path);
		System.out.println("this is the preorder traversal path " + preorder_path);
		
		StringBuilder pathtonode = new StringBuilder();
		
		char rootnode = preorder_path.charAt(0);
		
		System.out.println("tree root is " + rootnode);
		
		String tofind = ref.value;
		
		if( ref.value.chars().equals(rootnode)  )
			
			System.out.println("you tried to search for root node and here is its path " +  preorder_path.charAt(0) );
		
		else{
			//write code to do check if it is part of left subtree or right subtree
			
			int rootnode_index = inorder_path.toString().indexOf(rootnode);
			
			System.out.println("left sub tree is " + inorder_path.substring(0, rootnode_index) );
			
			System.out.println("right sub tree is " + inorder_path.substring(rootnode_index+1, inorder_path.length()));
			
			String tree = "";
			
			while(tree.length()>0){
				
				if(inorder_path.substring(0, rootnode_index).contains(tofind)){
					  tree = inorder_path.substring(0, rootnode_index);
					} else if(inorder_path.substring(rootnode_index+1, inorder_path.length()).contains(tofind)) {
						tree = inorder_path.substring(rootnode_index+1, inorder_path.length());
					}
					else System.out.println("the one you are searching is not present is not present");
				
			}
			
			
			
			
			
			
		}
			
		
	}
	
	public void preordertraverse(Node n){
		
		preorder(n);
		
	}
	
	public void inordertraverse(Node n){
		
		inorder(n);
		
	}

	private void preorder(Node m) {
		// TODO Auto-generated method stub
		
		if(m==null) return;
		
		preorder_path.append( m.value);
		//System.out.println("this is the preorder root" + m.value);
		preorder(m.leftChild);
		preorder(m.rightChild);
		
	}
	
	private void inorder(Node n){
		
		if(n == null) return;
			
		inorder(n.leftChild);	
		inorder_path.append(n.value);
		//System.out.println("this is the inorder root" + n.value);
		inorder(n.rightChild);
		
	}
	
}
