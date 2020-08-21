import java.util.*;
class Asq{
static int gcd(int a, int b){
	if (a == 0 || b == 0)
           	return 0;
     	if (a == b)
            	return a;
     	if (a > b)
            	return gcd(a-b, b);
        	return gcd(a, b-a);
    	}
    
static int lcm(int a, int b){
        	return (a*b)/gcd(a, b);
	}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Stack<Integer> s=new Stack<>();
Queue<Integer> q=new LinkedList<>();
int[] a1=new int [n];
int[] a2=new int [n];
int mid=0;
if(n%2==0){
mid=n/2;}
else{
mid=(n+1)/2;}
for(int i=0;i<n;i++){
a1[i]=sc.nextInt();
a2[i]=sc.nextInt();
}
for(int j=0;j<n;j++){
if(j!=mid){
System.out.println(a1[j]);
System.out.println(a2[j]);
q.add(lcm(a1[j],a2[j]));
s.push(gcd(a1[j],a2[j]));
}
}
System.out.println("Queue: "+q);
System.out.println("Stack: "+s);
q.add(lcm(a1[mid],a2[mid]));
s.push(gcd(a1[mid],a2[mid]));
System.out.println("New Queue: "+q);
System.out.println("New Stack: "+s);
a1=ArrayUtils.remove(a1,0);
a1=ArrayUtils.remove(a1,mid);
a2=ArrayUtils.remove(a2,0);
a2=ArrayUtils.remove(a2,mid);

}
}