package monitoreo.de.camaras;

import java.util.List;

public class MonitoreoDeCamaras {

    public static void main(String[] args) {
        SistemaMonitoreoCamara sistemaMonitoreo = new SistemaMonitoreoCamara();

        // Agregar cámaras al sistema
        sistemaMonitoreo.addCamara(new Camara("cam001", "Entrada Principal"));
        sistemaMonitoreo.addCamara(new Camara("cam002", "Pasillo Interior"));
        

        // Acceder a la lista de cámaras
        List<Camara> camaras = sistemaMonitoreo.getCamaras();

        for (Camara camara : camaras) {
            System.out.println("Cámara ID: " + camara.getId());
            System.out.println("Ubicación: " + camara.getubicacion());
             
        }

        // Ver una imagen de una cámara específica
        String cameraIdToView = "cam001";
        byte[] image = sistemaMonitoreo.viewCamaraImagen(cameraIdToView);
        if (image != null) {
            System.out.println("Vista previa de la cámara " + cameraIdToView);
            // Aquí puedes mejorar la visualización de la imagen
            // En lugar de imprimir el array de bytes, considera convertirlo en una representación de imagen.
        } else {
            System.out.println("Cámara no encontrada");
        }
    }
}
    
    

