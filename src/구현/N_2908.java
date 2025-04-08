package 구현;

import java.io.*;
import java.util.StringTokenizer;

public class N_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder a = new StringBuilder(st.nextToken()).reverse();
        StringBuilder b = new StringBuilder(st.nextToken()).reverse();

        if(a.compareTo(b)>0){
            bw.write(a+"");
        }else{
            bw.write(b+"");
        }
        bw.flush();
        bw.close();



    }
}
