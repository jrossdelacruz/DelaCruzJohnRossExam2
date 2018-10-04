package johnross.delacruz.com.delacruzjohnrossexam2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, MyBackgroundService.class);
        startService(i);
    }

    public void process(View v) {
        Intent i=null, chooser=null;

        if(v.getId() == R.id.btnNext) {
            i = new Intent(this, SecondActivity.class);
            startActivity(i);

            Log.d("Main Activity", "NEXT button was pressed.");
        } else if(v.getId() == R.id.btnMap) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo: 14.610358, 120.991927"));
            chooser = Intent.createChooser(i, "Choose a Map App");
            startActivity(chooser);

            Log.d("Main Activity", "MAP button was pressed.");
        }
    }
}
