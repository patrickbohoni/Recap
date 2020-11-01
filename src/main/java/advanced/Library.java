package advanced;

import java.util.*;

public class Library {

    private Map<Genre, Set<Book>> bookShelf;


    public void initWithDefaultBooks() {
        bookShelf = new HashMap<Genre, Set<Book>>();
        Book drama1 = new Book("Scott Fitzgerald", "Great Gatsby", Genre.DRAMA, 2001);
        final Book horror1 = new Book("Mary Shelley", "Frankenstein", Genre.HORROR, 1897);
        Book scifi1 = new Book("Frank Herbert", "Dune", Genre.SCIFI, 1996);

        Set<Book> dramaSection = new HashSet<Book>();
        dramaSection.add(drama1);
        bookShelf.put(Genre.DRAMA, dramaSection);

        bookShelf.put(horror1.getGenre(), new HashSet<Book>() {{
            add(horror1);
        }});

        bookShelf.put(scifi1.getGenre(), new HashSet<Book>(Arrays.asList(scifi1)));
    }

    public Library() {
        initWithDefaultBooks();
    }

    public Map<Genre, Set<Book>> getBookShelf() {
        return bookShelf;
    }

    public void setBookShelf(Map<Genre, Set<Book>> bookShelf) {
        this.bookShelf = bookShelf;
    }

}
