package Texts;
import Handlers.Choices.Choice;
import Handlers.Interface;
import Scenes.SceneFunction;
import Handlers.Personality;
import Handlers.Terminal;
import Scenes.SceneChapterOne;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Choices {
    public static Choice[] WolfBattle() {
        String[] texts1 = {
            "\tMovido pela coragem e determinação, você decide enfrentar o lobo diretamente. Com a faca de caça em mãos, você avança, prontamente para atacar. No entanto, no momento crucial, um galho escondido no chão se enrola em seu tornozelo, fazendo-o tropeçar. Seu ataque falha, e o lobo recua por um instante, avaliando a situação.",
            "\tAgora no chão, você rapidamente se levanta, mas o lobo avança novamente. Seus olhos se encontram com os do animal, e você sente a tensão no ar enquanto se prepara para o próximo movimento.",
            "\tAntes que a situação fique ainda mais perigosa, algo inesperado acontece. Uma figura misteriosa surge das sombras da floresta, vestida em trajes enigmáticos. O desconhecido emana uma aura de poder, e rapidamente conjura uma magia. O lobo é imobilizado, seu corpo preso por uma força invisível."
        };
        String[] texts2 = {
            "\tAo notar o lobo se aproximando, o instinto de sobrevivência o leva a escolher a fuga como a melhor opção. Desesperado, você começa a correr pela floresta, tentando escapar da fera que o persegue implacavelmente.",
            "\tEntretanto, em meio à corrida frenética, seu pé fica preso em um galho escondido no chão, fazendo-o tropeçar. Você cai desajeitadamente, e o lobo se aproxima, seus dentes à mostra, prestes a atacar.",
            "\tEm um momento crucial, algo extraordinário acontece. Uma figura misteriosa emerge das sombras da floresta, trajando roupas que parecem possuir traços arcanos. O desconhecido estende a mão para o lobo e murmura palavras místicas.",
            "\tUma magia poderosa envolve o lobo, imobilizando-o completamente. O animal rosna impotentemente, incapaz de se mover sob a influência do feitiço. O olhar do misterioso personagem se volta para você, como se estivesse analisando sua situação."
        }; 
            SceneFunction cena1 = () -> {
             Personality.increasePerso(Personality.racional);
             Personality.decreasePerso(Personality.valente);
             Personality.decreasePerso(Personality.corajoso);
            try {
                SceneChapterOne.startScene();
            } catch (InterruptedException ex) {
                Logger.getLogger(Choices.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
            SceneFunction cena2 = () -> {
             Personality.decreasePerso(Personality.racional);
             Personality.increasePerso(Personality.valente);
             Personality.increasePerso(Personality.corajoso);
            try {
                SceneChapterOne.startScene();
            } catch (InterruptedException ex) {
                Logger.getLogger(Choices.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        Choice escolha1 = new Choice(1,"Enfrentar o lobo", texts1, cena1);
        Choice escolha2 = new Choice(2,"Fugir", texts2, cena2);
        Choice[] data = {escolha1,escolha2};
    return data;
    }
    public static Choice[] AcceptPotion() {
        String[] text1 = {
            "\tApesar de toda a descofiança e do que você sabe sobre as poções, você acaba aceitando o produto alquímico.",
            "\tVocê pega o recipiente cheio de elixir e vira sobre sua boca, e sente o líquido caloroso descer pelo seu organismo.",
            "\tO gosto não é bom, mas em poucos segundos uma sensação agradável e aliviadora toma conta enquanto sua ferida cicatriza.",
            "- Uau! Isso é bom mesmo! - Você diz, impressionado.",
            "- Anos de prática. Se sente melhor?",
            "- Revigorado. Me sinto novo em folha!"
,};
        String[] text2 = {
            "\tCom toda a sua repulsa sobre a alquimia, você acena não com a cabeça.",
            "- Tem certeza? Pode acabar piorando.",
            "- Tenho. Eu tenho alguns curativos na minha bolsa.",
            "- Não sei o medo que vocês tem sobre poções e magias.",
            "\tVocê faz um curativo enquanto o mago organiza as suas criações. Depois de um suspiro, ele vira e diz:",
        };
        SceneFunction cena1 = () -> {
            Personality.increasePerso(Personality.corajoso);
            Personality.increasePerso(Personality.leal);
            Personality.increasePerso(Personality.confiante);
            Personality.decreasePerso(Personality.racional);
            try {
                Interface.TypeEffectbyArr(Terminal.returnTextsByArr(ChapterOne.thirdBlockOne()));
            } catch (InterruptedException ex) {
                Logger.getLogger(Choices.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        SceneFunction cena2 = () -> {
            Personality.decreasePerso(Personality.corajoso);
            Personality.decreasePerso(Personality.leal);
            Personality.decreasePerso(Personality.confiante);
            Personality.increasePerso(Personality.racional);
            try {
                Interface.TypeEffectbyArr(Terminal.returnTextsByArr(ChapterOne.thirdBlockOne()));
            } catch (InterruptedException ex) {
                Logger.getLogger(Choices.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        Choice choice1 = new Choice(1,"Aceitar a poção.",text1,cena1);
        Choice choice2 = new Choice(2,"Recusar a poção.",text2,cena2);
        return new Choice[]{choice1,choice2};
    }
}
