package tutorial.larys.info.zad1.fragment;

import java.util.ArrayList;
import java.util.List;

import tutorial.larys.info.zad1.R;

/**
 * Created by Piotr on 2016-04-10.
 */
public class AnimalRepository {
    private static List<Animal> animalList;

    static {
        animalList = new ArrayList<>(3);
        animalList.add(new Animal(R.drawable.cat, "Kot", "Kot to zwierzę domowe"));
        animalList.add(new Animal(R.drawable.dog, "Pies", "Pies to najlepszy przyjaciel człowieka"));
        animalList.add(new Animal(R.drawable.elephant, "Słoń", "Słoń zjada do 225kg roślin dziennie i wypija 130l wody na raz"));
    }

    public static List<Animal> getAnimalList() {
        return animalList;
    }
}
