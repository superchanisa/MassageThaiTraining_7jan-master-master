package rtc.chanisa.kanokporn.massagethaitraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }// Main Method

    public void clickButton9(View view) {
        startActivity(new Intent(Main3Activity.this, Come.class));
    }

}// Main Class
