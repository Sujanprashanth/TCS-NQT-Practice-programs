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
Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :

Input :
200  -> Value of V
540   -> Value of W

Output :
TW =130 FW=70

Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels

Constraints :

2<=W
W%2=0
V<W
Print “INVALID INPUT” , if inputs did not meet the constraints.

The input format for testing 
The candidate has to write the code to accept two positive numbers separated by a new line.

First Input line – Accept value of V.
Second Input line- Accept value for W.
The output format for testing 

Written program code should generate two outputs, each separated by a single space character(see the example)
Additional messages in the output will result in the failure of test case

Logic:
### ✅ Problem Understanding

You are given:

* *V* → Total number of vehicles (Two-Wheelers + Four-Wheelers)
* *W* → Total number of wheels

You must find:

* Number of *Two-Wheelers (TW)*
* Number of *Four-Wheelers (FW)*

If constraints are not satisfied → print *INVALID INPUT*

---

## ✅ Step 1: Understand the Vehicle Structure

* A *Two-Wheeler (TW)* has *2 wheels*
* A *Four-Wheeler (FW)* has *4 wheels*

Let:

* TW = x
* FW = y

---

## ✅ Step 2: Form Mathematical Equations

From total vehicles:

[
x + y = V
]

From total wheels:

[
2x + 4y = W
]

---

## ✅ Step 3: Solve the Equations

From first equation:

[
x = V - y
]

Substitute into second equation:

[
2(V - y) + 4y = W
]

Expand:

[
2V - 2y + 4y = W
]

[
2V + 2y = W
]

[
2y = W - 2V
]

[
y = (W - 2V) / 2
]

So,

[
FW = (W - 2V) / 2
]

Now substitute back:

[
TW = V - FW
]

---

## ✅ Step 4: Important Logical Observations

For a valid solution:

1. *W must be even* (because wheels come in pairs)
2. *Minimum wheels possible* = 2 × V
   (All vehicles are two-wheelers)
3. *Maximum wheels possible* = 4 × V
   (All vehicles are four-wheelers)
4. FW must be ≥ 0
5. TW must be ≥ 0

If any of these fail → *INVALID INPUT*

---

## ✅ Example Walkthrough

Input:
V = 200
W = 540

Check constraints:

* W ≥ 2 ✅
* W is even ✅
* 2×200 = 400 ≤ 540 ≤ 800 (4×200) ✅

Now calculate:

FW = (540 − 400) / 2
FW = 140 / 2
FW = 70

TW = 200 − 70
TW = 130

---

## ✅ Final Output

TW = 130
FW = 70

---

## 🎯 Core Logic Summary (Interview Answer Style)

1. Form two linear equations:

   * x + y = V
   * 2x + 4y = W
2. Solve algebraically to get:

   * FW = (W − 2V) / 2
   * TW = V − FW
3. Validate constraints before printing result.
4. If constraints fail → print *INVALID INPUT*

---

If you want, I can also explain the *intuitive logic without equations* (pure reasoning method used in aptitude rounds).

Program:
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int W = sc.nextInt();

        if (W >= 2 && W % 2 == 0 && V < W && W >= 2 * V && W <= 4 * V) {
            
            int FW = (W - 2 * V) / 2;
            int TW = V - FW;

            System.out.println("TW =" + TW + " FW=" + FW);
        } 
        else {
            System.out.println("INVALID INPUT");
        }
    }
}

Output:
Example Input
200
540
Output
TW =130 FW=70
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0
Example 1:
Input 1:

###***   -> Value of S
Output :

0   → number of * and # are equal
  
Program
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();   
        char[] arr = w.toCharArray();  
        int t_count=0,h_count=0,s_count=0;
        for(char arr1:arr){
            if(arr1=='#'){
                h_count++;
            }
            else{
                s_count++;
            }
        }
        t_count=s_count-h_count;
        System.out.print(t_count);
        
    }
}
  
Output
###***
0
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.

Note : 1st element of the array should be considered in the count of the result.

For example,
Arr[]={7,4,8,2,9}
As 7 is the first element, it will consider in the result.
8 and 9 are also the elements that are greater than all of its previous elements.
Since total of  3 elements is present in the array that meets the condition.
Hence the output = 3.
Example 1:

Input 
5 -> Value of N, represents size of Arr
7-> Value of Arr[0]
4 -> Value of Arr[1]
8-> Value of Arr[2]
2-> Value of Arr[3]
9-> Value of Arr[4]

Output :
3

Example 2:
5   -> Value of N, represents size of Arr
3  -> Value of Arr[0]
4 -> Value of Arr[1]
5 -> Value of Arr[2]
8 -> Value of Arr[3]
9 -> Value of Arr[4]

Output : 
5

Constraints

1<=N<=20
1<=Arr[i]<=10000

Program:
import java.util.*; 
class Main { 
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in); 
    int s = sc.nextInt(); 
    int[] arr = new int[s]; 
    for(int i=0;i<arr.length;i++){ 
      arr[i]=sc.nextInt(); 
    }
    int max = arr[0],count=0;
    for(int i=1;i<arr.length;i++){ 
      if(max<arr[i]){ 
        max=arr[i];
        count++;
      }
    }
    System.out.println(count+1);
  }
}

output:
Sample input:
6
{5, 1, 6, 3, 7, 2}

Sample output:
3
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Program:
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max=0,row=0;
        for(int i=0;i<r;i++){
            int count=0;
            for(int j=0;j<c;j++){
                if(arr[i][j]==1){
                    count++;
                }
                if(max<count){
                    max=count;
                    row=i;
                }
            }
        }
        System.out.print(row);
    }
}

Output:
Expected input:
4
3
  
0
1
0
1
1
0
1
0
1
1
1
1

Expected Output:
4
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
