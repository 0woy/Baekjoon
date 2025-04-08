package 구현;

import java.io.*;
import java.util.StringTokenizer;

public class N_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int max =0;
        int row=1, col=1;
        for(int r=1;r<=9;r++){
            st=new StringTokenizer(br.readLine());
            for(int c=1;c<=9;c++){
                int cur = Integer.parseInt(st.nextToken());
                if(cur>max){
                    max =cur;
                    row =r;
                    col=c;
                }
            }
        }
        bw.write(max+"\n");
        bw.write(row+" "+col);
        bw.flush();
        bw.close();



    }
}
