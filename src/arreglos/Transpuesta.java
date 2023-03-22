/**************************************
 * Autor: Màrquez Espina Josè Àngel   *
 * Fecha Creación: 22/03/23           *
 * Fecha Actualización:	22/03/23      *
 * Descripción: Tanspuesta con        *
 * matrices cuadradas		      *
 **************************************/

package arreglos;
import java.util.Iterator;
import	java.util.Scanner;
public class Transpuesta {
	public static void main(String[] args) {
	
	Scanner leer = new Scanner(System.in);  
	
	//El usuario introducira el tamaño de las filas y columnas de la matriz
	System.out.println("Dame el tamaño de las filas");
	int fil = leer.nextInt();
	System.out.println("Dame el tamaño de las Columnas");
	int col = leer.nextInt();
	
	//Se almacenarà el tamaño de la matriz
	int mat[][] = new int [fil][col];
	int mat2[][] = new int [col][fil];
	
	//EL usuario introducirà los valores de la matriz
		for (int i = 0; i<fil; i++) {
			for (int j = 0; j<col; j++) {
				System.out.print("Dame los valores de la matriz["+ i +"] ["+ j +"]: ");
				mat[i][j] =leer.nextInt();
				
			}
		}
		//Se imprimen los valores que el usuario introdujo y se muestra en consola
		for (int i = 0; i < fil; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat[i][j]);
			
		}
		//Se inicia la operaciòn de la matriz transpuesta  y la primera matriz se pasa a la segunda
		System.out.println(" ");
		}
		for (int j = 0; j<fil; j++) {
			for (int i = 0; i<col; i++) {
				
				mat2[i][j] = mat[j][i];
				
			}
		}
		//Se imprime la matriz transpuesto, solo acepta matrices cuadradas
		System.out.println("La matriz transpuesta es: ");

		for (int i = 0; i< fil; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(mat2[i][j]);
			
		}
			System.out.println(" ");
	}

  }
}
