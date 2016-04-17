package tutorial.larys.info.zad1.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by Piotr on 2016-04-10.
 */
public class InfoDialogFragment extends DialogFragment {

    private DialogInterface.OnClickListener mListener;


    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Prosty dialog");
        builder.setMessage("Tutaj treść dialogu");

        builder.setPositiveButton("OK", mListener);
        builder.setNegativeButton("Anuluj", mListener);

        return builder.create();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (DialogInterface.OnClickListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement DialogInterface.OnClickListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
}
