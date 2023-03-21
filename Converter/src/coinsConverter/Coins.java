package coinsConverter;

import javax.swing.JOptionPane;

public class Coins {

	// DE PESO MXN A MONEDAS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	public void ConvertirPesosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido * 0.053;

		monedaDolar = (double) Math.round(monedaDolar * 100) / 100.0; // 6 decimales

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = US$" + monedaDolar); // Muestra valor convertido
	}

	public void ConvertirPesosAEuro(double valorRecibido) {
		double monedaEuro = valorRecibido * 0.050;

		monedaEuro = (double) Math.round(monedaEuro * 100) / 100.0;

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = €" + monedaEuro);
	}

	public void ConvertirPesosALibra(double valorRecibido) {
		double monedaDolar = valorRecibido * 0.043;
		monedaDolar = (double) Math.round(monedaDolar * 100) / 100.0;

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = £" + monedaDolar);
	}

	public void ConvertirPesosAYen(double valorRecibido) {
		double monedaDolar = valorRecibido * 6.97;
		monedaDolar = (double) Math.round(monedaDolar * 100) / 100.0;

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = ¥" + monedaDolar);
	}

	public void ConvertirPesosAWon(double valorRecibido) {
		double monedaDolar = valorRecibido * 69.35;
		monedaDolar = (double) Math.round(monedaDolar * 100) / 100.0;

		JOptionPane.showMessageDialog(null, "$" + valorRecibido + " = ₩" + monedaDolar);
	}

	// DE MONEDAS A PESO MXN >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	public void ConvertirDolarAPeso(double valorRecibido) {
		double monedaDolar = valorRecibido * 18.84;
		monedaDolar = (double) Math.round(monedaDolar * 100) / 100.0; // 2 decimales

		JOptionPane.showMessageDialog(null, "US$" + valorRecibido + " = $" + monedaDolar); // Muestra valor convertido
	}

	public void ConvertirEuroAPeso(double valorRecibido) {
		double monedaEuro = valorRecibido * 20.20;
		monedaEuro = (double) Math.round(monedaEuro * 100) / 100.0;

		JOptionPane.showMessageDialog(null, "€" + valorRecibido + " = $" + monedaEuro);
	}

	public void ConvertirLibraAPeso(double valorRecibido) {
		double moneda = valorRecibido * 23.11;
		moneda = (double) Math.round(moneda * 100) / 100.0;

		JOptionPane.showMessageDialog(null, "£" + valorRecibido + " = $" + moneda);
	}

	public void ConvertirYenAPeso(double valorRecibido) {
		double moneda = valorRecibido * 0.14;
		moneda = (double) Math.round(moneda * 100) / 100.0;

		JOptionPane.showMessageDialog(null, "¥" + valorRecibido + " = $" + moneda);
	}

	public void ConvertirWonAPeso(double valorRecibido) {
		double moneda = valorRecibido * 0.014;
		moneda = (double) Math.round(moneda * 100) / 100.0;
		// Muestra valor convertido
		JOptionPane.showMessageDialog(null, "₩" + valorRecibido + " = $" + moneda);
	}
}