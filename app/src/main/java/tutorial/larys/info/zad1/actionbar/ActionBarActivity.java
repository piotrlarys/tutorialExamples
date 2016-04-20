package tutorial.larys.info.zad1.actionbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import tutorial.larys.info.zad1.R;

public class ActionBarActivity extends Activity implements ActionMode.Callback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     getActionBar().show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_example_one:
                Toast.makeText(this, "Jeden", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_example_two:
            Toast.makeText(this, "Dwa", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_example_three:
                Toast.makeText(this, "Trzy", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_example_four:
                Toast.makeText(this, "Cztery", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_example_five:
                Toast.makeText(this, "Pięć", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_example_six:
                Toast.makeText(this, "Sześć", Toast.LENGTH_SHORT).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_example, menu);
        return true;
    }

    @Override
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override
    public void onDestroyActionMode(ActionMode actionMode) {

    }
}
