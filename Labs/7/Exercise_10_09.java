
public class Exercise_10_09
{
	public static void main(String[] args)
	{
		Course10_09 math101 = new Course10_09("math101");

		math101.addStudent("Joey");
		math101.addStudent("John");
		math101.addStudent("Eric");

		math101.dropStudent("John");

		System.out.println("The students in the course " + math101.getCourseName() + " :: ");
		String[] students = math101.getStudents();
		for (int i = 0; i < math101.getNumberOfStudents(); i++)
		{
			System.out.print(students[i] + " ");
		}
		System.out.println();
	}
}