// Title.java
abstract class title {
    protected String titleName;
    protected String literatureType;
    protected int copies;
    protected static final double RATE = 0.067574; // Aktuel rate i 2024

    public title(String titleName, String literatureType, int copies) {
        this.titleName = titleName;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    // Beregner bibliotekspenge
    public double calculateRoyalties() {
        return calculatePoints() * RATE;
    }

    // Abstrakte metoder, implementeres i subklasserne
    protected abstract double calculatePoints();
    protected abstract double getLiteraturePoints();
}
