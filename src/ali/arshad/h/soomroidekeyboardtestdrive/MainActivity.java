package ali.arshad.h.soomroidekeyboardtestdrive;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText editText = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editText = (EditText) findViewById(R.id.et);
		editText.setInputType(0);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
