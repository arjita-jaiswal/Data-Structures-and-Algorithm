import java.util.*;
public class Solution{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList[] set =new ArrayList[n];
        for (int i=0;i<n;i++){
                int d=sc.nextInt();
                set[i]=new ArrayList();
                for(int j=0;j<d;j++){
                        set[i].add(sc.nextInt());

                }
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(set[x].get(y));
        System.out.println(set[x].length());


}


}
