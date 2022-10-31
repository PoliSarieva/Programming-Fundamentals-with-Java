package P02Articles;

public class Article {
    //полета-характеристики
    private String title;
    private String content;
    private String author;

    //конструктор - създ.ножи обекти
     public Article(String title, String content, String author) {
         this.title = title;
         this.content = content;
         this.author = author;
     }

     //методи - поведение
    public void edit (String newContent){
         this.content = newContent;
    }

    public void changeAuthor (String newAuthor) {
         this.author = newAuthor;
    }

    public void rename (String newTitle) {
         this.title = newTitle;
    }

    @Override
    public String toString () {
         return String.format("%s - %s: %s",this.title, this.content, this.author);
    }
}
