
import java.util.*;

/**
 * The type Student main.
 */
class StudentMain
{
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String args[])
    {
        /**
         Created ArrayList and add the students.
         */
        List<Student> studentArrayList = new ArrayList<Student>();
        String s = new String("Name");
        for(int i=1; i<=4000; i++)
        {
            s = s + String.valueOf(i);
            studentArrayList.add(new Student(s,i,i));
            s="Name";
        }

        /**
         Add one more student.
         */
        studentArrayList.add(new Student("Name4001",4001,4001));

        /**
         * Iterate the student ArrayList and print time taken to execute.
         */
        long startTime = System.currentTimeMillis();
        for(Student ss:studentArrayList)
        {
            System.out.println(ss.getName()+" "+ss.getAge()+" "+ss.getRollNo());
        }
        System.out.println("Time taken to iterate through ArrayList = "+(System.currentTimeMillis()-startTime));


        /**
         * Create student LinkedList and add student to LinkedList.
         */
        List<Student> studentLinkedList = new LinkedList<>();

        s = "name";
        for(int i=1; i<=4000; i++)
        {
            s = s + String.valueOf(i);
            studentLinkedList.add(new Student(s,i,i));
            s="name";
        }

        /**
         * Iterate through studentLinkedList and print time taken to print students from LinkedList.
         */
        startTime = System.currentTimeMillis();
        for(Student ss:studentLinkedList)
        {
            System.out.println(ss.getName()+" "+ss.getAge()+" "+ss.getRollNo());
        }
        System.out.println("Time taken to iterate through LinkedList = "+(System.currentTimeMillis()-startTime));


        /**
         * Create HashSet and add students to HashSet.
         */
        Set<Student> studentHashSet = new HashSet<>();
        s = "Nname";
        for(int i=1; i<=4000; i++)
        {
            s = s + String.valueOf(i);
            studentHashSet.add(new Student(s,i,i));
            s="Nname";
        }

        /**
         * Iterate through HashSet and print time taken to print student of HashSet.
         */
        startTime = System.currentTimeMillis();
        for(Student ss:studentHashSet)
        {
            System.out.println(ss.getName()+" "+ss.getAge()+" "+ss.getRollNo());
        }
        System.out.println("Time taken to iterate through HashSet = "+(System.currentTimeMillis()-startTime));
        System.out.println(studentHashSet.size());
    }
}