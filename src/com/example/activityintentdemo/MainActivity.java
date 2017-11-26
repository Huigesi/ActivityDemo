package com.example.activityintentdemo;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class MainActivity extends Activity {
	private Button button;
	private EditText editText1;
	private EditText editText2;
	private EditText editText3;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setListener();

       
    }


	private void setListener() {
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent=new Intent(MainActivity.this,NextActivity.class);
				String one=editText1.getText().toString().trim();
				String two=editText2.getText().toString().trim();
				
				intent.putExtra("message", one+"+"+two+"=?");
				startActivityForResult(intent, 1000);
			}
		});
	}
	


	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		if(requestCode==1000&&resultCode==1001){
			String resultString=data.getStringExtra("result");
			editText3.setText(resultString);
		}
	}


	private void initView() {
		button=(Button)findViewById(R.id.button1);
		editText1=(EditText)findViewById(R.id.editText1);
		editText2=(EditText)findViewById(R.id.editText2);
		editText3=(EditText)findViewById(R.id.editText3);
		
	}


    

}
