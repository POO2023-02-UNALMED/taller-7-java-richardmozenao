package comunicacion;

public class Periodico extends Escrito{
    String fecha;
    String primicia;
    String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;

    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public int palabrasTotales(){
        return this.getPaginas()*10;
    }
    public String interpretacion(){
        return interpretacion;
    }
    public String toString(){
        String r = resumen();
        r += this.fecha + "\n";
        r += this.primicia + "\n";
        return r;
    }
}
