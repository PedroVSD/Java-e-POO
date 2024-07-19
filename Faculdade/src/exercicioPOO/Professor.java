package exercicioPOO;

import java.util.ArrayList;

public class Professor {
	private ArrayList<Aluno> alunos;
	
	public ArrayList<Aluno> getTurma() {
		return alunos;
	}

	public void setTurma(ArrayList<Aluno> turma) {
		this.alunos = turma;
	}
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	public float calcularMediaBimestre1(int indice, float n1, float n2) {
		Aluno aluno = alunos.get(indice);
		float notaFinalB1 = (aluno.getN1()+aluno.getN2())/2;
		return notaFinalB1;
	}
	
	public float calcularMediaBimestre2(int indice, float n3, float n4) {
		Aluno aluno = alunos.get(indice);
		float notaFinalB2 = (aluno.getN3()+aluno.getN4())/2;
		return notaFinalB2;
	}
	
	public String calcularMediaFinal(int numeroALuno, float n1, float n2, float n3, float n4) {
		Aluno aluno = alunos.get(numeroALuno);
		
		float mediaFinal = (aluno.getN1()+aluno.getN2()+aluno.getN3()+aluno.getN4())/4;
		aluno.setNotaFinal(mediaFinal);
		
		if(mediaFinal>=6) {
			return "Aprovado";
		}return "Reprovado";
	}
}
