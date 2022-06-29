import java.util.Scanner;

public class CountSetBit_Int{
    static int setBits(int n){
        int count = 0;
        while (n > 0){
            n &= (n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int ans = setBits(a);
        System.out.println("No to set bits : "+ans);

    }
}