package Classes.Entitys;

public class Russian extends Classic{
    private boolean USSR=false;

    @Override
    public int kalkRaiting(int kolReader, int sumMarks) {
        int raiting=0;
        raiting=sumMarks/kolReader;
        this.setRaiting(raiting);
        return raiting;
    }

    public Russian(String name, String autor, boolean USSR) {
        super(name, autor);
        this.USSR = USSR;
    }

    public Russian() {
    }
}
