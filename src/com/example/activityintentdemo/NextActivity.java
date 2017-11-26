package com.example.activityintentdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NextActivity extends Activity{
	private Button button;
	private TextView textView;
	private EditText editText;
	Intent intent=new Intent();
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        initView();
        setListener();
        //要用getIntent()方法后才能得到传过来的值
        intent=getIntent();
		String messageString=intent.getStringExtra("message");
		textView.setText(messageString);
		//Log.i("message", messageString);

       
    }

	private void setListener() {
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				String resultString=editText.getText().toString().trim();
				intent.putExtra("result", resultString);
				setResult(1001, intent);
				finish();
			}
		});
		
	}

	private void initView() {
		button=(Button)findViewById(R.id.button1);
		textView=(TextView)findViewById(R.id.textView);
		editText=(EditText)findViewById(R.id.editText);
		
	}
}
