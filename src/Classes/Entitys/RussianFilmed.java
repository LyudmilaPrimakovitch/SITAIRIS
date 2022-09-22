package Classes.Entitys;
import Classes.EBook;

public class RussianFilmed extends FilmedBook implements EBook  {
    private boolean transl;
    private boolean eB;

    @Override
    public boolean isE() {
        return eB;
    }

    @Override
    public int kalkTime(int startRead, int finishRead) {
        int time=0;
        time=finishRead-startRead;
        this.setReadTime(time);
        return time;
    }

    @Override
    public String findWriter(String bookName) {
        if (bookName=="Мастер и Маргарита" || bookName=="Собачье сердце") {this.autor="Булгаков";}
        else
            if (bookName=="Мертвые души" || bookName=="Ревизор") {this.autor="Гоголь";}
    else this.autor="Some_author";
    return this.autor;
    }

    public boolean iseB() {
        return eB;
    }

    public void seteB(boolean eB) {
        this.eB = eB;
    }

    public boolean isTransl() {
        return transl;
    }

    public void setTransl(boolean transl) {
        this.transl = transl;
    }

    public RussianFilmed(String name, String autor, int filmDate, boolean transl, boolean eB) {
        super(name, autor, filmDate);
        this.transl = transl;
        this.eB=eB;
    }

    public RussianFilmed() {
    }
}
