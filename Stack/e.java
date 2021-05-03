
import java.io.*;

class e {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new  InputStreamReader(System.in));
        String[] sn = reader.readLine().split(" ");
        int[] n = new int[sn.length];
        for (int i = 0; i < sn.length; i++) {
            n[i] = Integer.parseInt(sn[i]);
        }
        int[][]array = new int[n[0]][n[1]];
        int[][]revArray = new int[n[1]][n[0]];
        for (int i = 0; i < n[0]; i++) {
            String[] s1 = reader.readLine().split(" ");
            for (int j = 0; j < s1.length; j++) {
                array[i][j] = Integer.parseInt(s1[j]);
            }        
        }
        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; j < array[i].length; j++) {
        //         System.out.print(array[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        //Inverser
        // System.out.println("After Inversing...");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                revArray[j][i] = array[i][j];
            }
        }
        
        for (int i = 0; i < revArray.length; i++) {
            for (int j = 0; j < revArray[i].length; j++) {
                System.out.print(revArray[i][j]+" ");
            }
            System.out.println();
        }
    
    }    
}
