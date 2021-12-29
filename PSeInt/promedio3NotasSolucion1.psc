Proceso Promedio_de_Notas
	Escribir "*****************************";
	Escribir "***** Promedio de Notas *****";
	Escribir "*****************************";
	Escribir "";
	Escribir "Calcular el promedio de 3 notas";	
	//Definir las variables que usara el algotirmo para calcular las notas
	Definir nota1 Como Real;
	Definir nota2 Como Real;
	Definir nota3 Como Real;
	Definir suma Como Real;
	Definir promedio Como Real;
	//Se ingresan las notas con las que se obtedra el promedio
	Escribir "Ingrese la primera nota ";
	Leer nota1;	
	Si nota1<= 7 Entonces
		Escribir "Ingrese la segunda nota ";
		Leer nota2;
		Si nota2<= 7 Entonces
			Escribir "Ingrese la tercera nota ";
			Leer nota3;
			Si nota3<= 7 Entonces
				suma<- nota1+nota2+nota3;
				promedio<- suma/3;
				Escribir " ";
				Escribir "La sumatoria de sus notas es ",suma;
				Escribir "Su promedio de notas es ",promedio;
			sino
				Escribir "Su tercera nota no es numero valido ";
			Finsi
		sino
			Escribir "Su segunda nota no es un nunero valido ";
		Finsi
	sino
		Escribir "Su primera nota no es numero valido ";
	FinSi
FinProceso