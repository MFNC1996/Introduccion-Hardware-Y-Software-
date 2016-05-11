Proceso sin_titulo
	avance <- 0
	contJugadas <- 0
		Repetir
			dado <- azar(6) + 1
			contJugadas <- contJugadas + 1
			avance <- avance + dado
			Escribir "Dado: ", dado
			Si (avance>15) Entonces
				dif <- avance - 15
				avance <- 15 - dif
			FinSi
			Escribir "Casilla Final: ", avance
		Hasta Que (avance=15)
	Escribir "Gano en ", contJugadas, " jugadas"
FinProceso
