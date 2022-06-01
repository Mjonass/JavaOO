import especialista.Arquiteto;

public class Escritorio {

	public static void main(String[] args) {
		Arquiteto oscar = new Arquiteto("Oscar Niemeyer", 104);
		Arquiteto kengo = new Arquiteto("Kengo Kuma", 64);

		desenhar(oscar, 2.0f, 5.2f, 3.7f);
		desenhar(kengo, 7.5f, 4.0f, 9.6f);
	}

	private static void desenhar(Arquiteto arq, float a, float b, float c) {

		arq.exiba_dados_pessoais();
		arq.trabalhe(a, b, c);
	}
}