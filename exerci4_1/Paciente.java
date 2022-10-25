import javax.swing.JOptionPane;

public class Paciente {
		  String nome, rg, endereco,telefone, profissao;
		 int anoNascimento, esteAno;
		 
	
	
	 Paciente(String nome, String rg,String endereco,String telefone,String profissao,int anoNascimento,int esteAno){
		this.nome = nome ;
		this.rg = rg;
		this.endereco=endereco;
		this.telefone = telefone;
		this.profissao=profissao;
		this.anoNascimento=anoNascimento;
		this.esteAno = esteAno;

	}
	 
	 
	 void calculaIdade(int anoAtutal) {
		 anoNascimento = anoAtutal- anoNascimento;
		 
	 }
	 
	 void imprimeDados() {
		 JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nRG: "+rg+"\nEndereço: "+endereco+"\nTelefone: "+telefone+"\nP"
		 		+ "rofissão: "+profissao+"\nIdade atual: "+anoNascimento);
		 
	 }
	 
	 
	 
}
