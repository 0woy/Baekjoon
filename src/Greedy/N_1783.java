package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N_1783 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        int count =0;
        if(N==1){
            count=1;
        }else if(N==2){
            // 오른쪽 +2만큼만
            count = Math.min(4, (M-1)/2+1);
        }else if(M<7){
            count = Math.min(4,M);
        }else{
            count = M-2;
        }
        System.out.println(count);
    }
}
