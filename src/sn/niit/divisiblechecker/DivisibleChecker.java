package sn.niit.divisiblechecker;

import java.util.Scanner;

public class DivisibleChecker 
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		int nombre1, nombre2;
		System.out.println("Entrez le premier nombre ");
		nombre1=scanner.nextInt();
		
		System.out.println("Entrez le deuxième nombre ");
		nombre2=scanner.nextInt();
		
		if(nombre2 ==0) 
		{
			System.out.println("Le deuxième nombre ne doit pas etre égal à zéro ");
		} 
		else 
		{
			if (nombre1 % nombre2 ==00) 
			{
				System.out.println(nombre1 + " est pas divisible par " + nombre2);
			}
			else 
			{
				System.out.println(nombre1 + " n'est pas divisible par " + nombre2);
			}
		}
	}
}
