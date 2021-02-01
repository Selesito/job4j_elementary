package test.java.pojo;

public class Library {
    public static void main(String[] args) {
        Book java = new Book("Java", 879);
        Book clean = new Book("Clean code", 123);
        Book philosophy = new Book("Philosophy", 34);
        Book psychology = new Book("Psychology", 47);
        Book[] books = new Book[4];
        books[0] = java;
        books[1] = clean;
        books[2] = philosophy;
        books[3] = psychology;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPages());
        }
        System.out.println();
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " - " + books[i].getPages());
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " - " + books[i].getPages());
            }
        }

    }
}
