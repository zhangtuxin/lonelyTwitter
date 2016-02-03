package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * The main activity for A SMALL personal Twitter aoo to capture notes and comments
 * <p> It saves the <pre> input tweets </pre></> in the json files.</p>
 * A sample code is as:<br>
 *     <code>
 *         for(int i =0;i<10;i++)
 *         	for (int j = 0;j<1;j++)
 *         		doSomething();
 *     </code>
 * The  list o important activities in this class are as follows:
 * <ul>
 *     <li>item1</li>
 *     <li>item2</li>
 *     <li>item3</li>
 *     <li>item4</li>
 * </ul>
 *@since 1.2.1
 * @see LonelyTwitterActivity for more information
 *@author Tuxin
 * @version 2.3
 * @deprecated
 */

public class LonelyTwitterActivity extends Activity {
	/**
	 * This  arraylist if for keeping the tweets and their date of posting.<br>
	 *     This is blah ~~~.
	 *     @see #loadFromFile()
	 *
	 */

	public ArrayList<String> ListOfItems;
	static final String FILE_NAME = "fuleName.json";

	private int calculateTweetSize(){

		return -1;
	}


	private String removeStopWords (String text){
		//
		return "";
	}

	/**
	 *This starts the next activity which is ~~.
	 * @param intent This is the intent to be run immediately after hitting "Start" button.
	 */
	private void startSecondActivity(Intent intent){
		//
	}

	/**
	 *This method does something.
	 * @param s	is some parameter
	 * @return The vaule that is used for some job.
	 * @throws  ...
	 * @deprecated
	 */
	public String someMethod(String s){
		return "";

	}


	/**
	 * This activity created for something..
	 * @param intent This is the intent that will run after clicking the button
	 * @return ture as always
	 * @deprecated
	 */
	public Boolean evaluateOtherActivity(Intent intent){
		int count = 0;
		Intent intent1=new Intent();
		String expression1="",expression2="",expression3="",expression4="";
		startSecondActivity(intent1);
		String S = someMethod ( expression1 + expression2 + expression3 + expression4 );
		someMethod ( expression1 + expression2 + expression3 + expression4 );
			//int count = 10; avoid;
			//
			//break;
		try{
			int a = 1;
			int b = 2;
			if (a < 2) {
				someMethod("First Choice");
			}
			else {
				someMethod("Second Choice");
			}
		while(1<2) {
			int j = 0;
		}
			//
		}catch(Exception e){}
		return true;
	}





	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;

	private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
	private ArrayAdapter<Tweet> adapter;

	/** Called when the activity is first created. */
	/**
	 *This method basiclly runs first
	 * inherient from parent
	 * @param savedInstanceState This parameter is needed. we need this to start the onCreate.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		//Button saveButton = (Button) findViewById(R.id.save);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);
		Button saveButton = (Button) findViewById(R.id.save);
		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();
				Tweet latestTweet = new NormalTweet(text);
				ImportantTweet latestImportantTweet = new ImportantTweet(text);
				// latestTweet.setMessage(latestTweet.getMessage() + "!");
				tweets.add(latestTweet);
				adapter.notifyDataSetChanged();
				saveInFile();
				//saveInFile(text, new Date(System.currentTimeMillis()));
				//finish();

			}
		});

		Button clearButton = (Button) findViewById(R.id.clear);
		clearButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v){
				setResult(RESULT_OK);
				tweets.clear();
				saveInFile();
				finish();
			}

		});

	}

	/**
	 * This method call a method that load the information from file
	 * then set the adapter
	 * This is "True" first start method
	 */
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		//String[] tweets = loadFromFile();
		loadFromFile();
		adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweets);
		oldTweetsList.setAdapter(adapter);
	}

	/**
	 * This method open a file input stream. Then load all the information from file
	 * Gson is good method . It convert the string to or from json.
	 */
	private void loadFromFile() {
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			Gson gson = new Gson();

			// Took from https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/Gson.html 01-19 2016
			Type listType = new TypeToken<ArrayList<NormalTweet>>() {}.getType();
			tweets = gson.fromJson(in, listType);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			tweets = new ArrayList<Tweet>();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}

	/**
	 * basiclly it is the reverse of the loadFromFile method.
	 * By obvious we can see all it does it convert the string to Gson then save in File.
	 */

	private void saveInFile() {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					0);
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));
			Gson gson = new Gson();
			gson.toJson(tweets, out);
			out.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
}