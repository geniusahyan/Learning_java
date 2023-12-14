import java.util.*;

class Book{
    int book_id;
    String title, author, publisher;
    int quantity;

    public Book(int id,String t, String a, String pub, int q){
        this.book_id = id;
        this.title = t;
        this.author = a;
        this.publisher = pub;
        this.quantity = q;
    }

    public String toString(){
        return book_id + "-->" + title + "-->" + author + "-->" + publisher + "-->" + quantity + "\n";
    }
    public boolean equals(Object O){
        return (this.book_id == ((Book)O).book_id);
    }
    public int hashCode(){
        return book_id;
    }
}

class SetD{
    public static void main(String[] args){
        // HashSet<Book> liberary = new HashSet<Book>();
        LinkedHashSet<Book> liberary = new LinkedHashSet<Book>();
        Book b1 = new Book(01,"Let us C", "Yashwant Kanetkar", "BPB", 100);
        Book b2 = new Book(02,"The class of Java", "Pravin Jain", "Oxford", 500);
        Book b3 = new Book(03,"Concepts of OOP", "Bhushan Trivedi", "Wiley", 300);

        // add to set
        liberary.add(b1);
        liberary.add(b2);
        liberary.add(b3);
        
        for (Book b:liberary){
            System.out.println(b);
        }
        Book b4 = new Book(03,"Concepts of OOP", "Bhushan Trivedi", "Wiley", 300);
        liberary.add(b4);
        liberary.add(b3);

        Iterator<Book> iter = liberary.iterator();
        while (iter.hasNext()) {
            Book b = iter.next();
            System.out.println(b);
        }

        HashSet<Integer> fewNumbers = new HashSet<Integer>();
        fewNumbers.add(20);
        fewNumbers.add(30);
        fewNumbers.add(40);
        fewNumbers.add(40);
        
        for(int no:fewNumbers){
            System.out.println(no);
        }
    }
}