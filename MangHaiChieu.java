package vn.edu.hcmus.student.sv19127640.lab02.Exercise02;

import java.util.Scanner;

/**
 * vn.edu.hcmus.student.sv19127640.lab02.Exercise02
 * Created by ADMIN
 * Date 10/25/2021 - 2:43 PM
 * Description: MangHaiChieu class
 */
public class MangHaiChieu {
    // attributes
    private int[][] arr;

    /**
     * default constructor
     */
    public MangHaiChieu(){
        this.arr = null;
    }

    /**
     * constructor with parameter
     * @param arr 2 dimensional array
     */
    public MangHaiChieu(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        this.arr = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                this.arr[i][j] = arr[i][j];
            }
        }
    }

    /**
     * copy constructor
     * @param arr MangHaiChieu
     */
    public MangHaiChieu(MangHaiChieu arr){
        int row = arr.arr.length;
        int col = arr.arr[0].length;
        this.arr = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                this.arr[i][j] = arr.arr[i][j];
            }
        }
    }

    /**
     * getter method
     * @return arr 2 dimensional array
     */
    public int[][] getArr() {
        return this.arr;
    }

    /**
     * setter method
     * @param arr 2 dimensional array
     */
    public void setArr(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        this.arr = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                this.arr[i][j] = arr[i][j];
            }
        }
    }

    /**
     * getter method to get an element in specified index
     * @param indexOfRow integer
     * @param indexOfCol integer
     * @return value Integer
     */
    public Integer get(int indexOfRow, int indexOfCol){
        Integer value = null;
        if (indexOfRow >= 0 && indexOfRow < this.arr.length && indexOfCol >= 0 && indexOfCol < this.arr[0].length)
            value = this.arr[indexOfRow][indexOfCol];
        return value;
    }

    /**
     * setter method to set an element at specified value to another value
     * @param indexOfRow integer
     * @param indexOfCol integer
     * @param value integer
     */
    public void set(int indexOfRow, int indexOfCol, int value){
        if (indexOfRow >= 0 && indexOfRow < this.arr.length && indexOfCol >= 0 && indexOfCol < this.arr[0].length)
            this.arr[indexOfRow][indexOfCol] = value;
    }

    /**
     * getter method to get the number of row
     * @return integer
     */
    public int getNumberOfRow(){
        return this.arr.length;
    }

    /**
     * getter method to get the number of col
     * @return integer
     */
    public int getNumberOfColumn(){
        return this.arr[0].length;
    }
    /**
     * input method
     */
    public void input(){
        Scanner scan = new Scanner(System.in);
        int m, n;
        do{
            System.out.print("Enter the number of rows: ");
            n = scan.nextInt();
            System.out.print("Enter the number of column: ");
            m = scan.nextInt();
            if (n <= 0 || m <= 0){
                System.out.println("n or m is invalid. Please, input again!");
            }
        }while(n <= 0 || m <= 0);
        this.arr = new int[n][m];
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++){
                System.out.print("arr[" + i + "][" + j + "] = ");
                this.arr[i][j] = scan.nextInt();
            }
        }
    }

    /**
     * output method
     */
    public void output(){
        System.out.println("Number of rows: " + this.arr.length);
        System.out.println("Number of columns: " + this.arr[0].length);
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++) {
                System.out.print(this.arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * sort all row of matrix in ascending order
     */
    public void sortRowAscending(){
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length - 1; j++){
                for (int k = j + 1; k < this.arr[i].length; k++){
                    if (this.arr[i][j] > this.arr[i][k]){
                        int temp = this.arr[i][j];
                        this.arr[i][j] = this.arr[i][k];
                        this.arr[i][k] = temp;
                    }
                }
            }
        }
    }
    /**
     * sort all column of matrix in descending order
     */
    public void sortColDescending(){
        for (int i = 0; i < this.arr[0].length; i++){
            for (int j = 0; j < this.arr.length - 1; j++){
                for (int k = j + 1; k < this.arr.length; k++){
                    if (this.arr[j][i] < this.arr[k][i]){
                        int temp = this.arr[j][i];
                        this.arr[j][i] = this.arr[k][i];
                        this.arr[k][i] = temp;
                    }
                }
            }
        }
    }

    /**
     * Calculate sum of all element in matrix
     * @return sum integer
     */
    public int sum(){
        int sum = 0;
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++) {
                sum += this.arr[i][j];
            }
        }
        return sum;
    }
    /**
     * Calculate product of all element in matrix
     * @return product long
     */
    public long product(){
        long product = 1;
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++) {
                product *= this.arr[i][j];
            }
        }
        return product;
    }

    /**
     * find the largest element in matrix
     * @return value integer
     */
    public int largestElement(){
        int value = Integer.MIN_VALUE;
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++) {
                if (this.arr[i][j] > value)
                    value = this.arr[i][j];
            }
        }
        return value;
    }

    /**
     * find the smallest positive integer
     * @return value integer
     */
    public int smallestPositiveInteger(){
        int value = Integer.MAX_VALUE;
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++) {
                if (this.arr[i][j] > 0 && this.arr[i][j] < value)
                    value = this.arr[i][j];
            }
        }
        return value;
    }
    /**
     * find the largest negative integer
     * @return value integer
     */
    public int largestNegativeInteger(){
        int value = Integer.MIN_VALUE;
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++) {
                if (this.arr[i][j] < 0 && this.arr[i][j] > value)
                    value = this.arr[i][j];
            }
        }
        return value;
    }

    /**
     * find the row has biggest sum value
     * @return index integer
     */
    public int biggestSumRow(){
        int value = Integer.MIN_VALUE;
        int sum;
        int index = -1;
        for (int i = 0; i < this.arr.length; i++){
            sum = 0;
            for (int j = 0; j < this.arr[i].length; j++) {
                sum += this.arr[i][j];
            }
            if (sum > value){
                index = i;
                value = sum;
            }
        }
        return index;
    }

    /**
     * transpose matrix
     * @return result MangHaiChieu
     */
    public MangHaiChieu transposeMatrix(){
        MangHaiChieu result = new MangHaiChieu();
        int n = this.arr.length;
        int m = this.arr[0].length;
        result.arr = new int[m][n];
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++){
                result.arr[j][i] = this.arr[i][j];
            }
        }
        return result;
    }

    /**
     * find the column has biggest sum value
     * @return index integer
     */
    public int biggestSumColumn(){
       MangHaiChieu transpose = this.transposeMatrix();
       return transpose.biggestSumRow();
    }

    /**
     * add a row to front of matrix
     * @param a integer array
     */
    public void addRowToFront(int[] a){
        int row = this.arr.length;
        int col = this.arr[0].length;
        if (a.length == col){
            MangHaiChieu old_matrix = new MangHaiChieu(this);
            this.arr = new int[row + 1][col];
            for (int i = 0; i < this.arr.length; i++){
                for (int j = 0; j < this.arr[i].length; j++){
                    if (i == 0){
                        this.arr[i][j] = a[j];
                    }else{
                        this.arr[i][j] = old_matrix.arr[i - 1][j];
                    }
                }
            }
        }else{
            System.out.println("Invalid column number. Please, input again!");
        }
    }
    /**
     * add a row to back of matrix
     * @param a integer array
     */
    public void addRowToBack(int[] a){
        int row = this.arr.length;
        int col = this.arr[0].length;
        if (a.length == col){
            MangHaiChieu old_matrix = new MangHaiChieu(this);
            this.arr = new int[row + 1][col];
            for (int i = 0; i < this.arr.length; i++){
                for (int j = 0; j < this.arr[i].length; j++){
                    if (i == this.arr.length - 1){ // if it's the last row
                        this.arr[i][j] = a[j];
                    }else{
                        this.arr[i][j] = old_matrix.arr[i][j];
                    }
                }
            }
        }else{
            System.out.println("Invalid column number. Please, input again!");
        }
    }
    /**
     * add a row to row k of matrix
     * @param k integer
     * @param a integer array
     */
    public void addRowToRowK(int k, int[] a){
        int row = this.arr.length;
        int col = this.arr[0].length;
        if (a.length == col){
            MangHaiChieu old_matrix = new MangHaiChieu(this);
            this.arr = new int[row + 1][col];
            for (int i = 0; i < this.arr.length; i++){
                for (int j = 0; j < this.arr[i].length; j++){
                    if (i < k){
                        this.arr[i][j] = old_matrix.arr[i][j];
                    }else if (i == k){
                        this.arr[i][j] = a[j];
                    }else{
                        this.arr[i][j] = old_matrix.arr[i - 1][j];
                    }
                }
            }
        }else{
            System.out.println("Invalid column number. Please, input again!");
        }
    }
    /**
     * delete row k of matrix
     * @param k integer
     */
    public void deleteRowK(int k){
        if (k >= 0 && k < this.arr.length){
            int row = this.arr.length;
            int col = this.arr[0].length;
            MangHaiChieu old_matrix = new MangHaiChieu(this);
            this.arr = new int[row - 1][col];
            for (int i = 0; i < this.arr.length; i++){
                for (int j = 0; j < this.arr[i].length; j++){
                    if (i < k){
                        this.arr[i][j] = old_matrix.arr[i][j];
                    }else{
                        this.arr[i][j] = old_matrix.arr[i + 1][j];
                    }
                }
            }
        }else{
            System.out.println("Invalid input number. Please, input again!");
        }
    }
    /**
     * delete column k of matrix
     * @param k integer
     */
    public void deleteColumnK(int k){
        if (k >= 0 && k < this.arr[0].length){
            MangHaiChieu transpose = this.transposeMatrix();
            transpose.deleteRowK(k);
            int row = transpose.arr.length;
            int col = transpose.arr[0].length;
            this.arr = new int[col][row];
            for (int i = 0; i < this.arr.length; i++){
                for (int j = 0; j < this.arr[i].length; j++){
                    this.arr[i][j] = transpose.arr[j][i];
                }
            }
        }else{
            System.out.println("Invalid input number. Please, input again!");
        }
    }

    /**
     * static method to parse String to Matrix, each line separate from \n character
     * @param s String
     * @return result MangHaiChieu
     */
    public static MangHaiChieu parseMangHaiChieu(String s){
        MangHaiChieu result = new MangHaiChieu();
        String[] arrStr = s.split("\n");
        int row = arrStr.length;
        String[] subStr = arrStr[0].split("[^0-9-]");
        int col = subStr.length;
        result.arr = new int[row][col];
        for (int i = 0; i < arrStr.length; i++){
            subStr = arrStr[i].split("[^0-9-]");
            for (int j = 0; j < subStr.length; j++){
                result.arr[i][j] = Integer.parseInt(subStr[j]);
            }
        }
        return result;
    }

    /**
     * Calculate sum of two matrix
     * @param object MangHaiChieu
     * @return sum integer
     */
    public int sum(MangHaiChieu object){
        int sum = this.sum() + object.sum();
        return sum;
    }

    /**
     * Calculate product of two matrix
     * @param object MangHaiChieu
     * @return product long
     */
    public long product(MangHaiChieu object){
        long product = this.product() * object.product();
        return product;
    }

    /**
     * static method to create matrix has MxN and set all element to 0
     * @param numberOfRow integer
     * @param numberOfCol integer
     * @return result MangHaiChieu
     */
    public static MangHaiChieu createZeroMatrix(int numberOfRow, int numberOfCol){
        MangHaiChieu result = new MangHaiChieu();
        result.arr = new int[numberOfRow][numberOfCol];
        for (int i = 0; i < result.arr.length; i++){
            for (int j = 0; j < result.arr[i].length; j++){
                result.arr[i][j] = 0;
            }
        }
        return result;
    }

    /**
     * static method to create random Matrix
     * @param numberOfRow integer
     * @param numberOfCol integer
     * @param maxValue integer
     * @param minValue integer
     * @return result MangHaiChieu
     */
    public static MangHaiChieu createRandomMatrix(int numberOfRow, int numberOfCol, int maxValue, int minValue){
        MangHaiChieu result = new MangHaiChieu();
        result.arr = new int[numberOfRow][numberOfCol];
        for (int i = 0; i < result.arr.length; i++){
            for (int j = 0; j < result.arr[i].length; j++){
                result.arr[i][j] = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
            }
        }
        return result;
    }

    /**
     * static method to create a new MangHaiChieu from old MangHaiChieu matrix. if type = 1: row ascending, type = 0: column descending
     * @param object MangHaiChieu
     * @param type integer
     * @return result MangHaiChieu
     */
    public static MangHaiChieu sort(MangHaiChieu object, int type){
        MangHaiChieu result = new MangHaiChieu();
        result.arr = new int[object.arr.length][object.arr[0].length];
        for (int i = 0; i < result.arr.length; i++){
            for (int j = 0; j < result.arr[i].length; j++){
                result.arr[i][j] = object.arr[i][j];
            }
        }
        if (type == 1){
            result.sortRowAscending();
        }
        else{
            result.sortColDescending();
        }
        return result;
    }
}
