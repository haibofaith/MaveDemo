package model;

import java.util.List;

public class BookBean {
	private int  idbook;
	private String bookname; 
	private String bookwriter; 
	private List<BookDetailBean> bookdetails;
	
	
	public int getIdbook() {
		return idbook;
	}
	public void setIdbook(int idbook) {
		this.idbook = idbook;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookwriter() {
		return bookwriter;
	}
	public void setBookwriter(String bookwriter) {
		this.bookwriter = bookwriter;
	}
	public List<BookDetailBean> getBookdetails() {
		return bookdetails;
	}
	public void setBookdetails(List<BookDetailBean> bookdetails) {
		this.bookdetails = bookdetails;
	}
	@Override
	public String toString() {
		return "BookBean [idbook=" + idbook + ", bookname=" + bookname + ", bookwriter=" + bookwriter + ", bookdetails="
				+ bookdetails + "]";
	}		
}
