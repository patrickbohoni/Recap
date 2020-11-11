package advanced;

public class LibraryTestRun {

    public static void main(String[] args) {

        Library luceafarul = new Library();

        System.out.println(luceafarul.getBookShelf());
        System.out.println(" \n");

        //exercise b i.
        System.out.println(luceafarul.browseByGenre(Genre.DRAMA));

        //exercise b ii.
        System.out.println(" \n");
        System.out.println(luceafarul.browseShelves());

        //exercise b iii.
        System.out.println(" \n");
        luceafarul.removeBook("Dune",Genre.SCIFI);



    }

}
