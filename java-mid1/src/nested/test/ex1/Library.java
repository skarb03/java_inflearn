package nested.test.ex1;

public class Library {

    private Book[] books;
    private int number;

    public Library(int n) {
        books = new Book[n];
    }

    public void addBook(String author, String title) {
        if(number >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        books[number++] = new Book(author, title);
    }

    public void showBooks(){
        System.out.println("== 책 제목 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }

   private static class Book {
        private String author;
        private String title;

        public Book(String author, String title){
            this.author = author;
            this.title = title;
        }
    }
}
