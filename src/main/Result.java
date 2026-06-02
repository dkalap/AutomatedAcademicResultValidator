public class Result {

    // Calculate total marks
    public int calculateTotal(Student s) {
        return s.mathMarks + s.scienceMarks + s.englishMarks;
    }

    // Calculate percentage
    public double calculatePercentage(Student s) {
        int total = calculateTotal(s);
        return (total / 300.0) * 100;
    }

    // Decide pass or fail (passing = 35 in each subject)
    public String getStatus(Student s) {
        if (s.mathMarks >= 35 && s.scienceMarks >= 35 && s.englishMarks >= 35) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    // Get grade based on percentage
    public String getGrade(Student s) {
        double percentage = calculatePercentage(s);
        if (percentage >= 90) return "A+";
        else if (percentage >= 75) return "A";
        else if (percentage >= 60) return "B";
        else if (percentage >= 45) return "C";
        else return "D";
    }

    // Print full result
    public void displayResult(Student s) {
        System.out.println("==============================");
        System.out.println("Student Name  : " + s.name);
        System.out.println("Roll No       : " + s.rollNo);
        System.out.println("Math Marks    : " + s.mathMarks);
        System.out.println("Science Marks : " + s.scienceMarks);
        System.out.println("English Marks : " + s.englishMarks);
        System.out.println("Total         : " + calculateTotal(s) + " / 300");
        System.out.println("Percentage    : " + calculatePercentage(s) + "%");
        System.out.println("Grade         : " + getGrade(s));
        System.out.println("Status        : " + getStatus(s));
        System.out.println("==============================");
    }
}