package org.example;

import java.util.*;

/**
 * This class contains several methods that operate on collections.
 */
public class Main {
    /**
     * Returns a list of student names.
     *
     * @return a list of student names
     */
    public static List<String> getStudentNamesList() {
        // TODO: return a list of student names (John, Jane, Alice, Bob)
        ArrayList<String> students = new ArrayList<String>();
        students.add("John");
        students.add("Jane");
        students.add("Alice");
        students.add("Bob");
        return new ArrayList<>(students);
    }

    /**
     * Converts a list of student names to a queue of student names.
     *
     * @return a queue of student names
     */
    public static List<String> getMStudents(List<String> students) {
        List<String> mStudents = new ArrayList<>();

        for(String student : students) {
            if(student.charAt(0) == 'M') {
                mStudents.add(student);
            }
        }

        return mStudents;
    }

    /**
     * Returns the first three items in a queue.
     *
     * @param queue the queue to get the first three items from
     * @return the first three items in the queue
     */
    public static List<String> getFirstThreeItems(Queue<String> queue) {
        List<String> firstThree = new ArrayList<>();

        // TODO: Poll the queue three times and add the items to firstThree



        for(int i = 0; i < 3; i++){
            firstThree.add(queue.poll());
        }
        // or this
        /*firstThree.add(queue.poll());
        firstThree.add(queue.poll());
        firstThree.add(queue.poll());*/

        return firstThree;
    }

    /**
     * Creates a set of student names from a list of student names.
     *
     * @return a set of student names
     */
    public static HashSet<String> makeSetFromList(List<String> students) {
        var set = new HashSet<String>();

        // TODO: Put all students into the set
        for(String student : students) {
            set.add(student);
        }

        return set;
    }

    /**
     * Checks if a set contains any of the given strings.
     *
     * @param haystack the set to check
     * @param needles the strings to look for
     * @return true if any of the strings are in the set, false otherwise
     */
    public static boolean checkIfHashSetContainsAny(Set<String> haystack, List<String> needles) {
        // TODO: Loop through all needles and return true if any of them are in the haystack
        for(String needle : needles) {
            if(haystack.contains(needle)) {
                return true;
            }
        }
        // Return false if none of the needles are in the haystack
        return false;
    }

    /**
     * Builds a map of student names to grades.
     *
     * @param grades a list of student grades in order
     * @param students a list of student names in order
     * @return a map of student names to grades
     */
    public static HashMap<String, Double> buildStudentGradesMap(List<String> students, List<Double> grades) {
        HashMap<String, Double> map = new HashMap<>();

        // TODO: Populate the map with students as keys and grades as values
        for(int i = 0; i < students.size(); i++) {
            map.put(students.get(i), grades.get(i));
            map.
        }

        return map;
    }
}