/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem5;

import java.io.*;
import java.util.Arrays;

/**
 * Retrieves data from the file
 *
 * @author bachle
 */
public class retrieve {

    /**
     * Retrieves the numbers for question1
     *
     * @param filename
     * @return
     */
    public static int[] question1Data(String filename) {
        BufferedReader br = null;
        int[] values = new int[9];
        try {
            br = new BufferedReader(new FileReader(filename));
            String contentLine = "";

            //Skip 3 lines 
            for (int i = 0; i < 3; i++) {
                contentLine = br.readLine();
                //If file is empty return 0
                if (contentLine == null) {
                    Arrays.fill(values, 0);
                    return values;
                }
            }

            for (int i = 0; i < values.length; i++) {
                contentLine = br.readLine();

                contentLine = contentLine.replaceAll("\\D+", "");
                contentLine = contentLine.replaceAll("\\s+", "");
                values[i] = Integer.parseInt(contentLine);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace(System.out);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
                ioe.printStackTrace(System.out);
            }
        }
        return values;
    }

    /**
     * Retrieves the numbers for question 2
     *
     * @param filename
     * @return
     */
    public static int[] question2Data(String filename) {
        BufferedReader br = null;
        int[] values = new int[4];
        try {
            br = new BufferedReader(new FileReader(filename));
            String contentLine = "";
            //Skips 14 lines
            for (int i = 0; i < 14; i++) {
                contentLine = br.readLine();
                //If file is empty return an array with 0
                if (contentLine == null) {
                    Arrays.fill(values, 0);
                    return values;
                }
            }

            //Value for < 5 hours
            contentLine = br.readLine();
            contentLine = contentLine.replace("< 5 hours - ", "");
            values[0] = Integer.parseInt(contentLine);

            //Value for < 10 hours
            contentLine = br.readLine();
            contentLine = contentLine.replace("< 10 hours - ", "");
            values[1] = Integer.parseInt(contentLine);

            //Value for < 15 hours
            contentLine = br.readLine();
            contentLine = contentLine.replace("< 15 hours - ", "");
            values[2] = Integer.parseInt(contentLine);

            //Value for 15+ hours
            contentLine = br.readLine();
            contentLine = contentLine.replace("15+ hours - ", "");
            values[3] = Integer.parseInt(contentLine);

        } catch (IOException ioe) {
            ioe.printStackTrace(System.out);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
                ioe.printStackTrace(System.out);
            }
        }
        return values;
    }

    /**
     * Reads the file and returns a string array
     *
     * @param surveyCount
     * @param filename
     * @return String array
     */
    public static String[] question3Data(String filename, int surveyCount) {
        String[] values = new String[surveyCount];
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
            String contentLine = "";

            //Skips 20 lines
            for (int i = 0; i < 20; i++) {
                contentLine = br.readLine();
                if (contentLine == null) {
                    Arrays.fill(values, "-");
                    return values;
                }
            }

            for (int i = 0; i < surveyCount; i++) {
                values[i] = br.readLine() + "\n";
            }

        } catch (IOException ioe) {
            ioe.printStackTrace(System.out);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
                ioe.printStackTrace(System.out);
            }
        }
        return values;
    }

    /**
     * Reads the number of surveys done
     *
     * @param filename
     * @return the number of surveys done
     */
    public static int surveyCount(String filename) {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));

            //Returns 0 if file is empty
            String contentLine = br.readLine();
            if (contentLine == null) {
                return 0;
            }
            contentLine = contentLine.replace("Number of surveys completed: ", "");

            return Integer.parseInt(contentLine);
        } catch (IOException ioe) {
            ioe.printStackTrace(System.out);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the BufferedReader");
                ioe.printStackTrace(System.out);
            }
        }
        return 0;
    }
}
