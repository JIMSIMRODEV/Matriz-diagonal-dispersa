//
import java.util.Random;
import java.util.Scanner;


public class TestMatrizDispersa {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Random aleatorio = new Random();
        int[] mostrarDiagonal;
        int diagonal;
        int fila;
        int columna;
        
        
//        System.out.println("Ingresa el numero de filas: ");
//        fila = leer.nextInt();
//        
//        
//        System.out.println("Ingresa el numero de columnas: ");
//        columnas = leer.nextInt();
        
        fila = aleatorio.nextInt(5-1) + 2;
        columna = (fila );
        

        int[][] matrizDispersa = new int[fila][columna];
        mostrarDiagonal = new int[matrizDispersa.length];
         
         
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        for(int i = 0; i < matrizDispersa.length; i++){
            diagonal = aleatorio.nextInt(11) + 1;
            System.out.println(":: El Valor ingresado en la (Fila: " + i + ", Columna " + i + "): es " + diagonal + " ::");
            mostrarDiagonal[i] = diagonal;
            matrizDispersa[i][i] = diagonal;
            
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
        
        
        System.out.println("::::::::: Matriz dispersa ::::::::::");
        for(int f = 0; f < matrizDispersa.length; f++){
            System.out.print("   Fila:" + f + " ");
            for(int c = 0; c < matrizDispersa[f].length; c++){
                System.out.print("[" + matrizDispersa[f][c] + "] ");
            }
            System.out.println("");
        }
        System.out.println("::::::::::::::::::::::::::::::::::::");
                 
        System.out.println("\n:::::: Numeros de la diagonal :::::");
        System.out.print("\t");
        for(int i = 0; i < mostrarDiagonal.length; i++){           
        System.out.print("[" + mostrarDiagonal[i]+ "]");
       }  
       System.out.println("\n::::::::::::::::::::::::::::::::::::");
    }
    
}
