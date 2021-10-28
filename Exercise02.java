package vn.edu.hcmus.student.sv19127640.lab02.Exercise02;


import java.util.Scanner;

/**
 * vn.edu.hcmus.student.sv19127640.lab02.Exercise02
 * Created by ADMIN
 * Date 10/25/2021 - 2:43 PM
 * Description: main function
 */
public class Exercise02 {
    /**
     * main function
     * @param argv console parameters
     */
    public static void main(String[] argv){
        Integer chosse = null;
        do{
            System.out.println("===================================================================");
            System.out.println("0. Exit");
            System.out.println("1. Using constructor methods");
            System.out.println("2. Using get/set methods");
            System.out.println("3. Using input/output methods");
            System.out.println("4. Using sort matrix ascending in each row method");
            System.out.println("5. Using sort descending in each column method");
            System.out.println("6. Using calculate sum of all elements method");
            System.out.println("7. Using calculate product of all elements method");
            System.out.println("8. Using find the largest element method");
            System.out.println("9. Using find the smallest positive integer number method");
            System.out.println("10. Using find the largest negative integer number method");
            System.out.println("11. Using find the row that has biggest sum value method");
            System.out.println("12. Using find the column that has biggest sum value method");
            System.out.println("13. Using add a new row to front of matrix method");
            System.out.println("14. Using add a new row to back of matrix method");
            System.out.println("15. Using add a new row to row K of matrix method");
            System.out.println("16. Using delete row K from matrix method");
            System.out.println("17. Using delete column K from matrix method");
            System.out.println("18. Using static method parseMangHaiChieu");
            System.out.println("19. Using static methods");
            System.out.println("20. Using overload methods");
            System.out.println("===================================================================");
            System.out.print("Input your choose: ");
            Scanner scan = new Scanner(System.in);
            chosse = scan.nextInt();
            switch (chosse){
                case 0: return;
                case 1: {
                    // use default constructor
                    MangHaiChieu obj_1 = new MangHaiChieu();
                    // use constructor with parameters
                    int[][] arr_1 = {
                            {1, 2},
                            {3, 4},
                            {5, 6},
                            {7, 8}
                    };
                    MangHaiChieu obj_2 = new MangHaiChieu(arr_1);
                    System.out.println("Using constructor with parameter: ");
                    obj_2.output();
                    // use copy constructor
                    System.out.println("Using copy constructor: ");
                    MangHaiChieu obj_3 = new MangHaiChieu(obj_2);
                    obj_3.output();
                    break;
                }
                case 2: {
                    // use getter and setter
                    MangHaiChieu obj_3 = MangHaiChieu.createRandomMatrix(3, 4, -5,5 );
                    System.out.println("Matrix:");
                    obj_3.output();
                    System.out.println("Using getter: ");
                    System.out.println("Number of row: " + obj_3.getNumberOfRow());
                    System.out.println("Number of col: " + obj_3.getNumberOfColumn());
                    int n, m;
                    System.out.print("Input row of element to get: ");
                    n = scan.nextInt();
                    System.out.print("Input column of element to get: ");
                    m = scan.nextInt();
                    Integer value = obj_3.get(n,m);
                    if (value != null){
                        System.out.println("The value at row = " + n + " and column = " + m + " of matrix above is " + value);
                    }else{
                        System.out.println("Value doesnt exist.");
                    }
                    System.out.println("Using setter: ");
                    MangHaiChieu obj_4 = new MangHaiChieu();
                    int[][] arr_1 = {
                            {1, 2, 4},
                            {3, 4, -1},
                            {5, 6, 0},
                            {7, 8, 10}
                    };
                    obj_4.setArr(arr_1);
                    System.out.println("Matrix after using setter method:");
                    obj_4.output();
                    System.out.println("Using setter at element has row = 1 and column = 2 of matrix above: ");
                    obj_4.set(1,2,100);
                    obj_4.output();
                    break;
                }
                case 3:{
                    // use input and output method
                    MangHaiChieu obj_1 = new MangHaiChieu();
                    System.out.println("Using input and output method: ");
                    obj_1.input();
                    obj_1.output();
                    break;
                }
                case 4:{
                    // use sort all row of matrix in ascending order
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(3, 4, -10, 10);
                    System.out.println("Matrix before sort all row in ascending order:");
                    obj_5.output();
                    System.out.println("Matrix after sort all row in ascending order:");
                    obj_5.sortRowAscending();
                    obj_5.output();
                    break;
                }
                case 5:{
                    // use sort all column of matrix in descending order
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(3, 4, -10, 10);
                    System.out.println("Matrix before sort all column in descending order:");
                    obj_5.output();
                    System.out.println("Matrix after sort all column in descending order:");
                    obj_5.sortColDescending();
                    obj_5.output();
                    break;
                }
                case 6: {
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(3, 4, -10, 10);
                    // use calculate sum of all element in matrix
                    System.out.println("Matrix:");
                    obj_5.output();
                    System.out.println("Sum of matrix above is " + obj_5.sum());
                    break;
                }
                case 7: {
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(3, 4, -10, 10);
                    // use calculate product of all element in matrix
                    System.out.println("Matrix:");
                    obj_5.output();
                    System.out.println("Product of matrix above is " + obj_5.product());
                    break;
                }
                case 8: {
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(3, 4, -10, 10);
                    // use find the largest element in matrix
                    System.out.println("Matrix:");
                    obj_5.output();
                    System.out.println("The largest element in matrix above is " + obj_5.largestElement());
                    break;
                }
                case 9:{
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(3, 4, -10, 10);
                    // use find the smallest positive integer element in matrix
                    System.out.println("Matrix:");
                    obj_5.output();
                    System.out.println("The smallest positive integer element in matrix above is " + obj_5.smallestPositiveInteger());
                    break;
                }
                case 10:{
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(3, 4, -10, 10);
                    // use find the largest negative integer element in matrix
                    System.out.println("Matrix:");
                    obj_5.output();
                    System.out.println("The largest negative integer element in matrix above is " + obj_5.largestNegativeInteger());
                    break;
                }
                case 11:{
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(3, 4, -10, 10);
                    // use find the row that have the biggest sum value
                    System.out.println("Matrix:");
                    obj_5.output();
                    System.out.println("The row that have the biggest sum value in matrix above is row number " + obj_5.biggestSumRow());
                    break;
                }
                case 12:{
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(3, 4, -10, 10);
                    // use find the column that have the biggest sum value
                    System.out.println("Matrix:");
                    obj_5.output();
                    System.out.println("The column that have the biggest sum value in matrix above is column number " + obj_5.biggestSumColumn());
                    break;
                }
                case 13:{
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(3, 4, -10, 10);
                    // use add a row to front of matrix
                    System.out.println("Matrix before add new row to the front:");
                    obj_5.output();
                    System.out.println("Matrix after add new row to the front:");
                    int[] arr_3 = {1, -2, 3, -4};
                    obj_5.addRowToFront(arr_3);
                    obj_5.output();
                    break;
                }
                case 14:{
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(3, 4, -10, 10);
                    // use add a row to back of matrix
                    System.out.println("Matrix before add new row to the back:");
                    obj_5.output();
                    System.out.println("Matrix after add new row to the back:");
                    int[] arr_4 = {441, 123, -43, 12};
                    obj_5.addRowToBack(arr_4);
                    obj_5.output();
                    break;
                }
                case 15:{
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(3, 4, -10, 10);
                    // use add a row to row K of matrix
                    System.out.println("Matrix:");
                    obj_5.output();
                    System.out.print("Input row k to add new row: ");
                    int k = scan.nextInt();
                    System.out.println("Matrix after add new row to row " + k + ":");
                    int[] arr_5 = {1, 0, -3, 9};
                    obj_5.addRowToRowK(k, arr_5);
                    obj_5.output();
                    break;
                }
                case 16:{
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(3, 4, -10, 10);
                    // use delete row K of matrix
                    System.out.println("Matrix:");
                    obj_5.output();
                    System.out.print("Input row k to delete: ");
                    int k = scan.nextInt();
                    System.out.println("Matrix after delete row " + k + ":");
                    obj_5.deleteRowK(k);
                    obj_5.output();
                    break;
                }
                case 17:{
                    MangHaiChieu obj_5 = MangHaiChieu.createRandomMatrix(5, 7, -10, 10);
                    // use delete column K of matrix
                    System.out.println("Matrix:");
                    obj_5.output();
                    System.out.print("Input column k to delete: ");
                    int k = scan.nextInt();
                    System.out.println("Matrix after delete column " + k + ":");
                    obj_5.deleteColumnK(k);
                    obj_5.output();
                    break;
                }
                case 18:{
                    // use static method to parse String to Matrix, each line separate from \n character
                    System.out.println("Using static method to parse String to matrix, each line separate from \\n character");
                    MangHaiChieu obj_6 = MangHaiChieu.parseMangHaiChieu("4/5/6\n7/6/5\n3&5*4\n12^3^2\n-1*2,-100");
                    obj_6.output();
                    break;
                }
                case 19:{
                    System.out.println("Using static input method to create Zero matrix: ");
                    MangHaiChieu obj_1 = MangHaiChieu.createZeroMatrix(2, 3);
                    obj_1.output();
                    System.out.println("Using static method to create Random matrix: ");
                    MangHaiChieu obj_2 = MangHaiChieu.createRandomMatrix(4,5,-10,10);
                    obj_2.output();
                    System.out.println("Using static method to create a row sorted in Ascending matrix: ");
                    MangHaiChieu obj_3 = MangHaiChieu.sort(obj_2, 1);
                    obj_3.output();
                    System.out.println("Using static method to create a column sorted in Descending matrix: ");
                    MangHaiChieu obj_4 = MangHaiChieu.sort(obj_2, 0);
                    obj_4.output();
                    break;
                }
                case 20:{
                    // use overload method
                    MangHaiChieu obj_6 = MangHaiChieu.createRandomMatrix(2,3,-10,10);
                    MangHaiChieu obj_7 = MangHaiChieu.createRandomMatrix(2,3,-10,10);
                    System.out.println("First matrix:");
                    obj_6.output();
                    System.out.println("Second matrix:");
                    obj_7.output();
                    System.out.println("Using overload method: ");
                    int sum = obj_6.sum(obj_7);
                    System.out.println("Sum of 2 matrix is " + sum);
                    long product = obj_6.product(obj_7);
                    System.out.println("Product of 2 matrix is " + product);
                    break;
                }
                default: return;
            }
            System.out.print("Press enter to continue...");
            try{System.in.read();}
            catch(Exception e){}
        }while(0 < chosse && chosse <= 20);
    }
}
