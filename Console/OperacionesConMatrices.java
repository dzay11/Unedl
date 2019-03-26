package TareasD;

import java.util.Scanner;

public class OperacionesConMatrices {
	private Scanner teclado; 
	private int[][] mat1;
	private int[][]mat2;
	private float[][]matR;
	
	public void cargar(){ 
		teclado=new Scanner(System.in); 
		mat1=new int[3][3]; 
		mat2=new int[3][3]; 
		matR=new float[3][3]; 
		System.out.println ("\tPrograma de operaciones con matriz 3x3 \n");
		for (int x=0;x<=2;x++){ 
			for (int y=0;y<=2;y++){ 
				System.out.println ("Digita los valores de la primera matriz \n");
				mat1[x][y]=teclado.nextInt();
			}
		}
		for (int x=0;x<=2;x++){ 
			for (int y=0;y<=2;y++){ 
				System.out.println ("Digita los valores de la segunda matriz \n");
				mat2[x][y]=teclado.nextInt();
			}
		}	
	}
	public void suma(){ 
		for (int x=0;x<=2;x++){ 
			for (int y=0;y<=2;y++){
				matR[x][y]=mat1[x][y]+mat2[x][y];}} 
		imprimir();
	}
	public void resta(){  
		for (int x=0;x<=2;x++){
			for (int y=0;y<=2;y++){
				matR[x][y]=mat1[x][y]-mat2[x][y];}}
		imprimir();
	}
	public void multiplicacion(){ 
		int rem;             
		for (int x=0;x<=2;x++){    
			for (int y=0;y<=2;y++){
				rem=0;                
	          for(int d=0;d<=2;d++){
	          	rem+=mat1[x][d]*mat2[d][y];  
	          	matR [x][y]=rem;         	
	          }
			}
		}
		imprimir();
	}
	public void imprimir(){
		System.out.println ("matriz resultante\n"); 
		for (int x=0;x<=2;x++){
			for (int y=0;y<=2;y++){
				System.out.print(" "+matR[x][y]);
			}
			System.out.println ("\n"); 
		}
	}
	public static void main(String[]args) { 
		OperacionesConMatrices matriz=new OperacionesConMatrices(); 
		 Scanner teclado = new Scanner(System.in);
		 matriz.cargar();
			int o;
			do{           
			System.out.println ("Operaciones con matrices\n");
			System.out.println ("0)salir\n1)Sumar\n2)Restar\n3)Multiplicar");
			o=teclado.nextInt();
			switch (o){
			
			case 1: matriz.suma();
				break;
				
			case 2:matriz.resta();
				break;
				
			case 3:matriz.multiplicacion();
				break;
				default :System.out.println ("Digita una opcion valida\n");
			}	
		}while(o!=0);
	}
}