/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.problema.pkg015;
import java.util.*;

public class FpProblema015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 11;
        int b = 11;
        int[][] arr = new int[a][b];
        Random r = new Random();
        for(int i = 0; i < a - 1; i++){
            int row = 0;
            int col = 0;
            for(int j = 0; j < b - 1; j++){
                arr[i][j] = r.nextInt(10);
                arr[j][i] = r.nextInt(10);
                row += arr[i][j];
                col += arr[j][i];
            }
            arr[i][b - 1] = row;
            arr[b - 1][i] = col;
        }
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
        
        
    }
    
} 
  
    
    

