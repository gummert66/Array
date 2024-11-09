import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int ans = 0; 
        int n= sc.nextInt();;
        int[] myarray = new int[n];
        
        for ( int i = 0; i < myarray.length; i++) {
            myarray[i]=sc.nextInt();
        }
        ans = myarray[n-1];
        for (int i = n-2; i>=0;i-- ){
            if (count % 4 ==1){
                ans += myarray[i];
             }
            else if (count % 4 ==2){

                ans -= myarray[i];
            }
            else if (count %4 ==3){
                ans *= myarray[i];
            }
            else {
                ans /= myarray[i];
            }
            count++;

        
        }
        System.out.println(ans);
        sc.close();
    }
}
