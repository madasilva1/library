public class Book {
    private String title ;
    private String author;
    private boolean isBorowed;

    public Book(){

        this.title = title;
        this.author = author;

    }
    public void borowed(){

        isBorowed = true;
    }
    public  void isReturned(){
        isBorowed = false;

    }
    public boolean isBookBorowed(){

        return isBorowed;
    }

}
