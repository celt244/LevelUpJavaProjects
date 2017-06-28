package ua.dp.levelup.list;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class UtilTest {

    @Test
    public void testArraysCopyof () {
        String[] arr = {"a", "b", "c"};
        String[] arr2 = Arrays.copyOf(arr, arr.length);

        System.out.println(Arrays.binarySearch(arr, "d"));
        System.out.println(Arrays.binarySearch(arr, "b"));

        assertTrue(Arrays.equals(arr, arr2));

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testArraysAsList() {
        String[] arr = {"a", "b", "c"};

        List<String> list = new ArrayList<>();
        for (String s : arr) list.add(s);

        List<String> list2 = Arrays.asList("f", "g", "h", "c");
        System.out.println(list2.size());

        Collections.copy(list2, list);
        list2.forEach(System.out::println);
    }

    @Test
    public void testHashSet(){
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(4);
        integerSet.add(3);
        integerSet.add(1);
        integerSet.add(2);

        System.out.println(integerSet.toString());

        Set<String> hash = new HashSet<>();
        hash.add("castle");
        hash.add("bridge");
        hash.add("castle");
        hash.add("moat");

        System.out.println(hash);

        int id = 525;
                                        //HashSet
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student(id + 4, "Bill", 24));
        students.add(new Student(id + 1, "Sam", 22));
        students.add(new Student(id + 3, "Tom", 22));
        students.add(new Student(id + 1, "Sam", 22));
        students.add(new Student(id + 3, "Sam", 22));
        students.add(new Student(id + 2, "Bob", 22));

        System.out.println(students.size());

        System.out.println(students);

        Set<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student(1,"Sem",22));
        treeSet.add(new Student(2,"Bob",22));
        treeSet.add(new Student(3,"Tom",22));
        treeSet.add(new Student(1,"Sem",22));
        treeSet.add(new Student(4,"Bill",24));
        treeSet.add(new Student(3,"Sem",22));

        System.out.println(treeSet.size());
        System.out.println(treeSet);

    }

    private Comparator<Student> filterByAge() {

    }
}
