package com.example.layoutexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class WeightGravityActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_manylayout);
	setTitle(getString(R.string.title_activity_Many));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.activity_linear, menu);
	return true;
    }

}
