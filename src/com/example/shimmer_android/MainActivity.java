package com.example.shimmer_android;

import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		 ShimmerTextView tv = (ShimmerTextView) findViewById(R.id.shimmer_tv);  
	        Shimmer shimmer = new Shimmer();  
	        shimmer.setDuration(2500);  
	        shimmer.start(tv);  
	
	}
}
