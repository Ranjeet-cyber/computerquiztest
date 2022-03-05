package com.examplejayho.quiztest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SubCategoryActivity extends AppCompatActivity {
    private final String TAG = SubCategoryActivity.class.getSimpleName();
    String category;
    Intent intent;
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_sub_category);
        Intent intent2 = getIntent();
        this.intent = intent2;
        this.category = intent2.getStringExtra("Category");


    }



    public void cardClick(View view) {
           setTitle(getResources().getString(R.string.world
           ));
            Intent intent3 = new Intent(this, MainActivity.class);
            if (view.getId() == R.id.sub1) {
                intent3.putExtra("sub", "sub1");
            } else if (view.getId() == R.id.sub2) {
                intent3.putExtra("sub", "sub2");
            } else if (view.getId() == R.id.sub3) {
                intent3.putExtra("sub", "sub3");
            } else if (view.getId() == R.id.sub4) {
                intent3.putExtra("sub", "sub4");
            } else if (view.getId() == R.id.sub5) {
                intent3.putExtra("sub", "sub5");
            } else if (view.getId() == R.id.sub6) {
                intent3.putExtra("sub", "sub6");
            } else if (view.getId() == R.id.sub7) {
                intent3.putExtra("sub", "sub7");
            } else if (view.getId() == R.id.sub8) {
                intent3.putExtra("sub", "sub8");
            } else if (view.getId() == R.id.sub9) {
                intent3.putExtra("sub", "sub9");
            } else if (view.getId() == R.id.sub10) {
                intent3.putExtra("sub", "sub10");
            }
            intent3.putExtra("category", this.category);
            startActivity(intent3);
        }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
