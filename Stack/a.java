
import java.io.*;

class a {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = reader.readLine().split("");
        int l = 0, r = 0;
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("(")) {
                l++;
            } else {
                r++;
            }
        }
        if (l != r) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < s.length; i++) {
            int flags = 0;
            for (int j = 0; j < s.length; j++) {
                if (s[(i + j) % s.length].equals("(")) {
                    flags++;
                } else {
                    flags--;
                    if (flags < 0) {
                        break;
                    }
                }
            }
            if (flags == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}