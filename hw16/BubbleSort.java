/*
CSE 15
Bart Michalak
bpm215
Bubblesort Array
HW 16
*/
public class BubbleSort{
  
public static void main(String a[]){

  int i;
int list[] = {20,15,10,30,80,5,17,100,35,75};
System.out.println("Values Before the sort:\n");

for(i = 0; i < list.length; i++)
System.out.print( list[i]+" ");
System.out.println();
mainSort(list, list.length);
System.out.print("Values after the sort:\n");
for(i = 0; i <list.length; i++)
System.out.print(list[i]+" ");
System.out.println();
}

public static void mainSort( int a[], int n ){
int i, j,t=0;
for(i = 0; i < n; i++){
for(j = 1; j < (n-i); j++){
if(a[j-1] > a[j]){
t = a[j-1];
a[j-1]=a[j];
a[j]=t;
}
}
}
}
}