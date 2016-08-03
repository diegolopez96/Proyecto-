import java.util.Scanner;

public class Main {
/**
 * 
 */
	public static void main(String[] args) 
	{
	

	Robot persona=new Robot();
	Scanner lector=new Scanner(System.in);
	
	System.out.println("\n\n##################################################################\n    #################################\n    #    Programa laberinto JAVA    #\n    #################################\n");
	
	
	String inicio=persona.analizar();
	int salirWhile=1;
	if (persona.analizar().substring(0,1).equals("c"))
	{
		persona.setMov(0);
	}
	
	else if (persona.analizar().substring(2,3).equals("c"))
	{
		persona.setMov(1);
	}
	
	else if (persona.analizar().substring(1,2).equals("c"))
	{
		persona.setMov(2);
	}
	
	else if (persona.analizar().substring(3,4).equals("c"))
	{
		persona.setMov(3);
	}
	
	System.out.println("El valor inicial de movimento es "+ persona.getmov());
	
	
	System.out.println("");
			while(salirWhile==1)
			{
				
				System.out.println("    #################################\n    #    Programa laberinto JAVA    #\n    #################################\n");
	
				persona.printLaberinto();
				System.out.println("\n   Presione cualquier letra + enter para continuar.....\n##################################################################");
				String enter=lector.next();
				
				
				System.out.println("El valor mov es:  "+ persona.getmov()+"\n    * <--- es el robot\n    #<---son paredes\n\n");
				
				//aqui se llaman a los metodos para trabajar

				//codigo para salir de bucle sin salida
				
				
				if (persona.analizar().equals("cccp") || persona.analizar().equals("ccpc") || persona.analizar().equals("cpcc") || persona.analizar().equals("pccc"))
				{
					persona.setNodoX(persona.getx());
					persona.setNodoY(persona.gety());
					System.out.println("\n*Se ha creado Pivote\n");
					
					
				}
				
				if ((persona.analizar().equals("pppc") && persona.getmov()==1 )|| (persona.analizar().equals("ppcp") && persona.getmov()==3 ) || (persona.analizar().equals("pcpp") && persona.getmov()==0 ) || (persona.analizar().equals("cppp") && persona.getmov()==2 ))
				{	
					persona.setLaberinto(persona.getx(),persona.gety());
					persona.setx(persona.getNodoX());
					persona.sety(persona.getNodoY());
					persona.analizar();
					
				}
				
				//cuando topa arriba
				if ((persona.getmov()==0) && persona.analizar().substring(0,1).equals("p"))
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

				else if ((persona.getmov()==1) && persona.analizar().substring(2,3).equals("p"))
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

				else if ((persona.getmov()==2) && persona.analizar().substring(1,2).equals("p"))
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

				else if ((persona.getmov()==3) && persona.analizar().substring(3,4).equals("p"))
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
				
				//////
				
				
				//arriba libre
				else if ((persona.getmov()==0) && persona.analizar().substring(0,1).equals("c"))
				{
					persona.arriba(persona.analizar());
				}
				
				
				//izquierda libre
				else if((persona.getmov()==1) && persona.analizar().substring(2,3).equals("c"))
				{
					persona.izquierda(persona.analizar());
				}
				
				//abajo libre
				else if((persona.getmov()==2) && persona.analizar().substring(1,2).equals("c"))
				{
					persona.abajo(persona.analizar());
				}
				
				//derecha libre
				else if ((persona.getmov()==3) && persona.analizar().substring(3,4).equals("c"))
				{
					persona.derecha(persona.analizar());
				}

				//######
				
				//System.out.println("esto regresa analizar\n    tsid"+"\n    "+persona.analizar() +"\n\n");
				
				if (persona.analizar().equals("xxxx"))
				{
					salirWhile=0;
				}
			}
			System.out.println("\n\n\n\n\n!!!!!!!!!!!!!!!!!!!GANASTE!!!!!!!!!!!!!!!!!!!"+"\n!!!!!!!!!!!!!!!!!!!GANASTE!!!!!!!!!!!!!!!!!!!"+"\n!!!!!!!!!!!!!!!!!!!GANASTE!!!!!!!!!!!!!!!!!!!");
			
	
	}
	
}
