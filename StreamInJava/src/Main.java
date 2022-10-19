import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();

        books.stream().filter(book -> {
            return book.getAuthor().startsWith("O");
        }).forEach(System.out::println);
    }

    public static ArrayList<Book> populateLibrary(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Julio verne","20000 leguas de viaje submarino" ));
        books.add(new Book("Dovtoyeski","lolita" ));
        books.add(new Book("Benito Perez galdos","Marianela" ));
        books.add(new Book("Camilo Jose Cela","La escalera" ));
        books.add(new Book("Terry Pratchett","Mort" ));
        books.add(new Book("JRR Tolkien","Lord of the rings" ));
        books.add(new Book("Wilt","Tom Sharep" ));
        books.add(new Book("Stanislaw Lem","Civeriada" ));
        books.add(new Book("Julio verne","Otro1" ));
        books.add(new Book("Julio verne","Otro2" ));
        books.add(new Book("Julio verne","Otro3" ));
        books.add(new Book("Julio verne","Otro4" ));
        books.add(new Book("Julio verne","Otro5" ));
        books.add(new Book("Julio verne","Otro6" ));
        books.add(new Book("Julio verne","Otro7" ));
        books.add(new Book("Julio verne","2Otro2" ));
        books.add(new Book("Julio verne","Otro8" ));
        books.add(new Book("Julio verne","Otro9" ));
        return books;
    }
}