package com.tashah.cs.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import com.tashah.cs.node.Node;

public class BinaryTree<T extends Comparable<T>> implements ITree<T>{

	private Node<T> root,left, right;
	
	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getRight() {
		return right;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public void add(Node<T> x) {
		if(x != null) {
			if(root == null) {
				root = x;
				return;
			}
			else {
				Queue<Node<T>> q = new LinkedList<Node<T>>();
				q.add(root);
				while(!q.isEmpty()) {
					Node<T> node = q.poll();
					if(node.getLeft() == null) {
						node.setLeft(x);
						break;
					} else {
						q.add(node.getLeft());
					}
					if(node.getRight() == null) {
						node.setRight(x);
						break;
					} else {
						q.add(node.getRight());
					}
				}
			}
		}
	}

	public void remove(Node<T> x) {
		// TODO Auto-generated method stub
		
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

	public void printPath() {
		Node<T> x =root;
		
		HashMap<String, Node<T>> map = new HashMap<String, Node<T>>();
		
		getPathMap(root, map, "");
		System.out.println(map);
//		String key = "";
//		Queue<Node<T>> q = new LinkedList<Node<T>>();
//		q.add(x);
//		while(!q.isEmpty()) {
//			x = q.poll();
//			if(x != null) {
//				
//				if(x.getLeft() != null) {
//					key = key +"L";
//					map.put(key, x.getLeft() );
//					q.add(x.getLeft());
//				} 
//				if(x.getRight() != null) {
//					key = key +"R";
//					map.put(key, x.getRight() );
//					q.add(x.getRight());
//				}
//			}
//		}
//		System.out.println(map);
	}
	
	private void getPathMap(Node<T> x, Map<String, Node<T>> map,String key){
		
		if(x.getLeft() != null) {
			map.put(key+"L", x.getLeft());
			getPathMap(x.getLeft(), map, key+"L");
		}
		if(x.getRight() != null) {
			map.put(key+"R", x.getRight());
			getPathMap(x.getRight(), map, key+"R");
		}
		
		
	}
	
}
