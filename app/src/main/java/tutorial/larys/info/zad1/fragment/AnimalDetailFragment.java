package tutorial.larys.info.zad1.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import tutorial.larys.info.zad1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnimalDetailFragment extends Fragment {

    private TextView title;
    private ImageView imageView;
    private TextView description;
    public static final String ANIMAL_ID = "extra.animal.id";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animal_detail, container, false);
        title = (TextView) view.findViewById(R.id.title);
        imageView = (ImageView) view.findViewById(R.id.image);
        description = (TextView) view.findViewById(R.id.description);

        if (getArguments() != null) {
            int animalId = getArguments().getInt(ANIMAL_ID);
            showAnimal(AnimalRepository.getAnimalList().get(animalId));
        }

        return view;
    }

    public void showAnimal(Animal animal) {
        title.setText(animal.getName());
        imageView.setImageResource(animal.getImage());
        description.setText(animal.getDescription());
    }

}
