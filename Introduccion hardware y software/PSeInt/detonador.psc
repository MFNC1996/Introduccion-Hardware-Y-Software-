Proceso sin_titulo
	Escribir "Ingrese Hora : minuto : Segundos";
	Leer hh;
	Leer mm;
	Leer ss;
	Mientras (hh>=0) Hacer
		Mientras (mm>=0) Hacer
			Mientras (ss>=0) Hacer
				Escribir hh,":",mm,":",ss;
				ss <- ss - 1;
				Esperar 1 Segundos;
				Limpiar Pantalla;
			FinMientras
			ss <- 59;
			mm <- mm - 1;
		FinMientras
		mm <- 59;
		hh <- hh - 1;
	FinMientras
	Escribir "Boooommm!!!";
FinProceso
