package com.stackroute.keywordsassignment.array;

import com.sun.source.tree.WhileLoopTree;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

/**
 * if the value of 2d matrix and the given row are equal we are priting the row number
 */
public class ArraysFor2D {
    public static void main(String[] args) {
        System.out.println("enter the no of rows needed");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("enter the no of columns");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter the values");
                matrix[i][j] = sc.nextInt();
            }
        }
        int rowmatrix[] = new int[row];
        for (int i = 0; i < row; i++) {
            System.out.println("enter the rowmatrix val");
            rowmatrix[i] = sc.nextInt();
        }
        int rowvalue=0;
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<col;j++){
                if(matrix[i][j]==rowmatrix[j]){
                    count++;
                }
                if(count==col){
                    rowvalue=col;
                }
            }
        }

        System.out.println(rowvalue);
    }
}
