TCS NQT Coding Question – September Day 1 – Slot 1
Problem Statement –
A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
Example 1 :
N=8 and arr = [4,5,0,1,9,0,5,0].
There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array
Input :
8  – Value of N
[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline
Output:
4 5 1 9 5 0 0 0
Example 2:
Input:
6 — Value of N.
[6,0,1,8,0,2] – Element of arr[0] to arr[N-1], While input each element is separated by newline
Output:
6 1 8 2 0 0

Program
import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int s = sc.nextInt();
    int arr[] = new int[s];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    int a = 0;
    for(int j=0;j<arr.length;j++){
      if(arr[j]!=0){
        arr[a]=arr[j];
        a++;
      }
    }
    while(a<arr.length){
      arr[a]=0;
      a++;
    }
    for(int k=0;k<arr.length;k++){
      Stsrem.out.print(arr[k]+" ");
    }
  }
}

Output:
Enter the size of the array: 
4
1
0
3
0
1 3 0 0 
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Problem Statement –
Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits”.
Constrains-
1<=N<=100
Example 1:
Input :
10  -> Integer
Output :
5    -> result- Integer
Explanation:
Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.

Program:
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num=sc.nextInt();
    int l=0;
    String sum="",rev="";
    whiile(num!=0){
      l=num%2;
      sum+=l;
      num/=2;
    }
    char[] a1 = sum.toCharArray();
    for(int i=a1.length-1;i>=0;i--){
      rev+=a1[i];            
    }
    char[] a2 = rev.toCharArray();
    for(int i=0;i<a2.length;i++){
      if(a2[i]=='0'){
        a2[i]=1;
      }
      else{
        a2[i]=0;
      }
    }
    int power=0;
    int result=0;
    for(int i =a2.length();i>=0;i--){
      result=Math.pow(2,power);
      power++;
    }
    System.out.print(result);
  }
}

Output:
Enter the number
10
5
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
