package Chapter6_Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Person[] arr = new Person[N];
        for(int i=0; i<N; i++){
            String name = sc.next();
            int score = sc.nextInt();
            arr[i] = new Person(name, score);
        }


        Arrays.sort(arr, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getScore() < o2.getScore())
                    return -1;
                else if(o1.getScore() > o2.getScore())
                    return 1;
                else return 0;
            }
        });

        for(int i=0; i<N; i++){
            System.out.print(arr[i].getName() + " ");
        }
    }

    static class Person{
        String name;
        int score;

        public Person(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }
    }
}
