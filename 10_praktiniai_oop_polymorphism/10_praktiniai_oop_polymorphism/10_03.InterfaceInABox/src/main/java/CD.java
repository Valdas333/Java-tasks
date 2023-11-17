public class CD implements Packable {

    private String authorCD;
    private String nameCD;
    private int publicationYear;
    private double weightCD = 0.1;

    public CD(String authorCD, String nameCD, int publicationYear) {
        this.authorCD = authorCD;
        this.nameCD = nameCD;
        this.publicationYear = publicationYear;
    }

    @Override
    public double weight() {
        return weightCD;
    }

    @Override
    public String toString() {
        return authorCD + ": " + nameCD + " (" +publicationYear + ')';
    }
}
