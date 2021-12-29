Proceso sin_titulo
	//Actividad 2 :
	//Solicitar 2 número y una operación aritméticaque
	//realizar el usuario (+ - * /). Calculadora
	
	
	// De que trata el juego
	escribir " Aprendamos las operaciones basicas";
	escribir "Sumar, Restar, Multiplicar y Dividir";
	Escribir " Aplicandolas a 2 numeros ";
	Escribir "";
	
	//Definir las variables que se ingresaran
	Definir Numero1 Como Real;
	Definir Numero2 Como Real;
	Definir operacion Como Caracter;
	
	//Ingresar los datos numericos
	Escribir "Escriba el primer numero" ;
	Leer Numero1;
	Escribir "Escriba el segundo numero" ;
	Leer Numero2;
	
	//intrucciones
	Escribir "";
	Escribir "Escriba la operación que desea aplicar ";
	Escribir " (+) para sumar";
	Escribir " (-) para restar";
	Escribir " (*) para multiplicar";
	Escribir " (/) para dividir";
	
	//Ingresa la operqción
	Leer operacion;
	
	//Verifica que la operación sea la correcta
	Si operacion <> "+" Entonces
		si operacion <> "-" Entonces
			si operacion <> "*" Entonces
				si operacion <> "/" Entonces
					Escribir "El operador no es valido, escoja uno de los 4 operadores indicados";
				FinSi
			FinSi
		FinSi
	FinSi
	
	// Aplica las operaciones a los numeros
	Si operacion = "+" Entonces
		Escribir "La suma es ",Numero1+Numero2;
	FinSi
	Si operacion = "-" Entonces
		Escribir "La resta es ",Numero1-Numero2;
	FinSi
	Si operacion = "*" Entonces
		Escribir "La multiplicación es ",Numero1*Numero2;
	FinSi
	Si operacion = "/" Entonces
		si Numero2=0 Entonces
			Escribir "No se puede dividir por 0";
		SiNo
			Escribir "La división es ",Numero1/Numero2;
		FinSi
	FinSi

FinProceso
