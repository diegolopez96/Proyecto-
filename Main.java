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
				//tsid
				
				
				
				
				
				/////////////////////////////////////////////////////
				
				
				//######
								//tsid

				//cuando topa arriba
				if (persona.getmov()==0 && persona.analizar().substring(0,1).equals("t"))
				{
					 if(persona.analizar().substring(2,3).equals("c"))
									{
									persona.izquierda(persona.analizar());
									}
					else if (persona.analizar().substring(3,4).equals("c"))
									{
									persona.derecha(persona.analizar());
									}
				}



				//cuando topa izquierda

				else if (persona.getmov()==1 && persona.analizar().substring(2,3).equals("t"))
				{
					 if(persona.analizar().substring(1,2).equals("c"))
									{
									persona.abajo(persona.analizar());
									}
					else if (persona.analizar().substring(0,1).equals("c"))
									{
									persona.arriba(persona.analizar());
									}
				}


				//cuando topa Abajo

				else if (persona.getmov()==2 && persona.analizar().substring(1,2).equals("t"))
				{
					 if(persona.analizar().substring(3,4).equals("c"))
									{
									persona.derecha(persona.analizar());
									}
					else if (persona.analizar().substring(2,3).equals("c"))
									{
									persona.izquierda(persona.analizar());
									}
				}


				//cuando topa derecha

				else if (persona.getmov()==3 && persona.analizar().substring(3,4).equals("t"))
					{
					 if(persona.analizar().substring(0,1).equals("c"))
									{
									persona.arriba(persona.analizar());
									}
					else if (persona.analizar().substring(1,2).equals("c"))
									{
									persona.abajo(persona.analizar());
									}
				}
				
			

				//######
				
				
				
				
				
				
				
				
				
				
				
				
				
				//////////////////////////////////////////////////////
				
				
				
				
				
				
				
				
				
				
				
				else if (persona.analizar().substring(0,1).equals("c"))
				{
					persona.arriba(persona.analizar());
				}
				
				
				else if(persona.analizar().substring(2,3).equals("c"))
				{
					persona.izquierda(persona.analizar());
				}
				
				else if(persona.analizar().substring(1,2).equals("c"))
				{
					persona.abajo(persona.analizar());
				}
				
				else if (persona.analizar().substring(3,4).equals("c"))
				{
					persona.derecha(persona.analizar());
				}
				
				System.out.println("esto regresa analizar\n    tsid"+"\n    "+persona.analizar() +"\n\n");
				
				
				
				
				
				
				
			
			}
	
	}
	
}
