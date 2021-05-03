
import java.io.*;

class f {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        int[][] n = new int[T][T];
        boolean[] sb = new boolean[T];
        for (int i = 0; i < T; i++) {
            String[] s = reader.readLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                n[i][j] = Integer.parseInt(s[j]);
            }
        }
        sb[0] = true;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[i][j] == 1) {
                    if (sb[j] == false) {
                        sb[j] = true;
                    }else{
                        if(j>2){
                            System.out.println(1);
                            return;
                        }
                        System.out.println(j+1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);

    }
}