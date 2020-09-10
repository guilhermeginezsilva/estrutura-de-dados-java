package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.linked_list.impl;

import br.com.g2stecnologia.estudo.estrutura_de_dados.array.util.TeamMembers;

import static br.com.g2stecnologia.estudo.estrutura_de_dados.array.util.TeamMembers.fabio;

public class SimpleLinkedListExample {

    private static SimpleNode<String> linkedListNode = null;

    public static void main(String[] args) {

        printLinkedList();

        linkedListNode = new SimpleNode<String>(TeamMembers.melissa);
        linkedListNode.next = new SimpleNode<String>(TeamMembers.fabio);
        linkedListNode.next.next = new SimpleNode<String>(TeamMembers.guilherme);
        linkedListNode.next.next.next = new SimpleNode<String>(TeamMembers.icaro);
        linkedListNode.next.next.next.next = new SimpleNode<String>(TeamMembers.gustavo);
        linkedListNode.next.next.next.next.next = new SimpleNode<String>(TeamMembers.cleber);
        linkedListNode.next.next.next.next.next.next = new SimpleNode<String>(TeamMembers.raul);
        linkedListNode.next.next.next.next.next.next.next = new SimpleNode<String>(TeamMembers.juliano);
        linkedListNode.next.next.next.next.next.next.next.next = new SimpleNode<String>(TeamMembers.leonardo);
        linkedListNode.next.next.next.next.next.next.next.next.next = new SimpleNode<String>(TeamMembers.felipe);

        printLinkedList();
    }

    private static void printLinkedList() {
        SimpleNode<String> node = linkedListNode;
        while(node != null) {
            System.out.print(node.data + " ->");
            node = node.next;
        }
        System.out.print("null\n");
    }

}
