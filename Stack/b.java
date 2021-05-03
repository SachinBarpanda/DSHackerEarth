
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class b {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        while(T>0){
            String[]s = reader.readLine().split(" ");
            String[]s1 = reader.readLine().split(" ");
            //int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int ans = 0 ;
            int[] a = new int[s1.length];
            for (int i = 0; i < s1.length; i++) {
                a[i] = Integer.parseInt(s1[i]);
            }
            Arrays.sort(a);
            if(k>a[0]){
                ans = k-a[0];
            }else{
                ans = 0;
            }
            System.out.println(ans);



            T--;
        }
    }    
}
