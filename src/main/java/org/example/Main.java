package org.example;


import com.hospital.exceptions.AddDivisionException;

import java.util.*;

public class Main {
    public static void main(String[] args) throws AddDivisionException {

//        Map<Long , Employee> listEmployees = new HashMap<>();
//        IDivision testDivision = new DivisionImpl(1l);
//        IDepartment testDepartment = new DepartmentImpl("Test_1","test dept" );
//        Employee emp1 = new Employee(12345l,"Employee 1");
//        listEmployees.put(emp1.getId(), emp1);
//
//
//        IDivision subdivision = new DivisionImpl(2l, "Test subdivision 1", testDepartment);
//        ((DivisionImpl) testDivision).setDivisionName("Test division");
//        testDivision.addSubdivision(subdivision );
//        System.out.println("""
//                %s
//                %s
//                """.formatted(testDivision.toString(), subdivision.toString()));
        Map<String, Object> map = new LinkedHashMap<>();
        Queue arrayDeque = new ArrayDeque();
        Queue priorityQueue = new PriorityQueue();
        Map<Integer, Character> hashMap = new HashMap<>();
        Map<Integer, Character> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, Character> treeMap = new TreeMap<>();
        Random random = new Random();
        Set linkedHashSet = new LinkedHashSet();
        Set treeSet = new TreeSet();
        Set hashSet = new HashSet();
//        try {
            linkedHashSet.add(random.nextInt()); linkedHashSet.add(0); linkedHashSet.add(random.nextInt()); linkedHashSet.add(0);
            treeSet.add(random.nextInt()); treeSet.add(0); treeSet.add(random.nextInt()); treeSet.add(0);
            hashSet.add(random.nextInt()); hashSet.add(0); hashSet.add(random.nextInt()); hashSet.add(0);
            arrayDeque.add(random.nextInt());  arrayDeque.add(0);  arrayDeque.add(random.nextInt());
            priorityQueue.add(random.nextInt()); priorityQueue.add(0); priorityQueue.add(random.nextInt());
            treeMap.put(5 , (char) (random.nextInt(26)+'a')); treeMap.put(3, (char) (random.nextInt(26)+'a')); treeMap.put(1,(char) (random.nextInt(26)+'a')); treeMap.put(4,(char) (random.nextInt(26)+'a'));
            linkedHashMap.put(5 , (char) (random.nextInt(26)+'a')); linkedHashMap.put(3, (char) (random.nextInt(26)+'a')); linkedHashMap.put(1,(char) (random.nextInt(26)+'a')); linkedHashMap.put(4,(char) (random.nextInt(26)+'a'));
            hashMap.put(5 , (char) (random.nextInt(26)+'a')); hashMap.put(3, (char) (random.nextInt(26)+'a')); hashMap.put(1,(char) (random.nextInt(26)+'a')); hashMap.put(4,(char) (random.nextInt(26)+'a'));
            System.out.println("""
                Array Dequeue :  // Ordre d'insertion
                \t\t%b\t\t%s
                Priority Queue : //Ordre naturel*
                \t\t%b\t\t%s                
                Hash Map : //Pas de classement / Ordre naturel des clés 
                \t\t%c\t\t%s
                Linked Hash Map : // Ordre d'insertion
                \t\t%c\t\t%s
                Tree Map : // Ordre naturel des clés
                \t\t%c\t\t%s         
                Hash Set : //Pas d'index / Ordre aléatoire
                \t\t%s\t\t%s
                Linked Hash Set : // Indexé + Ordre d'insertion
                \t\t%s\t\t%s
                Tree Set : // Pas d'index + Ordre naturel
                \t\t%s\t\t%s
                """.formatted(arrayDeque.offer("Object Offer"), arrayDeque, priorityQueue.offer(99),priorityQueue, hashMap.get(5),hashMap,
                             linkedHashMap.get(4),linkedHashMap,treeMap.get(3), treeMap, hashSet,"Rien à tester sur Hash Set", linkedHashSet,"Rien à tester sur Linked Hash Set",
                    treeSet, "Rien à tester sur Linked Hash Set")) ;
//        } catch (Exception ex) {
//            System.out.println("""
//                    %s
//                    --------------------------
//                    %s
//                    --------------------------
//                    %s
//                    """.formatted(ex.getMessage(), ex.getCause(),ex.getStackTrace().toString()));

//        }

    }
}