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

    //exercise b i.
    public void browseDrama() {
        Set booksOnShelf = bookShelf.get(Genre.DRAMA);
        System.out.println(booksOnShelf);
    }

    public void browseHorror() {
        Set booksOnShelf = bookShelf.get(Genre.HORROR);
        System.out.println(booksOnShelf);
    }

    public void browseScifi() {
        Set booksOnShelf = bookShelf.get(Genre.SCIFI);
        System.out.println(booksOnShelf);
    }

    //exercise b ii.
    public void browseShelves () {
        for(Genre key : bookShelf.keySet()) {
            System.out.println(key);
        }
    }

    //exercise biii.
    public void removeBook(String title, Genre genre) {
        Set<Book> booksOnShelf = bookShelf.get(genre);

        for (Iterator i = booksOnShelf.iterator(); i.hasNext();) {
            Book book = (Book) i.next();
            if (book.getTitle().equals(title)) {
                i.remove();
                break;
            }
        }


    }


}
