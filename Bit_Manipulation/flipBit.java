import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;

class flipBit {
    static int flipCount(int n , int m){
        int k = n ^ m;
        int count = 0;
        while(k > 0){
            k = k & (k - 1);
            count++;
        }
        return count;

    }
    public static void main(String[] arsg)throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the first interger: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter the second interger: ");
        int b = Integer.parseInt(br.readLine());
        System.out.println("No of flip bits: "+flipCount(a,b));
    }


}