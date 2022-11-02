
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
        List<Student> studentArrayList = new ArrayList<>();
        String stringObject = "Name";
        for(int i=1; i<=4000; i++)
        {
            //stringObject.concat(String.valueOf(i));
            //stringObject = stringObject + i;
            studentArrayList.add(new Student(stringObject.concat(String.valueOf(i)),i,i));
            stringObject="Name";
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
        long arrayListTimeTaken = (System.currentTimeMillis()-startTime);
        System.out.println("Time taken to iterate through ArrayList = "+arrayListTimeTaken);


        /**
         * Create student LinkedList and add student to LinkedList.
         */
        List<Student> studentLinkedList = new LinkedList<>();

        stringObject = "Link";
        for(int i=1; i<=4000; i++)
        {
            //stringObject.concat(String.valueOf(i));
            //stringObject = stringObject + i;
            studentLinkedList.add(new Student(stringObject.concat(String.valueOf(i)),i,i));
            stringObject="Link";
        }

        /**
         * Iterate through studentLinkedList and print time taken to print students from LinkedList.
         */
        startTime = System.currentTimeMillis();
        for(Student ss:studentLinkedList)
        {
            System.out.println(ss.getName()+" "+ss.getAge()+" "+ss.getRollNo());
        }
        long linkedListTimeTaken = (System.currentTimeMillis()-startTime);
        System.out.println("Time taken to iterate through LinkedList = "+linkedListTimeTaken);


        /**
         * Create HashSet and add students to HashSet.
         */
        Set<Student> studentHashSet = new HashSet<>();
        stringObject = "Hash";
        for(int i=1; i<=4000; i++)
        {
            //stringObject.concat(String.valueOf(i));
            //stringObject = stringObject + i;
            studentHashSet.add(new Student(stringObject.concat(String.valueOf(i)),i,i));
            stringObject="Hash";
        }

        /**
         * Iterate through HashSet and print time taken to print student of HashSet.
         */
        startTime = System.currentTimeMillis();
        for(Student ss:studentHashSet)
        {
            System.out.println(ss.getName()+" "+ss.getAge()+" "+ss.getRollNo());
        }
        long hashSetTimeTaken = (System.currentTimeMillis()-startTime);
        System.out.println("Time taken to iterate through HashSet = "+hashSetTimeTaken);


        /**
         * Time taken for each ArrayList, LinkedList and HashSet
         */
        System.out.println("Time taken to iterate through ArrayList = "+arrayListTimeTaken);
        System.out.println("Time taken to iterate through LinkedList = "+linkedListTimeTaken);
        //System.out.println("Time taken to iterate through HashSet = "+hashSetTimeTaken);
    }
}