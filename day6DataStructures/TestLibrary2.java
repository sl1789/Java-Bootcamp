package day6DataStructures;

public class TestLibrary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** Create Random authors */
        Author2 ruth = new Author2("Ruth");
        Author2 diane = new Author2("Diane");
        Author2 jacqueline = new Author2("Jacqueline");
        Author2 rachel = new Author2("Rachel");
        Author2 joan = new Author2("Joan");
        Author2 theresa = new Author2("Theresa");
        Author2 angela = new Author2("Angela");
        Author2 helen = new Author2("Helen");
        Author2 lisa = new Author2("Lisa");

    /** Create books with from the existing authors */
    Book2 book1 = new Book2("Book1",new Author2[]{ruth, joan},"368777540-2",10,2,20);
    Book2 book2 = new Book2("Book2",new Author2[]{ruth},"963099898-2",10,1,22);
    Book2 book3 = new Book2("Book3",new Author2[]{jacqueline, rachel},"005382097-2",10,0,23);
    Book2 book4 = new Book2("Book4",new Author2[]{theresa, angela},"538310208-2",10,3,24);
    Book2 book5 = new Book2("Book5",new Author2[]{lisa},"562448132-2",10,4,26);
    Book2 book6 = new Book2("Book6",new Author2[]{helen},"670364563-2",10,2,21);
    Book2 book7 = new Book2("Book7",new Author2[]{diane, jacqueline},"466916869-2",10,5,17);
    Book2 book8 = new Book2("Book8",new Author2[]{angela, rachel},"764674973-2",10,0,15);
    Book2 book9 = new Book2("Book9",new Author2[]{theresa, jacqueline},"052469721-2",10,6,17);
    Book2 book10 = new Book2("Book10",new Author2[]{angela},"609291817-2",10,3,13);
    Book2 book11 = new Book2("Book11",new Author2[]{lisa, ruth},"451378028-2",10,8,12);
    Book2 book12 = new Book2("Book12",new Author2[]{theresa},"142352773-2",10,6,20);
    Book2 book13 = new Book2("Book13",new Author2[]{lisa, rachel},"115135166-2",10,0,20);
    Book2 book14 = new Book2("Book14",new Author2[]{helen},"631942468-2",10,3,20);
    Book2 book15 = new Book2("Book15",new Author2[]{angela, helen},"323662444-2",10,0,23);
    Book2 book16 = new Book2("Book16",new Author2[]{rachel},"121360492-2",10,0,12);
    Book2 book17 = new Book2("Book17",new Author2[]{theresa, jacqueline, angela},"391199302-2",10,0,20);
    Book2 book18 = new Book2("Book18",new Author2[]{angela,lisa},"549307784-2",10,1,20);
    Book2 book19 = new Book2("Book19",new Author2[]{theresa, helen},"368777230-2",10,23,20);
    Book2 book20 = new Book2("Book20",new Author2[]{ruth},"793027213-2",10,0,20);

    /** Create the BookList from the books array above **/
    BookList books = new BookList( new Book2[]{book1,book2,book3,book4,book5,book6,book7,
            book8,book9,book10,book11,book12,book13,book14,book15,
            book16,book17,book18,book19,book20} );
    
    /** Assign the book collection to the library */
    Library2 library = new Library2(books);
    /* A librarian undertakes the operation of the library */
    Librarian2 librarian = new Librarian2(library);
    //librarian.findMeAvailableBooks();
    //librarian.findMeBook("Book3");//works
    //librarian.findMeBooksFromAuthor("Ruth");// works
    //librarian.findMostPopularBook();// works
    
    librarian.rentPhysicalCopy("Book1");//works
    
    librarian.rentPhysicalCopy("Book2");
    librarian.printAllPending();//works
    //librarian.rentPhysicalCopy("Book2"); // no available copies left
    
    librarian.executePendingTransactions();
    librarian.executePendingTransactions();//works. problem in remove of arraylist
    librarian.printTransactionHistory();


	}

}
