Proceso sin_titulo	
	Definir opcion Como Entero;	
	opcion <- 0; // asigna cero a la variable	
	Mientras opcion <> 3 Hacer
		Limpiar Pantalla;
		Escribir " **** Men� ****";
		Escribir " 1. Saludar";
		Escribir " 2. Despedir";
		Escribir " 3. Salir de la aplicaci�n";
		Leer opcion;
		
		si opcion = 1 Entonces
			Escribir "======> Hola Humano";
			Escribir "Presione cualquier tecla para continuar";
			Esperar Tecla;
		FinSi
		si opcion = 2 Entonces
			Escribir "======> Adi�s Humano";
			Escribir "Presione cualquier tecla para continuar";
			Esperar Tecla;
		FinSi
		si opcion < 1 o opcion > 3 Entonces
			Escribir "=======> ERROR: Opci�n no v�lida";
			Escribir "Presione cualquier tecla para continuar y vuelva a intentar";
			Esperar Tecla;
		FinSi
	FinMientras
	Limpiar Pantalla;
	Escribir "Cierre del ciclo Mientras y de la aplicaci�n";
FinProceso
