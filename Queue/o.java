
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class o {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] s = reader.readLine().split(" ");
        int[] s1 = new int[n];
        for (int i = 0; i < n; i++) {
            s1[i] = Integer.parseInt(s[i]);
        }
        
    }    
}
