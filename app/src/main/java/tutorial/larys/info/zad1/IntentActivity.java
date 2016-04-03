package tutorial.larys.info.zad1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IntentActivity extends Activity {

    private EditText titleFied;
    private EditText messageField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        titleFied = (EditText) findViewById(R.id.ed_title);
        messageField = (EditText) findViewById(R.id.ed_message);

    }

    public void sendButton(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");

        String getTitle = titleFied.getText().toString();
        String getMessage = messageField.getText().toString();

        intent.putExtra(Intent.EXTRA_SUBJECT, getTitle);
        intent.putExtra(Intent.EXTRA_TEXT, getMessage);
        startActivity(intent);
    }
}
