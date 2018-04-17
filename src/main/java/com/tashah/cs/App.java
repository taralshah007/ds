package com.tashah.cs;

import com.tashah.cs.node.Node;
import com.tashah.cs.tree.BinarySearchTree;
import com.tashah.cs.tree.ITree;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Node<Double> x = new Node<Double>(.5);	
        BinarySearchTree<Double> tree = new BinarySearchTree<Double>();
        tree.add(new Node<Double>(5.3));
        tree.add(new Node<Double>(6.3));
        tree.add(new Node<Double>(2.3));
        tree.add(new Node<Double>(8.3));
        tree.add(new Node<Double>(11.3));
        tree.add(new Node<Double>(99.3));
        Node<Double> y = new Node<Double>(89.3);
        tree.add(y);
        tree.add(new Node<Double>(0.3));
        
        tree.printInOrder();
        
        System.out.println("pre order");
        tree.printPreOrder();
        System.out.println("post order");
        tree.printPostOrder();
        
//        tree.printPath();
        
        tree.findPathToNode(y);
        
    }
}
