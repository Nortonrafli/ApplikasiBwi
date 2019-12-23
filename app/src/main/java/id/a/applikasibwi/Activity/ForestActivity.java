package id.a.applikasibwi.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.a.applikasibwi.R;

public class ForestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forest);
    }

    public void btn_handler_baluran(View view) {
        Intent inten = new Intent(this, BaluranActivity.class);
        startActivity(inten);
    }
}
