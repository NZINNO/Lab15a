// Lab15avst.java
// 02-28-15 by Leon Schram
// The "Odd Magic Square" Program
// This is the student, starting version of the Lab15 assignment.


import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab15avst
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

      System.out.print("Enter the odd# size of the Magic Square -->  ");
      int size = 3;
      MagicSquare magic = new MagicSquare(size);

      magic.computeMagicSquare();
      magic.displayMagicSquare();
   //	magic.checkRows();          // for 100 & 110 Point Version Only
   //	magic.checkColumns();		 // for 100 & 110 Point Version Only
   //	magic.checkDiagonals();	 	 // for 100 & 110 Point Version Only
	}
}


class MagicSquare
{
	private int size;
	private int magic[][];
	private DecimalFormat output;
	private int row;
	private int col;

	public MagicSquare(int s)
	{
		size = s;
		magic = new int[size][size];
		output = new DecimalFormat("000");
	}

	public void computeMagicSquare()
	{
		int row = 0; int col = (size -1)/2; magic[row][col] = 1;
		for(int i=2; i <= (size*size); i++){
			if (magic[(row + 1) % size][(col + 1) % size] == 0) {
			row = (row + 1) % size;
						 col = (col + 1) % size;
				 }
				 else {
						 row = (row - 1 + size) % size;

				 }
				 magic[row][col] = i;
		}

	}

	public void displayMagicSquare()
	{
		System.out.println();
		System.out.println(size + "x" + size + " Magic Square");
		System.out.println("==================");
		System.out.println();
		for (int x = 0; x<=size; x++){
			for int y = 0; y<=size; y++){
				System.out.print(magic[x][y]);
				System.out.print("\t");
			}
		}
	}

	public void checkRows()
	{
		System.out.println();
		System.out.println("Checking Rows");
		System.out.println("=============");
		System.out.println();
	}

	public void checkColumns()
	{
		System.out.println();
		System.out.println("Checking Columns");
		System.out.println("================");
		System.out.println();
   }

	public void checkDiagonals()
	{
		System.out.println();
		System.out.println("Checking Diagonals");
		System.out.println("==================");
		System.out.println();
	}

}
