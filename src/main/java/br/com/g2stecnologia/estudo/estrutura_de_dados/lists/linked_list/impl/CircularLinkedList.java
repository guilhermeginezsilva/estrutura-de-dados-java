package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.linked_list.impl;

public class CircularLinkedList<T> extends DoublyLinkedList<T> {
	
	protected void updateHeaderAndTail() {
		this.head.previous = this.tail;
		this.tail.next = this.head;
	}
	
	@Override
	public void addFirst(T data) {
		super.addFirst(data);
		updateHeaderAndTail();
	}
	
	@Override
	public void addFirst(DoublyNode<T> node) {
		super.addFirst(node);
		updateHeaderAndTail();
	}
	
	@Override
	public void addLast(T nodeData) {
		super.addLast(nodeData);
		updateHeaderAndTail();
	}
	
	@Override
	public void addLast(DoublyNode<T> node) {
		super.addLast(node);
		updateHeaderAndTail();
	}
	
	@Override
	public void addAfter(DoublyNode<T> referenceNode, DoublyNode<T> newNode) {
		super.addAfter(referenceNode, newNode);
		updateHeaderAndTail();
	}
	
	@Override
	public void addBefore(DoublyNode<T> referenceNode, DoublyNode<T> newNode) {
		super.addBefore(referenceNode, newNode);
		updateHeaderAndTail();
	}
	
	@Override
	public void removeFirst() {
		super.removeFirst();
		updateHeaderAndTail();
	}
	
	@Override
	public void removeLast() {
		super.removeLast();
		updateHeaderAndTail();
	}
	
	@Override
	public void remove(DoublyNode<T> referenceNode) {
		super.remove(referenceNode);
		updateHeaderAndTail();
	}
	
	@Override
	public boolean isPresent(DoublyNode<T> referenceNode) {
		DoublyNode<T> node = this.head;
		
		if(node == referenceNode) {
			return true;
		} else {
			node = node.getNext();
		}
		
		while(node != null && node != referenceNode && node != this.head) {
			node = node.getNext();
		}
		return node == null? false : true;
	}
	
	@Override
	public DoublyNode<T> find(T data) {
		DoublyNode<T> node = this.head;
		
		if(node.data == data) {
			return node;
		} else {
			node = node.getNext();
		}
		
		while(node != null && node.getData() != data && node != this.head) {
			node = node.getNext();
		}
		return node;
	}
	
}
