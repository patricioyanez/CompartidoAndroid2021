Proceso sin_titulo	
	//Ejercicios: 
	// 1.- Solicitar un numero y obtener la sumatoria de un nro positivo
	// 1+2+3+4+5
	
	// 2.- Mostrar la sumatoria pero SOLO considerar los numeros par
	// 10%2 => 0, 0 significa que es numero par
	Definir indice Como Entero;
	Definir num Como Entero;
	Definir resultado como entero;
	Definir resto Como Entero;
	// asingar, usar < y - , sin espacios <-
	resultado<-0;// se asigna o traspasa el numero cero a la variable	
	Escribir "ingrese numero para la sumatoria";
	Leer num;
	Para indice<-1 Hasta num Hacer
		si (indice mod 2) = 0 Entonces	// indice%2 = 0		
			resultado<-resultado+indice;			
		FinSi		
	FinPara
	Escribir "El resultado es:", resultado;
	
	// java -> for 
	
FinProceso
