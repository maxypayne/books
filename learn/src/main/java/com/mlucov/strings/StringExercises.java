package com.mlucov.strings;

import java.util.*;
import java.util.regex.Pattern;

public class StringExercises {

    // -------------------------------------
    // 🟢 EASY (1–30)
    // -------------------------------------

    // 1. Print a string
    public static void printString(String s) {
        printPermutations("First exercise");
    }

    // 2. Find the length of a string
    public static int stringLength(String s) {
        return s.length();
    }

    // 3. Convert a string to uppercase
    public static String toUpperCase(String s) {
        return s.toUpperCase();
    }

    // 4. Convert a string to lowercase
    public static String toLowerCase(String s) {
        return s.toLowerCase();
    }

    // 5. Get the first character
    public static char firstChar(String s) {
        return s.charAt(0);
    }

    // 6. Get the last character
    public static char lastChar(String s) {
        return s.charAt(s.length() - 1);
    }

    // 7. Extract a substring
    public static String extractSubstring(String s, int start, int end) {
        return s.substring(start, end);
    }

    // 8. Check if a string contains another
    public static boolean containsSubstring(String s, String target) {
        return s.contains(target);
    }

    // 9. Compare two strings (case-sensitive)
    public static boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    // 10. Compare two strings (ignore case)
    public static boolean compareStringsIgnoreCase(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }

    // 11. Check if starts with prefix
    public static boolean startsWith(String s, String prefix) {
        return s.startsWith(prefix);
    }

    // 12. Check if ends with suffix
    public static boolean endsWith(String s, String suffix) {
        return s.endsWith(suffix);
    }

    // 13. Replace a character
    public static String replaceChar(String s, char oldChar, char newChar) {
        return s.replace(oldChar, newChar);
    }

    // 14. Replace a word
    public static String replaceWord(String s, String oldWord, String newWord) {
        return s.replace(oldWord, newWord);
    }

    // 15. Remove spaces
    public static String removeSpaces(String s) {
        return s.replaceAll("\\s+", " ");
    }

    // 16. Count a character
    public static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    // 17. Reverse a string (loop)
    public static String reverseStringLoop(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    // 18. Reverse a string (StringBuilder)
    public static String reverseStringBuilder(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    // 19. Check if string is empty
    public static boolean isEmpty(String s) {
        return s.isEmpty();
    }

    // 20. Concatenate two strings
    public static String concatenate(String s1, String s2) {
        return s1.concat(s2);
    }

    // 21. Split string by spaces
    public static String[] splitBySpaces(String s) {
        return s.split(" ");
    }

    // 22. Split by specific character
    public static String[] splitByChar(String s, char c) {
        System.out.println();
        System.out.println("Split by specific character");
        return s.split(String.valueOf(c));
    }

    // 23. Index of first occurrence
    public static int indexOfFirst(String s, char c) {
        // TODO: Return index
        return s.indexOf(c);
    }

    // 24. Index of last occurrence
    public static int indexOfLast(String s, char c) {
        // TODO: Return last index
        return s.lastIndexOf(c);
    }

    // 25. Get character at index
    public static char charAt(String s, int index) {
        return s.charAt(index);
    }

    // 26. Trim spaces
    public static String trimSpaces(String s) {
        // TODO: Trim spaces
        return s.trim();
    }

    // 27. Integer to string
    public static String intToString(int num) {
        // TODO: Convert int to String
        return String.valueOf(num);
    }

    // 28. String to integer
    public static int stringToInt(String s) {
        // TODO: Convert String to int
        return Integer.parseInt(s);
    }

    // 29. Format string with variables
    public static String formatString(String name, int age) {
        // TODO: Use String.format
        return String.format("My name is %s and i am (%d) years old", name, age);
    }

    // 30. Join strings with separator
    public static String joinStrings(String[] arr, String separator) {
        // TODO: Join array elements
        return String.join(separator, arr);
    }

    // -------------------------------------
    // 🟡 MEDIUM (31–70)
    // -------------------------------------

    // 31. Count vowels
    public static int countVowels(String s) {
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    // 32. Count consonants
    public static int countConsonants(String s) {
        String vowels = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!vowels.contains(String.valueOf(s.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    // 33. Find duplicate characters
    public static List<String> findDuplicates(String s) {
        List<String> toReturn = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
                toReturn.add(String.valueOf(s.charAt(i)));
            }
        }
        return toReturn.stream().distinct().toList();
    }

    // 34. Check anagrams
    public static boolean areAnagrams(String s1, String s2) {
        String[] sl1 = s1.split(" ");
        String[] sl2 = s2.split(" ");

        Arrays.sort(sl1);
        Arrays.sort(sl2);

        String res1 = String.join("", sl1);
        String res2 = String.join("", sl2);
        System.out.println(res1 + " res1");
        System.out.println(res2 + " res2");
        return res1.equals(res2);
    }

    // 35. Remove vowels
    public static String removeVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();
        for (String word : s.split("")) {
            System.out.println("Word : " + word);
            if (!vowels.contains(word)) {
                result.append(word);
            }
        }
        return result.toString();
    }

    // 36. Longest word in sentence
    public static String longestWord(String sentence) {
        String longest = "";
        for (String word : sentence.split(" ")) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    // 37. Capitalize first letter of each word
    public static String capitalizeWords(String sentence) {
//        String capitalized = "";
//        for (String word : sentence.split(" ")) {
//            capitalized += word.substring(0, 1).toUpperCase() + word.substring(1);
//        }
//        return capitalized;
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : sentence.split(" ")) {
            stringBuilder.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
        }
        return stringBuilder.toString();
    }

    // 38. Check palindrome
    public static boolean isPalindrome(String s) {
        return false;
    }

    // 39. Reverse each word
    public static String reverseEachWord(String sentence) {
//        var string = "This is my string";
        String[] words = sentence.split(" ");
        StringBuilder builder = new StringBuilder();

//        for(String word : words) {
//            StringBuilder b2 = new StringBuilder();
//            for(int i = word.length() - 1; i >= 0; i--) {
//                System.out.println(word.charAt(i));
//                b2.append(word.charAt(i));
//            }
//            builder.append(b2 + " ");
//        }

        for(String word : words) {
            builder.append(new StringBuilder(word).reverse()).append(" ");
        }
        return builder.toString().trim();
    }

    // 40. Remove duplicate characters
    public static String removeDuplicateChars(String s) {
        StringBuilder builder = new StringBuilder();
        String[] chars = s.split(" ");
        for(String cha : chars) {
            if(!builder.toString().contains(cha)) {
               builder.append(cha);
            }
        }
        return builder.toString();
    }

    // (Skipping explanations for brevity now)

    public static boolean containsOnlyDigits(String s) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(s).matches();
    }
    public static int countWords(String s) {
        return s.split(" ").length;
    }
    public static String replaceDigits(String s) {
        return s.replaceAll("[0-9]", "");
    }
    public static String sortString(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words);
        return String.join(" ", words);
    }
    public static String mostFrequentChar(String str) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = str.split("");
        for (String s : words) {
            map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1);
        }
        System.out.println("map: " + map);
        String key = null;
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                key = entry.getKey();
                max = entry.getValue();
                System.out.println("key: " + key + " max: " + max);
            }
        }
        System.out.println("Most frequent char: ");
        return key;
    }
    public static char firstNonRepeatingChar(String s) { return ' '; }
    public static void swapStrings(String s1, String s2) { }
    public static String removeCharacter(String s, char c) { return null; }
    public static String removeExtraSpaces(String s) { return null; }
    public static String removeSpecialChars(String s) { return null; }
    public static String largestAndSmallestWord(String s) { return null; }
    public static void wordFrequencies(String s) { }
    public static boolean isValidEmail(String email) { return false; }
    public static boolean isValidMobileNumber(String number) { return false; }
    public static String toTitleCase(String s) { return null; }
    public static int sumOfDigitsInString(String s) { return 0; }
    public static String swapCase(String s) { return null; }
    public static boolean isRotation(String s1, String s2) { return false; }
    public static boolean containsOnlyAlphabets(String s) { return false; }
    public static char secondMostFrequentChar(String s) { return ' '; }
    public static String removeConsecutiveDuplicates(String s) { return null; }
    public static String insertCharAt(String s, int pos, char c) { return null; }
    public static boolean sameCharacterSet(String s1, String s2) { return false; }
    public static int longestUniqueSubstring(String s) { return 0; }
    public static String reverseWords(String s) { return null; }
    public static void printPermutations(String s) { }
    public static int countWordOccurrences(String s, String word) { return 0; }
    public static boolean balancedParentheses(String s) { return false; }
    public static String extractNumbers(String s) { return null; }
    public static String runLengthEncoding(String s) { return null; }

    // -------------------------------------
    // 🔴 HARD (71–100)
    // -------------------------------------

    public static void palindromicSubstrings(String s) { }
    public static String longestPalindromicSubstring(String s) { return null; }
    public static String customReplace(String s, String target, String replacement) { return null; }
    public static String firstRepeatedWord(String s) { return null; }
    public static String removeDuplicateWords(String s) { return null; }
    public static void groupAnagrams(String[] strs) { }
    public static void allSubstrings(String s) { }
    public static int minDeletionsForPalindrome(String s) { return 0; }
    public static String longestCommonPrefix(String[] strs) { return null; }
    public static String minWindowSubstring(String s, String t) { return null; }
    public static String smallestSubstringWithAllChars(String s) { return null; }
    public static String longestPrefixSuffix(String s) { return null; }
    public static void allCombinations(String s) { }
    public static void validIPAddresses(String s) { }
    public static String decodeString(String s) { return null; }
    public static boolean patternMatch(String s, String p) { return false; }
    public static boolean kmpSearch(String text, String pattern) { return false; }
    public static int editDistance(String s1, String s2) { return 0; }
    public static int matchingCharacters(String s1, String s2) { return 0; }
    public static String shortestPalindrome(String s) { return null; }
    public static String longestRepeatedSubstring(String s) { return null; }
    public static int minOperationsToConvert(String s1, String s2) { return 0; }
    public static String simpleCompression(String s) { return null; }
    public static void letterFrequency(String s) { }
    public static boolean areScrambledStrings(String s1, String s2) { return false; }
    public static int longestCommonSubsequence(String s1, String s2) { return 0; }
    public static int longestRepeatingSubsequence(String s) { return 0; }
    public static void allPalindromicPartitions(String s) { }
    public static String restoreParentheses(String s) { return null; }
    public static void trieExample() { }

    // Main method to test
    public static void main(String[] args) {
        System.out.println("String Exercises Ready!");
    }
}
