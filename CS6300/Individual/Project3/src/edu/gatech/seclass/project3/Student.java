package edu.gatech.seclass.project3;
import java.io.*;
import java.util.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*Task Card #1.1: 
Develop a Student class that holds the information about a student, such as name and GT ID.
*/

public class Student {

	private static String name = "Shevon Wise";
	private static int attendance = 98;
	private static int gtID = 901234512; // defined as an int in P3D2
	private static String team = "Team 2";
	
    static final String DB = "DB/CourseDatabase6300.xlsx";
    static final String DB_GOLDEN = "DB/CourseDatabase6300-golden.xlsx";
    
	// need to do stuff here to make objects pull from sheet 1
	// use getters/setters to add data from other sheets
	Student(String string, int i) {
		try {
			FileInputStream file = new FileInputStream(new File(DB));
			XSSFWorkbook workbook = new XSSFWorkbook (file);
			XSSFSheet sheet = workbook.getSheetAt(0); 
			//Iterate through each rows from first sheet
		    Iterator<Row> rowIterator = sheet.iterator();
		    while(rowIterator.hasNext()) {
		        Row row = rowIterator.next();
		        // these are rows, so new Student on each line
		     //   Student student = new Student();
		        //For each row, iterate through each columns
		        Iterator<Cell> cellIterator = row.cellIterator();
		        while(cellIterator.hasNext()) {
		        	// these are cells in the rows, so attributes of the student
		            Cell cell = cellIterator.next();
		           // student.setName(cell.getStringCellValue());
		           // student.setgtID(cell.getStringCellValue());
		           // student.setEmail(cell.getStringCellValue());
  
		           // add all attributes, then add to hashset of students
		        }
		    }
		    file.close();
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return Student.name;
	}
	
	public void setName(String nameIn) {
		Student.name = nameIn;
	}

	public int getGtid() {
		return Student.gtID;
	}
	
	public void setGtid(int gtIDin) {
		Student.gtID = gtIDin;
	}

	public int getAttendance() {
		return Student.attendance;
	}

	public String getTeam() {
		return Student.team;	
	}
	
	public void setTeam(String teamIn) {
		Student.team = teamIn;
	}
	
	public void setAttendance(int attendanceIn) {
		Student.attendance = attendanceIn;
	}
}