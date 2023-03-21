package temperatureConverter;

import javax.swing.JOptionPane;

public class FunctionTemp {

  Temperature temperatura = new Temperature();

  public void convertirTemperatura(double tempRecibida) {
    String opciones = (JOptionPane.showInputDialog(null, "Seleccione el valor a convertir", "Temperatura",
        JOptionPane.PLAIN_MESSAGE, null, new Object[] {
            "Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius", "Fahrenheit a Kelvin",
            "Kelvin a Celsius", "Kelvin a Fahrenheit"
        }, "Selección")).toString();

    switch (opciones) {
      case "Celsius a Fahrenheit":
        temperatura.CelsiusAFahrenheit(tempRecibida);
        break;
      case "Celsius a Kelvin":
        temperatura.CelsiusAKelvin(tempRecibida);
        break;
      case "Fahrenheit a Celsius":
        temperatura.FahrenheitACelsius(tempRecibida);
        break;
      case "Fahrenheit a Kelvin":
        temperatura.FahrenheitAKelvin(tempRecibida);
        break;
      case "Kelvin a Celsius":
        temperatura.KelvinACelsius(tempRecibida);
        break;
      case "Kelvin a Fahrenheit":
        temperatura.KelvinAFahrenheit(tempRecibida);
        break;
      default:
        break;
    }
  }
}