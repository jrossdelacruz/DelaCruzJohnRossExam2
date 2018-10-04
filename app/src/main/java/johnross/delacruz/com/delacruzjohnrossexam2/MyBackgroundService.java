package johnross.delacruz.com.delacruzjohnrossexam2;


import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyBackgroundService extends IntentService{

    public MyBackgroundService() {
        super("MyBackgroundService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("Background Service","Background Service is running.");
    }
}
