Proceso sin_titulo
	// Determinar que tipo de triangulo seg?n las medidas de los lados.
	// is?sceles, escaleno o equil?tero. Ocupar solo n?meros enteros.
	
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
	Si Lado1 = Lado2 Entonces
		Si Lado1 <> Lado3 Entonces;
			Escribir "Tringulo es Isoceles";
		FinSi
	FinSi
	//Triangulo Escaleno
	Si Lado1 <> Lado2 Y Lado1 <> Lado3 Entonces
		Si Lado2 <>Lado3 Entonces
			Escribir "El Triangulo es Escaleno";
		FinSi
	FinSi
	//Tringulo Equilatero
	Si Lado1 = Lado2 y Lado1 = Lado3 Entonces
		Si Lado2 <> Lado3 Entonces
			Escribir "Triangulo es Equilatero";
		FinSi
	FinSi

FinProceso
