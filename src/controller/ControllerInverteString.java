package controller;

public class ControllerInverteString {

	public ControllerInverteString() {
		super();
	}

	public String InverteTexto(int tamanho, String texto) {
		String inverso = "";
		if (tamanho == 1) { // Quando tamanho for 1, retornar a primeira letra (0,1)
			return texto.substring(tamanho - 1, tamanho);
		} else {
			inverso = texto.substring(tamanho - 1, tamanho) + InverteTexto((tamanho - 1), texto);
			return inverso;
		}
	}

}

/* palavra = bianca
 *  f(6) = f(5,6) + f(5) --> "a" + f(5) --> "acnaib"
 *  f(5) = f(4,5) + f(4) --> "c" + f(4) --> "cnaib"
 *  f(4) = f(3,4) + f(3) --> "n" + f(3) --> "naib"
 *  f(3) = f(2,3) + f(2) --> "a" + f(2) --> "aib"
 *  f(2) = f(1,2) + f(1) --> "i " + f(1) --> "ib"
 *  f(1) = f(0,1) = "b"
 */
