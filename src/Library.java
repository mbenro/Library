public class Library {
    public static void main(String[] args) {
        Author Author01 = new Author("Charles Dickens", "charles@gmail.com", 'm');
        Book Book01 = new Book("Oliver Twist", Author01, 10.99, 5 );
        System.out.println(Book01);

        
    }
}
