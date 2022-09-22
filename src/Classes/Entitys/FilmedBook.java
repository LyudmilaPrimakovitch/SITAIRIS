package Classes.Entitys;
import Classes.ReadTime;
import Classes.ReaderData;

abstract public class FilmedBook implements ReadTime, ReaderData {
    protected String name;
    protected String autor;
    protected int filmDate;
    private int age;
    private int readTime;
    private String[] readers;
    private int kolReaders;

    @Override
    public int kalkAge(int startYear, int nowYear) {
        this.age=nowYear-startYear;
        return this.age;
    }



    @Override
    public void enterReader(String readerName) {
        readers[kolReaders]=readerName;
        kolReaders++;
    }

    public FilmedBook(String name, String autor, int filmDate) {
        this.name = name;
        this.autor=autor;
        this.filmDate=filmDate;
    }

    public FilmedBook() {
    }

    public int getReadTime() {
        return readTime;
    }

    public void setReadTime(int readTime) {
        this.readTime = readTime;
    }
}
