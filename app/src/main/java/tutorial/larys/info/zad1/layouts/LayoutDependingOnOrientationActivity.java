package tutorial.larys.info.zad1.layouts;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tutorial.larys.info.zad1.R;

public class LayoutDependingOnOrientationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_depending_on_orientation);
    }
}
