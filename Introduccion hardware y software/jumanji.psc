Proceso Jumanji
	cont_jug1<-0;
	avance_jug1<-0;
	cont_jug2<-0;
	avance_jug2<-0;
	cont_jug3<-0;
	avance_jug3<-0;
	Repetir
		Escribir "turno para el jugador 1";
		dado<-azar(6) + 1;
		Escribir "el numero del dado es: ", dado;
		Si(dado=2 O dado=4 O dado=6)Entonces
			avance_jug1<-dado+2;
		Sino
			Si(dado=1 O dado=3 O dado=5)Entonces
				avance_jug1<-dado-1;
			Sino
				Si(dado=5 O dado=2)Entonces
					avance_jug1<-dado+5;
					
					
				FinSi
				
			FinSi
			
			
		FinSi
		
	Hasta Que 
	
	
FinProceso
