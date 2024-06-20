
    /*======================================================================================
Study Center....: Universidad TÃ©cnica Nacional
Campus..........: PacÃ­fico (JRMP)
College career..: IngenierÃ­a en TecnologÃ­as de InformaciÃ³n
Period..........: 2C-2024
Course..........: ITI-221 - ProgramaciÃ³n I
Document........: class_05 - cls_Persona.java
Goals...........: Use the ADT (Abstract Data Type) concept to create a class that
                  represents a person.
Professor.......: Jorge Ruiz (york)
Student.........: Johel Mena

======================================================================================*/
import java.util.Date;

    public abstract class cls_Persona2 {
        // Private attributes
        private int cedula;
        private String nombre;
        private char sexo;
        private char eCivil;

        private Date fecNac;


        // Getters and Setters methods
        public int getCedula() {
            return this.cedula;
        }

        public void setCedula(int cedula) {
            this.cedula = cedula;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public char getSexo() {
            return this.sexo;
        }

        public void setSexo(char sexo) {
            this.sexo = sexo;
        }

        public char geteCivil() {
            return this.eCivil;
        }

        public void seteCivil(char eCivil) {
            this.eCivil = eCivil;
        }

        public Date getFecNac() {
            return this.fecNac;
        }

        public void setFecNac(Date fecNac) {
            this.fecNac = fecNac;
        }

        public int getEdad() {
            return new Date().getYear() - this.fecNac.getYear();
        }

    }

