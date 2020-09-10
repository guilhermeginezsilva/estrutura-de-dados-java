package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.linked_list.impl;

public class LinkedList<T> {

	protected Node<T> head;
	protected Node<T> tail;
	protected Integer size;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public LinkedList(Node<T> rootNode) {
		this.head = rootNode;
		this.tail = rootNode;
		this.size = 1;
	}
	
	public void addFirst(T nodeData) {
		Node<T> node = new Node<T>(this, nodeData);
		addFirst(node);
	}
	
	public void addFirst(Node<T> node) {
		if(this.head != null) {
			node.next = head;
		} else {
			this.tail = node;
		}
		this.head = node;
		this.increaseSize(1);
	}
	
	public void addLast(T nodeData) {
		Node<T> node = new Node<T>(this, nodeData);
		addLast(node);
	}
	
	public void addLast(Node<T> node) {
		if(this.tail != null) {
			this.tail.next = node;
		} else {
			this.head = node;
		}
		this.tail = node;
		this.increaseSize(1);
	}
	
	public void addAfter(Node<T> referenceNode, Node<T> newNode) {
		newNode.next = referenceNode.next;
		referenceNode.next = newNode;
		this.increaseSize(1);
	}
	
	public void removeFirst() {
		this.head = this.head.next;
		this.decreaseSize(1);
	}
	
	public void removeLast() {
		Node<T> currentNode = this.head;
		
		while(currentNode.hasNext() && currentNode.next != this.tail) {
			currentNode = currentNode.next;
		}
		currentNode.next = null;
		this.tail = currentNode;
		this.decreaseSize(1);
	}
	
	public void remove(Node<T> referenceNode) {
		Node<T> currentNode = this.head;
		
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
	
	public boolean isPresent(Node<T> referenceNode) {
		Node<T> node = this.head;
		while(node != null && node != referenceNode) {
			node = node.getNext();
		}
		return node == null? false : true;
	}
	
	public Node<T> find(T data) {
		Node<T> node = this.head;
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

	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public Integer getSize() {
		return size;
	}
	
	
	
}
