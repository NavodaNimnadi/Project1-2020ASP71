public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye", "B001", "J.D. Salinger", 240);
        Book book2 = new Book("To Kill a Mockingbird", "B002", "Harper Lee", 281);
        Book book3 = new Book("1984", "B003", "George Orwell", 328);
        Book book4 = new Book("Pride and Prejudice", "B004", "Jane Austen", 432);
        Book book5 = new Book("The Hobbit ","B005"," J.R.R. Tolkien", 320);
		 
		book1.displayItemDetails();
		book1.displayItemDetail1();
		
		book2.displayItemDetails();
		book2.displayItemDetail1();
		
		book3.displayItemDetails();
		book3.displayItemDetail1();
		
		book4.displayItemDetails();
		book4.displayItemDetail1();
		
		book5.displayItemDetails();
		book5.displayItemDetail1();
		
		
		Magazine m1 = new Magazine("National Geographic"," M001"," August 2023"," National Geographic Society");
		Magazine m2 = new Magazine("Time ","M002"," September 2023"," Time USA, LLC");
		Magazine m3 = new Magazine("Forbes"," M003"," June 2023"," Forbes Media");
		Magazine m4 = new Magazine("Vogue"," M004"," July 2023"," Condé Nast");
		Magazine m5 = new Magazine("Sports Illustrated","M005"," July 2023"," Maven Coalition");
	
	    m1.displayItemDetails();
		m1.displayItemDetail2();
		
		m2.displayItemDetails();
		m2.displayItemDetail2();
		
		m3.displayItemDetails();
		m3.displayItemDetail2();
		
		m4.displayItemDetails();
		m4.displayItemDetail2();
		
		m5.displayItemDetails();
		m5.displayItemDetail2();
		
		 LibraryMember lm1 =new  LibraryMember("L001 ","John Doe");
		 LibraryMember lm2 =new  LibraryMember("L002"," Jane Smith");
		 LibraryMember lm3 =new  LibraryMember("L003"," David Johnson");
		 LibraryMember lm4 =new  LibraryMember("L003"," David Johnson");
		 LibraryMember lm5 =new  LibraryMember("L005"," Michael Brown");
		 
		 lm1.displayMemberDetails();
		 lm2.displayMemberDetails();
		 lm3.displayMemberDetails();
		 lm4.displayMemberDetails();
		 lm5.displayMemberDetails();
		}
	}