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
    public void btn_handler_telukijo(View view) {
        Intent intent = new Intent(this, telukijoActivity.class);
        startActivity(intent);
    }

    public void btn_handler_pulaumerah(View view) {
        Intent intent = new Intent(this, pmActivity.class);
        startActivity(intent);
    }

    public void btn_handler_wediireng(View view) {
        Intent inten = new Intent(this, wedirengActivity.class);
        startActivity(inten);
    }
}
