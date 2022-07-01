// import java.util.Arrays;

// import javax.lang.model.util.ElementScanner14;

// fine 2 non-repeating no. when others are repeating 2 times.

class NonRepeating_2{
    static void singleNo(int[] a){
        int[] arr = a;
        int rev = 0;
        for(int i = 0; i<arr.length;i++){
            rev = rev ^ a[i];
        }
        rev = rev & ~(rev - 1);
        int temp = rev;
        int c =0;
        int d =0;
        for(int i=0; i<arr.length;i++){
            if((arr[i] & temp ) > 0){
                c = d ^ arr[i];
            }
            else{
                d = c ^ arr[i];
            }
        }
        if(c > d){
            System.out.println(d + ", " + c);
        }
        else{
            System.out.println(c + "," + d);
        }
        
    }
    public static void main(String args[] ){
        int a[] = {2,1,3,2};
        singleNo(a);
    }
}