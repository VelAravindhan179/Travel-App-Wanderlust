import java.util.*;
class binarysearch
{
public static void main(String args[])
{
int[] numarray=new int[10];
Scanner s=new Scanner(System.in);
System.out.print("Enter the no.of elements");
int n=s.nextInt();
System.out.print("Enter the elements one by one");
for(int i=0;i<n;i++)
numarray[i]=s.nextInt();
Arrays.sort(numarray);
System.out.println("The input array:"+Arrays.toString(numarray));
System.out.print("Enter the element you want to search");
int key=s.nextInt();
int first=0;
int last=numarray.length-1;
int mid=(first+last)/2;
while(first<=last){
if(numarray[mid]<key)
{
first=mid+1;
}
else if(numarray[mid]==key)
{
System.out.println("Element is found at index:"+mid);
break;
}
else
{
last=mid-1;
}
mid=(first+last)/2;
}
if(first>last)
{
System.out.println("Element is not found!");
}
}
}
