package Scenes;
import Handlers.Interface;
import Texts.ChapterOne;
import Handlers.Terminal;
import Handlers.Choices.ChoiceSelector;
import Texts.Choices;
import java.io.IOException;
public class SceneChapterOne {
    static public void startScene() throws InterruptedException, IOException {
        Interface.TypeEffectbyArr(Terminal.returnTextsByArr(ChapterOne.initialBlockOne()));
        Interface.TypeEffectbyArr(Terminal.returnTextsByArr(ChapterOne.secondBlockOne()));
        ChoiceSelector.Select(Choices.AcceptPotion());
    }
}
