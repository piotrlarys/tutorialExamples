package tutorial.larys.info.zad1.settings;

import android.content.SharedPreferences;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Set;

import tutorial.larys.info.zad1.R;

public class PreferenceExampleActivity extends PreferenceActivity {

    private static final String PREF_LIGHT = "pref_light";
    private static final String PREF_WASHING_MASHINE = "pref_washing_machine";
    private static final String PREF_NAME = "pref_name";
    private static final String PREF_ANIMALS = "pref_animals";
    private static final String PREF_ICE_CREAM_FLAVOURS = "pref_ice_cream_flavours";
    private static final String PREF_RINGTONE = "pref_ringtone";

    private TextView light;
    private TextView washingMachine;
    private TextView name;
    private TextView animal;
    private TextView iceCreamFlavour;
    private TextView ringtone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new PreferencesFragment()).commit();

        light = (TextView) findViewById(R.id.light);
        washingMachine = (TextView) findViewById(R.id.washing_machine);
        name = (TextView) findViewById(R.id.name);
        animal = (TextView) findViewById(R.id.animal);
        iceCreamFlavour = (TextView) findViewById(R.id.ice_cream_flavour);
        ringtone = (TextView) findViewById(R.id.ringtone);

    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

        boolean lightEnabled = preferences.getBoolean(PREF_LIGHT, false);
        boolean wasingMahineEnabled = preferences.getBoolean(PREF_WASHING_MASHINE, false);
        String nameValue = preferences.getString(PREF_NAME, "");
        String animalValue = preferences.getString(PREF_ANIMALS, "");
        Set<String> iceCreamFlavoursValues = preferences.getStringSet(PREF_ICE_CREAM_FLAVOURS, null);
        String ringtoneValue = preferences.getString(PREF_RINGTONE, "");

        String lightValue = (lightEnabled) ? "włączone" : "wyłączone";
        String washingMachineValue = (wasingMahineEnabled) ? "włączona" : "wyłączona";

        light.setText(lightValue);
        washingMachine.setText(washingMachineValue);
        name.setText(nameValue);
        animal.setText(animalValue);

        if (iceCreamFlavoursValues != null) {
            iceCreamFlavour.setText(iceCreamFlavoursValues.toString());
        }

        ringtone.setText(ringtoneValue);
    }

    public static class PreferencesFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences);
        }
    }
}
