package Texts;
import InputVariables.GetName;
public class Story {
    public static String[] fullInitialStory() {
       String[] texts = {
            "\tO reino de Mysticoria costumava ser próspero e pacífico, governado por um sábio rei que possuía um poderoso artefato mágico conhecido como Orbe da Luz. No entanto, um dia, o Orbe da Luz foi roubado pelo maligno feiticeiro Malvodor, e o reino caiu em trevas.",
            "\tA escuridão tomou conta do reino, transformando criaturas pacíficas e adoráveis em monstros ferozes e hostis. O rei ficou preso em seu próprio castelo, incapaz de enfrentar Malvodor e recuperar o orbe.",
            "\tEm meio ao caos e a destruição, o reino incorporou-se em uma guerra entre os soldados e os monstros, incadeando um banho de sangue incontrolável.",
            "\tMas toda essa obscuridade teve um fim quando uma luz se iniciou...",
            
        };
       return texts;
    }
    public static String[] blocoInicialDoHeroi() {
        String[] texts = {
            "Você acorda, com seu rosto iluminado com a luz do sol. Animado com o dia ensolarado, você levanta rapidamente e vai até sua sala.",
            "- Bom dia! - diz você, a sua mãe.",
            "- Bom dia, ______!",
        };
           return texts;
    }
    public static String[] segundoBlocoHeroi() {
        String[] texts = {
        "- Bom dia, " + GetName.name + "!",
        "Você olha pros lados, e percebe que algo está faltando.",
        "- Ué... Cadê o pai?!",
        "Sua mãe abaixa a cabeça, tentando disfarçar sua preocupação.",
        "- Ele ainda não voltou...",
        "\tDjikstra, seu pai, é um renomado soldado de elite do reino. Vocês moram numa casa de campo afastada do local, evitando problemas e preocupações, e o seu pai foi convocado para uma reunião no castelo. Não é a primeira vez, e assim como em todas, você e sua mãe achavam que ele voltaria no dia seguinte. Mas não foi o caso.",
        "\tVocê, com o seu vínculo inequebrável com o seu pai, é tomado pela preocupação. Você dá uma leve refletida, enche seu peito e diz:",
        "- E-Eu vou atrás dele!",
        "- Não, " + GetName.name + "! Você vai ficar aqui em casa!",
        "Você pega a sua bolsa e pendura sobre seu pescoço. Ignorando as palavras de sua mãe, você se dirige até a saída.",
        "- Você não vai me escutar, não é?!",
        "Você para em frente a porta, sem respostas para sua mãe. Você sabe que ela está preocupada, mas não consegue voltar atrás",
        "- Só... Tome cuidado, filho.",
        "- Eu vou, mãe.",
        "\tVocê sai da casa, depositando todas suas esperanças para encontrar o seu pai. Na sua bolsa, você tem uma faca de caça, alguns suprimentos e o mapa antigo da região."
        };
        return texts;
    }
    public static String[] TerceiroBlocoHeroi() {
        String[] texts = {
            "\tTentando levantar toda a confiança que você tem, você pega aquele mapa desgastado, com um uma planta da região e algumas anotações de seu pai.",
            "- Droga... Vou ter que seguir por essa floresta. - Você pensa.",
            "\tVocê se prepara mentalmente e se adentra na densa floresta, seguindo as indicações do mapa com cuidado. A luz do sol mal consegue atravessar o dossel das árvores, e os sons dos animais da floresta ecoam ao seu redor. A cada passo, você sente a tensão aumentar, mas a esperança de encontrar seu pai te impulsiona a continuar.",
            "\tEnquanto avança, o silêncio da floresta é interrompido por um rosnado gutural. Seus instintos alertam que algo está se aproximando rapidamente. Com um calafrio na espinha, você se vira e se depara com um lobo imponente, cujos olhos faiscam com uma mistura de curiosidade e cautela. Ele não parece hostil, mas também não se mostra amigável."
        };
        return texts;
    }
}
