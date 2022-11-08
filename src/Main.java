import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> bookSort=new TreeSet<>();
        bookSort.add(new Book("A",100,"Aaa",2000));
        bookSort.add(new Book("C",98,"Ccc",1999));
        bookSort.add(new Book("D",102,"dd",2008));
        bookSort.add(new Book("B",190,"BBb",2020));
        bookSort.add(new Book("E",170,"eEe",1980));
        for (Book b:bookSort) {
            System.out.println(b.getBookName());
        }
        TreeSet<Book> bookSort2=new TreeSet<>(new Comparator<Book>() {
            //SortByPageNumber
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber().compareTo(o2.getPageNumber());
            }
        });
        System.out.println("========");
        bookSort2.addAll(bookSort);
        for (Book c:bookSort2) {
            System.out.println(c.getBookName());
        }
    }
}
