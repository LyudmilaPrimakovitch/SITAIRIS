package Classes.Entitys;

import Classes.Rating;

abstract public class Classic implements Rating {
    private String name;
    private String autor;
    private int age=0;
    private int raiting=0;

    @Override
    public int kalkAge(int startAge, int nowAge) {
        this.age = nowAge - startAge;
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Classic(String name, String autor) {
        this.name = name;
        this.autor=autor;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public Classic() {
        name=new String();
        autor=new String();
        autor="Some_Author";
        name="Some_Name";
        age=0;
        raiting=0;
    }
}
