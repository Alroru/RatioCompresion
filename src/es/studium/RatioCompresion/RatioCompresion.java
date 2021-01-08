package es.studium.RatioCompresion;
import java.util.Scanner;
public class RatioCompresion
{

	public static void main(String[] args)
	{
		Scanner teclado=new Scanner (System.in);
		double real,comprimido,resultado;
		System.out.println("Dame real");
		real=teclado.nextDouble();
		System.out.println("Dame comprimido");
		comprimido=teclado.nextDouble();
		resultado=100-(comprimido/real)*100;
		System.out.println(resultado);
		

	}

}
