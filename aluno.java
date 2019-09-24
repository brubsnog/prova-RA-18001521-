package prova;

public class aluno {
	
	String nome; 
	String curso;
	int serie; 
	String disciplina;
	String disciplina1;
	double avaliacao;
	double avaliacao1; 
	
	String dadosAluno() {
		String dados = "Nome do aluno: " + this.nome; 
		return dados += "/n Curso: " + this.curso; 
		return dados += "/n Disciplina: " + this.disciplina;
		return dados += "/n Avaliação: " + this.avaliacao; 
		
	}
		
			}

