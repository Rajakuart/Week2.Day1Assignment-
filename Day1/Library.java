package HomeWorkWeek2.Day1;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println(bookTitle+" "+"Book added successfully");
		return bookTitle;
	}
	public void issueBook() {
		System.out.println("Book issued successfully");

		
	}
	public static void main(String[] args) {
		Library book =new Library();
		book.addBook("My Last Love");
		book.issueBook();
		}
	}
		
		
