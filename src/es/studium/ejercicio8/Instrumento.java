package es.studium.ejercicio8;

public class Instrumento
{
	
		private String nombre;
		private char afinacion;
		
		
		public Instrumento () { 
			
			nombre = "";
			afinacion = ' ';
			
		}
		
		

//prueba Github1
		public Instrumento(String nom, char afin)
		{
			super();
			this.nombre = nom;
			this.afinacion = afin;
		}




		public String getNombre()
		{
			return nombre;
		}


		public void setNombre(String nombre)
		{
			this.nombre = nombre;
		}


		public char getAfinacion()
		{
			return afinacion;
		}


		public void setAfinacion(char afinacion)
		{
			this.afinacion = afinacion;
		}
		
		
}
