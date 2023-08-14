package controller;

public class SequenciaController {

	public SequenciaController() {
		super();
	}

	public double sequencial(int N) {
		// condição de parada - quando N for == 1; retornando os valores a partir de 1.
		// *dúvida: ele pode ser igual a 0 mesmo se tratando de uma divisão?
		if (N == 1) {
			return 1;
		}
		// relação de chamada dos passsos - o 1 permanece o mesmo;
		// será decrementado do N até o resultado for = 1 e então a função ser despilhada. 
		return 1 / N + sequencial(N - 1);
	}
}
