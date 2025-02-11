package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class N_1448 {
    /** My Solve 900 ms
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);
        for(int i=list.size()-1;i>=2;i--){
            int longest = list.get(i);
            for(int j=i-1;j>0;j--){
                int a = list.get(j);
                int b = list.get(j-1);
                if(longest<a+b){
                    System.out.println(longest+a+b);
                    return;
                }else{
                    break;
                }
            }
        }
        System.out.println(-1);
    }
     */
    static int [] arr;
    static int idx;
    public static int getV(){
        int num = 0;
        while (arr[idx]==0) --idx;
        num = idx;
        arr[idx]--;

        return num;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        arr =new int[1000001];
        int maxNum = -1;
        for(int i=1;i<=n;i++){
            int cur =Integer.parseInt(br.readLine());
            arr[cur]++;
            if(cur > maxNum){
                maxNum =cur;
            }
        }

        int res = -1,a,b,c;
        idx = maxNum;
        int cnt = n-2;
        while (cnt -- >0){
            c = getV();
            a = getV();
            b = getV();
            if(c < a+b){
                res = a+b+c;
                break;
            }

            arr[a]++; arr[b]++;
            idx = a;
        }
        System.out.println(res);
    }
}
