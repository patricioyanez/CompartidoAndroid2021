Proceso sin_titulo
	// actividad portafolio descuentos de una compra:
	// Crear un algoritmo que permita ingresar el valor de una compra y realizar descuentos de acuerdo 
	// a las siguientes indicaciones:
	// Si el valor es mayor o igual a $50.000, se hace un descuento del 30%.
	// Si el valor es menor de $50.000 y mayor o igual a $20.000, se descuenta el 20%.
	// Si el monto es menor a $20.000 y mayor o igual a $10.000, el descuento es del 10%.
	// Mostrar el subtotal, descuento y total a pagar
	// $100.000  $30.000  $70.000
	
	// si y o = <= >= sino etc.
	
	Definir compra Como Real;
	Definir descuento Como Real;
	
	definir porcentaje como real;
	definir total Como Entero;
	
	Escribir 'Descuentos por compra";
	
	Escribir 'ingrese el valor total de la compra';
	Leer compra;
	
	Si ( compra >= 50.000 ) Entonces
		descuento<- (compra *0.3);   // compra*0.7
		pagoreal <- compra-(compra*0.3);
		
		Escribir 'su descuento es" ,descuento;
	FinSi
	
	si ( compra < 50.000 y compra >= 20.000 ) entonces
		descuento <- (compra *0.2);
		Escribir 'su descuento es" ,descuento;
		
	FinSi
	
	si ( compra < 20.000 y compra >= 10.000 ) entonces
		descuento <- (compra *0.1);
		Escribir 'su descuento es" ,descuento;
	FinSi
	

FinProceso
