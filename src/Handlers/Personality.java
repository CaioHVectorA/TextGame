package Handlers;

public class Personality {
    public static int racional = 5;
    public static int valente = 5;
    public static int corajoso = 5;
    public static int sentimental = 5;
    public static int habilidoso = 5;
    public static int confiante = 5;
    public static int carismatico = 5;
    public static int impulsivo = 5;
    public static int leal = 5;
    public static int honrado = 5;
    public static int trapaceiro = 5;
    public static int perceptivo = 5;
    public static int determinado = 5;
    public static int altruista = 5;
    public static void increasePerso(int personalidade) {
        if (personalidade < 10) {
            personalidade++;
        }
    }
    public static void decreasePerso(int personalidade) {
        if (personalidade > 0) {
            personalidade--;
        }
    }
}
