Proceso sin_titulo
	// Determinar que tipo de triangulo según las medidas de los lados.
	// isósceles, escaleno o equilátero. Ocupar solo números enteros.
	
	// 1.- Definir las variables
	definir lado1 como entero;
	definir lado2 como entero;
	definir lado3 como entero;
	
	// 2.- capturar y/o solicitar los datos al usuario para procesar	
	escribir "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ";
	Escribir "~~~~~~~~~~~ Identificar tipo de triangulo ~~~~~~~~~~ ";
	escribir "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ";
	
	escribir "~~~~~~ ingrese valor del lado 1 ~~~~~~";
	leer lado1;
	escribir "~~~~~~ ingrese valor del lado 2 ~~~~~~~";
	leer lado2;
	escribir "~~~~~~ ingrese valor del lado 3 ~~~~~~~";
	leer lado3;
	// 3.- Procesar la info capturada y mostrar resultados
	// se deben cumplir ambas condiciones para que el si sea verdadero
	Si (lado1=lado2)  y (lado2 = lado3) Entonces
		Escribir "El triangulo tiene sus 3 lados iguales" ;
		Escribir "Es un triangulo EQUILATERO" ;
	SiNo
		//  <> Operador que pregunta si es distinto 
		SI (lado1 <> lado2) Y (lado2 <> lado3) Y (lado1<>lado3) Entonces
			Escribir "El triangulo tiene sus 3 lados diferentes" ;
			Escribir "Es un triangulo ESCALENO" ;
		SiNo
			Escribir "El triangulo tiene 2 lados iguales" ;
			Escribir "Es un triangulo ISÓCELES (2 iguales)" ;			
		FinSi
	FinSi	
FinProceso
