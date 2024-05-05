import java.util.Scanner;
public class Person  {
    public Person() {
    }

    public Person(String firstName, String lastName, int idNumber, int[] testScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.testScore = testScore;
    }

    String firstName;
    String lastName;
    int idNumber;
    int scoreNumber=0;
    int testScore[] = new int[scoreNumber];
    char grade;


    public void print() {
        System.out.println("Name: " + lastName + ", " + firstName +
                "\n" + "ID: " + idNumber +
                "\n" + "Grade: " + grade);


    }

    public char calculate() {
        Scanner sc = new Scanner(System.in);
        firstName = sc.next();
        lastName = sc.next();
        idNumber=sc.nextInt();
        scoreNumber = sc.nextInt();
        int testScore[] = new int[scoreNumber];

        int sum=0;
        for (int i = 0; i <scoreNumber; i++) {
            testScore[i] = sc.nextInt();
           sum+=testScore[i];
        }

        int average = sum/ scoreNumber;

        char[] grades = {'O', 'E', 'A', 'P', 'D', 'T'};
        if ( 90<=average && average <= 100) {
            grade = grades[0];
        } else if (80 <= average && average <90) {
            grade = grades[1];
        } else if ( 70<=average && average < 80) {
            grade = grades[2];
        } else if ( 55<=average && average < 70) {
            grade = grades[3];
        } else if (40<=average && average < 55) {
            grade = grades[4];
        } else if(average<40){
            grade = grades[5];
        }
        print();
        sc.close();
        return grade;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.calculate();
    }


}
