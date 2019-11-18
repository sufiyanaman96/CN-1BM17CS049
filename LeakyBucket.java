import java.util.*;
import java.lang.*; 

class Bucket
{ static int bucketSize=512;
 public static void bktInput(int a,int b) 
 {
  if(a>bucketSize)
  System.out.println("\n\t\tBucket overflow");
  else
  {
   //Thread.sleep(500);
   while(a>b)
   {
    System.out.println("\n\t\t"+b+" bytes outputted.");
    a-=b;
    //Thread.sleep(500);
   }
   if (a>0)
   System.out.println("\n\t\tLast "+a+" bytes sent\t");
   System.out.println("\n\t\tBucket output successful");
  }
 }
 public static void main(String args[])
 {
   Random random = new Random();
   Scanner in = new Scanner( System.in);
   System.out.println("Enter output rate : "); 
   int op=in.nextInt();
   for(int i=1;i<=5;i++)
   {
    int pktSize=random.nextInt(1000);
    System.out.println("\nPacket no "+i+"\tPacket size = "+pktSize);
    bktInput(pktSize,op);
   }
 } 
}
