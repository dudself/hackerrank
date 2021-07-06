/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerranksolutions;

/**
 * Hackerrank's Repeated String Solution in Java 8 // https://www.hackerrank.com/challenges/repeated-string/
 * @author dudself
 */

import java.io.*;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    int count = 0;
    int kalanSayi=0;

    char[] ch = s.toCharArray();
    long kacTane = n/ch.length; 
    long kalan = n % ch.length;
    for(int i = 0;i<ch.length;i++){
        if(ch[i] == 'a'){
            count++;
        }

    }
    for(int i = 0; i<kalan;i++){
        if(ch[i] == 'a'){
            kalanSayi++;
        }
    }
    return count * kacTane + kalanSayi;


    }

}

public class repeatedString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
