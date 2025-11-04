package model;

public class KLTN<T, V> implements Comparable<KLTN<T, V>> {
    private String thesisName;
    private T student;
    private V supervisor;

    public KLTN(String thesisName, T student, V supervisor) {
        this.thesisName = thesisName;
        this.student = student;
        this.supervisor = supervisor;
    }

    public String getThesisName() {
        return thesisName;
    }

    public T getStudent() {
        return student;
    }

    public V getSupervisor() {
        return supervisor;
    }

    @Override
    public int compareTo(KLTN<T, V> o) {
        return this.thesisName.compareToIgnoreCase(o.thesisName);
    }

    @Override
    public String toString() {
        return "Thesis: \"" + thesisName + "\"\n  " + student + "\n  " + supervisor + "\n";
    }
}
