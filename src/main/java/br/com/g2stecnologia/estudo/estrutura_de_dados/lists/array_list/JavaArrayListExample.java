package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.array_list;

import br.com.g2stecnologia.estudo.estrutura_de_dados.array.util.TeamMembers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class JavaArrayListExample {

    private static ArrayList<String> names = new ArrayList<String>();

    public static void main(String[] args) {
//        System.out.println(names.stream().collect(Collectors.joining("->")));
//        names.addFirst(TeamMembers.fabio);
//        names.addFirst(TeamMembers.guilherme);
//        System.out.println(names.stream().collect(Collectors.joining("->")));
//        names.addLast(TeamMembers.cleber);
//        System.out.println(names.stream().collect(Collectors.joining("->")));
//        names.add(2, TeamMembers.felipe);
//        System.out.println(names.stream().collect(Collectors.joining("->")));
//        names.add(2, TeamMembers.felipe);
//        System.out.println(names.stream().collect(Collectors.joining("->")));

        System.out.println(names.stream().collect(Collectors.joining("->")));
        names.add(TeamMembers.guilherme);
        names.add(TeamMembers.fabio);
        System.out.println(names.stream().collect(Collectors.joining("->")));
        names.addAll(Arrays.asList(TeamMembers.cleber, TeamMembers.felipe, TeamMembers.gustavo));
        System.out.println(names.stream().collect(Collectors.joining("->")));

    }

}
