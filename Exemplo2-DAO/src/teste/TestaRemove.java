package teste;

import java.sql.SQLException;

import modelo.Contato;
import bd.ContatoDAO;

public class TestaRemove {
	public static void main(String[] args) throws SQLException{
		 int  id = 1; 
		
		 ContatoDAO dao = new ContatoDAO();
		 Contato contato = dao.obter(id);
		 
		 if (contato != null) {
						 		 
			 // remove o contato
			 dao.remove(contato);
			 
			 System.out.println("Contato foi removido com sucesso!");
		 }
		 else
			 System.out.println("Não existe contato com id " + String.valueOf(id) + "!");
	}
}
