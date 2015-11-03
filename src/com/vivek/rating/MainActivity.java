package com.vivek.rating;

import android.support.v7.app.ActionBarActivity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class MainActivity extends ActionBarActivity implements
		RatingBar.OnRatingBarChangeListener {

	private EditText movieName;
	private EditText userReview;
	private EditText releaseYear;
	private EditText movieDuration;
	private RatingBar yourRating;
	private EditText movieStarring;
	private EditText movieDirector;
	private Button mSaveButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		movieName = (EditText) findViewById(R.id.editText2);
		userReview = (EditText) findViewById(R.id.editText1);
		releaseYear = (EditText) findViewById(R.id.editText3);
		movieDuration = (EditText) findViewById(R.id.editText4);
		userReview = (EditText) findViewById(R.id.editText1);
		yourRating = (RatingBar) findViewById(R.id.ratingBar1);
		movieStarring = (EditText) findViewById(R.id.editText5);
		movieDirector = (EditText) findViewById(R.id.editText6);
		mSaveButton = (Button) findViewById(R.id.button1);
	}

	public class OnButtonClick implements OnClickListener

	{

		@Override
		public void onClick(DialogInterface dialog, int which) {
			// TODO Auto-generated method stub
			
		}
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

	@Override
	public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
		// Set the rating as specified by the user
		yourRating.setRating(arg1);

	}
}
