package co.edu.uniquindio.poo;

public record Estudiante(String nombre, String apellido, String identificacion, String correo, String telefono, byte edad) {

    public Estudiante{
        assert nombre != null && !nombre.isBlank() : "El nombre del estudiante no puede ser nulo y tampoco vacio";

        assert apellido != null && !apellido.isBlank() : "El apellido del estudiante no puede ser nulo";

        assert identificacion != null && !identificacion.isBlank() : "El identificacion del estudiante no puede ser nulo";

        assert correo != null && !correo.isBlank() && correo.contains("@") : "El correo del estudiante no puede ser nulo";

        assert telefono != null && !telefono.isBlank() : "El telefono del estudiante no puede ser nulo";

        assert edad >=0 :"La edad del estudiante no puede ser negativa";

    }
    
}
