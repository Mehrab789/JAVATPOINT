package com.Matrix;

import java.util.Scanner;

public class ArrayMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
<<<<<<< HEAD
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];

        System.out.println("Enter Element for A matrix: ");
        // Getting input for A matrix
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++){
=======
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        int[][] C = new int[4][4];

        System.out.println("Enter Element for A matrix: ");
        // Getting input for A matrix
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++){
>>>>>>> upstream/master
                System.out.printf("A[%d][%d] = ",row,col);
                A[row][col] = input.nextInt();
            }
        }

        System.out.println("Enter Element for B matrix: ");
        // Getting input for B matrix
<<<<<<< HEAD
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++){
=======
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++){
>>>>>>> upstream/master
                System.out.printf("B[%d][%d] = ",row,col);
                B[row][col] = input.nextInt();
            }
        }

        // Printing A matrix
<<<<<<< HEAD
        System.out.print("A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++){
=======
        System.out.print("A= "+"\n");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++){
>>>>>>> upstream/master
                System.out.print("\t"+A[row][col]);
            }
            System.out.println();
        }
<<<<<<< HEAD

        System.out.println("\n");

        // Printing B matrix
        System.out.print("B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++){
=======
        System.out.println("\n");

        // Printing B matrix
        System.out.print("B= "+"\n");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++){
>>>>>>> upstream/master
                System.out.print("\t"+B[row][col]);
            }
            System.out.println();
        }
        System.out.println("\n");
<<<<<<< HEAD
        // '-' A & B Matrix
          System.out.print("A-B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++){
                C[row][col] = A[row][col] - B[row][col];
=======

        // Sum A & B Matrix
          System.out.print("A+B= "+"\n");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++){
                C[row][col] = A[row][col] + B[row][col];
>>>>>>> upstream/master
                System.out.print("\t" + (C[row][col]));
            }
            System.out.println();
        }
    }
}
