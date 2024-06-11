public class Programa {
    public static void main(String[] args) {
        // Variáveis para armazenar o nome do herói e a quantidade de XP
        String nome = "Gustavo Boaz";
        int xp = 8500;

        // Variável para armazenar o nível do herói
        String nivel;

        // Estrutura de decisão para determinar o nível do herói com base na XP
        if (xp < 1000) {
            nivel = "Ferro";
        } else if (xp >= 1001 && xp <= 2000) {
            nivel = "Bronze";
        } else if (xp >= 2001 && xp <= 5000) {
            nivel = "Prata";
        } else if (xp >= 5001 && xp <= 7000) {
            nivel = "Ouro";
        } else if (xp >= 7001 && xp <= 8000) {
            nivel = "Platina";
        } else if (xp >= 8001 && xp <= 9000) {
            nivel = "Ascendente";
        } else if (xp >= 9001 && xp <= 10000) {
            nivel = "Imortal";
        } else if (xp >= 10001) {
            nivel = "Radiante";
        } else {
            nivel = "Desconhecido";
        }

        // Saída da mensagem com o nome do herói e o nível correspondente
        System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);
    }
}
