package menu;

import javax.swing.JOptionPane;

import coinsConverter.FunctionCoin;
import timeConverter.FunctionTime;
import temperatureConverter.FunctionTemp;

public class Menu {

  public static void ejecutarMenu() {

    FunctionCoin monedas = new FunctionCoin();
    FunctionTime tiempo = new FunctionTime();
    FunctionTemp temperatura = new FunctionTemp();

    try {
      String opciones;
      int menuSi = JOptionPane.YES_OPTION;

      do {
        opciones = (JOptionPane.showInputDialog(null, "Seleccione que desea convertir", "Menú ",
            JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Monedas", "Temperatura", "Tiempo" }, "Selección"))
            .toString();

        switch (opciones) {
          case "Monedas": {

            // validar que el valor ingresado sea un #
            String input = JOptionPane.showInputDialog("Ingrese los $$ a convertir");

            while (!esNumero(input)) {
              JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
              input = JOptionPane.showInputDialog(null, "Por favor ingrese el monto");
            }

            double valorRecibido = Double.parseDouble(input);
            monedas.ConvertirMoneda(valorRecibido);

            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
            System.out.println(seleccion);

          }
            break;

          case "Temperatura": {
            String input = JOptionPane.showInputDialog("Ingrese la T° a convertir");
            while (!esNumero(input)) {
              JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
              input = JOptionPane.showInputDialog(null, "Por favor ingrese el valor");
            }

            double temperaturaRecibida = Double.parseDouble(input);
            temperatura.convertirTemperatura(temperaturaRecibida);

            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
            System.out.println(seleccion);
          }
            break;

          case "Tiempo": {
            String input = JOptionPane.showInputDialog("Ingrese el valor a convertir");
            while (!esNumero(input)) {
              JOptionPane.showMessageDialog(null, "Ha ingresado un valor inválido", "Error", JOptionPane.ERROR_MESSAGE);
              input = JOptionPane.showInputDialog(null, "Por favor ingrese el valor");
            }

            double tiempoRecibido = Double.parseDouble(input);
            tiempo.convertirTiempo(tiempoRecibido);

            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quiere volver a convertir?");
            System.out.println(seleccion);
          }
            break;

          default:
            break;
        }
      } while (JOptionPane.YES_OPTION == menuSi);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "¡Vuelva pronto!");
    }
  }

  // VALIDO QUE VALORES SEAN NÚMEROS
  private static boolean esNumero(String num) {
    try {
      Double.parseDouble(num);
      return true;
    } catch (NumberFormatException nfe) {
      return false;
    }
  }
}
