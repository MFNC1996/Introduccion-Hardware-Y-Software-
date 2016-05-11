Proceso campeonato
	cont<-0;
	ganado<-0;
	perdido<-0;
	empatados<-0;
	puntos<-0;
	goles_a_fav<-0;
	goles_en_cont<-0;
	Repetir
		Escribir "Ingrese goles a favor del partido:",cont+1;
		Leer goles_a_favor;
		Escribir "Ingrese goles en contra del partido:",cont+1;
		Leer goles_en_contra;
		Si (goles_a_favor>goles_en_contra) Entonces
			ganado<-ganado+1;
			puntos<-puntos+3;
			goles_a_fav<-goles_a_favor;
		Sino
			Si(goles_a_favor<goles_en_contra) Entonces
				perdido<-perdido+1;
				goles_en_cont<-goles_en_contra;
			Sino
				empatados<-empatados+1;
				puntos<-puntos+1;
			FinSi
		FinSi	
		diferencia_goles<-goles_a_favor-goles_en_contra;
		cont<-cont+1;
	Hasta Que (cont=10)
	Escribir "ganados:",ganado;
	Escribir "perdidos:",perdido;
	Escribir "empatados:",empatados;
	Escribir "goles a favor:",goles_a_fav;
	Escribir "goles en contra:",goles_en_cont;
	Escribir "puntos:",puntos;
	Escribir "diferencia de goles:",diferencia_goles;
	Si(puntos<10)Entonces
		Escribir "liguilla de promocion";
	Sino
		Si(puntos>10 && puntos<=20)Entonces
			Escribir "no liguilla";
		Sino 
			Si(puntos>20) Entonces
				Escribir "liguilla de campeonato";
			Finsi	
		FinSi
	FinSi
FinProceso