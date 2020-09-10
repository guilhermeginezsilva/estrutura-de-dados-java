package br.com.g2stecnologia.estudo.estrutura_de_dados.array;

import java.util.Random;

public class JavaArrayExample {

    public static void main(String[] args) {
        intArrayExample();
        stringArrayExample();
        anyObjectArrayExample();
    }

    private static void intArrayExample() {
        int[] intArray = new int[10]; //Todo array é um objeto no Java!
        populateIntArray(intArray);

        for(int value : intArray) {
            System.out.println(value);
        }
    }

    private static void populateIntArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            array[i] = new Random().nextInt();
        }
    }

    private static void stringArrayExample() {
        String[] stringArray = new String[10]; //Todo array é um objeto no Java!
        populateStringArray(stringArray);

        for(String value : stringArray) {
            System.out.println(value);
        }
    }

    private static void populateStringArray(String[] array) {
        for(int i=0; i<array.length; i++) {
            array[i] = String.valueOf(new Random().nextInt());
        }
    }

    private static void anyObjectArrayExample() {
        User[] userArray = new User[10]; //Todo array é um objeto no Java!
        populateAnyObjectArray(userArray);

        for(User value : userArray) {
            System.out.println(value);
        }
    }

    private static void populateAnyObjectArray(User[] array) {
        for(int i=0; i<array.length; i++) {
            array[i] = new User(
                String.valueOf(new Random().nextInt()),
                new Random().nextInt()
            );
        }
    }

    public static class User {
        String name;
        int idade;

        public User(String name, int idade) {
            this.name = name;
            this.idade = idade;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", idade=" + idade +
                    '}';
        }
    }

}
