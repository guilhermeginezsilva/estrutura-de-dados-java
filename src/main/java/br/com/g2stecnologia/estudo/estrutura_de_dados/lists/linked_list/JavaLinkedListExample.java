package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.linked_list;

import br.com.g2stecnologia.estudo.estrutura_de_dados.array.util.TeamMembers;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class JavaLinkedListExample {

    private static LinkedList<String> names = new LinkedList<String>();

    public static void main(String[] args) {
        System.out.println(names.stream().collect(Collectors.joining("->")));
        names.addFirst(TeamMembers.fabio);
        names.addFirst(TeamMembers.guilherme);
        System.out.println(names.stream().collect(Collectors.joining("->")));
        names.addLast(TeamMembers.cleber);
        System.out.println(names.stream().collect(Collectors.joining("->")));
        names.add(2, TeamMembers.felipe);
        System.out.println(names.stream().collect(Collectors.joining("->")));
        names.add(2, TeamMembers.felipe);
        System.out.println(names.stream().collect(Collectors.joining("->")));
    }

}
