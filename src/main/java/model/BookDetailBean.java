package model;

public class BookDetailBean {
	private int idbookdetail;
	private int idreal;
	private String bookcontent;
	
	public int getIdreal() {
		return idreal;
	}
	public void setIdreal(int idreal) {
		this.idreal = idreal;
	}
	public void setIdbookdetail(int idbookdetail) {
		this.idbookdetail = idbookdetail;
	}
	
	public String getBookcontent() {
		return bookcontent;
	}
	public void setBookcontent(String bookcontent) {
		this.bookcontent = bookcontent;
	}
	@Override
	public String toString() {
		return "BookDetailBean [idbookdetail=" + idbookdetail + ", idreal=" + idreal + ", bookcontent=" + bookcontent
				+ "]";
	}
}
