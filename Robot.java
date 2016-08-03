import java.io.*;

public class Robot{
	private int posder; //indica si esa direccion es disponible(1) o no disponible(0)
	private int posizq;//indica si esa direccion es disponible(1) o no disponible(0)
	private int posari;//indica si esa direccion es disponible(1) o no disponible(0)
	private int posaba;//indica si esa direccion es disponible(1) o no disponible(0)
	//private String [][] laberinto; //laberinto para comparar en metodo analizar
	
	String [] [] laberinto=  {{"0","0","0","0","0","0"}, //0=pared 1=camino
						     {"0","1","1","1","1","0"},
						     {"0","1","0","0","0","0"},
						     {"0","1","0","0","0","0"},
							 {"0","1","1","1","1","0"},
							 {"0","0","0","0","0","0"}};
	
	
	
	public int x;//posicion en el mapa/laberinto x
	public int y; //posicion en el mapa/laberinto y
	public int mov; //nos dice cual fue el ultimo movimiento
	public int gx; //Posicion x de la salida del laberinto
	public int gy; //Posicion y de la salida del laberinto
	
	public Robot()
	{
	x=4;
	y=1;
	gx=4;
	gy=4;
	laberinto[y][x]="x";
	laberinto[gy][gx]="Y";
	mov=2;
	
	}
	
	public void printLaberinto()
	{
		for(int i=0; i<laberinto.length;i++)
		{
			//for(int posicion=0;posicion<vector.length();posicion++)
			for(int j=0;j<laberinto[i].length;j++)
			{
				
				if (laberinto[i][j].equals("0"))
				{
					//System.out.print(laberinto[i][j]);
					System.out.print("#");
				}
				
				if (laberinto[i][j].equals("1"))
				{
					//System.out.print(laberinto[i][j]);
					System.out.print(" ");
				}
				
				if (laberinto[i][j].equals("x"))
				{
					//System.out.print(laberinto[i][j]);
					System.out.print("*");
				}
				
				if (laberinto[i][j].equals("Y"))
				{
					//System.out.print(laberinto[i][j]);
					System.out.print("Y");
				}
			}
			System.out.println("");
		}
	}
	
	
	
	public int getmov()
	{
		return mov;
	}
	
	public void setMov(int cambio)
	{
		mov=cambio;
	}
	
	
	// banderas techo=0  oeste=1 sur=2 este=3
	public void derecha(String respuesta)
	{
	 if (respuesta.substring(3,4).equals("c"))
	 {
		x=x+1;
		mov=3;
		laberinto[y][x]="x";
		laberinto[y][x-1]="1";
	 }
	 
	}
	
	public void izquierda(String respuesta)
	{
	if (respuesta.substring(2,3).equals("c"))
	 {
		x= x-1;
		mov=1;
		laberinto[y][x]="x";
		laberinto[y][x+1]="1";
	 }
	 
	}
	
	public void arriba (String respuesta)
	{
		if (respuesta.substring(0,1).equals("c"))
	 {
		y=y-1;
		mov=0;
		laberinto[y][x]="x";
		laberinto[y+1][x]="1";
		
		
	 }	
	 
	
	}
	
	public void abajo(String respuesta)
	{
		if (respuesta.substring(1,2).equals("c"))
	 {
		y= y+1;
		mov=2;
		laberinto[y][x]="x";
		
		laberinto[y-1][x]="1";
		
	 }
	 
	}
	
	public String analizar ()
	{
		//string retornar tsid  p=pared c=camino
		String techo;
		String suelo;
		String paredizq;
		String paredder;
		String respuesta;
		respuesta="tsid";
		int posX=x;
		int posY=y;
		
		//arriba
		if (laberinto[posY-1][posX].equals("0"))
		{
			techo="p";		
		}
		else
		{
			techo="c";
		}
		//abajo
		if (laberinto[posY+1][posX].equals("0"))
		{
			suelo="p";		
		}
		else
		{
			suelo="c";
		}
		//izquierda
		if (laberinto[posY][posX-1].equals("0"))
		{
			paredizq="p";		
		}
		else
		{
			paredizq="c";
		}
		//derecha
		if (laberinto[posY][posX+1].equals("0"))
		{
			paredder="p";		
		}
		else
		{
			paredder="c";
		}
		
		respuesta=techo+suelo+paredizq+paredder;
		return respuesta;
	}
		
}
