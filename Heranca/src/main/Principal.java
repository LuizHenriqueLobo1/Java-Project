package main;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("João", 18);
		System.out.println("Nome  : " + pessoa.getNome());
		System.out.println("Idade : " + pessoa.getIdade());
		
		System.out.println("--------------");
		
		Aluno aluno = new Aluno("Maria", 20, 2021123, true, 7.65f);
		System.out.println("Nome  : " + aluno.getNome());
		System.out.println("Idade : " + aluno.getIdade());
		System.out.println("Matr  : " + aluno.getMatricula());
		System.out.println("Semes : " + aluno.getSemestralizado());
		System.out.println("CRE   : " + aluno.getCre());
	}
	
}