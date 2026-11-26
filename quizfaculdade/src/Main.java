import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe o cabeçalho institucional
        cabecalho.exibir();

        // Criação do vetor com as 15 questões
        Questao[] questoes = new Questao[15];

        questoes[0] = new Questao(
                "1. Qual é o maior planeta do Sistema Solar?",
                "A) Marte", "B) Saturno", "C) Júpiter", "D) Terra", "E) Urano", "C"
        );

        questoes[1] = new Questao(
                "2. Qual planeta é conhecido como o Planeta Vermelho?",
                "A) Vênus", "B) Marte", "C) Mercúrio", "D) Júpiter", "E) Netuno", "B"
        );

        questoes[2] = new Questao(
                "3. Qual é a estrela mais próxima da Terra?",
                "A) Alfa Centauri", "B) Sírius", "C) Betelgeuse", "D) Sol", "E) Próxima Centauri", "D"
        );

        questoes[3] = new Questao(
                "4. Qual o nome da galáxia em que o Sistema Solar está localizado?",
                "A) Andrômeda", "B) Via Láctea", "C) Triângulo", "D) Grande Nuvem de Magalhães", "E) Sombreiro", "B"
        );

        questoes[4] = new Questao(
                "5. Quem foi o primeiro homem a pisar na Lua?",
                "A) Yuri Gagarin", "B) Buzz Aldrin", "C) Neil Armstrong", "D) Michael Collins", "E) John Glenn", "C"
        );

        questoes[5] = new Questao(
                "6. Qual é o planeta mais próximo do Sol?",
                "A) Vênus", "B) Terra", "C) Marte", "D) Mercúrio", "E) Saturno", "D"
        );

        questoes[6] = new Questao(
                "7. Qual planeta do Sistema Solar é famoso por seus grandes anéis visíveis?",
                "A) Júpiter", "B) Saturno", "C) Urano", "D) Netuno", "E) Vênus", "B"
        );

        questoes[7] = new Questao(
                "8. Qual é o nome do primeiro satélite artificial lançado ao espaço (pela União Soviética em 1957)?",
                "A) Explorer 1", "B) Hubble", "C) Sputnik 1", "D) Voyager 1", "E) James Webb", "C"
        );

        questoes[8] = new Questao(
                "9. Qual gás compõe a maior parte da atmosfera de Júpiter e Saturno?",
                "A) Oxigênio", "B) Dióxido de Carbono", "C) Nitrogênio", "D) Hidrogênio", "E) Hélio", "D"
        );

        questoes[9] = new Questao(
                "10. Qual é a galáxia espiral de grande porte mais próxima da Via Láctea?",
                "A) Galáxia do Triângulo", "B) Galáxia de Andrômeda", "C) Grande Nuvem de Magalhães", "D) Galáxia do Sombreiro", "E) Centaurus A", "B"
        );

        questoes[10] = new Questao(
                "11. O que é um 'Buraco Negro'?",
                "A) Uma estrela que brilha mais que o Sol", "B) Uma região do espaço com forte atração gravitacional da qual nada escapa", "C) Um planeta gasoso sem núcleo", "D) Um meteoro de grande porte", "E) Uma nebulosa em extinção", "B"
        );

        questoes[11] = new Questao(
                "12. Qual planeta do Sistema Solar possui a temperatura superficial mais alta devido a um efeito estufa descontrolado?",
                "A) Mercúrio", "B) Marte", "C) Vênus", "D) Júpiter", "E) Saturno", "C"
        );

        questoes[12] = new Questao(
                "13. Em que ano ocorreu a missão Apollo 11, que levou o homem à Lua?",
                "A) 1965", "B) 1969", "C) 1972", "D) 1958", "E) 1981", "B"
        );

        questoes[13] = new Questao(
                "14. Qual é o nome do telescópio espacial lançado em dezembro de 2021 para substituir o Hubble?",
                "A) Spitzer", "B) Kepler", "C) James Webb", "D) Chandra", "E) Fermi", "C"
        );

        questoes[14] = new Questao(
                "15. Qual é o segundo maior planeta do Sistema Solar em tamanho?",
                "A) Júpiter", "B) Saturno", "C) Urano", "D) Netuno", "E) Terra", "B"
        );

        int acertos = 0;
        int totalQuestoes = questoes.length;

        // Loop para apresentar as questões e capturar respostas
        for (int i = 0; i < totalQuestoes; i++) {
            System.out.println("--------------------------------------------------");
            questoes[i].escreva();
            String resposta = scanner.nextLine();

            // Valida a resposta
            if (questoes[i].isCorreta(resposta)) {
                System.out.println("-> Resposta CORRETA!\n");
                acertos++;
            } else {
                System.out.println("-> Resposta INCORRETA. A correta era: " + questoes[i].getRespostaCorreta() + "\n");
            }
        }

        // Cálculos e Resultados Finais (Requisitos da P2)
        double mediaAproveitamento = ((double) acertos / totalQuestoes) * 100;

        System.out.println("==================================================");
        System.out.println("                   FIM DO QUIZ                    ");
        System.out.println("==================================================");
        System.out.println("Total de questões: " + totalQuestoes);
        System.out.println("Questões acertadas: " + acertos);
        System.out.printf("Média de acerto: %.2f%%\n", mediaAproveitamento);
        System.out.println("--------------------------------------------------");
        System.out.println("Muito obrigado por participar do nosso Quiz espacial!");
        System.out.println("==================================================");

        scanner.close();
    }
}