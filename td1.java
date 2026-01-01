import java.util.Scanner;
import java.util.Arrays;

public class td1{
    public static void main(String[] args) {

        // Exersice 1 :
      
        System.out.println("--------- EXERCICE 1 -------------------------");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of grades : ");
        int totalNumberOfGrades = sc.nextInt();
        sc.nextLine();
        double[] grades = new double[totalNumberOfGrades];
        //get grades
        for (int i = 0; i < totalNumberOfGrades; i++) {
            System.out.println("Enter the grade of the student N° : " + (i+1));
            grades[i] = sc.nextDouble();
        }
        //sort grades
        Arrays.sort(grades);
        //Display grades
        System.out.println("Grades sorted are : ");
        double sum = 0;
        for(double g:grades){
            System.out.println(g);
            //sum all the grades
            sum += g;
        }
        double avg = sum/totalNumberOfGrades;
        //Display Average grade
        System.out.println("Average of all grades is = " + String.format("%.2f",avg));
        //Display the highest and lowest grades
        double minGrade = grades[0];
        double maxGrade = grades[grades.length - 1];
        System.out.println("Highest grade = "+maxGrade);
        System.out.println("Lowest grade = "+minGrade);
        //Display the number of students with a grade entered by the user
        System.out.println("Give me a grade that you'd like to know how many students got it : ");
        double specificGrade = sc.nextDouble();
        int count = 0;
        for(double g:grades){
            if(g == specificGrade){
                count += 1;
            }
        }
        if(count == 1){
            System.out.println(count +" student got = "+specificGrade);
        }else{
            System.out.println(count +" students got = "+specificGrade);
        }

        // Exersice 2:
        
        System.out.println("--------- EXERCICE 2 -------------------------");
        sc.nextLine();
        System.out.println("Entrez un verbe du premier groupe : ");
        String verb = sc.nextLine();

        while (!verb.endsWith("er")) {
            System.out.println("Entrez un verbe du premier groupe [ends with 'er']: ");
            verb = sc.nextLine();
        }
        System.out.println("----- The verb " + verb + " is a regular verb -----\n  It's conjugation is as follows :");
        String verbRoot = verb.substring(0, verb.length() - 2);

        //Conjugation
        if(verb.endsWith("ger")) {
            System.out.println("   Je " + verbRoot + "e");
            System.out.println("   Tu " + verbRoot + "es");
            System.out.println("   Il / Elle " + verbRoot + "e");
            System.out.println("   Nous " + verbRoot + "eons");
            System.out.println("   Vous " + verbRoot + "ez");
            System.out.println("   Ils / Elles " + verbRoot + "ent");
        }
        else if(verb.endsWith("cer")){
            System.out.println("   Je " + verbRoot + "e");
            System.out.println("   Tu " + verbRoot + "es");
            System.out.println("   Il / Elle " + verbRoot + "e");
            System.out.println("   Nous " + verbRoot.substring(0, verbRoot.length() - 1) + "çons");
            System.out.println("   Vous " + verbRoot + "ez");
            System.out.println("   Ils / Elles " + verbRoot + "ent");
        }
        else if (verb.endsWith("eler") || verb.endsWith("eter")) {
            char lastChar = verbRoot.charAt(verbRoot.length() - 1);
            String doubleConsonant = verbRoot + lastChar;
            // je ou j'
            String je = "Je ";
            if ("aeiouyAEIOUY".indexOf(doubleConsonant.charAt(0)) != -1) {
                je = "J'";
            }

            System.out.println("   " + je + doubleConsonant + "e");
            System.out.println("   Tu " + doubleConsonant + "es");
            System.out.println("   Il / Elle " + doubleConsonant + "e");
            System.out.println("   Nous " + verbRoot + "ons");
            System.out.println("   Vous " + verbRoot + "ez");
            System.out.println("   Ils / Elles " + doubleConsonant + "ent");
        }

        //Exersice 3:

        System.out.println("--------- EXERCICE 3 -------------------------");
        int click = -1;
        String originalCharacter = "";

        while (click != 5) {
            System.out.println("--------- MENU ---------");
            System.out.println("1- ENTER");
            System.out.println("2- DISPLAY");
            System.out.println("3- REVERSE");
            System.out.println("4- NUMBER OF WORDS");
            System.out.println("5- EXIT");

            System.out.print("CHOOSE AN OPTION FROM THE MENU : [1-5] ");
            click = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (click) {
                case 1:
                    System.out.print("Enter a string: ");
                    originalCharacter = sc.nextLine();
                    System.out.println("Press Enter to return to the menu...");
                    sc.nextLine();
                    break;

                case 2:
                    System.out.println("The entered string is: " + originalCharacter);
                    System.out.println("Press Enter to return to the menu...");
                    sc.nextLine();
                    break;

                case 3:
                    StringBuilder reversedCharacter = new StringBuilder(originalCharacter).reverse();
                    System.out.println("Reversed string: " + reversedCharacter);
                    System.out.println("Press Enter to return to the menu...");
                    sc.nextLine();
                    break;

                case 4:
                    if (originalCharacter.isEmpty()) {
                        System.out.println("No string entered yet!");
                    } else {
                        String trimmed = originalCharacter.trim();
                        if (trimmed.isEmpty()) {
                            System.out.println("Number of words: 0");
                        } else {
                            String[] words = trimmed.split("\\s+");
                            System.out.println("Number of words: " + words.length);
                        }
                    }
                    System.out.println("Press Enter to return to the menu...");
                    sc.nextLine();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option!");
                    System.out.println("Press Enter to return to the menu...");
                    sc.nextLine();
            }
        }

        // Exercise 4:

        System.out.println("--------- EXERCICE 4 -------------------------");
        System.out.print("Enter a line of text (max. 100 characters): ");
        String ch = sc.nextLine();

        int[] nb_occurrences = new int[26];

        ch = ch.toUpperCase();

        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                nb_occurrences[c - 'A']++;
            }
        }

        System.out.println("The string \"" + ch + "\" contains:");

        for (int i = 0; i < 26; i++) {
            if (nb_occurrences[i] > 0) {
                char letter = (char) ('A' + i);
                System.out.println(nb_occurrences[i] + " occurrence(s) of the letter '" + letter + "'");
            }
        }
    }
}
