/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem5;

import java.io.*;

/**
 * Methods to read and update the file
 *
 * @author bachle
 */
public class file {

    /**
     * Creates a file
     *
     * @param filename
     */
    public static void create(String filename) {
        try {

            File file = new File(filename);
            
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File has been created successfully");
            } 
            else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred");
            e.printStackTrace(System.out);
        }
    }

    /**
     * Updates the file
     *
     * @param filename
     * @param surveyCount
     * @param question1Data
     * @param question2Data
     * @param question3Data
     * @param checkBoxData
     * @param comboBoxData
     * @param textAreaData
     */
    public static void update(String filename, int surveyCount, int[] question1Data, int[] question2Data, String[] question3Data, int[] checkBoxData, int[] comboBoxData, String textAreaData) {
        try {
            File file = new File(filename);

            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("Number of surveys completed: " + (surveyCount + 1));
            pw.println();

            //Question 1
            pw.println("Question 1:");
            pw.println("Shooters - " + (question1Data[0] + checkBoxData[0]));
            pw.println("Fighters - " + (question1Data[1] + checkBoxData[1]));
            pw.println("Platformers - " + (question1Data[2] + checkBoxData[2]));
            pw.println("Strategy - " + (question1Data[3] + checkBoxData[3]));
            pw.println("RPG - " + (question1Data[4] + checkBoxData[4]));
            pw.println("Puzzle - " + (question1Data[5] + checkBoxData[5]));
            pw.println("Arcade - " + (question1Data[6] + checkBoxData[6]));
            pw.println("Sports - " + (question1Data[7] + checkBoxData[7]));
            pw.println("Other - " + (question1Data[8] + checkBoxData[8]));
            pw.println();

            //Question 2
            pw.println("Question 2:");
            pw.println("< 5 hours - " + (question2Data[0] + comboBoxData[0]));
            pw.println("< 10 hours - " + (question2Data[1] + comboBoxData[1]));
            pw.println("< 15 hours - " + (question2Data[2] + comboBoxData[2]));
            pw.println("15+ hours - " + (question2Data[3] + comboBoxData[3]));
            pw.println();

            //Question 3
            pw.println("Question 3:");
            for (int i = 0; i < question3Data.length; i++) {
                pw.print(question3Data[i]);
            }
            pw.println(textAreaData);
            pw.close();
            System.out.println("File written Successfully");
        } catch (IOException ioe) {
            ioe.printStackTrace(System.out);
        }
    }
}
