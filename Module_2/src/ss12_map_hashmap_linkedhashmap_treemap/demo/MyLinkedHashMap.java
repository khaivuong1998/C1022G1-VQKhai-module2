package ss12_map_hashmap_linkedhashmap_treemap.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        Map<Student, String> myMap = new LinkedHashMap<>();
        Student student1 = new Student(1, "hung");
        Student student2 = new Student(6, "ngoc");
        Student student3 = new Student(5, "duong");
        Student student4 = new Student(3, "tam");
        Student student5 = new Student(16, "cuong");
        myMap.put(student2, "khá");
        myMap.put(student3, "giỏi");
        myMap.put(student4, "tb");
        myMap.put(student5, "khá");
        myMap.put(student1, "yếu");
        myMap.put(null, "yếu");
//        myMap.put(null, "hoa");
        //Duyệt map bằng keySet()//
//        for (Student key: myMap.keySet()){
//            System.out.println(key + " - " + myMap.get(key));
//        }
        //Duyệt map bằng entrySer()//
        for (Map.Entry<Student, String> entry: myMap.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
