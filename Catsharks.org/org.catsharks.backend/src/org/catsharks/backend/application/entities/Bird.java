package org.catsharks.backend.application.entities;
/**
 * Clase que implementa los metodos para instancia objetos tipo {@code Bird}.
 */
public class Bird extends Animal{
    /**
     * Constante que designa la ruta de un recurso grafico de {@code Bird}.
     */
    public static final String FISH_ICON_PATH = "../visual_resources/picto-ocells.png";
    /**
     * Atributo que designa si la embergadura de {@code Bird}.
     */
    private int wingspan;
    /**
     * Construye una instancia de {@code Bird}.
     */
    public Bird(int s_type, boolean poisonous) {
        super(BIRD, s_type);
        this.setWingspan(wingspan);
    }
    /**
     * Obtiene la embergadura del {@code Bird}.
     * @return    la embergadura del {@code Bird}.
     * @see       #setWingspan(int)
     */
    public int getWingspan() {
        return wingspan;
    }
    /**
     * Asigna la embergadura de las alas.
     * @param wingspan la embergadura de las alas.
     * @see      #getWingspan()
     */
    public void setWingspan(int wingspan) {this.wingspan = wingspan;}
    /**
     * Sobrescritura del método toString().
     */
    @Override
    public String toString(){
        var sb = new StringBuilder(super.toString());
        sb.append(String.format(">Embergadura:          %s %n", this.getWingspan()));
        return sb.toString();
    }
}
