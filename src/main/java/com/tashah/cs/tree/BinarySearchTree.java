package com.tashah.cs.tree;

import com.tashah.cs.node.Node;

public class BinarySearchTree<T extends Comparable<T>> implements ITree<T> {
	
	private Node<T> root = null;
	
	public void add(Node<T> x) {
		if(root == null) {
			root = x;
		}
		else {
			Node<T> temp = root;
			Node<T> kido = null;
			while(temp != null) {
				if(x.getValue().compareTo(temp.getValue()) > 0) {
					kido = temp.getRight();
					if(kido == null) {
						temp.setRight(x);
					} 
				} else {
					kido = temp.getLeft();
					if(kido == null) {
						temp.setLeft(x);
					}
				}
				temp = kido;
			}
		}
		
	}

	public void remove(Node<T> x) {
		
	}

	public void printInOrder() {
		if(this.root != null) {
			traverseInOrder(root);
		}
	}

	public void printPostOrder() {
		if(this.root != null) {
			traversePostOrder(root);
		}
	}

	public void printPreOrder() {
		if(this.root != null) {
			traversePreOrder(root);
		}
	}
	private void traverseInOrder (Node<T> x) {
		if(x != null) {
			System.out.println(x.getValue()+ "  ");
			traverseInOrder(x.getLeft());
			traverseInOrder(x.getRight());
		}
		
	}
	
	private void traversePreOrder (Node<T> x) {
		if(x != null) {
			traverseInOrder(x.getLeft());
			System.out.println(x.getValue()+ "  ");
			traverseInOrder(x.getRight());
		}
		
	}
	
	private void traversePostOrder (Node<T> x) {
		if(x != null) {
			traverseInOrder(x.getLeft());
			traverseInOrder(x.getRight());
			System.out.println(x.getValue()+ "  ");
		}
		
	}

}
