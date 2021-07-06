/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranksolutions;

/**
 * Hackerrank's 2D Array - DS in Java 8 // https://www.hackerrank.com/challenges/2d-array/
 * @author dudself
 */
import java.io.*;
import java.util.*;

public class twoDArrayDS{
    
    static int hourglassSum(int[][] arr) {
        
        int [] results = new int[16];
        int result = -63;
        int s = 0;
        
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < 6; j++){
                if(i < 4 && j < 4){
                    int sum = 0;
                    sum = arr[i][j] + arr[i][j+1] +arr[i][j+2];
                    sum += arr[i+1][j+1];
                    sum += arr[i+2][j] + arr[i+2][j+1] +arr[i+2][j+2];
                    results[s] = sum;
                    s++;
                }
                else
                    break;
            }
        }
           
        for (int i = 0; i < 16; i++) {  
              
           if(results[i] > result)  
               result = results[i];  
        }
        
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
