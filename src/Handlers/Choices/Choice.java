package Handlers.Choices;
import Scenes.SceneFunction;

public class Choice {
    int number;
    String choiceName;
    String[] dropTexts;
    SceneFunction scene;
    public Choice(int number, String choiceName, String[] dropTexts, SceneFunction scene) {
        this.number = number;
        this.choiceName = choiceName;
        this.dropTexts = dropTexts;
        this.scene = scene;
    }
}
