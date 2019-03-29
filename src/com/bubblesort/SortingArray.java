package com.bubblesort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortingArray {
    public int[] array = new int[5];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private int temp;
    public void inputArray(int i)throws IOException {
        System.out.print("Masukkan Nilai Array : ");
        array[i] = Integer.parseInt(br.readLine());
    }
    public int sorting(int i){
        if (array[i] > array[i+1]){
            temp = array[i+1];
            array[i+1] = array[i];
            array[i] = temp;
        }
        return array[i];
    }

    public void showArray(int i){
        System.out.println("Nilai Array : "+array[i]);
    }

}
