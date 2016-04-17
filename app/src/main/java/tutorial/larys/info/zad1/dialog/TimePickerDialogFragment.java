package tutorial.larys.info.zad1.dialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * Created by Piotr on 2016-04-17.
 */
public class TimePickerDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        TimePickerDialog timePickerDialog = new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                String formattedTime = String.format("%02d:%02d", hourOfDay, minute);
                Toast.makeText(getActivity(), "Wybrano: " + formattedTime, Toast.LENGTH_SHORT).show();
            }
        }, 10, 10, true);

        return timePickerDialog;
    }
}
