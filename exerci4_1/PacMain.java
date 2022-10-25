import javax.swing.JOptionPane;

public class PacMain {

	public static void main(String[] args) {
		Paciente p;
		String nome;
		String rg;
		String endereco;
		String telefone;
		String profissao;
		int anoNascimento;
		int esteAno = 2022;
		
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		rg = JOptionPane.showInputDialog("Digite seu RG: ");
		endereco = JOptionPane.showInputDialog("Digite o seu endereço: ");
		telefone = JOptionPane.showInputDialog("Digite o numero de telefone: ");
		profissao = JOptionPane.showInputDialog("Digite a sua profissao");
		anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
		
		p = new Paciente( nome, rg,endereco,telefone,profissao,anoNascimento,esteAno);
		
		p.calculaIdade(esteAno);
		p.imprimeDados();
			
		
		
		
	}

}
