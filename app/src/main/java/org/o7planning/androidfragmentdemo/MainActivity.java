package org.o7planning.androidfragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(String topImageText, String bottomImageText) {
        BottomFragment bottomFragment = (BottomFragment) this.getSupportFragmentManager().findFragmentById(R.id.fragment_bottom);
        bottomFragment.showText(topImageText, bottomImageText);
    }
}
