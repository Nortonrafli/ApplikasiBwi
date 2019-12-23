package id.a.applikasibwi.Activity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.a.applikasibwi.R;
public class BeachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beach);
    }
    public void btn_handler_ijen(View view) {
        Intent intent = new Intent(this, ijenActivity.class);
        startActivity(intent);
    }

    public void btn_handler_raung(View view) {
        Intent intent = new Intent(this, raungActivity.class);
        startActivity(intent);
    }

    public void btn_handler_ranti(View view) {
        Intent inten = new Intent(this, rantiActivity.class);
        startActivity(inten);
    }
}
