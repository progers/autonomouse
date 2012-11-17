package com.lagbuster.clickbaseline;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/*
 * This is a simple app for determining the input
 * lag baseline performance. When pressed, the background
 * turns from white to black.
 */
public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View main = (View) findViewById(R.id.mainlayout);
        main.setBackgroundColor(0xFF000000);
        main.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
				case (MotionEvent.ACTION_DOWN):
					v.setBackgroundColor(0xFFFFFFFF);
					break;
				case (MotionEvent.ACTION_UP):
				case (MotionEvent.ACTION_CANCEL):
					v.setBackgroundColor(0xFF000000);
					break;
				}
				return true;
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
