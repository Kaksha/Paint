package com.example.android.paint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BrushView view = new BrushView(this);
        setContentView(view);
        addContentView(view.btnEraseAll, view.params);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
