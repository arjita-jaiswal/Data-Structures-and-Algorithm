import java.util.*;
class NewThree{
static int fac(int number){  
  int i;
  int fact=1;    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }
return fact;        
 }  
public static void main (String args[]){
ArrayList<Integer> f1=new ArrayList<Integer>(10);
ArrayList<Double> f2=new ArrayList<Double>(10);
ArrayList<Double> f3=new ArrayList<Double>(10);
ArrayList<Double> f4=new ArrayList<Double>(10);
ArrayList<Integer> f5=new ArrayList<Integer>(10);
for(int n=1;n<11;n++){
f1.add(2*n+10);
f2.add((Math.pow(2,n))+10);
f3.add((Math.pow(n,2))+10);
f4.add(Math.log(2*n+10));
f5.add(2*(fac(n))+10);

}
System.out.println(f1);
System.out.println(f2);
System.out.println(f3);
System.out.println(f4);
System.out.println(f5);
}
}