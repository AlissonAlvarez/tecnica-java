import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NotificacionEstudiantes {

  private static final String MENSAJE_MATE = "No se celebrarán las clases de Matemáticas programadas para el siguiente día en el instituto.";
  private static final String MENSAJE_FRANCES = "No se celebrarán las clases de Francés programadas para el siguiente día en el instituto.";
  private static final String MENSAJE_AMBOS = "No se celebrarán las clases de Matemáticas y Francés programadas para el siguiente día en el instituto.";

  public static void main(String[] args) {
    List<Estudiante> listaA = Arrays.asList(
            new Estudiante("Jacobo", "Málaga", "jacobo@hotmail.com", "Matemáticas"),
            new Estudiante("Dina", "Málaga", "dina@gmail.com", "Matemáticas"),
            new Estudiante("Paola", "Málaga", "paola@hotmail.com", "Matemáticas")
    );

    List<Estudiante> listaB = Arrays.asList(
            new Estudiante("Gabriela", "Málaga", "gabriela@yahoo.com", "Francés"),
            new Estudiante("Wendy", "Málaga", "wendy@hotmail.com", "Francés"),
            new Estudiante("Edwin", "Málaga", "edwin@gmail.com", "Francés")
    );

    List<Estudiante> listaC = Arrays.asList(
            new Estudiante("Carlos", "Málaga", "carlos@hotmail.com", "Matemáticas y Francés"),
            new Estudiante("Bryant", "Málaga", "bryant@gmail.com", "Matemáticas y Francés")
    );

    Set<Estudiante> notificarMatematicas = new HashSet<>(listaA);
    Set<Estudiante> notificarFrances = new HashSet<>(listaB);
    Set<Estudiante> notificarAmbos = new HashSet<>(listaC);

    String[] opciones = {"Matemáticas", "Francés", "Matemáticas y Francés"};
    int seleccion = JOptionPane.showOptionDialog(null,
            "Selecciona el tipo de notificación",
            "Menú de Notificación",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            opciones,
            opciones[0]);
    try {
      switch (seleccion) {
        case 0:
          enviarCorreo(notificarMatematicas, MENSAJE_MATE);
          break;
        case 1:
          enviarCorreo(notificarFrances, MENSAJE_FRANCES);
          break;
        case 2:
          enviarCorreo(notificarAmbos, MENSAJE_AMBOS);
          break;
        default:
          throw new IllegalArgumentException("Selección no válida.");
      }
    } catch (Exception e) {
      System.err.println("Error al enviar correos: " + e.getMessage());
    }
  }

  private static void enviarCorreo(Set<Estudiante> estudiantes, String mensaje) {
    if (estudiantes.isEmpty()) {
      System.out.println("No hay estudiantes para enviar notificación.");
      return;
    }
    for (Estudiante estudiante : estudiantes) {
      System.out.println("Enviando correo a: " + estudiante.getCorreo() +
              ", Nombre: " + estudiante.getNombre() +
              ", Sede: " + estudiante.getSede() +
              ", Mensaje: " + mensaje);
    }
  }
}
