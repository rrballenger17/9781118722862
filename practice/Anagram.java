
// Ch7 - Implementing Library Functionality 
// Given a list of words, produce an algorithm that will return a list of all anagrams for a specific word.

import java.util.*;

public class Anagram {
   
	public static Map<Character, Integer> createMap(String one){

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for(int i=0; i<one.length(); i++){

			Character c = one.charAt(i);

			if(!map.keySet().contains(c)){
				map.put(c, 1);
			}else{
				map.put(c, map.get(c) + 1);
			}
		}

		return map;
	}

	public static boolean isAnagram(String one, String two){

		if(one.length() != two.length()){
			return false;
		}

		Map<Character, Integer> mapOne = createMap(one);
		Map<Character, Integer> mapTwo = createMap(two);

		for(Character c: mapOne.keySet()){
			if(mapOne.get(c) != mapTwo.get(c)){
				return false;
			}
		}

		return true;
	}

	public static void main(String []args) {
      // Following statement would create an object myPuppy

		if(args.length != 2){
			System.out.println("Error: arguements must be two words");
		}

		if(isAnagram(args[0], args[1])){
			System.out.println("Anagram!");
		}else{
			System.out.println("Not an anagram");
		}

	}

}





