
package Handlers;

import InputVariables.GetTiming;

public class Interface {
    public static void TypeEffect(String[] frases) throws InterruptedException {
        for (String i : frases) {
            for (String c: i.split("")) {
            Thread.sleep(GetTiming.timing);    
            System.out.printf(c);
        }
            System.out.println();
        }
    }
    public static void TypeEffectbyArr(String[][] frasesArr) throws InterruptedException {
      for (String[] frases : frasesArr) {
        for (String i : frases) {
            for (String c: i.split("")) {
            Thread.sleep(GetTiming.timing);    
            System.out.printf(c);
        }
            System.out.println("");
        }
        System.out.println("");
      }
    }
}
