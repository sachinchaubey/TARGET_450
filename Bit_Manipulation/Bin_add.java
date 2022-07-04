import java.util.Scanner;

class Bin_add{
    public static String addBinary(String a,String b){
        int A = Integer.parseInt(a,2);
        int B = Integer.parseInt(b,2);
        int add = A + B;
        return Integer.toBinaryString(add);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        String ans = addBinary(a,b);
        System.out.println(ans);
    }
}