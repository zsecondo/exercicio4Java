package exerci4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CursoMain {

	public static void main(String[] args) {
		Curso c;
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		int quantidadeDeAlunos=30;
		String turma = "Noturnna";
		float total =2000f;
		int m = 0;
		  
		 c = new Curso(nome, quantidadeDeAlunos,turma, total);
		 System.out.println( "Ola -- " +nome+
					"\nNa turma "+turma+" tem uma quantidade de: "+quantidadeDeAlunos+" vagas\ncom o valor total do curso de: "+total);
		 
		
		 
		 Scanner scan = new Scanner(System.in);
		 
		 
		 System.out.println("escolha o numero de parcelas(2a7): ");
		 
		 
		  int mensalidade = scan.nextInt();
		  
	
		switch(mensalidade) {
		case 1: System.out.println( "O valor a vista é de 1900");
		break;
		case 2: System.out.println("2x de "+ total/2f); 
		break;
		case 3: System.out.println("3x de "+ total/3f);
		break;
		case 4: System.out.println("4x de "+ total/4f);
		break;
		case 5: System.out.println("5x de "+ total/5f);
		break;
		case 6: System.out.println("6x de "+ total/6f);
		break;
		case 7: System.out.println("7x de "+ total/7f);
		break;
		default: 	System.out.println("não temos esse tipo de parcelamento");
		
		}
		 
		
	    }
	}