package com.example.activityintentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ActivityCycleDemo extends Activity {

	// 打电话会切断虚拟机和adt之间的联系
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		Log.i("activity", "onCreate");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("activity", "onPause");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("activity", "onRestart");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("activity", "onResume");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("activity", "onStart");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i("activity", "onStop");
	}

}
