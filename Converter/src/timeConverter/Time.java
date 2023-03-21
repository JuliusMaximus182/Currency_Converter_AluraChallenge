package timeConverter;

import javax.swing.JOptionPane;

public class Time {

	public void segundosMinutos(double valorRecibido) {
		double minutos = valorRecibido / 60;
		minutos = (double) Math.round(minutos * 1000000) / 1000000.0; // 6 decimales

		JOptionPane.showMessageDialog(null, valorRecibido + " segundo/s = " + minutos + " minuto/s"); 
		// Muestra valor convertido
	}

	public void minutosHoras(double valorRecibido) {
		double horas = valorRecibido / 60;
		horas = (double) Math.round(horas * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " minuto/s = " + horas + " hora/s");
	}

	public void horasDias(double valorRecibido) {
		double dias = valorRecibido / 24; // 24 horas en un día
		dias = (double) Math.round(dias * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " hora/s = " + dias + " día/s");
	}

	public void minutosSegundos(double valorRecibido) {
		double segundos = valorRecibido * 60;
		segundos = (double) Math.round(segundos * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " minuto/s = " + segundos + " segundo/s");
	}

	public void horasMinutos(double valorRecibido) {
		double minutos = valorRecibido * 60;
		minutos = (double) Math.round(minutos * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " hora/s = " + minutos + " minuto/s");
	}

	public void diasHoras(double valorRecibido) {
		double horas = valorRecibido * 24; // 24 horas en un día
		horas = (double) Math.round(horas * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " día/s = " + horas + " hora/s");
	}

	public void segundosHoras(double valorRecibido) {
		double horas = valorRecibido / 3600; // 3600 segundos en una hora
		horas = (double) Math.round(horas * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " segundo/s = " + horas + " hora/s");
	}

	public void horasSegundos(double valorRecibido) {
		double segundos = valorRecibido * 3600; // 3600 segundos en una hora
		segundos = (double) Math.round(segundos * 1000000) / 1000000.0;

		JOptionPane.showMessageDialog(null, valorRecibido + " hora/s = " + segundos + " segundo/s");
	}
}