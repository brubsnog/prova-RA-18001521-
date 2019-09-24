package prova;

public class Calcularmedia {
	public static void main(String[] args) {
        aluno alunoAnderson;
        aluno alunoJoão;
        aluno alunoJoaquim;
        aluno alunoMaria;

        alunoAnderson = new aluno();
        alunoJoão = new aluno();
        alunoJoaquim = new aluno();
        alunoMaria = new aluno();

        alunoAnderson.nome = "Anderson";
        alunoAnderson.curso = "ADS";
        alunoAnderson.serie = 4;
        alunoAnderson.disciplina = "LTPIV";
        alunoAnderson.avaliacao = 1.5;
        alunoAnderson.disciplina1 = "SO";
        alunoAnderson.avaliacao1 = 5.4;

        alunoJoão.nome = "João";
        alunoJoão.curso = "ADS";
        alunoJoão.serie = 4;
        alunoJoão.disciplina = "LTPIV";
        alunoJoão.avaliacao = 9.8;

        alunoJoaquim.nome = "Joaquim";
        alunoJoaquim.curso = "ADS";
        alunoJoaquim.serie = 2;
        alunoJoaquim.disciplina = "SO";
        alunoJoaquim.avaliacao = 7.8;

        alunoMaria.nome = "Maria";
        alunoMaria.curso = "ADS";
        alunoMaria.serie = 2;
        alunoMaria.disciplina = "SO";
        alunoMaria.avaliacao = 3.4;

        double media = (alunoAnderson.avaliacao + alunoAnderson.avaliacao1 + alunoJoão.avaliacao
                + alunoJoaquim.avaliacao + alunoMaria.avaliacao);
        System.out.println("A média do curso ADS é " + media);

        double mediaSerie4 = (alunoAnderson.avaliacao + alunoAnderson.avaliacao1 + alunoJoão.avaliacao) / 3;
        System.out.println("A média da Serie 4  é " + mediaSerie4);

        double mediaAnderson = (alunoAnderson.avaliacao + alunoAnderson.avaliacao1) / 2;
        System.out.println("A média do Aluno " + alunoAnderson.nome + " é " + mediaAnderson);

        double mediaSO = (alunoJoaquim.avaliacao + alunoMaria.avaliacao + alunoAnderson.avaliacao1) / 3;
        System.out.print("A média da disciplina SO é " + mediaSO);

    }

}