package johnross.delacruz.com.delacruzjohnrossexam2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
    }

    public void process(View v) {
        Intent i = null, chooser = null;

        if (v.getId() == R.id.btnPrev) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);

            Log.d("Second Activity", "PREVIOUS button was pressed.");
        }
    }
}
