package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Tiktac {
public static int row,col;
 public static char[][] board=new char[3][3];
public static char turn='x';
 static Scanner scan=new Scanner(System.in);
public static void main(String[] args)
{
	
for (int i = 0; i <3; i++) {
	for (int j = 0; j < 3; j++) {
		board[i][j]='_';
	}
}
play();
}
public static void play()
{
	boolean playing=true;
	while(playing)
	{
		System.out.println("enter the rows and column");
		row=scan.nextInt()-1;  
		col=scan.nextInt()-1;
		board[row][col]=turn;
		printb();
		if(gameover(row,col))
		{
			playing=false;
			System.out.println("game over player "+turn+" wins");
		}
		if(turn=='x')
			turn='o';
		else
			turn='x';
	}
	
}
public static void printb()
{
	for (int i = 0; i <3; i++) {
		System.out.println();
		for (int j = 0; j < 3; j++) {
			if(j==0)
			{
				System.out.print(" | ");
			}
		System.out.print(board[i][j]+" | ");
		}
		}System.out.println();System.out.println();
	
}
public static boolean gameover(int rmove,int cmove)
{	//row and col check
	if(board[0][cmove]==board[1][cmove] && board[0][cmove]==board[2][cmove])
		return true;
	if(board[rmove][0]==board[rmove][1] && board[rmove][0]==board[rmove][2])
		return true;
	// for diagonal
	if(board[0][0]==board[1][1]&&board[0][0]==board[2][2]&&board[1][1]!='_')
		return true;
	if(board[0][2]==board[1][1]&&board[0][2]==board[2][0]&&board[1][1]!='_')
		return true;             
	
	return false;
}
}
