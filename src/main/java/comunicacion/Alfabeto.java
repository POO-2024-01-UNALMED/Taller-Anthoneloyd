package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    // Métodos

    public int cantidadLetras() {
        return letras.length;
    }

    public String interpretacion() {
        return interpretacion;
    }

    public String toString() {
        String cadena = "";

        for (String letra: letras) {
            if (letra != letras[letras.length - 1])
                cadena = cadena + letra + ", ";
            else
                cadena = cadena + letra;
        }

        return cadena;
    }

    // Getters y Setters
    public String[] getLetras() {
        return letras;
    }
    public void setLetras() {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion() {
        this.interpretacion = interpretacion;
    }
}
