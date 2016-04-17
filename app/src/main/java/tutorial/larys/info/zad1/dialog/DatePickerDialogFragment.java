package tutorial.larys.info.zad1.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

/**
 * Created by Piotr on 2016-04-17.
 */
public class DatePickerDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DatePickerDialog dialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                String formattedDate = String.format("%04d-%02d-%02d", year, monthOfYear + 1, dayOfMonth);
                Toast.makeText(getActivity(), "Wybrano: " + formattedDate, Toast.LENGTH_SHORT).show();
            }
        }, 2012, 0, 3);

        return dialog;
    }
}
