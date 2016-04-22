Proceso SUCESION_FIBONACCI
	N<-0;
	X<-1;
	Escribir "INGRESE UN NUMERO";
	NUMERO<-0;
	Leer NUMERO;
	PARA I<-0 HASTA NUMERO CON PASO 1 Hacer
		Escribir N;
		A<-X+N
		N<-X
		X<-A
	FinPara
FinProceso