package rtc.chanisa.kanokporn.massagethaitraining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Come extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.come);

    }   // Main Method

    public void clickButton7(View view) {
        startActivity(new Intent(Come.this, MainHub.class));
    }

    public void clickButton3(View view) {
        startActivity(new Intent(Come.this, Main1Activity.class));
    }

    public void clickButton4(View view) {
        startActivity(new Intent(Come.this, Main2Activity.class));
    }

    public void clickButton5(View view) {
        startActivity(new Intent(Come.this, Main3Activity.class));
    }

    public void clickButton6(View view) {
        startActivity(new Intent(Come.this, Main4Activity.class));
    }



}   // Main Class
