package rtc.chanisa.kanokporn.massagethaitraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }// Main Method


    public void clickButton8 (View View) {
        startActivity(new Intent(Main1Activity.this, Come.class));
    }

}// Main Class
