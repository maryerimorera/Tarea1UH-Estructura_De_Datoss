package tarea1;

// @author Maryeri Morera - Tarea1 Estructura de Datos

public class Tarea1 {

    public static void main(String[] args) {

        Sumatoria();

    }

    public static void Sumatoria() {

        int cont = 1;
        int[][] matriz = new int[21][21];

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = cont++;
            }
        }

        System.out.println("La matriz es igual a: ");

        for (int f = 0; f < matriz[0].length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {

                System.out.print("  " + matriz[f][c]);
            }
            System.out.println(" ");
        }
  
        
        
        int sumaDiagIzq = 0;
        
        for (int i=0; i < matriz[0].length; i++){
            
            sumaDiagIzq += matriz[i][i];
                    
        }
        System.out.println("Suma de diagonal izquierda: " + sumaDiagIzq);
        
        
        
        int sumaDiagDer = 0;
        
        for (int i=matriz[0].length-1; i >= 0; i--){
            
            sumaDiagDer += matriz[i][i];
                    
        }
        System.out.println("Suma de diagonal derecha: " + sumaDiagDer);
        
        
        int sumaDiags = sumaDiagIzq + sumaDiagDer;
        System.out.println("El gran total es: " +sumaDiags);
        
    }

}
