//package tutorial.larys.info.zad1.fragment;
//
//import android.app.Activity;
//import android.app.FragmentTransaction;
//import android.content.Intent;
//import android.content.res.Configuration;
//import android.os.Bundle;
//import android.view.View;
//
//import tutorial.larys.info.zad1.R;
//
//public class AnimalListFragmentActivity extends Activity implements AnimalListFragment.OnAnimalClickedListener  {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragments_animal_list);
//    }
//
//    @Override
//    public void onAnimalClicked(int id) {
//        Bundle bundle = new Bundle();
//        bundle.putInt(AnimalDetailFragment.ANIMAL_ID, id);
//
//        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            AnimalDetailFragment animalDetailFragment = new AnimalDetailFragment();
//            animalDetailFragment.setArguments(bundle);
//            findViewById(R.id.label_show_details).setVisibility(View.GONE);
//            FragmentTransaction transaction = getFragmentManager().beginTransaction();
//            transaction.replace(R.id.fragment_container_animal_detail, animalDetailFragment).addToBackStack(null);
//            transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
//            transaction.commit();
//            return;
//        }
//
//        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
//            Intent intent = new Intent(this, AnimalDetailActivity.class);
//            intent.putExtras(bundle);
//            startActivity(intent);
//        }
//
//    }
//}
