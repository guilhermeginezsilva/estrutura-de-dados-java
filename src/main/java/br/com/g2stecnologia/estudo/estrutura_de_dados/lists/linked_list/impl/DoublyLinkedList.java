package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.linked_list.impl;

public class DoublyLinkedList<T> {
	
	protected DoublyNode<T> head;
	protected DoublyNode<T> tail;
	protected Integer size;
	
	public void addFirst(T nodeData) {
		DoublyNode<T> node = new DoublyNode<T>(this, nodeData);
		addFirst(node);
	}
	
	public void addFirst(DoublyNode<T> node) {
		if(this.head != null) {
			node.next = head;
		} else {
			this.tail = node;
		}
		this.head = node;
		node.previous = null;
		this.increaseSize(1);
	}
	
	public void addLast(T nodeData) {
		DoublyNode<T> node = new DoublyNode<T>(this, nodeData);
		addLast(node);
	}
	
	public void addLast(DoublyNode<T> node) {
		if(this.tail != null) {
			this.tail.next = node;
		} else {
			this.head = node;
		}
		node.previous = this.tail;
		this.tail = node;
		
		this.increaseSize(1);
	}
	
	public void addAfter(DoublyNode<T> referenceNode, DoublyNode<T> newNode) {
		newNode.next = referenceNode.next;
		referenceNode.next = newNode;
		this.increaseSize(1);
	}
	
	public void addBefore(DoublyNode<T> referenceNode, DoublyNode<T> newNode) {
		newNode.previous = referenceNode.previous;
		newNode.next = referenceNode;
		referenceNode.previous = newNode;
		this.increaseSize(1);
	}
	
	public void removeFirst() {
		this.head = this.head.next;
		this.decreaseSize(1);
	}
	
	public void removeLast() {
		DoublyNode<T> currentNode = this.head;
		
		while(currentNode.hasNext() && currentNode.next != this.tail) {
			currentNode = currentNode.next;
		}
		currentNode.next = null;
		this.tail = currentNode;
		this.decreaseSize(1);
	}
	

	
	public void remove(DoublyNode<T> referenceNode) {
		DoublyNode<T> currentNode = this.head;
		
		if(referenceNode == currentNode) {
			this.removeFirst();
			return;
		}
		
		if(referenceNode == this.tail) {
			this.removeLast();
			return;
		}
		
		while(currentNode.hasNext() && currentNode.next != referenceNode) {
			currentNode = currentNode.next;
		}
		
		currentNode.next = currentNode.next.next;
		currentNode.next.next = null;
		this.decreaseSize(1);
	}
	
	public boolean isPresent(DoublyNode<T> referenceNode) {
		DoublyNode<T> node = this.head;
		while(node != null && node != referenceNode) {
			node = node.getNext();
		}
		return node == null? false : true;
	}
	
	public DoublyNode<T> find(T data) {
		DoublyNode<T> node = this.head;
		while(node != null && node.getData() != data) {
			node = node.getNext();
		}
		return node;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	protected void increaseSize(int quantity) {
		this.size += quantity;
	}
	
	protected void decreaseSize(int quantity) {
		this.size -= quantity;
	}

	public DoublyNode<T> getHead() {
		return head;
	}

	public DoublyNode<T> getTail() {
		return tail;
	}

	public Integer getSize() {
		return size;
	}
	
	
	
}
