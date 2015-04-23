package C_SL18;
import java.util.Scanner;

public class Main {  
    static int answer=0;  
    public static void main(String[] args) {   
        int[][] arr = new int[8][8];  
        Scanner sc = new Scanner(System.in);   
          
        for(int i = 0; i < arr.length; i++)   
            for(int j = 0; j < arr[0].length; j++){  
                int keyin = sc.nextInt();   
                arr[i][j] = keyin;  
            }  
        sc.close();
        
        for(int m = 0; m < arr.length; m++)   
            for(int n = 0; n < arr[0].length; n++)  
            if(arr[m][n]==1){  
               answer = checkarr(m,n,arr);   
            }
        
       if(answer >= 1)  
            System.out.println("X");  
       else  
            System.out.println("O");  
    }  
      
    public static int checkarr(int x, int y, int[][] carr){            
         for(int j=y+1; j < carr.length; j++)   
            if (carr[x][j] == 1){  
                answer = answer + 1;  
                break;  
            }  
         if(answer == 0)  
             for(int i=x+1; i < carr[0].length; i++)  
                 if (carr[i][y] == 1){  
                        answer = answer + 1;  
                        break;  
                 } 
         int p=0;
         int q=y;
         if(answer == 0)  
             for(p=x+1; p < carr.length; p++){
            	 q+=1;
                 if(p<8 && q<8)
 				   if (carr[p][q] == 1){  
                         answer = answer + 1;  
                  }
             }
            	 
        return answer;                        
    }  
}  
 
 