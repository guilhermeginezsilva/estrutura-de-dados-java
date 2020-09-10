package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.linked_list.impl;

public class Node<T> {

	protected LinkedList<T> listReference;
	protected T data;
	protected Node<T> next;
	
	public Node(LinkedList<T> listRef, T data) {
		this.listReference = listRef;
		this.data = data;
	}
	
	public Node(LinkedList<T> listRef, T data, Node<T> nextNode) {
		this.listReference = listRef;
		this.data = data;
		this.next = nextNode;
	}
	
	public boolean hasNext() {
		return next != null;
	}
	
	public void addAfter(T data) {
		Node<T> node = new Node<T>(this.listReference, data);
		addAfter(node);
	}
	
	public void addAfter(Node<T> node) {
		if(this == this.listReference.tail) {
			this.listReference.addLast(node);
		} else {
			this.listReference.addAfter(this, node);
		}
	}

	public LinkedList<T> getListReference() {
		return listReference;
	}

	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}
	
}
