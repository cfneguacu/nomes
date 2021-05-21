package nomes;

public class Nomes {

	public static void main(String[] args) {
		
		String nome[] = new String[] {"jose","pedro","paulo","Katia"};
		String pesquisa = "jose";

		int i;
		boolean existente = false;
		
		for(i = 0 ; i<nome.length; i++) {
			if(nome[i].equalsIgnoreCase(pesquisa)) {
				System.out.println("O nome ja existe");
				existente = true;
				break;

			}

		}
		
		if (existente == false) {
			System.out.println("O nome não existe");
		}
	}
	
}


		
		
		




