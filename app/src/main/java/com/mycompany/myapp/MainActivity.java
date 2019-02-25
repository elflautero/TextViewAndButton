package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class MainActivity 
	extends Activity {
	
	public TextView tvOne;
	public TextView tvTwo;
	public Button btnOne;

	
	
    @Override
    protected void onCreate(
		Bundle savedInstanceState) {
       
		super.onCreate(
			savedInstanceState);
			
        setContentView(R.layout.main);
	
		tvOne = (TextView)
			findViewById(
				R.id.text_view_id
				);
		tvTwo = (TextView)
			findViewById(
				R.id.tv_cronometro_ID
				);
		
    } // fim onCreate

	int i = 0;

	public void onClickButton (View v){
	
		Demanda d = new Demanda();
		
		d.setDoc("13243546" + i++);
		tvOne.setText(d.getDocumento());
		for (int i = 0;i<1000;i++){
			tvTwo.setText(i++ + "");
			Long l = (Long) 100.0;
			tvTwo.wait(100.0);
			
		}
	} //fim onClickButton
	
} // fim MainActivity 
