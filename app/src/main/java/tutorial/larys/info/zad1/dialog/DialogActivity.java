package tutorial.larys.info.zad1.dialog;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import tutorial.larys.info.zad1.R;

public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }

    public void infoDialog(View view) {
        InfoDialogFragment infoDialogFragment = new InfoDialogFragment();
        infoDialogFragment.show(getFragmentManager(), null);
    }
}
