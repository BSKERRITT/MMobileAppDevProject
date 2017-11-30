package bskerritt.student.ncirl.ie.saddleup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {

    private int SLEEP_DELAY = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        //https://www.youtube.com/watch?v=w4FDTAHRaUY
        SplashLauncher splashLauncher = new SplashLauncher();
        splashLauncher.start();
    }

    //https://www.youtube.com/watch?v=w4FDTAHRaUY
    private class SplashLauncher extends Thread{
        public void run(){
            try{
                sleep(SLEEP_DELAY);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            Intent i = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        }
    }
}
