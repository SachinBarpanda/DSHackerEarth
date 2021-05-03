
import java.io.BufferedReader;
import java.io.InputStreamReader;

class i {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split(" ");
        int[] n = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            n[i] = Integer.parseInt(s[i]);
        }
        int sum1=0, sum2 =0;
        for (int i = 0; i < n.length; i++) {
            if(i%2==0){
                sum1+= n[i];
            }else{
                sum2+=n[i];
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }    
}
