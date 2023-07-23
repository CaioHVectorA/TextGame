package Handlers;

import java.io.IOException;

public class Terminal {
        public static void printText(String text) {
        String[] allWords = text.split(" ");
        int count = 0;
        StringBuilder currentLine = new StringBuilder();
        for (int i = 0; i < allWords.length; i++) {
            currentLine.append(allWords[i]).append(" ");
            count++;
            //System.out.println(allWords[i]);
            if (count == 13 || count == allWords.length - 1) {
                System.out.println(currentLine);
                currentLine = new StringBuilder();
                count = 0;
            } 
            if (allWords.length - i < 13) {
                System.out.print(" ");
                System.out.print(currentLine);
                for (int index = i; index < allWords.length; index++) {
                System.out.print(" ");
                System.out.print(allWords[index]);
                }
                break;
            }
        }
    }
        public static String[] returnTexts(String text) {
        String[] finalPhrases = {};
        String[] allWords = text.split(" ");
        int count = 0;
        StringBuilder currentLine = new StringBuilder();
        for (int i = 0; i < allWords.length; i++) {
            currentLine.append(allWords[i]).append(" ");
            count++;
            //System.out.println(allWords[i]);
            if (count == 13 || count == allWords.length - 1) {
                finalPhrases = Utils.addString(finalPhrases, currentLine.toString());
                currentLine = new StringBuilder();
                count = 0;
            } 
            if (allWords.length - i < 13) {
                StringBuilder temp = new StringBuilder();
                temp.append(" ");
                temp.append(currentLine);
                for (int index = i + 1; index < allWords.length; index++) {
                temp.append(" ");
                temp.append(allWords[index]);
                }
                finalPhrases = Utils.addString(finalPhrases, temp.toString());
                break;
            }
        }
        return finalPhrases;
        }
        public static void PrintTexts(String[] textos) {
            
        }
        public static String[][] returnTextsByArr(String[] textos) {
            String[][] texts = {};
            for (String i : textos) {
                texts = Utils.addArrayString(texts, returnTexts(i));
            }
            return texts;
        }
        public static void CleanTerminal() throws IOException, InterruptedException {
//            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
             else 
            Runtime.getRuntime().exec("clear");
        }
}
