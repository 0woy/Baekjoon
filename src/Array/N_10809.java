package Array;

import java.io.*;
import java.util.Arrays;

public class N_10809 {
    /** Previous Solve
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char cur = 'a';

        for(int i=0;i<26;i++){
            bw.write(str.indexOf(cur)+" ");
            cur++;
        }
        bw.flush();
        bw.close();
    }
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int [] alpha = new int[26];
        Arrays.fill(alpha, -1);
        for(int i=0;i<str.length();i++){
            char cur = str.charAt(i);
            if(alpha[cur-'a']==-1){
                alpha[cur-'a']=i;
            }
        }
        for(int v: alpha){
            bw.write(v+" ");
        }
        bw.flush();
        bw.close();
    }

}
