package com.maxim;

import java.util.*;

public class JavaCollectionsExercisesStubs {

    public static void main(String[] args) {
        // You can call your exercise methods here to test them
        // Example:
        // exercise1_CreateArrayList();
        // exercise33_ArrayListOfCustomObjects();
        // exercise98_TwoSumProblem(new int[]{2, 7, 11, 15}, 9);
    }

    // Sets (HashSet & TreeSet)
    public static void exercise11_CreateHashSet() {
        HashSet<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");

        hs.forEach(System.out::println);

        hs.stream().findFirst().ifPresent(System.out::println);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("A");
        ts.add("B");
        ts.add("C");

        ts.forEach(System.out::println);
        ts.stream().findFirst().ifPresent(System.out::println);
    }
    public static void exercise15_IterateHashSet() { /* TODO */ }
    public static void exercise16_CreateTreeSet() { /* TODO */ }
    public static void exercise17_FirstLastTreeSet() { /* TODO */ }

    // Maps (HashMap & TreeMap)
    public static void exercise18_CreateHashMap() { /* TODO */ }
    public static void exercise19_GetValueByKey() { /* TODO */ }
    public static void exercise20_AddNewEntry() { /* TODO */ }
    public static void exercise21_UpdateValueMap() { /* TODO */ }
    public static void exercise22_RemoveEntry() { /* TODO */ }
    public static void exercise23_IterateKeys() { /* TODO */ }
    public static void exercise24_IterateValues() { /* TODO */ }
    public static void exercise25_IterateEntries() { /* TODO */ }
    public static void exercise26_CheckIfKeyExists() { /* TODO */ }
    public static void exercise27_CheckIfValueExists() { /* TODO */ }
    public static void exercise28_CreateTreeMap() { /* TODO */ }
    public static void exercise29_FirstLastEntryTreeMap() { /* TODO */ }
    public static void exercise30_ClearMap() { /* TODO */ }

    // --- Part 2: Medium Exercises (31-70) ---

    // Generics and Custom Objects
    public static void exercise31_GenericArrayList() { /* TODO */ }
    // Exercise 32: Person class creation is handled above.
    public static void exercise33_ArrayListOfCustomObjects() { /* TODO */ }
//    public static Person exercise34_FindInListCustomObject(List<Person> people, String name) { /* TODO */ return null; }
    public static void exercise35_RemoveFromListCustomObject() { /* TODO */ }
    public static void exercise36_HashSetOfCustomObjects() { /* TODO */ }
    public static void exercise37_HashMapWithCustomKey() { /* TODO */ }
    public static void exercise38_HashMapWithCustomValue() { /* TODO */ }

    // Sorting
    public static void exercise39_SortArrayListOfStrings() { /* TODO */ }
    public static void exercise40_SortArrayListOfIntegersReverse() { /* TODO */ }
    public static void exercise41_SortCustomObjectsComparable() { /* TODO */ }
    public static void exercise42_SortCustomObjectsComparatorAge() { /* TODO */ }
    public static void exercise43_SortCustomObjectsComparatorAgeDescending() { /* TODO */ }
    public static void exercise44_ChainedComparators() { /* TODO */ }

    // Queues (ArrayDeque & PriorityQueue)
    public static void exercise45_BasicArrayDequeQueue() { /* TODO */ }
    public static void exercise46_BasicArrayDequeStack() { /* TODO */ }
    public static void exercise47_PriorityQueueIntegers() { /* TODO */ }
    public static void exercise48_PriorityQueueCustomObjectsComparable() { /* TODO */ }
    public static void exercise49_PriorityQueueCustomObjectsComparator() { /* TODO */ }

    // Mixed Collections and More Operations
    public static void exercise50_CountWordFrequencies() { /* TODO */ }
    public static void exercise51_FindUniqueElements() { /* TODO */ }
    public static void exercise52_IntersectionOfSets() { /* TODO */ }
    public static void exercise53_UnionOfSets() { /* TODO */ }
    public static void exercise54_DifferenceOfSets() { /* TODO */ }
    public static void exercise55_Sublist() { /* TODO */ }
    public static void exercise56_ConvertListToArray() { /* TODO */ }
    public static void exercise57_ConvertArrayToList() { /* TODO */ }
    public static void exercise58_ImmutableListJava9Plus() { /* TODO */ }
    public static void exercise59_ImmutableSetJava9Plus() { /* TODO */ }
    public static void exercise60_ImmutableMapJava9Plus() { /* TODO */ }
    public static void exercise61_CopyList() { /* TODO */ }
    public static void exercise62_ReverseList() { /* TODO */ }
    public static void exercise63_ShuffleList() { /* TODO */ }
    public static void exercise64_MinMaxInList() { /* TODO */ }
    public static void exercise65_ReplaceAllInList() { /* TODO */ }
    public static void exercise66_FillList() { /* TODO */ }
    public static void exercise67_FrequencyOfElement() { /* TODO */ }
    public static void exercise68_SynchronizedList() { /* TODO */ }
    public static void exercise69_SynchronizedMap() { /* TODO */ }
    public static void exercise70_NavigableSetTreeSetFeatures() { /* TODO */ }

    // --- Part 3: Hard Exercises (71-100) ---

    // Streams API with Collections
    public static List<Integer> exercise71_FilterListWithStream(List<Integer> numbers) { /* TODO */ return null; }
    public static List<String> exercise72_MapListWithStream(List<String> names) { /* TODO */ return null; }
//    public static List<String> exercise73_FilterAndMapCustomObjects(List<Person> people) { /* TODO */ return null; }
    public static long exercise74_CountWithStream(List<String> words) { /* TODO */ return 0; }
    public static int exercise75_SumWithStream(List<Integer> numbers) { /* TODO */ return 0; }
    public static double exercise76_AverageWithStream(List<Double> numbers) { /* TODO */ return 0.0; }
    public static Optional<Integer> exercise77_MaxWithStream(List<Integer> numbers) { /* TODO */ return Optional.empty(); }
    public static Optional<String> exercise78_MinWithStream(List<String> strings) { /* TODO */ return Optional.empty(); }
    public static List<String> exercise79_DistinctElementsWithStream(List<String> elements) { /* TODO */ return null; }
//    public static Map<Integer, List<Person>> exercise80_GroupingByWithStream(List<Person> people) { /* TODO */ return null; }
//    public static Map<Boolean, List<Person>> exercise81_PartitioningByWithStream(List<Person> people) { /* TODO */ return null; }
    public static String exercise82_JoiningStringsWithStream(List<String> words) { /* TODO */ return null; }
//    public static Map<String, Integer> exercise83_MapToMapWithStream(List<Person> people) { /* TODO */ return null; }
    public static List<Integer> exercise84_FlatMapWithStream(List<List<Integer>> listOfLists) { /* TODO */ return null; }

    // Advanced Map Operations
    public static Map<String, Integer> exercise85_MergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) { /* TODO */ return null; }
    public static void exercise86_ComputeIfAbsent() { /* TODO */ }
    public static void exercise87_ComputeIfPresent() { /* TODO */ }
    public static void exercise88_ReplaceAllValuesInMap() { /* TODO */ }
    public static void exercise89_RemoveIfEntry() { /* TODO */ }
    public static void exercise90_IterateAndRemoveSafely() { /* TODO */ }

    // Performance and Data Structures Choices
    public static void exercise91_PerformanceComparisonArrayListLinkedListAddEnd() { /* TODO */ }
    public static void exercise92_PerformanceComparisonArrayListLinkedListAddBeginning() { /* TODO */ }
    public static void exercise93_PerformanceComparisonHashSetTreeSetAdd() { /* TODO */ }
    public static void exercise94_PerformanceComparisonHashMapTreeMapPut() { /* TODO */ }
    public static void exercise95_WhenToUseWhichList() { /* TODO */ } // This method implies a print/explanation
    public static void exercise96_WhenToUseWhichSet() { /* TODO */ } // This method implies a print/explanation
    public static void exercise97_WhenToUseWhichMap() { /* TODO */ } // This method implies a print/explanation

    // Algorithms & Problem Solving with Collections
    public static int[] exercise98_TwoSumProblem(int[] nums, int target) { /* TODO */ return null; }
    public static Map<Character, Integer> exercise99_FindDuplicateCharacters(String s) { /* TODO */ return null; }
    public static boolean exercise100_BalancedParentheses(String s) { /* TODO */ return false; }
}