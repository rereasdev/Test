/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author asus
 */
public class NewClass2 {
    public static void main(String[] args) {
        int[][] foo = {{1, 2, 3}, { 5, 6, 7, 8}};
        
        int[][] foo2 = new int[][] {
        new int[] { 1, 2, 3 },
        new int[] { 1, 2, 3, 4},
        };

    System.out.println(foo.length); //2
    System.out.println(foo[0].length); //3
    System.out.println(foo[1].length); //4
    }
}
