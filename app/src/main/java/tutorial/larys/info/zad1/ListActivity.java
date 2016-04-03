package tutorial.larys.info.zad1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView animalList = (ListView) findViewById(R.id.aniamList);

        final String[] animals = {"Kot", "Słoń", "Pies"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, animals);
        animalList.setAdapter(adapter);

        animalList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Wybrano element " + position + ", czyli " + animals[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
