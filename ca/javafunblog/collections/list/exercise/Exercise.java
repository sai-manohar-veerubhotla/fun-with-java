package ca.javafunblog.collections.list.exercise;

import ca.javafunblog.collections.list.ListUtil;

import java.util.List;

public class Exercise {


    // take a big string with comma separated values
    // "manohar, vamsi , iPhone, Alexa"
    // split it into words
    // collect the words into a list
    // use streams

    // take a string -> split into characters
    // "Manohar" -> ['M', 'a', ...]
    // use filter and get me only vowels
    // a, e, i, o, u



    // time complexities
    private static void listTimeComplexties(){
        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(5,6,7,8,9,10);

        //list1.size() * list2.size()
        // n * m
        // WORST CASE - BIG O(n * m)
        //  6 + 6 + 6 + 6 + 1
        // O(n * m)
        for (int i = 0; i < list1.size(); i++) {
            int e1 = list1.get(i);
            for (int j = 0; j < list2.size(); j++) {
                int e2 = list2.get(j);
                if(e1 == e2){

                }
            }
        }

        for(int i : list1){
            if(list2.contains(i)){

            }
        }


    }





}
