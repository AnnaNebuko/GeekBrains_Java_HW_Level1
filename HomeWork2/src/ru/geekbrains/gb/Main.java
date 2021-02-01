package ru.geekbrains.gb;

public class Main {

    public static void main(String[] args) {
        int [] zerosOnes = {0, 1, 0, 1, 0, 1};
        changeToOpposite (zerosOnes);
        int [] everyThirdNum = new int [8];
        fillInEveryThirdNum (everyThirdNum);
        int [] someOfNumbsUnder6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        multiplyNumbsUnder6(someOfNumbsUnder6);
        int [][] squareArr = new int [7][7];
        makeDiagonalsFromOnes (squareArr);
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println("TheBiggest: " + findTheBiggest(arr));
        System.out.println("TheSmallest: " + findTheSmallest(arr));
    }

    private static void printArray(int[] arr) {
        for (int i =0; i < arr.length; i ++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
    //=====1=====
    static void changeToOpposite(int [] zerosOnes){
        for (int i =0; i < zerosOnes.length; i ++)
            if (zerosOnes[i] == 0) zerosOnes[i] = 1; else zerosOnes[i] = 0;
        System.out.print("changeToOpposite: ");
        printArray(zerosOnes);
    }
    //=====2=====
    static void fillInEveryThirdNum(int [] everyThirdNum){
        for (int i = 0; i < everyThirdNum.length; i+=3){
            everyThirdNum[i] = i;
        }
        System.out.print("fillInEveryThirdNum: ");
        printArray(everyThirdNum);
    }
    //=====3=====
    static void multiplyNumbsUnder6(int[] someOfNumbsUnder6) {
        for (int i = 0; i < someOfNumbsUnder6.length; i++){
            if (someOfNumbsUnder6 [i] < 6) someOfNumbsUnder6 [i] *= 2;
        }
        System.out.print("multiplyNumbsUnder6: ");
        printArray(someOfNumbsUnder6);
    }
    //=====4=====
    static void makeDiagonalsFromOnes(int[][] squareArr) {
        System.out.print("makeDiagonalsFromOnes: ");
        for (int i = 0; i < squareArr.length; i++) {
            squareArr[i] = new int[squareArr.length];
            for (int j = 0; j < squareArr[i].length; j++) {
                if(i==j || squareArr.length-i == j+1){
                    squareArr[i][j] = squareArr[i][squareArr.length-i-1] = 1;
                }
                else{
                    squareArr[i][j] = 0;
                }
                System.out.print(squareArr[i][j]);
            }
            System.out.println();
        }
    }
    //=====5=====
    static int findTheBiggest (int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;

    }
    static int findTheSmallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        return min;
    }
}


