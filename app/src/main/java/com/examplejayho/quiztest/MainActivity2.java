package com.examplejayho.quiztest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity2";
    boolean doubleBackToExitPressedOnce = false;
    private CardView python;
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main2);

        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        if (defaultSharedPreferences.getBoolean("FIRSTRUN", true)) {
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            edit.putBoolean("FIRSTRUN", false);
            edit.commit();
        }
        CardView cardView = (CardView) findViewById(R.id.python);
        this.python = cardView;
        cardView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "vv", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity2.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    public void classClick(View view) {
        Intent intent = new Intent(this, SubCategoryActivity.class);
        if (view.getId() == R.id.india) {
            intent.putExtra("Category", "india");
            Toast.makeText(this, "india", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.world) {
            intent.putExtra("Category", "world");
            Toast.makeText(this, "world", Toast.LENGTH_SHORT).show();
        } else if (view.getId() == R.id.geo) {
            intent.putExtra("Category", "geo");
        } else if (view.getId() == R.id.history) {
            intent.putExtra("Category", "history");
        } else if (view.getId() == R.id.chemistry) {
            intent.putExtra("Category", "chemistry");
        } else if (view.getId() == R.id.bio) {
            intent.putExtra("Category", "bio");
        } else if (view.getId() == R.id.sports) {
            intent.putExtra("Category", "sports");
        } else if (view.getId() == R.id.economy) {
            intent.putExtra("Category", "economy");
        } else if (view.getId() == R.id.physics) {
            intent.putExtra("Category", "physics");
        } else if (view.getId() == R.id.politics) {
            intent.putExtra("Category", "politics");
        }
    }




    @SuppressLint("WrongConstant")
    public void onBackPressed() {
        if (this.doubleBackToExitPressedOnce) {
            super.onBackPressed();
            System.exit(0);
            finish();
            System.gc();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", 0).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                MainActivity2.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}