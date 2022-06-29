// fine 2 non-repeating no. when others are repeating 2 times.

class NonRepeating_2{
    public static void main(String args[]){
        int a[] = {2,3,7,9,11,2,3,11};
        int rev = 0;
        for(int i = 0; i<a.length;i++){
            rev = rev ^ a[i];
        }
        // rev = ( rev & -rev);
        int temp = rev;
        int rev1=0;
        int rev2=0;
        for(int i=0; i<a.length;i++){
            if((a[i] & temp ) > 0){
                rev1 = rev1 ^ a[i];
            }
            else{
                rev2 = rev2 ^ a[i];
            }
        }
        System.out.println("Two non-repeating no. are: "+ rev1+","+rev2);
    }
}