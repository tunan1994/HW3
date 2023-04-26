import java.util.Comparator;

class SurNameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.surName.compareTo(o2.surName);
    }

}