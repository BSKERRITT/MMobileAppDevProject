package bskerritt.student.ncirl.ie.saddleup;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button lessonBtn = (Button)findViewById(R.id.button);
        final Button riderButton = (Button)findViewById(R.id.button2);
        final Button activityButton = (Button)findViewById(R.id.button3);

        lessonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lessonBtn.setBackgroundColor(Color.BLACK);
                Intent i = new Intent(getApplicationContext(), LessonsActivity.class);
                startActivity(i);
            }
        });

        riderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //riderButton.setBackgroundColor(Color.BLACK);
                Intent i = new Intent(getApplicationContext(), RiderActivity.class);
                startActivity(i);
            }
        });

        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //activityButton.setBackgroundColor(Color.BLACK);
                Intent i = new Intent(getApplicationContext(), ActivitiesActivity.class);
                startActivity(i);
            }
        });
    }
}
