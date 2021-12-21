Proceso PromedioDeNotas
	//Definir las variables a utlizar.
	Definir Nota1, Nota2, Nota3 Como Real;
	Definir Promedio Como Real;
	// Solcitar la información.
	Escribir "Obtener promedio de 3 notas";
	// Leer para obtener los valores
	Escribir "Ingrese la primera nota";
	Leer Nota1;
	Escribir "Ingrese la segunda nota";
	Leer Nota2;
	Escribir "Ingrese la tercera nota";
	Leer Nota3;
	// Promediar solo cuando las notas sean menos o igual a 7
	SI Nota1 <= 7 Y Nota2 <= 7 Y Nota3 <= 7 Entonces
		
		// Obtenemos el promedio de las notas
		Promedio <- (Nota1 + Nota2 + Nota3)/3;
		// Se muestra el resultado obtenido
		Escribir "El promedio de las 3 notas es: ", Promedio;
	SiNo
		Escribir "La nota no es válida";
	FinSi
FinProceso