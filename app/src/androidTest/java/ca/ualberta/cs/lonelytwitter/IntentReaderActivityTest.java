package ca.ualberta.cs.lonelytwitter;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.widget.TextView;

/**
 * Created by sajediba on 2/8/16.
 */
public class IntentReaderActivityTest extends ActivityInstrumentationTestCase2{

    public IntentReaderActivityTest() {
        super(IntentReaderActivity.class);
    }

    public void testSendText(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 1");

        setActivityIntent(intent);

        IntentReaderActivity ira = (IntentReaderActivity)getActivity();

        assertEquals("IntentReaderActivity should get the text from intent","message 1",ira.getText());
    }
    //

    public void testDisplayText(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 2");
        setActivityIntent(intent);
        IntentReaderActivity ira = (IntentReaderActivity)getActivity();
        TextView textView = (TextView) ira.findViewById(R.id.intentText);
        assertEquals("The text should be displayed","message 2",textView.getText().toString());
    }
    //
    public void testDoubleText(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 3");
        intent.putExtra(IntentReaderActivity.MODE_OF_TRANSFORM_KEY, IntentReaderActivity.DOUBLE);
        setActivityIntent(intent);
        IntentReaderActivity ira = (IntentReaderActivity)getActivity();
        assertEquals("The Text should be repeated twice!","message 3message 3",ira.getText());
    }
    //
    //
    public void testReverseText(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 4");
        intent.putExtra(IntentReaderActivity.MODE_OF_TRANSFORM_KEY, IntentReaderActivity.REVERSE);
        setActivityIntent(intent);
        IntentReaderActivity ira = (IntentReaderActivity)getActivity();
        assertEquals("The text should be reversed","4 egassem",ira.getText());
    }

    public void testDefaultText(){
        Intent intent = new Intent();
        //intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 5");   "No text will be sent"
        intent.putExtra(IntentReaderActivity.MODE_OF_TRANSFORM_KEY, IntentReaderActivity.NORMAL);
        setActivityIntent(intent);
        IntentReaderActivity ira = (IntentReaderActivity)getActivity();
        assertEquals("The default text should be displayed", "default text", ira.getText());
    }

    public void testViewAssert(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 5");
        setActivityIntent(intent);
        IntentReaderActivity ira = (IntentReaderActivity)getActivity();
        TextView textView = (TextView) ira.findViewById(R.id.intentText);
        ViewAsserts.assertOnScreen(ira.getWindow().getDecorView(),textView);

    }
    //TODO: Add your code here ...
//-------------------------------------------------------------------------------

//-------------------------------------------------------------------------------
}
