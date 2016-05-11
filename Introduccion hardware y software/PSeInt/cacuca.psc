Proceso sin_titulo
	contMod<-0;
	contAlum<-0;
	contNotas<-0;
	Repetir
		Escribir "ingrese cantidad de modulos";
		Leer cantMod;
		contMod<-contMod+cantMod;
		Repetir
			Escribir "ingrese cantidad de alumnos del modulo",contMod+1;
			Leer cantAlum;
			contAlum<-contAlum+cantAlum;
			Repetir
				Escribir "ingrese cantidad de notas de alumno",contAlum+1;
				Leer cantNotas;
				contNotas<-contNotas+cantNotas;
				Repetir
					Escribir "ingrese nota",contNotas+1;
					Leer nota;
					contNotas<-contNotas+nota;
				Hasta Que (nota=cantNotas)
				contNotas<-0;
			Hasta Que (cantNotas=contNotas)
		Hasta Que (cantAlum=contAlum)
	Hasta Que (cantMod=contMod)
FinProceso
