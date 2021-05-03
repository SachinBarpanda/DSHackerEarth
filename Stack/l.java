
import java.io.BufferedReader;
import java.io.InputStreamReader;

class l {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] n1 = reader.readLine().split(" ");
        int[] n2 = new int[n1.length];
        for (int i = 0; i < n1.length; i++) {
            n2[i] = Integer.parseInt(n1[i]);
        }
        int a, b;
        for (int i = 0, j = n - 1; i < n2.length && j >= 0;) {
            a = n2[i];
            b = n2[j];
            if (a > b) {
                System.out.print(1 + " ");
                j--;
            } else if (b > a) {
                System.out.print(2 + " ");
                i++;
            }else{
                System.out.print(0 +" ");
                i++;
                j--;
            }
        }

    }
}
