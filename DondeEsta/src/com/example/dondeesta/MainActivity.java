package com.example.dondeesta;

//import com.example.lanzarmapa.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	EditText editText1;//declaracio de la caixa de text
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//
		final Button boton=(Button) findViewById(R.id.button1);
    
        boton.setOnClickListener(new Button.OnClickListener(){
        	
			@Override
			public void onClick(View v) {
				//li asigne a la variable de la caixa de text la id de la corresponent
				editText1=(EditText) findViewById(R.id.editText1);
				Intent mapa = new Intent(
						android.content.Intent.ACTION_VIEW,
						//faig el mateix que avanç sols que li done la direccio de la caixa de text
						Uri.parse("geo:0,0?q="+editText1.getText().toString())
						);
				//llança gmaps
				startActivity(mapa);
			}
        		
        }
        		); 
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
