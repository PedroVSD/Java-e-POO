package aula_10_heranca;

public class Main extends Pessoa{

	public static void main(String[] args) {
		
		Pessoa novaPessoa = new Pessoa();
		Aluno novoAluno = new Aluno();
		Professor novoProfessor = new Professor();
		Funcionario novoFuncionario = new Funcionario();
		
		novoAluno.setNome("Pedro");
		novaPessoa.setNome("Maria");
		novoProfessor.setNome("Cláudio");
		novoFuncionario.setNome("Fabiana");
		
		novoAluno.setCurso("Informática");
		novoProfessor.setSalario(2500.75f);
		novoFuncionario.setSetor("Estoque");
		
		novoProfessor.ReceberAum(550.20f);
		novoFuncionario.mudarTrabalho();
		novoAluno.cancelarMatricula();
		
		
		System.out.println(novoAluno.toString());
		System.out.println(novaPessoa.toString());
		System.out.println(novoProfessor.toString());
		System.out.println(novoFuncionario.toString());
		
	}

}
