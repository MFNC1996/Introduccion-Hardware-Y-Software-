Proceso sin_titulo
	montoInicial<-1000000;
	passUser<-1234;
	passAdmin<-9876;
	montoActual<-0;
	otravez<-0;
	Escribir "Bienvenido al banco";
	Escribir "_____________________";
	Escribir "Opere tarjeta";
	Esperar Tecla;
	Escribir "______________________";
	Repetir
		Repetir
			Escribir "Ingrese contraseña";
			Leer pass;
			Si(pass=passUser)Entonces
				Escribir "Bienvenido Usuario";
			Sino
				Si(pass=passAdmin)Entonces
					Escribir "Bienvenido Administrador";
				Sino
					Escribir "Uuario no registrado";
				FinSi
			FinSi
			Hasta Que(pass=passAdmin O pass=passUser) 
			Si(pass=passUser)Entonces
				Repetir
					Escribir "¿Que desea hacer?";
					Escribir "__________________";
					Escribir "1-Retirar dinero","   ","2-Consultar saldo","   ","   ","3-Cerrar sesion";
					Leer opcion;
						Segun opcion Hacer
							1: 
								Escribir "Ingrese cantidad deseada";
								Leer dinero;
								montoActual<-montoInicial-dinero;
								Si(dinero>=montoInicial)Entonces
									Escribir "Monto supera saldo";
								FinSi
							2:
								Escribir "Su saldo es: ", "$ ",montoInicial-dinero;
							3: 
								Escribir "Cerrando sesion";
								Esperar 1 Segundos;
								Escribir "Sesion terminada con exito";
						FinSegun
				Hasta Que (opcion=3)
				
			Sino
				Si(pass=passAdmin)Entonces
					Repetir
						Escribir "¿Que desea hacer?";
						Escribir "_________________";
						Escribir "1-Consultar saldo","   ","2-Depositar","   ","3-Cambiar claves","   ","4-Cerrar sesion";	
						Leer opcion;
						Segun opcion Hacer
							1: 
								Escribir "Lo que queda en el cajero es: ", montoInicial+deposito;
							2:
								Escribir "Ingrese cantidad a depositar";
								Leer deposito;
								montoActual<-deposito+montoInicial;
							3:
								Escribir "Administrador: 1","   ","Usuario: 2";
								Leer cambioPass;
								Si(cambioPass=1)Entonces
									Escribir "Ingrese nueva contraseña";
									Leer newPass;
									passAdmin<-newPass;
								Sino
									Si(cambioPass=2)Entonces
										Escribir "Ingrese nueva contraseña";
										Leer newPass;
										passUser<-newPass;
									FinSi
								FinSi
							4:
								Escribir "Cerrando sesion";
								Esperar 1 Segundos;
								Escribir "Sesion terminada con exito";
						FinSegun
					Hasta Que (opcion=4)
				FinSi
			FinSi
			Escribir "¿Desea apagar el cajero automatico?",    "1-Si","   ","2-No";
			Leer apagar;
	Hasta Que (apagar=1)
	Escribir "Apagando sistema";
	Esperar 2 Segundos;
	Escribir "Hasta pronto...";
FinProceso
