package com.sree.Trees;

public interface TraverseTree {
	

    //for example, if referenceNode is ‘E’ then return node ‘B’

    public Node getParent(Node referenceNode);



    //for example, if referenceNode is ‘E’ then print to standard out “EBA”

    public void printPath(Node referenceNode);

}
