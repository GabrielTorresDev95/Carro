package oo.composicao;

public class Carro {
	Motor motor = new Motor();
	
	void acelerar () {
		if (motor.fatorInjecao < 2.6)
		motor.fatorInjecao +=  0.4;
	}

	void frear() {
		if (motor.fatorInjecao < 0.5)
		motor.fatorInjecao -= 0.4;
	}
	void desligar (){
		motor.ligado = false;
	}
	
	void ligar () {
		motor.ligado = true;
		
	}
	
	boolean estaligado() {
		return motor.ligado;
		
	}
	
	
}	

