Proceso estadistica
	cont_centros<-0;
	cont_atenciones<-0;
	cant_desnut<-0;
	cant_sobrep<-0;
	cant_normal<-0;
	cont_edad_1<-0;
	cont_edad_2<-0;
	cont_edad_3<-0;
	Escribir "ingrese cantidad de centros asistenciales";
	Leer cant_centros;
	Mientras (cont_centros<cant_centros) Hacer
		Escribir "ingrese la cantidad de atenciones para el centro asistencial: ",cont_centros+1;
		Leer cant_atenciones;
		Mientras (cont_atenciones<cant_atenciones) Hacer
			Escribir "ingrese edad de la atencion:",cont_atenciones+1;
			Leer edad;
			Escribir "ingrese peso de la atencion:",cont_atenciones+1;
			leer peso;
			rangoInf<-(3*edad+7)-4;
			rangoSup<-(3*edad+7)+4;
			Si(peso<=rangoInf) Entonces
				cant_desnut<-cant_desnut+1;
				Si(edad>=1&&edad<=3) Entonces
					cont_edad_1<-cont_edad_1+1;
				Sino
					Si(edad>=4&&edad<=6)Entonces
						cont_edad_2<-cont_edad_2+1;
					Sino
						cont_edad_3<-cont_edad_3+1;
					FinSi
				FinSi
			Sino
				Si(peso>=rangoSup)Entonces
					cant_sobrep<-cant_sobrep+1;
				Sino
					cant_normal<-cant_normal+1;
				FinSi	
			FinSi
			cont_atenciones<-cont_atenciones+1;
		FinMientras
		Escribir "la cantidad de atenciones con rango de desnutricion es: ",cant_desnut;
		Escribir "la cantidad de atenciones con rango sobrepeso es: ",cant_sobrep;
		Escribir "la cantidad de atenciones con rango normal es: ",cant_normal;
		cont_centros<-cont_centros+1;
	FinMientras
FinProceso
