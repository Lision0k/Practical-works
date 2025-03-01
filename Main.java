import static java.lang.System.*;
class Reader{
    String name;
    String number;
    String facult;
    String birthday;
    String telef;
    Reader(String name, String number, String facult, String birthday, String telef){
        this.name = name;
        this.number = number;
        this.facult = facult;
        this.birthday = birthday;
        this.telef = telef;
    }
    void takeBook(int k){
        out.printf("%S взял(а) %d книг(и) \n", this.name, k);
    }
    void takeBook(String ... Books){
        out.printf("%S взял(а) книги: %S \n", this.name, String.join(", ", Books));
    }
    void returnBook(int k){
        out.printf("%S вернул(а) %d книг(и) \n", this.name, k);
    }
    void returnBook(String ... Books){
        out.printf("%S вернул(а) книги: %S \n", this.name, String.join(", ", Books));
    }
}
public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Константин", "395K", "Griffindor", "29.09.2007", "89996660022");
        readers[1] = new Reader("Елизавета", "199L", "Ravenclaw", "09.11.2007", "89245378100");
        readers[2] = new Reader("Мария", "271M", "Slytherin", "21.09.2007", "89784442332");
        readers[3] = new Reader("Марина", "289M", "Ravenclaw", "15.08.2007", "84562347795");
        readers[4] = new Reader("Ольга", "175O", "Hufflepuff", "08.06.2007", "89956432218");
        readers[0].takeBook(7);
        readers[1].takeBook("Мумитролли", "Назад в будущее");
        readers[3].takeBook("Преступление и наказание", "Горе от ума", "Мастер и Маргарита");
        readers[2].returnBook(3);
        readers[4].returnBook("Собачье сердце");
    }
}
