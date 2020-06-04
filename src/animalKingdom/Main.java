package animalKingdom;

import java.util.*;

public class Main
{
        public static ArrayList<Animals> filteredList = new ArrayList<>();

        public static void printAnimals(ArrayList<Animals> animals, CheckAnimals tester)
        {
                filteredList.clear();

                for (Animals a : animals)
                {
                        if (tester.test(a))
                        {
                                System.out.println(a.getName()/* + " " + a.getYear()*/);
                                filteredList.add(a);
                        }
                }
        }

        public static void main(String[] args)
        {
                Mammals panda = new Mammals("Panda", 1869);
                Mammals zebra = new Mammals("Zebra", 1778);
                Mammals koala = new Mammals("Koala", 1816);
                Mammals sloth = new Mammals("Sloth", 1804);
                Mammals armadillo = new Mammals("Armadillo", 1758);
                Mammals raccoon = new Mammals("Raccoon", 1758);
                Mammals bigfoot = new Mammals("Bigfoot", 2021);

                Birds pigeon = new Birds("Pigeon", 1837);
                Birds peacock = new Birds("Peacock", 1821);
                Birds toucan = new Birds("Toucan", 1758);
                Birds parrot = new Birds("Parrot", 1824);
                Birds swan = new Birds("Swan", 1758);

                Fish salmon = new Fish("Salmon", 1758);
                Fish catfish = new Fish("Catfish", 1817);
                Fish perch = new Fish("Perch", 1758);

                ArrayList<Animals> myList = new ArrayList<>();
                myList.add(panda);
                myList.add(zebra);
                myList.add(koala);
                myList.add(sloth);
                myList.add(armadillo);
                myList.add(raccoon);
                myList.add(bigfoot);
                myList.add(pigeon);
                myList.add(peacock);
                myList.add(toucan);
                myList.add(parrot);
                myList.add(swan);
                myList.add(salmon);
                myList.add(catfish);
                myList.add(perch);

                // System.out.println();
                // System.out.println("*** This List ***");
                // System.out.println(myList.toString());

                // printAnimals(myList, a -> a.getYear() > 1800);
                System.out.println();
                System.out.println("*** 1. Descening year named***");
                myList.sort((a1, a2) -> a2.getYear().compareTo(a1.getYear()));
                myList.forEach((a) -> System.out.println("Name: " + a.getName() + " Year: " + a.getYear()));

                System.out.println();
                System.out.println("*** 2. Alphabetical***");
                myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
                myList.forEach((a) -> System.out.println("Name: " + a.getName()));

                System.out.println();
                System.out.println("*** 3. Order by move***");
                myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
                myList.forEach((a) -> System.out.println("Animal: " + a.getName() + " Move: " + a.move()));

                System.out.println();
                System.out.println("*** 4. Only lung breathers ***");
                printAnimals(myList, a -> (a.breathe() == "lungs"));

                System.out.println();
                System.out.println("*** 5. Only lung breathers named in 1758 ***");
                printAnimals(myList, a -> (a.getName() + a.breathe() == "lungs") && (a.getYear() == 1758));

                System.out.println();
                System.out.println("*** 6. Only egg layers and lung breathers ***");
                printAnimals(myList, a -> (a.breathe() == "lungs") && (a.reproduce() == "eggs"));

                System.out.println();
                System.out.println("*** 7. Only named in 1757***");
                myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
                printAnimals(myList, b -> (b.getYear() == 1758));

                System.out.println();
                System.out.println("*** 8. Alphabetical ammals***");
                myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
                printAnimals(myList, v -> (v instanceof Mammals));

                // Collections.sort(myList, new Comparator<HashMap.Entry<String, Integer>>()
                // {
                //      public int compare(HashMap.Entry<String, Integer> o1, HashMap.Entry<String, Integer> o2)
                //      {
                //              return o2.getValue() - o1.getValue();
                //              // return o2.getValue().getAvgWeight() - o1.getValue().getAvgWeight();                  
                //      }
                // });
        }
}