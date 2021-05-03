
import java.io.*;

class g {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        while(T>0){
            int a = Integer.parseInt(reader.readLine());
            int[][] arr = new int[a][a];
            for (int i = 0; i < a; i++) {
                String[]s = reader.readLine().split("");
                for (int j = 0; j < s.length; j++) {
                    arr[i][j] = Integer.parseInt(s[j]);
                }
            }
            solve(arr);
            T--;
        }
    }
    
    static void solve(int[][] arr){
    
    //Checking left and right of the 3d array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0,k=arr.length-1; j < (arr.length/2); j++,k--) {
                if(arr[i][j] != arr[i][k]){
                    System.out.println("NO");
                    return;
                }
            }
        }
        //Checking top and bottom of the 3d array
        for (int i = 0,k=(arr.length-1); i < (arr.length/2); i++,k--) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]!=arr[k][j]){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
