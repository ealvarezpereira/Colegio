package colegio;

/**
 *
 * @author quique
 */
public class Estudiante extends Persona{
    
    private String nomColegio;
    private int nivel;

    public Estudiante(String nombre, String direccion, String nomColegio, int nivel) {
        
        super (nombre, direccion);
        this.nomColegio = nomColegio;
        this.nivel = nivel;
    }

    public String getNomColegio() {
        return nomColegio;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNomColegio(String nomColegio) {
        this.nomColegio = nomColegio;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nombre Colegio: " + nomColegio + ", Nivel: " + nivel ;
    }
    
    
    
}
