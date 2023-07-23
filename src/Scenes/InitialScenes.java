package Scenes;


import Handlers.Interface;
import Handlers.Terminal;
import Handlers.Utils;
import InputVariables.GetName;
import Texts.Story;
import java.io.IOException;
import Handlers.Choices.ChoiceSelector;
import Texts.Choices;
public class InitialScenes {
        static public void startSceneOne() throws InterruptedException, IOException {        
        Interface.TypeEffectbyArr(Terminal.returnTextsByArr(Story.fullInitialStory()));
        Utils.pauseAndClean();
        Interface.TypeEffectbyArr(Terminal.returnTextsByArr(Story.blocoInicialDoHeroi()));
        GetName.getName();
        Interface.TypeEffectbyArr(Terminal.returnTextsByArr(Story.segundoBlocoHeroi())); 
        Utils.pauseAndClean();
        Interface.TypeEffectbyArr(Terminal.returnTextsByArr(Story.TerceiroBlocoHeroi()));
        ChoiceSelector.Select(Choices.WolfBattle());
        }
}