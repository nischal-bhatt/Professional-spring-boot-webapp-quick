package professional.stuff.nischal.bhatt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import professional.stuff.nischal.bhatt.domain.Book;
import professional.stuff.nischal.bhatt.repositories.BookRepository;

@Controller
public class BookController {

	private final BookRepository bookRepository;
	
	
	
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}



	@RequestMapping("/books")
	 public String getBooks(Model model)
	 {
		 model.addAttribute("books",this.bookRepository.findAll());
		 //model.addAttribute("books", this.bookRepository.findById(Integer.toUnsignedLong(2)));
		 System.out.println("inside request mapping for book");
		 
		 return "books/list";
	 }
}
