import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotaRevista {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nota = "", revista = "";
    int opcion;

    while (true) {
      mostrarMenu();
      opcion = Integer.parseInt(scanner.nextLine());

      if (opcion == 1) {
        nota = obtenerTexto(scanner, "nota");
        revista = obtenerTexto(scanner, "revista");
      } else if (opcion == 2) {
        System.out.println(puedeEscribirNota(nota, revista) ? "Sí, se puede escribir la nota." : "No, no se puede escribir la nota.");
      } else if (opcion == 3 || opcion == 4) {
        String texto = opcion == 3 ? nota : revista;
        System.out.println("El texto contiene " + contarPalabras(texto) + " palabras.");
      } else if (opcion == 5) {
        System.out.println("¡Hasta luego JITKey!");
        break;
      } else {
        System.out.println("Opción no válida. Inténtalo de nuevo.");
      }
    }
    scanner.close();
  }

  private static void mostrarMenu() {
    System.out.println("\nMenú:\n1. Introducir nota y revista\n2. Verificar si se puede escribir la nota\n3. Contar palabras en la nota\n4. Contar palabras en la revista\n5. Salir");
    System.out.print("Selecciona una opción: ");
  }

  private static String obtenerTexto(Scanner scanner, String tipo) {
    System.out.print("Introduce el texto de la " + tipo + ": ");
    return scanner.nextLine().trim();
  }

  private static boolean puedeEscribirNota(String nota, String revista) {
    return contarCaracteres(revista).entrySet().containsAll(contarCaracteres(nota).entrySet());
  }

  private static Map<Character, Integer> contarCaracteres(String texto) {
    Map<Character, Integer> contador = new HashMap<>();
    texto.chars()
            .filter(Character::isLetter)
            .map(Character::toLowerCase)
            .forEach(c -> contador.put((char) c, contador.getOrDefault((char) c, 0) + 1));
    return contador;
  }

  private static int contarPalabras(String texto) {
    return texto.isEmpty() ? 0 : texto.split("\\s+").length;
  }

}
