public class Questao {
    private String pergunta;
    private String opcaoA;
    private String opcaoB;
    private String opcaoC;
    private String opcaoD;
    private String opcaoE;
    private String respostaCorreta;

    public Questao(String pergunta, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoE, String respostaCorreta) {
        this.pergunta = pergunta;
        this.opcaoA = opcaoA;
        this.opcaoB = opcaoB;
        this.opcaoC = opcaoC;
        this.opcaoD = opcaoD;
        this.opcaoE = opcaoE;
        this.respostaCorreta = respostaCorreta.toUpperCase();
    }

    public void escreva() {
        System.out.println(pergunta);
        System.out.println(opcaoA);
        System.out.println(opcaoB);
        System.out.println(opcaoC);
        System.out.println(opcaoD);
        System.out.println(opcaoE);
        System.out.print("Digite sua resposta (A, B, C, D ou E): ");
    }

    public boolean isCorreta(String respostaUsuario) {
        return this.respostaCorreta.equalsIgnoreCase(respostaUsuario.trim());
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }
}