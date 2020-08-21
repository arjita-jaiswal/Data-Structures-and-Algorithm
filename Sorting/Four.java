import java.util.*;
class Four{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

long startTime = System.currentTimeMillis();
for(int i=0;i<n;i++){
System.out.print(i+" ");
}
long endTime = System.currentTimeMillis();
System.out.println(" Time taken= "+(endTime-startTime)+"miliseconds");

long startTime1 = System.currentTimeMillis();
for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		System.out.print(i+j+" ");
		}
	}
long endTime1 = System.currentTimeMillis();
System.out.println(" Time taken= "+(endTime1-startTime1)+"miliseconds");

long startTime2 = System.currentTimeMillis();
for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		for(int k=0;k<n;k++){
		System.out.print(i+j+k+" ");
		}
	}}
long endTime2 = System.currentTimeMillis();
System.out.println(" Time taken= "+(endTime2-startTime2)+"miliseconds");
}}