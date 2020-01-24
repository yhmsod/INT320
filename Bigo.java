/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo;

/**
 *
 * @author Student
 */
import java.security.Timestamp;
import java.util.Arrays;
import java.util.Random;

public class Bigo {

    /**
     * @param args the command line arguments
     */
    private static int N = 1_000_000;
    private static Random r = new Random();

    public static void bubbleSort(int[] arr) {

        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {

        int[] arr = new int[1_000_000];
        long begin = System.currentTimeMillis();
        generateArray(arr);

        System.out.println("Array Before Bubble Sort");
        System.out.println("Duration\t" + (System.currentTimeMillis() - begin) + "\tmilliseconds");

        //Arrays.sort(arr);
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Array After Bubble Sort");

        System.out.println("Duration\t" + (System.currentTimeMillis() - begin) + "\tmilliseconds");

    }

    private static void generateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000 + 1);

        }
    }
}
