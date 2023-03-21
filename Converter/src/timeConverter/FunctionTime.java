package timeConverter;

import javax.swing.JOptionPane;

public class FunctionTime {

	Time tiempo = new Time();

	public void convertirTiempo(double tiempoRecibido) {
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione el valor a convertir", "Tiempo",
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {
						"Segundo a minuto", "Minuto a hora", "Hora a día",
						"Minuto a segundo", "Hora a minuto", "Día a hora",
						"Segundo a hora", "Hora a segundo"
				}, "Selección")).toString();

		switch (opciones) {
			case "Segundo a minuto":
				tiempo.segundosMinutos(tiempoRecibido);
				;
				break;
			case "Minuto a hora":
				tiempo.minutosHoras(tiempoRecibido);
				break;
			case "Hora a día":
				tiempo.horasDias(tiempoRecibido);
				;
				break;
			case "Minuto a segundo":
				tiempo.minutosSegundos(tiempoRecibido);
				;
				break;
			case "Hora a minuto":
				tiempo.horasMinutos(tiempoRecibido);
				;
				break;
			case "Día a hora":
				tiempo.diasHoras(tiempoRecibido);
				;
				break;
			case "Segundo a hora":
				tiempo.segundosHoras(tiempoRecibido);
				;
				break;
			case "Hora a segundo":
				tiempo.horasSegundos(tiempoRecibido);
				;
				break;
			default:
				break;
		}
	}
}