package com.example.test;

import com.navdrawer.SimpleSideDrawer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;


@SuppressWarnings("deprecation")
public class MainActivity extends Activity {
	private SimpleSideDrawer simpleDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleDrawer = new SimpleSideDrawer(this);
        
        simpleDrawer.setLeftBehindContentView(R.layout.activity_behind_left_simple2);
        findViewById(R.id.left_menu_button).setOnClickListener(new OnClickListener() {
            @Override 
            public void onClick(View v) {
                simpleDrawer.toggleLeftDrawer();
            }
        });

    }
}
