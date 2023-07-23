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
public class GetName {
    public static String name = "Aldrik";
    static String phrase = "Qual será o seu nome?";
    //depois reutilizar para as configurações
    static public void getName() {    
        Scanner scanner = new Scanner(System.in);
        System.out.println(phrase);
        name = scanner.nextLine();
        if (name.length() > 16 || name.length() < 3) {
            phrase = "Só pode nome entre 3 a 16 caracteres.";
            getName();
        }
        //scanner.close();
    }    
}
