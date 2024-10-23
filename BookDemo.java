import java.util.Scanner;

class Book {
    String name, author;
    int num_pages;
    double price;

    void setDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Author: ");
        this.author = sc.nextLine();
        System.out.print("Enter Pages: ");
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid number for pages: ");
            sc.next();
        }
        this.num_pages = sc.nextInt();
        System.out.print("Enter Price: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Please enter a valid number for price: ");
            sc.next();
        }
        this.price = sc.nextDouble();
        sc.nextLine();      }

    void getDetails() {
        System.out.println(this);
    }

    public String toString() {
        return "Name: " + name + "\nAuthor: " + author + "\nPages: " + num_pages + "\nPrice: " + price;
    }
}

class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        while (!sc.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        int bookNum = sc.nextInt();
        sc.nextLine(); 

        Book[] bookArray = new Book[bookNum];

        for (int i = 0; i < bookNum; i++) {
            bookArray[i] = new Book();
            bookArray[i].setDetails();
            System.out.println();
        }

        for (int i = 0; i < bookNum; i++) {
            bookArray[i].getDetails();
            System.out.println();
	    System.out.println("AYAAN SHRESTHA, 1BM23CS056");	
        }

       
    }
}
