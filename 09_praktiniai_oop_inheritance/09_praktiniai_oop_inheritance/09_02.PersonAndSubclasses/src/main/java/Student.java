public class Student extends Person{

    private int studyCredits;

    public Student(String name, String address) {
        super(name, address);
    }

    public void study(){
        this.studyCredits++;
    }

    public int credits() {
        return studyCredits;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + this.studyCredits;
    }
}
