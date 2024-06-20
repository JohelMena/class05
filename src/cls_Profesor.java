/*=================================================================================
Study Center....: Universidad TÃ©cnica Nacional
Campus..........: PacÃ­fico (JRMP)
College career..: IngenierÃ­a en TecnologÃ­as de InformaciÃ³n
Period..........: 2C-2024
Course..........: ITI-221 - ProgramaciÃ³n I
Document........: class_05 - corrida_03.java
Goals...........: Create instances of the cls_Persona class and use its methods.
Professor.......: Jorge Ruiz (york)
Student.........:
=================================================================================*/
public class cls_Profesor extends cls_Persona2 {
    // Private attributes
    private String Especialidad;
    private String Titulo;

    // Creates default constructor
    public cls_Profesor() {
    }

    // Creates parametrized constructor
    public cls_Profesor(int cedula, String Nombre, String Especialidad, String Titulo) {
        // Calls the constructor of the superclass
        this.setCedula(cedula);
        this.setNombre(Nombre);

        // Initializes the attributes of the subclass
        this.Especialidad = Especialidad;
        this.Titulo = Titulo;
    }

    // Getters and Setters methods
    public String getEspecialidad() {
        return this.Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    // Create destructor method
    protected void finalize() {
        System.out.println("El profesor con cÃ©dula " + this.getCedula() + "ha sido removido de memoria");
    }

}
