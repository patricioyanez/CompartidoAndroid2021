Proceso sin_titulo
	//Actividad 3:	
	// promediar 3 notas y mostrar si aprobo o no el curso. nota <=40
	// Definir  las variables a utilizar
	
	// validar que las notas no superen el 7 (70) y
	// ademas la ponderación de las nota son 30%, 30% y 40% 
	
	Definir Nota1 Como Real;
	Definir Nota2 Como Real;
	Definir Nota3 Como Real;
	Definir Promedio Como Real;
	// Solicitar Notas
	Escribir "****** Promediador ******";
	Escribir "Ingrese Primera Nota:";
	Leer Nota1;
	Escribir "Ingrese Segunda Nota:";
	Leer Nota2;
	Escribir "Ingrese Tercera Nota:";
	Leer Nota3;
	//Calcular Promedio
	Nota1 <- Nota1 * 0.3; 
	Promedio <- (Nota1 + Nota2 + Nota3) / 3;
	// Mostrar si esta aprobado o reprobado
	Si Promedio >= 4 Entonces
		Escribir "Nota Promedio es: ", Promedio;
		Escribir "Ud. ha Aprobado el curso";
	Sino
		Escribir "Nota Promedio es: ", Promedio;
		Escribir "Ud a Reprobado";
	FinSi

	
FinProceso
