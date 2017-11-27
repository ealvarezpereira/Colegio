package colegio;

/**
 *
 * @author quique
 */
public class Erasmus extends Estudiante{
    
    private String pais;

    public Erasmus(String nombre, String direccion, String nomColegio, int nivel, String pais) {
        super (nombre, direccion, nomColegio,nivel);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pais: " + pais ;
    }
    
    
    
}
