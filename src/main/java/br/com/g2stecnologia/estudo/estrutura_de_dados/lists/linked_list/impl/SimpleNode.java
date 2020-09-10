package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.linked_list.impl;

public class SimpleNode<T> {

	protected T data;
	protected SimpleNode<T> next;

	public SimpleNode(T data) {
		this.data = data;
	}

	public SimpleNode(T data, SimpleNode<T> nextNode) {
		this.data = data;
		this.next = nextNode;
	}
	
	public boolean hasNext() {
		return next != null;
	}
	
	public T getData() {
		return data;
	}

	public SimpleNode<T> getNext() {
		return next;
	}
	
}
