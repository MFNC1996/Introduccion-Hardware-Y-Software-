Proceso dificultad_complejo_ejercicio1
	Escribir "ingrese numero de 4 digitos"
	Leer num
	num1<- trunc(num/1000)
	num2<- trunc(num/100) - (num1*10)
	num3<- trunc(num/10) - (num2*10) - (num1*100)
	num4<- num % 10
	suma<- num1 + num2 + num3 + num4
	Escribir "la suma de los cuatro numeros es:" " ",suma
FinProceso
