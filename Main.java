import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //// Счётчик
        Counter counter = new Counter();
        counter.current = 5;
        counter.inc();
        System.out.println("counter: " + counter.getCurrent());
        System.out.println(" ");
        ////

        // Слова.
        String input = "one two three four five six";
        int length = 0;
        String output = "";
        Scanner scan = new Scanner(input);
        while(scan.hasNext()){
            String temp = scan.next();
            int tempLength = temp.length();

            if(tempLength > length){
                length = tempLength;
                output = temp;
            }
        }
        System.out.println("LongWord: " + output);
        System.out.println(" ");
        //Я пытался сделать через новый класс, я сделал метод в новом классе
        // а когда прописывал команду в main.java, то в одном писало что static не нужен, а когда убирал то писало что нужен :)

        // Book
        Book books = new Book();
        books.getyearOfPublishing();
        books.getAutors();
        books.getTitle();
        System.out.println("Title: " + books.getTitle());
        System.out.println("Autor: " + books.getAutors());
        System.out.println("Year of Publishing: " + books.getyearOfPublishing());
    }
}
