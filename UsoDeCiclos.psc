Proceso sin_titulo
	Definir indice Como Entero;	
	Para indice<-1 Hasta 10 Hacer
		Escribir "Numero de indice es: ";
		Escribir  indice;
	FinPara
	Escribir "Fuera del bloque Para";
	// ejercicio: solicitar un numero al usuario
	// y mostrar la multiplicación del 1 al 10
	
	Definir tabla Como Entero;
	Definir dato Como Entero;
	Definir resultado Como Entero;
	
	Escribir "Escriba un numero para saber su tabal de multiplicar";
	leer dato ;
	Para tabla<-1 Hasta 10 Hacer		
//		solucion 1
//		resultado <- dato * tabla;
//		Escribir resultado;
//  solucion 2
		Escribir dato," * ", tabla," es igual a:", dato * tabla;
	FinPara
	Escribir "Fin de la tabla de multiplicar del ", dato;
	// ejercicio: solicitar un numero al usuario
	// y mostrar la multiplicación del 1 al 10
	
FinProceso
