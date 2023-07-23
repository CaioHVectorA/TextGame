/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputVariables;

import java.util.Scanner;

/**
 *
 * @author caihe
 */
public class GetTiming {
    public static int timing = 0;
    //depois reutilizar para as configurações
    static public void getTiming() {    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual será o tempo entre cada digitação? (Milisegundos)");
        timing = scanner.nextInt();
        //scanner.close();
    }
}
