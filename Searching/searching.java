import java.util.*;
public class searching{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[] arr=new int[10];
int[] un=new int[10];
for(int i=0;i<10;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<10;i++){
un[i]=arr[i];
}
Arrays.sort(arr);
System.out.println("Highest mark is "+arr[9]+" and lowest mark is "+arr[0]);
int mark=sc.nextInt();
int start=0;
int end=9;
while (start<=end){
int mid =(start+end)/2;
if (mark==arr[mid]){
System.out.println("Mark is obtained by Subject  "+(mid+1));
break ;}
else if(mark<arr[mid]){
end=mid-1;
}
else if(mark>arr[mid]){
start=mid+1;
}
}
for(int j=0;j<10;j++){
if(un[j]==mark){
System.out.println("Mark is obtained by Subject "+(j+1));
}
}
for(int k=0;k<10;k++){
if(un[k]<40){
System.out.println("Margine in Subject "+(k+1)+" is "+(40-un[k]));
}
}}}
