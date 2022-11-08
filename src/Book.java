public class Book implements Comparable<Book>{
    private String bookName;
    private Integer pageNumber;
    private String writerName;
    private Integer releaseDate;

    public Book(String bookName, Integer pageNumber, String writerName, Integer releaseDate) {
        this.bookName = bookName;
        this.pageNumber = pageNumber;
        this.writerName = writerName;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book o1) {
        return getBookName().compareTo(o1.getBookName());
    }

}
