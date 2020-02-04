package newyearmaven;
import java.util.*;
class gifts
{
public int w()
{
return 0;
}
void sort(int a)
{
if(a==1)
System.out.println(" chocolate in gift is kitkat");
else
System.out.println("chocolate in gift is milkybar");
}
void candies(int b)
{
if(b==1)
System.out.println("sweet in gift is sweet1");
else
System.out.println("sweet in gift is sweet2");
}
}
class chocolates extends gifts
{
void chocolate1()
{
System.out.println("chocolates in gift are kitkat,milkybar");
}
}
class sweets extends gifts
{
void sweet1()
{
System.out.println("sweets in gift are sweet1,sweet2 ");
}
}

class choco extends gifts
{
public void weight()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no.of chocos are");
int n=sc.nextInt();
int a[]=new int[n];
int i,j;
System.out.println("weights of chocolates are");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(a[i]<a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("After sorting weights of chocolates are");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
int sum=0;
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
System.out.println("sum of weights of chocolates are"+" "+sum);
System.out.println(" ");
System.out.println("enter no.of sweets are");
int n2=sc.nextInt();
int d[]=new int[n2];
int temp1;
System.out.println("weights of sweets are");
for(i=0;i<n2;i++)
{
d[i]=sc.nextInt();
}
for(i=0;i<n2;i++)
{
for(j=0;j<n2;j++)
{
if(d[i]<d[j])
{
 temp1=d[i];
d[i]=d[j];
d[j]=temp1;
}
}
}
System.out.println("After sorting weights of sweets are");
for(i=0;i<n;i++)
{
System.out.println(d[i]);
}
int sum1=0;
for(i=0;i<n;i++)
{
sum1=sum1+d[i];
}
System.out.println("sum of weights of sweets are"+" "+sum1);
}
}
class newyear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
choco obj=new choco();
chocolates obj1=new chocolates();
sweets obj2=new sweets();
choco obj3=new choco();
choco obj4=new choco();
System.out.println("enter no.of childrens are");
int n1=sc.nextInt();
for(int i=0;i<n1;i++)
{
System.out.println("chocos for users"+(i+1));
obj.weight();
obj1.chocolate1();
obj2.sweet1();
System.out.println("enter pick chocolate from newyear's gifts");
int c1=sc.nextInt();
obj3.sort(c1);
System.out.println("enter pick sweet from newyear's gifts");
int s1=sc.nextInt();
obj4.candies(s1);
}
}
}