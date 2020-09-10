package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.linked_list.impl;

public class DoublyNode<T> {

	protected DoublyLinkedList<T> listReference;
	protected T data;
	protected DoublyNode<T> next;
	protected DoublyNode<T> previous;
	
	public DoublyNode(DoublyLinkedList<T> listRef, T data) {
		this.listReference = listRef;
		this.data = data;
		this.previous = null;
	}
	
	public DoublyNode(DoublyLinkedList<T> listRef, T data, DoublyNode<T> previousNode, DoublyNode<T> nextNode) {
		this.listReference = listRef;
		this.data = data;
		this.next = nextNode;
		this.previous = previousNode;
	}
	
	public boolean hasNext() {
		return next != null;
	}
	
	public boolean hasPrevious() {
		return previous != null;
	}
	
	public void addAfter(T data) {
		DoublyNode<T> node = new DoublyNode<T>(this.listReference, data);
		addAfter(node);
	}
	
	public void addAfter(DoublyNode<T> node) {
		if(this == this.listReference.tail) {
			this.listReference.addLast(node);
		} else {
			this.listReference.addAfter(this, node);
		}
	}
	
	public void addBefore(T data) {
		DoublyNode<T> node = new DoublyNode<T>(this.listReference, data);
		addBefore(node);
	}
	
	public void addBefore(DoublyNode<T> node) {
		if(this == this.listReference.getHead()) {
			this.listReference.addFirst(node);
		} else {
			this.listReference.addBefore(this, node);
		}
	}
	
	public DoublyNode<T> getPrevious() {
		return previous;
	}

	public DoublyLinkedList<T> getListReference() {
		return listReference;
	}

	public T getData() {
		return data;
	}

	public DoublyNode<T> getNext() {
		return next;
	}
}
