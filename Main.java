import java.util.Scanner;

public class Main {
/**
 * 
 */
	public static void main(String[] args) 
	{
	

	Robot persona=new Robot();
	Scanner lector=new Scanner(System.in);
	
	System.out.println("\n    Programa laberinto JAVA\n\n");
	
	//persona.printLaberinto();
	
	System.out.println("");
			while(1==1)
			{
				persona.printLaberinto();
				System.out.println("\n   Presione enter para continuar");
				String enter=lector.next();
				
				//aqui se llaman a los metodos para trabajar
				persona.derecha(persona.analizar());
				persona.izquierda(persona.analizar());
				persona.arriba(persona.analizar());
				persona.abajo(persona.analizar());
				
				
				
				
			}
	
	}
	
}