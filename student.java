package Collections;

public class student implements Comparable {
    private String studentname;
    private int rollno;
    private int studentage;

    public student(int rollno, String studentname, int studentage) {
         this.rollno = rollno;
         this.studentname = studentname;
         this.studentage = studentage;
    }

    public String getStudentname() {
         return studentname;
    }
    public void setStudentname(String studentname) {
 this.studentname = studentname;
    }
    public int getRollno() {
 return rollno;
    }
    public void setRollno(int rollno) {
 this.rollno = rollno;
    }
    public int getStudentage() {
 return studentage;
    }
    public void setStudentage(int studentage) {
  this.studentage = studentage;

    }
    
    
    
    public int compareTo(student comparestu) {
        int compareage=((student)comparestu).getStudentage();
        /* For Ascending order*/
        return this.studentage-compareage;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }

    @Override
    public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}


