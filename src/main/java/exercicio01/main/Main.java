package exercicio01.main;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {
		
		int idade = 15;
		int nova_idade;
		int nova_idade1;
		
		idade = (idade + 5) / 2;
		nova_idade = (idade - 5);
		
		System.out.println("A idade � de: " + nova_idade + " anos");
		
		
		
		
		if (nova_idade < 20) {
			
			System.out.println("A idade � menor 20 anos: " + nova_idade);
		}
		
		else {
			
			System.out.println(("A idade � maior que 20: "+ nova_idade));
		}
		
		
		
	}

}
