Proceso sin_titulo
	contSucursal<-0;
	acumFalla1<-0;
	acumFalla2<-0;
	acumFalla3<-0;
	Repetir
		Escribir "Sucursal: ",contSucursal+1;
		Repetir
			Escribir "ingrese numero de fallas de tipo leve";
			Leer falla1;
			acumFalla1<-acumFalla1+falla1;
			dinero1<-1200*falla1;
			Escribir "ingrese numero de fallas de tipo grave";
			Leer falla2;
			acumFalla2<-acumFalla2+falla2;
			dinero2<-5000*falla2;
			Escribir "ingrese numero de fallas de tipo mayor";
			Leer falla3;
			acumFalla3<-acumFalla3+falla3;
			dinero3<-15000*falla3;
		Hasta Que (acumFalla1=falla1 && acumFalla2=falla2 && acumFalla3=falla3)
		Escribir "dinero de fallas leves de sucursal 1: ","$",dinero1;
		Escribir "dinero de fallas graves de sucursal 2: ", "$",dinero2;
		Escribir "dinero de fallas mayores de sucursal 3: ", "$",dinero3;
		Si(contSucursal=0)Entonces
			suma1<-falla1+falla2+falla3;
		Sino
			Si(contSucursal=1)Entonces
				suma2<-falla1+falla2+falla3;
			Sino
				Si(contSucursal=2) Entonces
					suma3<-falla3+falla2+falla1;
				FinSi
			FinSi
		FinSi
		acumFalla1<-0;
		acumFalla2<-0;
		acumFalla3<-0;
		contSucursal<-contSucursal+1;
		Escribir "______________________________________________________";
	Hasta Que (contSucursal=3)
	Escribir "total de todas las incidencias de las sucursales: ",suma1+suma2+suma3;
	Si(suma1>suma2)Entonces
		max<-suma1;
	Sino
		Si(max<suma3)Entonces
			max<-suma3;
		Sino
			max<-suma2;
		FinSi
	FinSi
	Escribir "la sucursal con mas fallas es: ",max;
FinProceso
