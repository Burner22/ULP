
package entidades;

public class Cursada {
    private int idCursada;
    private Materia mater;
    private Alumno alum;
    private double nota;

    public Cursada() {
    }

    public Cursada(Materia mater, Alumno alum, double nota) {
        this.mater = mater;
        this.alum = alum;
        this.nota = nota;
    }

    public Cursada(int idCursada, Materia mater, Alumno alum, double nota) {
        this.idCursada = idCursada;
        this.mater = mater;
        this.alum = alum;
        this.nota = nota;
    }

    public int getIdCursada() {
        return idCursada;
    }

    public void setIdCursada(int idCursada) {
        this.idCursada = idCursada;
    }

    public Materia getMater() {
        return mater;
    }

    public void setMater(Materia mater) {
        this.mater = mater;
    }

    public Alumno getAlum() {
        return alum;
    }

    public void setAlum(Alumno alum) {
        this.alum = alum;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
    
}
