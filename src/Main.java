public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.isBookBorowed();
        boolean resulted = book.isBookBorowed();


        searchCostumer mysearchCostumer;
        mysearchCostumer = new searchCostumer();

        String you = mysearchCostumer.searchCostumer();
        System.out.println("Costumer name is:" + you + " ");
    }
}
