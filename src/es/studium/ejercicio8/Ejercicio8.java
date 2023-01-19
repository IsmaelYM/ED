package es.studium.ejercicio8;


public class Ejercicio8
{

	public static void main(String[] args)
	{
		Musico musico1 = new Musico ("Hola, me llamo Fernando Alonso", 'H');
		Instrumento instrumento1 = new Instrumento ("y toco la guitarra.",'D');
		
		System.out.println(musico1.getNombre());
		System.out.println(instrumento1.getNombre());

	}

}
