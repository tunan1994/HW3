import java.util.Comparator;

class AgeComparator implements Comparator<Employee>{

    // 1 0 -1
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
