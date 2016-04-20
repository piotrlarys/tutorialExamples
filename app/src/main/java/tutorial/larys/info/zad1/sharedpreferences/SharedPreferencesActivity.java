package tutorial.larys.info.zad1.sharedpreferences;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import tutorial.larys.info.zad1.R;

public class SharedPreferencesActivity extends Activity {

    private static final String prefFirstRun = "pref_first_run";
    private static final String prefName = "pref_name";

    private TextView message;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        message = (TextView) findViewById(R.id.textView1);
        name = (EditText) findViewById(R.id.editText1);

        SharedPreferences preferences = getPreferences(MODE_PRIVATE);

        boolean firstRun = preferences.getBoolean(prefFirstRun, true);

        if (firstRun) {
            message.setText("Cześć miło cię widzieć. Jestes tutaj nowy?");
        } else {
            String savedName = preferences.getString(prefName, "");
            message.setText("Już cię znamy " + savedName);
            name.setText(savedName);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences preferences = getPreferences(MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(prefFirstRun, false);
        editor.putString(prefName, name.getText().toString());
        editor.commit();
    }
}
