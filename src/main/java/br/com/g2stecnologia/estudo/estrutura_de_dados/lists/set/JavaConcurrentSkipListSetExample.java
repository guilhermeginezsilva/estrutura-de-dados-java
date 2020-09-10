package br.com.g2stecnologia.estudo.estrutura_de_dados.lists.set;

import br.com.g2stecnologia.estudo.estrutura_de_dados.array.util.TeamMembers;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class JavaConcurrentSkipListSetExample {

    private static ConcurrentSkipListSet<String> names = new ConcurrentSkipListSet<String>();

    public static void main(String[] args) {
        System.out.println(names.stream().collect(Collectors.joining("->")));
        names.add(TeamMembers.guilherme);
        names.add(TeamMembers.fabio);
        names.add(TeamMembers.fabio);
        names.add(TeamMembers.fabio);
        names.add(TeamMembers.fabio);
        names.add(TeamMembers.fabio);
        System.out.println(names.stream().collect(Collectors.joining("->")));
        names.addAll(Arrays.asList(TeamMembers.cleber, TeamMembers.felipe, TeamMembers.gustavo));
        System.out.println(names.stream().collect(Collectors.joining("->")));
        runThreads();
        System.out.println(names.stream().collect(Collectors.joining("->")));
    }

    public static void runThreads() {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for(int i=0; i< 10000; i++) {
            executorService.submit(() -> {
                for(int j=0; j< 10000; j++) {
                    if(j%2 ==0) {
                        names.add(String.valueOf(new Random().nextInt()));
                    } else {
                        names.remove(String.valueOf(new Random().nextInt()));
                    }
                }
            });
        }
        executorService.shutdown();
    }



}
