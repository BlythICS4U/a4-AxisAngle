/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

import static java.lang.Math.*;

/**
 * Converts decimal and binary
 *
 * @author bachle
 */
public class convert {

    /**
     *
     * @param input
     * @return Converts decimal to binary
     */
    public static String toBinary(int input) {
        int remainder;
        String output = "";
        int iterations = (int) ceil(Math.log(input) / Math.log(2));
        remainder = input;
        
        for (int i = 0; i < iterations + 1; i++) {
            if (remainder % 2 == 1) {
                output = 1 + output;
                remainder = (int) floor(remainder / 2);
            } else {
                output = 0 + output;
                remainder = remainder / 2;
            }
        }
           //Drops the leading zeros
            int placeholder = Integer.parseInt(output);
            output = Integer.toString(placeholder);
        return output;
    }

    /**
     * converts binary to decimal
     *
     * @param input
     * @return decimal string
     */
    public static String toDecimal(int input) {
        String num = Integer.toString(input);
        int decimalValue = 0;
        int base = 1;

        int length = num.length();
        for (int i = length - 1; i >= 0; i--) {
            if (num.charAt(i) == '1') {
                decimalValue += base;
            }
            base = base * 2;
        }
        return Integer.toString(decimalValue);
    }
}
