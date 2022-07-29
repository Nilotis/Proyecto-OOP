package org.catsharks.backend.application.entities;
/**
 * Clase que implementa los metodos para instancia objetos tipo {@code Fish}.
 */
public class Fish extends Animal{
    /**
     * Constante que designa la ruta de un recurso grafico de {@code Fish}.
     */
    public static final String FISH_ICON_PATH = "../visual_resources/picto-tiburones.png";
    /**
     * Constante que designa los biomas de los {@code Fish}.
     */
    public static final String[] FISH_BIOME = {"Marismas", "Manglares", "Zonas intermareales", "Estuarios", "Lagunas costeras", "Arrecifes de coral", "Fondo marino"};
    /**
     * Constante que designa las especies de los {@code Fish}.
     */
    public static final String[] FISH_SPECIES = {"Dasyatis pastinaca", "Galeorhinus galeus", "Gymnura altavela", "Hexanchus griseus", "Dipturus oxyrinchus", "Isurus oxyrinchus", "Lamna nasus", "Mobula mobular", "Mustelus asterias", "Myliobatis aquila", "Odontaspis ferox", "Oxynotus centrina", "Prionace glauca", "Pteroplatytrygon violacea", "Raja radula", "Raja undulata"};
    /**
     * Atributo que designa el tipo de agua de {@code Fish}.
     * Si el valor es true el agua sera salada, sino, el agua sera dulce.
     */
    private boolean water;
    /**
     * Construye una instancia de {@code Mammal}.
     */
    public Fish(int s_type, boolean water) {
        super(FISH, s_type);
        this.setWater(water);
    }
    /**
     * Obtiene el tipo de agua del pez.
     * @return    el tipo de agua.
     * @see       #setWater(boolean)
     */
    public boolean isWater() {
        return water;
    }
    /**
     * Asigna el tipo de agua del pez.
     * @param water el tipo de agua.
     * @see      #isWater()
     */
    public void setWater(boolean water) {
        this.water = water;
    }
    /**
     * Sobrescritura del método toString().
     */
    @Override
    public String toString(){
        var sb = new StringBuilder(super.toString());
        sb.append(String.format(">Agua:                  %s %n", this.isWater()));
        return sb.toString();
    }
}
