package com.tashah.cs.tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

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

	public void printPath() {
		Node<T> x =root;
		
		HashMap<String, Node<T>> map = new LinkedHashMap<String, Node<T>>();
		
		getPathMap(root, map, "");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key: "+key +" Value:" + map.get(key).getValue());
		}
		
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
