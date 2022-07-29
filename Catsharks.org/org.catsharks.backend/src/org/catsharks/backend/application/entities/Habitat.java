package org.catsharks.backend.application.entities;
/**
 * Clase que implementa los metodos para instancia objetos tipo {@code Habitat}.
 */
public class Habitat {
    /**
     * Literales que definen estados booleanos.
     */
    public static final String[] BOOL = {"Sí", "No"};
    /**
     * Liretales que definen las direcciones del viento.
     */
    public static final String[] CARDINALS = {"N : Norte", "NE : Noreste", "S : Sur", "SE : Sureste", "E : Este", "SO : Suroeste", "O : Oeste", "N0 : Noroeste"};
    /**
     * Liretales que definen las fuerzas del viento.
     */
    public static final String[] WIND = {"Calma", "Ventolina", "Brisa", "Fresco", "Temporal"};
    /**
     * Liretales que definen los tipos de cielos.
     */
    public static final String[] WHEATER = {"Cielo despejado", "Parcialmente nublado", "Nublado", "Cielo completamente cubierto"};
    private String especie;private String habitat;private int profundidad;private int tmp_nav;private String nubosidad;
    private String direccio_viento;private String fuerza_viento;private String hora_llegada;private int num_embarcaciones;
    private int temp;private String tipo_cebo;private int parasitos;private int presencia_anzuelos;private int num_anzuelos;
    public int getParasitos() {
        return parasitos;
    }
    public void setParasitos(int parasitos) {
        this.parasitos = parasitos;
    }
    public int getPresencia_anzuelos() {
        return presencia_anzuelos;
    }
    public void setPresencia_anzuelos(int presencia_anzuelos) {
        this.presencia_anzuelos = presencia_anzuelos;
    }
    public int getNum_anzuelos() {
        return num_anzuelos;
    }
    public void setNum_anzuelos(int num_anzuelos) {
        this.num_anzuelos = num_anzuelos;
    }
    public int getProfundidad() {
        return profundidad;
    }
    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }
    public int getTmp_nav() {
        return tmp_nav;
    }
    public void setTmp_nav(int tmp_nav) {
        this.tmp_nav = tmp_nav;
    }
    public String getNubosidad() {
        return nubosidad;
    }
    public void setNubosidad(String nubosidad) {
        this.nubosidad = nubosidad;
    }
    public String getDireccio_viento() {
        return direccio_viento;
    }
    public void setDireccio_viento(String direccio_viento) {
        this.direccio_viento = direccio_viento;
    }
    public String getFuerza_viento() {
        return fuerza_viento;
    }
    public void setFuerza_viento(String fuerza_viento) {
        this.fuerza_viento = fuerza_viento;
    }
    public String getHora_llegada() {
        return hora_llegada;
    }
    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }
    public int getNum_embarcaciones() {
        return num_embarcaciones;
    }
    public void setNum_embarcaciones(int num_embarcaciones) {
        this.num_embarcaciones = num_embarcaciones;
    }
    public int getTemp() {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }
    public String getTipo_cebo() {
        return tipo_cebo;
    }
    public void setTipo_cebo(String tipo_cebo) {
        this.tipo_cebo = tipo_cebo;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

