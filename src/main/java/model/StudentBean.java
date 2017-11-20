package model;

import java.util.List;

public class StudentBean {
	private int idstudent;
	private String studentname;
	private List<StuclassBean> clazzs;
	
	public List<StuclassBean> getClazzs() {
		return clazzs;
	}
	public void setClazzs(List<StuclassBean> clazzs) {
		this.clazzs = clazzs;
	}
	public int getIdstudent() {
		return idstudent;
	}
	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	@Override
	public String toString() {
		return "StudentBean [idstudent=" + idstudent + ", studentname=" + studentname + ", clazzs=" + clazzs + "]";
	}	
}
