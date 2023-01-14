/*Есть класс Book. У него есть три поля: поле String title, поле int yearOfPublishing и массив строк authors.
        Напишите геттеры и сеттеры для всех полей.*/
    public class Book {
    String title;
    int yearOfPublishing;
    String[] autors;
    public Book(String title, int yearOfPublishing, String[] autors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.autors = autors;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
    public void setyearOfPublishing(int yearOfPublishing){
        this.yearOfPublishing = yearOfPublishing;
    }
    public int getyearOfPublishing() {
        return this.yearOfPublishing;
    }
    public void setAutors(String[] autors){
        this.autors = autors;
    }
    public String[] getAutors() {
        return this.autors;
    }
}
// не понял что старое, а что новое поэтому оставлю то чего не было в списке
/*Есть класс Book. У него есть три поля: поле String title, поле int yearOfPublishing и массив строк authors.
        Напишите геттеры и сеттеры для всех полей.
    public class Book {
    String title = "Shrek";
    int yearOfPublishing = 1990;
    String autors = "William Steig";
    public Book() {
    String title;
    int yearOfPublishing;
    String[] autors;
    public Book(String title, int yearOfPublishing, String[] autors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.autors = autors;
@@ -21,10 +21,10 @@ public void setyearOfPublishing(int yearOfPublishing){
    public int getyearOfPublishing() {
        return this.yearOfPublishing;
    }
    public void setAutors(String autors){
    public void setAutors(String[] autors){
        this.autors = autors;
    }
    public String getAutors() {
    public String[] getAutors() {
        return this.autors;
    }
}*/
