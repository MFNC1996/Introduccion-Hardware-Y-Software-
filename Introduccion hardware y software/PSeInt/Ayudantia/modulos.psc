Proceso sin_titulo
	cont_mod<-0;
	alum_mod<-0;
	cont_notas<-0;
	notas_mod<-0;
	Repetir
		Escribir "ingrese alumnos de modulo: ",cont_mod+1;
		leer alum;
		alum_mod<-alum+alum_mod;
		Repetir
			Escribir "ingrese tres notas del alumno: ",cont_notas+1;
			Leer nota1,nota2,nota3; 
			notas_mod<-nota1+nota2+nota3+notas_mod;
			cont_notas<-cont_notas+1;
		Hasta Que (cont_notas=alum)
		cont_mod<-cont_mod+1;
		cont_notas<-0;
	Hasta Que (cont_mod=3)
FinProceso
