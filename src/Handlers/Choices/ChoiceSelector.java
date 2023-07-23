package Handlers.Choices;

import Handlers.Interface;
import Handlers.Terminal;
import java.util.Scanner;
import Handlers.Utils;
import Texts.Story;
import java.io.IOException;
public class ChoiceSelector {
    public static void Select(Choice[] args) throws InterruptedException, IOException {
        for (Choice choice : args) {
            System.out.println(choice.number + ". " + choice.choiceName);
    }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faça sua escolha, digite o número correspondente a sua escolha.");
        String number = scanner.nextLine();
        if (Utils.isStringNaN(number) || Integer.parseInt(number) > 10 || Integer.parseInt(number) < 1 ) {
            System.out.println("Digite um número válido!");
        }
        for (int index = 0; index < args.length; index++) {
            if (Integer.parseInt(number) == args[index].number) {
                Interface.TypeEffectbyArr(Terminal.returnTextsByArr(args[index].dropTexts));
                args[index].scene.StartScene();
            } else {
             if (index == args.length - 1) {
                 System.out.println("Digite um número válido!");
                 Utils.pauseAndClean();
                 Select(args);
             }   
            }
    }
}
}
