package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.queue;

import br.com.g2stecnologia.estudo.estrutura_de_dados.array.util.TeamMembers;

import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class JavaArrayDequeExample {

    private static ArrayDeque<String> names = new ArrayDeque<String>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println(names.stream().collect(Collectors.joining("->")));
        names.add(TeamMembers.guilherme);
        names.add(TeamMembers.fabio);
        names.add(TeamMembers.gustavo);
        names.add(TeamMembers.felipe);
        names.add(TeamMembers.icaro);
        names.add(TeamMembers.melissa);
        names.add(TeamMembers.juliano);
        names.add(TeamMembers.leonardo);
        System.out.println(names.stream().collect(Collectors.joining("->")));
        System.out.println(names.pollFirst());
        System.out.println(names.stream().collect(Collectors.joining("->")));
        System.out.println(names.pollLast());
        System.out.println(names.stream().collect(Collectors.joining("->")));
        System.out.println(names.pollFirst());
        System.out.println(names.stream().collect(Collectors.joining("->")));
        System.out.println(names.pollLast());
        System.out.println(names.stream().collect(Collectors.joining("->")));
        System.out.println(names.pollFirst());
        System.out.println(names.stream().collect(Collectors.joining("->")));
    }

}
