Proceso sin_titulo
	dinero_inicial<-200000;
	Repetir
		Escribir "ingrese cantidad de dinero deseada";
		Leer dinero;
		Si(dinero<=dinero_inicial Y dinero>dinero_inicial)Entonces
			dinero_inicial<-(dinero_inicial-dinero);
		Sino
			Escribir "cantidad mal ingresada";
		FinSi
		dinero_inicial<-(dinero_inicial-dinero);
	Hasta Que (dinero_inicial=0)
	Escribir "su dinero restante es:",dinero_inicial;

	
FinProceso
