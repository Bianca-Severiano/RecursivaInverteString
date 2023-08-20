package view;
import controller.ControllerInverteString;
public class Principal {

	public static void main(String[] args) {
		String texto = "bianca";
		int tamanho = texto.length();
		
		ControllerInverteString ci = new ControllerInverteString();
		System.out.print(ci.InverteTexto(tamanho, texto));

	}



}
