Algoritmo Promedio
	
	//Definir variables
	Definir nota1 como real;
	Definir nota2 como real;
	Definir nota3 como real;
	Definir Resultado_promedio como real;
	
	
	//Solicitar informacion
	
	Escribir "************* Promediar notas ****************";
	
	Escribir "Ingresar primera nota a promediar";
	Leer nota1;
	
	si nota1 <= 7 entonces
		Escribir "Ingresar segunda nota a promediar";
		Leer nota2;		
		si nota2 <= 7 entonces
			Escribir "Ingresar tercera nota a promediar";
			Leer nota3;			
			//Operacion de las variables
			Resultado_promedio <- (nota1+nota2+nota3) / 3;		
			//Mostrar resultado
			Escribir "Su promedio es:", Resultado_promedio;
		SiNo			
			Escribir "La nota 2 no es válida";
		FinSi			
	SiNo
		Escribir "La nota 1 no es válida";
	FinSi
	// promediar solo cuanto las 3 notas sean menor o igual a 7
FinAlgoritmo