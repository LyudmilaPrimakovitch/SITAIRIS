package Classes.Entitys;

import Classes.EBook;
import Classes.PersRaiting;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BestCellers implements PersRaiting, EBook {
    private String name;
    private String autor;
    private boolean eBook;
    private int raiting;
    private BookCard card;


    @Override
    public boolean isE() {
        return eBook;
    }

    @Override
    public int showPers(int rait) {
        if(rait>raiting) {
            System.out.println("Автор оценивает свою книгу лучше, чем читатели");
            return rait-raiting;
        } else if (rait<raiting) {
            System.out.println("Автор оценивает свою книгу хуже, чем читатели");
            return raiting-rait;
        }
        else {
            System.out.println("Мнение автора и читателей совпадают");
            return 0;
        }

    }

    @Override
    public int kalkRaiting(int kolReader, int sumMarks) {
        raiting=sumMarks/kolReader;
        return this.raiting;
    }

    @Override
    public int kalkTime(int startRead, int finishRead) {
        return finishRead-startRead;
    }

    @Override
    public void enterReader(String readerName) {
        System.out.println("Последний читатель: "+readerName);
    }

    @Override
    public String findWriter(String bookName) throws IOException {
        if (bookName=="Мастер и Маргарита" || bookName=="Собачье сердце") {this.autor="Булгаков";}
        else
        if (bookName=="Мертвые души" || bookName=="Ревизор") {this.autor="Гоголь";}
        else this.autor="Some_author";

        PrintWriter printWriter=new PrintWriter(
                new OutputStreamWriter(
                new FileOutputStream("RequestHistory.txt", true), "Cp1251"));
        printWriter.println(bookName+"-"+this.autor);
        printWriter.append("-----------------------------------------------\n");
        printWriter.close();
        return this.autor;
    }

    @Override
    public int kalkAge(int startYear, int nowYear) {
        int temp=nowYear-startYear;
        return temp;
    }

    public BestCellers(String name, boolean eBook, int raiting) {
        this.name = name;
        this.card=new BookCard() {
            @Override
            public String findWriter(String bookName) {
                if (bookName=="Мастер и Маргарита" || bookName=="Собачье сердце") {autor="Булгаков";}
                else
                if (bookName=="Мертвые души" || bookName=="Ревизор") {autor="Гоголь";}
                else autor="Some_author";
                return autor;
            }
        };
        this.card.age=this.kalkAge(1998,2022);
        this.raiting=raiting;
        this.eBook=eBook;
    }

    public BestCellers() {}
}
