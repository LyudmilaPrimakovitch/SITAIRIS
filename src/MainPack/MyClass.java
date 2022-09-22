package MainPack;
import Classes.Entitys.BestCellers;
import Classes.PersRaiting;

import java.io.IOException;

public class MyClass {
    public static void main(String[] args) throws IOException {
        BestCellers bestCellers = new BestCellers("Мастер и Маргарита", true, 25);
        int authorRating=bestCellers.showPers(30);
        System.out.println("Разница:"+authorRating);
        String writer=bestCellers.findWriter("Мастер и Маргарита");
        System.out.println("Поиск автора через метод 1 класса: "+writer);
        PersRaiting personRaiting;
        personRaiting=bestCellers;
        System.out.println("Поиск автора через метод интерфейса: "+personRaiting.findWriter("Мертвые души"));
        String writer2=bestCellers.findWriter("Божественная комедия");
        System.out.println("Поиск автора через метод 2 класса: "+writer2);
        System.out.println("Поиск автора через метод класса: "+writer);
        String writer3=bestCellers.findWriter("Божественная комедия");
    }
}
