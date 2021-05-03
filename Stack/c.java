
import java.io.*;
import java.util.Arrays;

class c {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        String[] s = reader.readLine().split(" ");
        long[] a = new long[s.length+1];
        long count = 0L, count1 = 0L,sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(s[i]);

        }
        Arrays.sort(a);
        for (int i = 0; i < a.length-1; i++) {
            long dif = a[i + 1] - a[i];
            if (dif == 1) {
                count++;  
            }
            else if (dif == 0){
                count++;
                count1++;
                
            }else{
                if(count!=count1){
                    sum +=(count*(count+1))/2;
                }
                count = 0;
                count1 = 0;
            }
        }
        System.out.println(sum);
    }
}

