package desafioCap;

public class SenhaForte {

	public static void main(String[] args) {
		
			
			String senha = JOptionPane.showInputDialog("Digite a senha com no mínimo 6 caracteres. "
				  + "\nEla deve ter ao menos:"
				  + "\num número, uma letra maiúscula, uma letra minúscula e "
				  + "\num destes carateres especiais: !@#$%^&*()-+.");
	
			
	        if(senha.length()<6){
				int n = 6 - senha.length();
				JOptionPane.showMessageDialog(null,"Você precisa adicionar: " + n + " caractere(s).");

	        }else if(!senha.matches(".*[0-9].*$")){
	        	JOptionPane.showMessageDialog(null,"A senha deve ter no mínimo um número.");
	            
	        }else if(!senha.matches(".*[a-z].*$")){
	        	JOptionPane.showMessageDialog(null,"A senha deve ter no mínimo uma letra minúscula.");
	            
	        }else if(!senha.matches(".*[A-Z].*$")){
	        	JOptionPane.showMessageDialog(null,"A senha deve ter no mínimo uma letra maiúscula.");
	            
	        }else if(!senha.matches(".*[!@#$%^&*()-+].*$")){
	        	JOptionPane.showMessageDialog(null,"A senha deve ter no mínimo um caractere especial.");
	            
	        }else{
	        	JOptionPane.showMessageDialog(null,"Senha Forte!");
	        }
   }

}
