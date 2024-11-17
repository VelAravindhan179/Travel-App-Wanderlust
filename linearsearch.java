import java.io.*;
import java.util.*;
class linearsearch
{
public static int search(int arr[],int n,int x)
{
for(int i=0;i<n;i++)
{
if(arr[i]==x)
return i;
}
return-1;
}
public static void main(String args[])
{
int[] arr=new int[10];
Scanner s=new Scanner(System.in);
System.out.print("Enter the no.elements");
int n=s.nextInt();
System.out.print("Enter the elements one by one");
for(int i=0;i<n;i++)
arr[i]=s.nextInt();
System.out.print("Enter the element you want to search");
int x=s.nextInt();
int result=search(arr,n,x);
if(result==-1)
System.out.print("Element is not present in array");
else
System.out.print("Element is present"+"at index"+result);
}
}