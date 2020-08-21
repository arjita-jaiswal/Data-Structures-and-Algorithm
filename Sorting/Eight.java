import java.util.*;
class Eight{
class MinHeap{
    int *harr; 
    int capacity; 
    int heap_size;

     MinHeap(int a[], int size){
     heap_size = size;
     harr = a;  
     int i = (heap_size - 1)/2;
     while (i >= 0){
        MinHeapify(i);
        i--;
    }
}

void MinHeapify(int i){
    int l = left(i);
    int r = right(i);
    int smallest = i;
    if (l < heap_size && harr[l] < harr[i])
        smallest = l;
    if (r < heap_size && harr[r] < harr[smallest])
        smallest = r;
    if (smallest != i){
        Collections.swap(&harr[i], &harr[smallest]);
        MinHeapify(smallest);
    }

 
   
    int parent(int i) { return (i-1)/2; }
    int left(int i) { return (2*i + 1); }
    int right(int i) { return (2*i + 2); }
 
int extractMin(){
    if (heap_size == 0)
        return INT_MAX;
 
   
    int root = harr[0];
    if (heap_size > 1)
    {
        harr[0] = harr[heap_size-1];
        MinHeapify(0);
    }
    heap_size--;
 
    return root;
}
int getMin() { return harr[0]; } 

 
public static void main(Strings args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
int =sc.nextInt();
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
MinHeap mh=new MinHeap(arr,n);
    for (int i=0; i<k-1; i++){
        mh.extractMin();
}
   System.out.println(mh.getMin());
}

}