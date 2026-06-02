public class Main {
    public static void main(String[] args) {

        Result result = new Result();

        // Creating 3 student objects
        Student s1 = new Student("Rahul Sharma", 101, 85, 90, 78);
        Student s2 = new Student("Priya Patil", 102, 30, 88, 72);  // will FAIL math
        Student s3 = new Student("Amit Singh", 103, 45, 50, 40);

        // Display results
        result.displayResult(s1);
        result.displayResult(s2);
        result.displayResult(s3);
    }
}