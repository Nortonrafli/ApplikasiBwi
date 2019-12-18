package id.a.applikasibwi.Activity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import id.a.applikasibwi.Fragment.BookingFragment;
import id.a.applikasibwi.Fragment.DestinationFragment;
import id.a.applikasibwi.R;

public class NavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        loadFragment(new DestinationFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.action_home:
                fragment = new DestinationFragment();
                break;
            case R.id.action_download:
                fragment = new BookingFragment();
                break;
        }
        return loadFragment(fragment);
    }

    public void btn_handler_mountain(View view) {
        Intent intent = new Intent(this, MountainActivity.class);
        startActivity(intent);
    }

    public void btn_handler_beach(View view) {
//        Intent intent = new Intent(this, BeachActivity.class);
//        startActivity(intent);
    }

//    public void btn_handler_mountain(View view) {
//        Intent intent = new Intent(this, MountainActivity.class);
//        startActivity(intent);
//    }
}
