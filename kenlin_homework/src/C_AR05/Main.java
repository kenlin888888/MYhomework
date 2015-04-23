package C_AR05;
import java.util.Scanner;
public class Main { 
  public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        while(keyin.hasNext()){
            int n = keyin.nextInt();
            int[] arr = new int[25];
            for(int i=0;i<n;i++){
                int s = keyin.nextInt();
                int d = keyin.nextInt();
                for(int j=s;j<d;j++){
                    arr[j]++;
                }
            }
            int max =0;
            for(int i=0;i<25;i++){
                max = Math.max(max, arr[i]);
                //System.out.println(iarr[i]);
            }
            System.out.println(max);
        }
    }
}
