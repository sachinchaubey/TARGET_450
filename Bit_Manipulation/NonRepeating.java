
// find non-repeating no. when others are repeating 2 times.

class NonRepeating{
    public static void main(String[] args){
        int a[] = {5,4,1,4,3,5,1};
        int rev = 0;
        for(int i = 0; i<a.length; i++){
            rev = rev ^ a[i];
        }
        System.out.println(rev);
    }
}