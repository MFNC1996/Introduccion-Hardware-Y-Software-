Proceso sin_titulo
	acum_centro_1<-0;
	acum_centro_2<-0;
	cont<-0;
	acum_s_peso<-0;
	acum_b_peso<-0;
	peso_normal<-0;
	Repetir
		Escribir "ingrese edad de niño"," ",cont+1;
		leer edad;
		Si (edad>=1 Y edad<=9) Entonces
			Escribir "ingrese peso del niño"," ",cont+1;
			leer peso;
		Sino
			Escribir "edad mal ingresada";
		FinSi
		Escribir "Ingrese centro asistencial 1 ò 2";
		Leer centro;
		Si (centro=1)Entonces
			acum_centro<-acum_centro+1;
		Sino
			Escribir "centro mal ingresado";
		FinSi
		Si (centro=2)Entonces
			acum_centro_2<-acum_centro_2+1;
		Sino
			Escribir "centro mal ingresado";
		FinSi
		p_normal<-(3*edad+7);
		Si(peso>p_normal)Entonces
			acum_s_peso<-acum_s_peso+1;
		Sino
			Si(peso<p_normal) Entonces
				acum_b_peso<-acum_b_peso+1;
			Sino
				peso_normal<-peso_normal+1;
			FinSi
		FinSi
		cont<-cont+1;
	Hasta Que (cont=10)
	Escribir "niños con bajo peso",acum_b_peso;
	Escribir "niños con peso normal",peso_normal;
	Escribir "niños con sobre peso",acum_s_peso;
	Si (acum_centro_1>acum_centro_2)Entonces
		mayor<-acum_centro_1;
	Sino
		mayor<-acum_centro_2;
	FinSi
	Escribir "el centro mas visitado es:",mayor;


	
	
	
FinProceso
