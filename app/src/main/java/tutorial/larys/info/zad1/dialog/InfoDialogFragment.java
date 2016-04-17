package tutorial.larys.info.zad1.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/**
 * Created by Piotr on 2016-04-10.
 */
public class InfoDialogFragment extends DialogFragment {


    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Prosty dialog");
        builder.setMessage("Tutaj treść dialogu");
        return builder.create();
    }
}
