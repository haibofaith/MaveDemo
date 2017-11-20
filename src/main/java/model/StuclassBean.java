package model;

import java.util.List;

public class StuclassBean {
	private int idstuclass;
	private String stuclassname;
	private String stuclassdetail;
	private int idstudent;
	private List<StudentBean> students;
	
	
	public int getIdstudent() {
		return idstudent;
	}
	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}
	public List<StudentBean> getStudents() {
		return students;
	}
	public void setStudents(List<StudentBean> students) {
		this.students = students;
	}
	public int getIdstuclass() {
		return idstuclass;
	}
	public void setIdstuclass(int idstuclass) {
		this.idstuclass = idstuclass;
	}
	public String getStuclassname() {
		return stuclassname;
	}
	public void setStuclassname(String stuclassname) {
		this.stuclassname = stuclassname;
	}
	public String getStuclassdetail() {
		return stuclassdetail;
	}
	public void setStuclassdetail(String stuclassdetail) {
		this.stuclassdetail = stuclassdetail;
	}
	@Override
	public String toString() {
		return "StuclassBean [idstuclass=" + idstuclass + ", stuclassname=" + stuclassname + ", stuclassdetail="
				+ stuclassdetail + ", idstudent=" + idstudent + ", students=" + students + "]";
	}
	
	
	
}
