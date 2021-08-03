import java.util.ArrayList;

public class BasicThirteen{

// *********** main **************
    public static void main(String[] args){
        // print1to255();
        // printOdd1to255();
        // System.out.println(sigmaNum(255));
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(4);
        x.add(12);
        x.add(-5);
        x.add(1);
        x.add(7);
        x.add(-13);
        // iterateArray(x);
        // findMax(x);
        // System.out.println(arraywOddNumbers(255));
        // average(x);
        // greaterThanY(x,2);
        // squareValues(x);
        eliminateNeg(x);
        System.out.println(x);
    }
// *********** END main **************

// Print 1-255
    public static void print1to255(){
        for(int i =1; i<256; i++){
            System.out.println(i);
        }
    }

// Print odd numbers between 1-255
    public static void printOdd1to255(){
        for(int i=1; i<256; i+=2){
            System.out.println(i);
        }
    }

// Sigma of 255 AKA Sum to 255
    public static int sigmaNum(int num){
        int sum = 0;
        for(int i=1; i< num+1; i++){
            sum += i;
        }
        return sum;
    }

//     Iterating through an array
    public static void iterateArray(ArrayList arrInput){
        for(int i = 0; i < arrInput.size() ; i++){
            System.out.println(arrInput.get(i));
        }
    }

//     Find Max
    public static void findMax(ArrayList<Integer> arrInput){
        int max = arrInput.get(0);
        for(int i = 1; i < arrInput.size() ; i++){
            if( arrInput.get(i) > max){
                max = arrInput.get(i);
            }
        }
        System.out.println(max);
    }

// Array with Odd Numbers 
    public static ArrayList arraywOddNumbers(int num){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i < num+1; i += 2){
            y.add(i);
        }
        return y;
    }

// Get Average
    public static void average(ArrayList<Integer> arrInput){
        double sum = 0;
        for(int i = 0; i < arrInput.size(); i ++){
            sum += arrInput.get(i);
        }
        System.out.println(sum/arrInput.size());
    }

// Greater Than Y
    public static void greaterThanY(ArrayList<Integer> arrInput, int num){
    int counter = 0;
        for(int i = 1; i < arrInput.size(); i++){
            if( num > arrInput.get(i)){
                counter ++;
            }
        }
        System.out.println(counter);
    }

// Square the values
    public static void squareValues(ArrayList<Integer> arrInput){
        for(int i = 0;  i < arrInput.size(); i++){
        int square = arrInput.get(i)*arrInput.get(i);
        arrInput.set(i, square);
        }
    }

// Eliminate Negative Numbers
// Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].
    public static void eliminateNeg(ArrayList<Integer> arrInput){
        for(int i = 0; i < arrInput.size(); i++){
            int zero = 0;
            if(arrInput.get(i)< 0){
                arrInput.set(i, zero);
            }
        }
    }

}