package coinsConverter;

import javax.swing.JOptionPane;

public class FunctionCoin {

	Coins monedas = new Coins();

	public void ConvertirMoneda(double ValorRecibido) {

		String opciones = (JOptionPane.showInputDialog(null, "Seleccione la moneda a convertir", "monedas ",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"Peso MXN a Dólar", "Peso MXN a Euro", "Peso MXN a Libra esterlina", "Peso MXN a Yen", "Peso MXN a Won",
						"Dólar a Peso MXN", "Euro a Peso MXN", "Libra esterlina a Peso MXN", "Yen a Peso MXN",
						"Won a Peso MXN"
				}, "Selección")).toString();

		switch (opciones) {
			case "Peso MXN a Dólar":
			monedas.ConvertirPesosADolar(ValorRecibido);
				break;
			case "Peso MXN a Euro":
				monedas.ConvertirPesosAEuro(ValorRecibido);
				break;
			case "Peso MXN a Libra esterlina":
				monedas.ConvertirPesosALibra(ValorRecibido);
				break;
			case "Peso MXN a Yen":
				monedas.ConvertirPesosAYen(ValorRecibido);
				break;
			case "Peso MXN a Won":
				monedas.ConvertirPesosAWon(ValorRecibido);
				break;
			case "Dólar a Peso MXN":
				monedas.ConvertirDolarAPeso(ValorRecibido);
				break;
			case "Euro a Peso MXN":
				monedas.ConvertirEuroAPeso(ValorRecibido);
				break;
			case "Libra esterlina a Peso MXN":
				monedas.ConvertirLibraAPeso(ValorRecibido);
				break;
			case "Yen a Peso MXN":
				monedas.ConvertirYenAPeso(ValorRecibido);
				break;
			case "Won a Peso MXN":
				monedas.ConvertirWonAPeso(ValorRecibido);
				break;
			default:
				break;
		}
	}
}