package ss12_map_hashmap_linkedhashmap_treemap.demo;

import java.util.Comparator;

public class StudentSortById implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}
