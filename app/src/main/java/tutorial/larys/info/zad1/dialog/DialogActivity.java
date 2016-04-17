package tutorial.larys.info.zad1.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import tutorial.larys.info.zad1.R;

public class DialogActivity extends Activity implements DialogInterface.OnClickListener {

    private TextView selectedOptionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        selectedOptionText = (TextView) findViewById(R.id.selected_option_text);
    }

    public void infoDialog(View view) {
        InfoDialogFragment infoDialogFragment = new InfoDialogFragment();
        infoDialogFragment.show(getFragmentManager(), null);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        switch (which) {
            case DialogInterface.BUTTON_POSITIVE:
                selectedOptionText.setText("OK");
                break;
            case DialogInterface.BUTTON_NEGATIVE:
                selectedOptionText.setText("Anuluj");
                break;
        }
    }
}
