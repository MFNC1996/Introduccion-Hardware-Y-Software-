Proceso sin_titulo
	contJug<-0;
	cont<-0;
	cantLanzamientos<-0;
	contMuerto<-0;
	gatillo<-azar(6)+1;
	Repetir
			Escribir "Jugador: ",contJug+1,"   ","antes de iniciar, ¿Desea retirarse?","   ","1-Si","   ","2-No";
			Leer abandona;
			Si (abandona=2)Entonces
				Escribir "Bienvenido a la ruleta rusa";
			Sino
				Si(abandona=1)Entonces
					Escribir "Hasta pronto";
				FinSi
			FinSi
			Si(abandona=2)Entonces
				Escribir "Jugador: ",contJug+1,"   ","Su turno";
				dado<-azar(6)+1;
				Escribir "Jugador","   ",cont+1,"   ","Lance el dado";
				Escribir "Debe apretar el gatillo: ",dado,"   ","veces";
				Repetir
					Si((azar(6)+1)=dado)Entonces
						Escribir "Jugador: ",cont+1,"   ","Ha muerto";
					Sino
						Si((azar(6))+1)>dado O ((azar(6)+1)<dado) Entonces
							Escribir "¡Buena suerte!";
						FinSi
					FinSi
				Hasta Que (dado=gatillo)
				Escribir "Siguiente jugador";
				contJug<-contJug+1;
			FinSi
	Hasta Que (contJug=3);
FinProceso
