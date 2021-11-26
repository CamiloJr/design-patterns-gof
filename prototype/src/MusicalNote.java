public abstract class MusicalNote implements Cloneable {

    public MusicalNote clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return (MusicalNote) clone;
    }

    public abstract void drawing();
}
