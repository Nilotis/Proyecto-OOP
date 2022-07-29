package org.catsharks.backend.application.entities;
/**
 * Clase que implementa los metodos para instancia objetos tipo {@code Reptile}.
 */
public class Reptile extends Animal{
    /**
     * Define si la piel del {@code Reptile} és dura o blanda.
     */
    private boolean skin;

    /**
     * Construye una instancia de {@code Reptile}.
     */
    public Reptile(int s_type, boolean skin) {
        super(REPTILE, s_type);
        this.setSkin(skin);
    }

    /**
     * Obtiene el tipo de peil del reptil.
     * @return    el tipo de andar.
     * @see       #setSkin(boolean)
     */
    public boolean isSkin() {
        return skin;
    }

    /**
     * Asigna el tipo de piel del reptil.
     * @param skin el tipo de piel.
     * @see      #isSkin()
     */
    public void setSkin(boolean skin) {
        this.skin = skin;
    }

    /**
     * Sobrescritura del método toString().
     */
    @Override
    public String toString(){
        var sb = new StringBuilder(super.toString());
        sb.append(String.format(">Piel suave o blanda:      %s %n", this.isSkin()));
        return sb.toString();
    }
}
