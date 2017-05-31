package day3;

public class Library {
		private Book[] books;
		
		
		public Book[] getBooks() {
			return books;
		}

		public void setBooks(Book[] books) {
			this.books = books;
		}
		
		
		
		Library(Book[] books){
			this.books=books;
		}

		public void printAvailableBooks(){
			for (Book x:books){
				if (x.isAvailable()){
					System.out.println(x.toString());
				}
			}
		}
		
		public void printBookDetails(String title){
			boolean beornot=false;
			for (Book x:books){
				if(x.getTitle().equals(title)){
					System.out.println(x.toString());
					beornot=true;
				}
			}
			if (!beornot){
				System.out.println("Sorry book not found");
			}
		}
		
		public void printBooksFromAuthor(String name){
			for (Book x:books){
				if(x.hasAuthor(name)){
					System.out.println(x.toString());
				}
			}
		}
		
		public void printTheMostPopularBook(){
			int max=0;
			Book maxBook = new Book("",new Author(),"000",10,10,10);
			for (Book x:books){
				if(x.getTimesRented()>max){
					max=x.getTimesRented();
					maxBook =x;
				}
			}
			System.out.println(maxBook.toString());
		}

}
