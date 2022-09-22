package Classes.Entitys;
import Classes.WriterData;

abstract public class BookCard implements WriterData {
    protected int number;
    protected int age=0;


    @Override
    public int kalkAge(int startYear, int nowYear) {
        this.age=nowYear-startYear;
        return this.age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public BookCard() {
        number=(age+751)/3;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
