package Classes.Entitys;

public class Foreign extends Classic{
    private String country;

    @Override
    public int kalkRaiting(int kolReader, int sumMarks) {
        int raiting=0;
        raiting=sumMarks/kolReader;
        this.setRaiting(raiting);
        return raiting;
    }

    public Foreign(String name, String autor, String country) {
        super(name, autor);
        this.country = country;
    }

    public Foreign(String name, String autor) {
        super(name, autor);
        this.country="USA";
    }

    public Foreign() {
    }
}
