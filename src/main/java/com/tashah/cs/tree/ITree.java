package com.tashah.cs.tree;

import com.tashah.cs.node.Node;

public interface ITree<T extends Comparable<T>> {
	void add(Node<T> x);
	void remove(Node<T> x);
	void printInOrder();
	void printPostOrder();
	void printPreOrder();
}
