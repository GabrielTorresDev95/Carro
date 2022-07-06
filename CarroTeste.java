/**
 *@author Gabriel Torres 
 * Relacionamento um para um onde um carro tem um motor.
 * Código unidirecional
 */
package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
	Carro c1 = new Carro();
	System.out.println(c1.estaligado());
	
	c1.ligar();
	System.out.println(c1.estaligado());
	System.out.println(c1.motor.giros()); //c1 objeto, motor -> atributo, giros metodos
	//system classe, out -> atributo, println--> metodos
	
	c1.acelerar();
	c1.acelerar();
	c1.acelerar();
	c1.acelerar();

	System.out.println(c1.motor.giros());
	
	c1.frear();
	c1.frear();
	c1.frear();
	c1.frear();
	c1.frear();
	c1.frear();
	c1.frear();
	c1.frear();
	c1.frear();

	//faltou encapsulmaneto!!!
	//c1.motor.fatorInjecao = -30;
	
	
	
	}
}
