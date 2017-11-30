package bskerritt.student.ncirl.ie.saddleup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditRiderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_rider);
    }

    public void saveButtonClicked(View v){
        String riderNameText = ((EditText)findViewById(R.id.riderName)).getText().toString();
        if(riderNameText.equals("")){

        }else{
            Intent intent = new Intent();
            intent.putExtra(Intent_Constants.INTENT_MESSAGE_FIELD, riderNameText);
            setResult(Intent_Constants.INTENT_RESULT_CODE, intent);
            finish();
        }
    }
}
