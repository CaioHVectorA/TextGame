import InputVariables.GetTiming;
import Scenes.InitialScenes;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        GetTiming.getTiming();
        InitialScenes.startSceneOne();
    }
}
