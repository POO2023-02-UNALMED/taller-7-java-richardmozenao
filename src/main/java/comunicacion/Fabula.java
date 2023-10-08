package comunicacion;

public class Fabula extends Escrito{
    String ensenanza;
    String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public int palabrasTotales(){
        return this.getPaginas();
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        String r = resumen();
        r += this.ensenanza+"\n";
        return r;
    }

}
