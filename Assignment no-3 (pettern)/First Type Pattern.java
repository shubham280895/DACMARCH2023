LAB HOMEWORK 1

/*
Q.1

class 	Homework1{

	public static void main(String args[])
	{
		int i;
		int j; 
		for( i=1;i<=5;i++)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}
	
}

1
12
123
1234
12345
*/

/*
Q.2
class 	Homework2{

	public static void main(String args[])
	{
		int i;
		int j;
		for( i=5;i>=0;i--)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	
	}
	
}

12345
1234
123
12
1
*\

/*
Q.3

class 	hw1{

	public static void main(String args[])
	{
		int i;
		int j; 
		for( i=1;i<=5;i++)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for( i=4;i>=0;i--)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
}

1
12
123
1234
12345
1234
123
12
1

*/



/*
Q.4
class 	hw2{

	public static void main(String args[])
	{
		int i;
		int j;
		for( i=5;i>=1;i--)
		{
			for( j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}		
				for( i=2;i<=5;i++)
		{
			for( j=1;j<=i;j++)
				{
				System.out.print(j);
				}
			System.out.println();
		}	
	}
	
}
12345
1234
123
12
1
12
123
1234
12345
*/






LAB HOMEWORK 2
/*
Q.1
class Ptrn1{
	public static void main(String args[])
	{		
		for (int i=1;i<=5;i++) // number of rows
		{
			for(int j=1;j<=i;j++)  // number of colums (changing this to (i) will cut it diagonally)
			{
				System.out.print(j+" "); // this line gives output
			}
			System.out.println();
		}
			
	}
}

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/



/*
Q.2
class Ptr2{
	public static void main(String args[])
	{		
	    int alpha = 65;
		for (int i=0;i<=4;i++) // number of rows
		{
			for(int j=0;j<=i;j++)  // number of colums (changing this to (i) will cut it diagonally)
			{
				System.out.print((char)(alpha + j) + " "); // this line gives output
			}
			System.out.println();
		}
			
	}
}

A
A B
A B C
A B C D
A B C D E
*/
/*
Q.3

class Ptr3{
	public static void main(String args[])
	{		
	  		for (int i=1;i<=5;i++) // number of rows
		{
			for(int j=1;j<=i;j++)  // number of colums (changing this to (i) will cut it diagonally)
			{
				System.out.print("* "); // this line gives output
			}
			System.out.println();
		}
			
	}
}
*
* *
* * *
* * * *
* * * * *
*/


/*
Q.4
class Ptr4{
	public static void main(String args[])
	{		
		for (int i=1;i<=5;i++) // number of rows
		{
			for(int j=1;j<=i;j++)  // number of colums (changing this to (i) will cut it diagonally)
			{
				System.out.print(i+" "); // this line gives output
			}
			System.out.println();
		}
			
	}
}


1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/

/*
Q.5
class Ptr5{
	public static void main(String args[])
	{		
	    int alpha = 65;
		for (int i=0;i<=4;i++) // number of rows
		{
			for(int j=0;j<=i;j++)  // number of colums (changing this to (i) will cut it diagonally)
			{
				System.out.print( (char) (alpha + i) + " "); // this line gives output
			}
			System.out.println();
		}
			
	}
}

A
B B
C C C
D D D D
E E E E E
*/

/*
Q.6

class Ptr6{
	public static void main(String args[])
	{		
	  		for (int i=1;i<=5;i++) 
		{
			for (int k=4;k>=i;k--)
			{
				System.out.print(" " + " ");
			}
			
			for(int j=1;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
			
	}
	
        *
      * *
    * * *
  * * * *
* * * * *	
/*	
	

/*
Q.7
class Ptr7{
	public static void main(String args[])
	{		
		for (int i=1;i<=5;i++) // number of rows
		{
			for (int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)  // number of colums (changing this to (i) will cut it diagonally)
			{
				System.out.print(j+" "); // this line gives output
			}
			System.out.println();
		}
			
	}
}

     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5
 */

/*
Q.8
class Ptr8{
	public static void main(String args[])
	{		
		for (int i=5;i>=1;i--) // number of rows
		{
			for (int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)  // number of colums (changing this to (i) will cut it diagonally)
			{
				System.out.print(j + " "); // this line gives output
			}
			System.out.println();
		}
			
	}
}

     5
    4 5
   3 4 5
  2 3 4 5
 1 2 3 4 5
*/

/*
Q.9
class Ptr9{
	public static void main(String args[])
	{		
	    int alpha = 65;
		for (int i=0;i<=4;i++) // number of rows
		{
			for (int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
		
			for(int j=0;j<=i;j++)  // number of colums (changing this to (i) will cut it diagonally)
			{
				System.out.print((char)(alpha + j) + " "); // this line gives output
			}
			System.out.println();
		}
			
	}
}

      A
     A B
    A B C
   A B C D
  A B C D E
*/

/*
Q.10

class Ptr10{
	public static void main(String args[])
	{		
	    int alpha = 64;
		for (int i=5;i>=1;i--) // number of rows
		{
			for (int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)  // number of colums (changing this to (i) will cut it diagonally)
			{
				System.out.print((char)(alpha + j) + " "); // this line gives output
			}
			System.out.println();
		}
			
	}
}


     E
    D E
   C D E
  B C D E
 A B C D E
 */


/*
Q.11

class Ptr11{
	public static void main(String args[])
	{		
		for (int i=1;i<=5;i++) 
		{
			for (int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)  
			{
				System.out.print("*");
			}
			
			for (int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
		   
				System.out.println();
		}
			
	}
}

    *
   ***
  *****
 *******
*********
*/




/*
Q.12
	
		for (int i=1;i<=5;i++) // number of rows
		{
			for (int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)  // number of colums (changing this to (i) will cut it diagonally)
			{
				System.out.print(i+" "); // this line gives output
			}
			System.out.println();
		}
			


     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5

 */

/*
q.13


		int alpha = 65;
		for (int i=0;i<=4;i++)
	    {
		 
			for (int j=4;j>=i;j--)
			{
				System.out.print (" ");
			}
			for (int k=0;k<=i;k++)
			{
				System.out.print ( (char) (alpha+i) + " ");
			}				 
		System.out.println();


     A
    B B
   C C C
  D D D D
 E E E E E
 
 */
 
 /*
 Q14.
 
 for (int i=5;i>=1;i--)
		{
			for( int j=1;j<=i;j++)
			{
				System.out.print(j +"  ");
			}
		System.out.println();
		}
 
1  2  3  4  5
1  2  3  4
1  2  3
1  2
1

*/
 

 /*
 Q15
 

			
		for (int i=1;i<=5;i++) 
		{
			
			for(int j=5;j>=i;j--) 
			{
				System.out.print(j+" "); 
			}
			System.out.println();
		}
			


5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/


/*
Q16

for (int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print((6-j)+" "); 
			}
			System.out.println();
		}	
		
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1

*/		

/*
Q.17

int n =1;
		for (int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(n +" ");
				n++;
			}
			System.out.println();
		}		

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

/*
Q.18

int alpha = 69;
		for (int i=0;i<=4;i++) 
		{
			for(int j=4;j>=i;j--) 
			{
				System.out.print((char)(alpha - j) +" ");
			}
			System.out.println();
		}		
		
A B C D E
A B C D
A B C
A B
A

*/

/*
Q.19

	for (int i=0;i<=4;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}		
		
*
**
***
****
*****

*/