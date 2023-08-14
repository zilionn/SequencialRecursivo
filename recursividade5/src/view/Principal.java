package view;

import javax.swing.JOptionPane;

import controller.SequenciaController;

public class Principal {

	public static void main(String[] args) {
		SequenciaController sequenciaCont = new SequenciaController();
		
		do {
			try {
				String input = JOptionPane.showInputDialog("digite um número inteiro: ");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "encerrado");
					System.exit(0);
				}
				int n = Integer.parseInt(input);
				JOptionPane.showMessageDialog(null, "o sequencial do número " + n + " = " + sequenciaCont.sequencial(n));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "número inválido");
				continue;
			}
			break;
		} while(true);
	}
}