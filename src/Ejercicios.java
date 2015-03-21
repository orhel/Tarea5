import java.io.File;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		try//grabamos el archivo por medio de un try
		{
		PrintWriter Contenido = new PrintWriter(nombre_archivo);//nuevo PrintWriter para nombre_archivo
		Contenido.println(contenido);//imprime la variable String contenido
		Contenido.close();// se cierra contenido
		}
		catch(Exception e)//captura el error
		{
			
		}
		
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{
		try//grabamos el archivo por medio de un try
		{
			PrintWriter Contenido = new PrintWriter(nombre_archivo);//nuevo PrintWriter para nombre_archivo
			Contenido.println(contenido);//imprime la variable String contenido
			Contenido.close();
			}
			catch(Exception e)//captura el error
			{
				
			}
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
		int entero;//creacion de variable 
		try
		{
			Scanner entrada = new Scanner(new File(nombre_archivo));//nuevo Scanner para nuevo archivo
			entero = entrada.nextInt();//lee el siguiente entero y lo asigna a la variable
			entrada.close();// se cierra el Scanner
			return entero;//devuelve el numero entero
		}
		catch(FileNotFoundException e)//captura el error si no encuentra un archivo
		{
			
		}
		return -1;//devuelve menos uno si se capturo el error
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{
		String primera;//creacion de variable
		try
		{
			Scanner entrada = new Scanner(new File(nombre_archivo));//nuevo Scanner para nuevo archivo
			primera = entrada.next();//lee el String y lo asigna a la variable
			entrada.close();//se cierra el scanner
			return primera;//devuelve el valor de la variable
		}
		catch(FileNotFoundException e)//captura el error si no hay un archivo
		{
			
		}
		return "";//devuelve un espacio en blanco si se capturo el error
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		double doble;//se crea la variable
		try
		{
			Scanner entrada = new Scanner(new File(nombre_archivo));//nuevo Scanner para nuevo archivo
			doble = entrada.nextDouble();//se asgina el valor a la variable
			entrada.close();//se cierra el Scanner
			return doble;//devuelve el valor de la variable
		}
		catch(FileNotFoundException e)//captura el error si no hay un archivo
		{
			
		}
		return -1;
	}
	
	//Devuelve la cantidad de veces que buscada (dado) existe en el archivo con nombre nombre_archivo (dado)
	static int contar(String nombre_archivo, String buscada)
	{
		String palabra;
		int cantidad = 0;
		try
		{
			Scanner entrada = new Scanner(new File(nombre_archivo));
			while(entrada.hasNext())
			{
				palabra = entrada.next();
				if(palabra.equals(buscada)) cantidad = cantidad +1;
			}
			entrada.close();
			return cantidad;
		}
		catch(FileNotFoundException e)
		{
			
		}
		return -1;//devuelve menos uno si se capturo el error
	}
	
	//Devuelve el promedio de los numeros almacenados en un archivo
	//Nota: el archivo unicamente contiene enteros
	static int getPromedio(String nombre_archivo)
	{
		int promedio;//cracion de variables
		int numeros = 0;
		int contador = 0; 
		try
		{
			Scanner entrada = new Scanner(new File(nombre_archivo));//nuevo Scanner para nuevo archivo
			while(entrada.hasNext())//mientras
			{
				numeros = numeros + entrada.nextInt();//agrega el siguiente numero a la variable
				contador = contador + 1;//se suma uno al contador
			}
			promedio = numeros/contador;//la suma de los numeros entre el contador
			entrada.close();//se cierra el scanner
			return promedio;//devuelve el valor de promedio
		}
		catch(FileNotFoundException e)//captura el error si no hay un archivo
		{
			
		}
		return -1;//devuelve menos uno si se capturo el error
	}
}
