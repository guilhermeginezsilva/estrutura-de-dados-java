package br.com.g2stecnologia.estudo.estrutura_de_dados.lists;

import java.util.Random;

public class JavaListsExample {

    public static void main(String[] args) {
        intMatrixExample();
        int3dMatrixExample();
        int4dMatrixExample();
    }

    private static void intMatrixExample() {
        int[][] intMatrix = new int[10][10];
        populateIntMatrix(intMatrix);

        for(int[] valueArray : intMatrix) {
            for(int value : valueArray) {
                System.out.print(value + " ");
            }
            System.out.println("\n============");
        }
    }

    private static void populateIntMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                matrix[i][j] = new Random().nextInt();
            }
        }
    }

    private static void int3dMatrixExample() {
        int[][][] int3dMatrix = new int[10][10][10];
        populateInt3dMatrix(int3dMatrix);

        for(int[][] valueMatrix : int3dMatrix) {
            for(int valueArray[] : valueMatrix) {
                for(int value : valueArray) {
                    System.out.print(value + " ");
                }
                System.out.println("\n======1=====");
            }
            System.out.println("\n======2=====");
        }
    }

    private static void populateInt3dMatrix(int[][][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                for(int k=0; k<matrix[0][0].length; k++) {
                    matrix[i][j][k] = new Random().nextInt();
                }
            }
        }
    }

    private static void int4dMatrixExample() {
        int[][][][] int4dMatrix = new int[10][10][10][10];
        populateInt4dMatrix(int4dMatrix);

        for(int[][][] value3dMatrix : int4dMatrix) {
            for (int[][] valueMatrix : value3dMatrix) {
                for (int valueArray[] : valueMatrix) {
                    for (int value : valueArray) {
                        System.out.print(value + " ");
                    }
                    System.out.println("\n======1=====");
                }
                System.out.println("\n======2=====");
            }
            System.out.println("\n======3=====");
        }
    }

    private static void populateInt4dMatrix(int[][][][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                for(int k=0; k<matrix[0][0].length; k++) {
                    for(int l=0; l<matrix[0][0][0].length; l++) {
                        matrix[i][j][k][l] = new Random().nextInt();
                    }
                }
            }
        }
    }

}
