package tudo;

public class driver {

	public static void main (String[] args) {
		veiculo meuVeiculo = new HondaAccord();
		veiculo meu2veiculo = new MercedesC300();
		meuVeiculo.acelerar();
		meu2veiculo.acelerar();
	}
}
