package com.oop.sorting.comparable.program;

public class Student implements Comparable<Student>
{
	private static final int STUDENT_ID_DIGIT = 6;

	private static int DEFAULT_STUDENT_ID = 100000;

	private int studentID;
	public String firstName;
	public String lastName;
	public int termGrade;


	public Student(int studentID, String firstName, String lastName, int termGrade)
	{
		super();
		setStudentID(studentID);
		this.firstName = firstName;
		this.lastName = lastName;
		this.termGrade = termGrade;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID)
	{
		if(studentID < 0)
		{
			System.out.println("\nStudent ID can not be negative.");

			if(this.studentID == 0)
			{
				this.studentID = DEFAULT_STUDENT_ID++;
			}

		}
		else
		{
			if( String.valueOf(studentID).length() != STUDENT_ID_DIGIT )
			{
				System.out.println("\nStudent ID must have " + STUDENT_ID_DIGIT + " digits.");

				if(this.studentID == 0)
				{
					this.studentID = DEFAULT_STUDENT_ID++;
				}
			}
			else
			{
				this.studentID = studentID;
			}
		}
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", termGrade=" + termGrade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentID != other.studentID)
			return false;
		return true;
	}




	@Override
	public int compareTo(Student student)
	{
		if (termGrade > student.termGrade)
		{
			return -1;
		}
		else if (termGrade < student.termGrade)
		{
			return 1;
		}
		else
		{
			return firstName.compareTo(student.firstName) == 0
					? lastName.compareTo(student.lastName)
					: firstName.compareTo(student.firstName);
		}
	}
}