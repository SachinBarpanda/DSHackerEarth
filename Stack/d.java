
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

// import jdk.internal.jline.internal.InputStreamReader;

class d {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new  InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        String[] s = reader.readLine().split(" ");
        int[] n = new int[T];
        ArrayList<Integer> max = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            n[i] = Integer.parseInt(s[i]);
        }
        max.add(n[s.length-1]);
        int j = 0;
        for (int i = (T-2); i >=0; i--) {
            if(max.get(j)<=n[i]){
                max.add(n[i]);
                j++;
            }
        }
        Collections.reverse(max);
        for(Integer i : max){
            System.out.print(i+" ");
        }
        
       
        
    }    
}
