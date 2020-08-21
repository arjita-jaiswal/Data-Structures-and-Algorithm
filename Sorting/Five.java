import java.util.*;
class Five{
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	int c=sc.nextInt();
	long startTime = System.currentTimeMillis();	
	for( double i=1; i<n; i*=c ){
		System.out.print(i+" ");
		}
	long endTime = System.currentTimeMillis();
	System.out.println("Time taken= "+(endTime-startTime)+"miliseconds");
	
	long startTime1 = System.currentTimeMillis();
	for( double i=2; i<n;i=(Math.pow(i,c))){
		System.out.print(i+" ");
		}
	long endTime1 = System.currentTimeMillis();
	System.out.println("Time taken= "+(endTime1-startTime1)+"miliseconds");

}
}