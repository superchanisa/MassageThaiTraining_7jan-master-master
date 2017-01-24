package rtc.chanisa.kanokporn.massagethaitraining;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetail extends AppCompatActivity {

    //Explicit
    private int index;
    private ImageView topImageView, bottonImageView;
    private TextView topTextView, bottonTextView;
    private int[] ints = new int[2];
    private String[] strings = new String[2];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        bindWidget();

        index = getIntent().getIntExtra("Index", 0);
        Log.d("2decV1", "index ==> " + index);

        chooseData();


    }   // Main Method

    private void chooseData() {
        switch (index) {
            case 0:
                ints[0] = R.drawable.forehead1;
                ints[1] = R.drawable.hub33;
                strings[0] = "ผู้ถูกนวด นั่งอยู่ด้านหน้าผู้นวด(หันหน้าออก)"+
                                           "ผู้นวด นั่งอยู่ด้านหลังคนไข้ ";
                strings[1] = "วิธีการนวด ใช้นิ้วหัวแม่มือกดเส้นกล้ามเนื้อที่คอ " +
                             "กดไล่เรียงไปด้านบนชิดฐานกะโหลกกดผู้นวดจะต้องใช้มือด้านที่อยู่ฝั่งตรงข้าม กับคอด้านที่จะกดและตั้งเข่าตรงข้ามกับ มือด้านที่ใช้กดมืออีกข้างประคองที่หน้าผากกดนวดขึ้นด้านบนอย่างเดียวไม่กด นวดลง";
                break;
            case 1:
                ints[0] = R.drawable.arm1;
                ints[1] = R.drawable.arm2;
                strings[0] = "ผู้ถูกนวด นอนหงายยืดขาตรง " +

                                      "ผู้นวด นั่งคุกเข่าคู่ด้านข้างของคนไข้";
                strings[1] = "วิธีการนวด " +

                        "๑.คว่ำมือใช้นิ้วหัวแม่มือกดบนกึ่งกลาง แขนท่อนบนด้านนอก(แนวตกของกล้าม เนื้อต้นแขน)หันหน้าเข้าหาผู้ถูกนวด หงายมือวางนิ้วหัวแม่มือคู่กดตามแนวนิ้วกลางเริ่มจากใต้ข้อศอกไปจนถึงบริเวณ เหนือข้อมือ\n" +
                             "๒.คว่ำมือใช้นิ้วหัวแม่มือกดบนหน้าขา และขาด้านใน-ด้านนอกเริ่มจากเข่าลงไปกระดูกข้อเท้า ";
                break;
            case 2:
                ints[0] = R.drawable.back1;
                ints[1] = R.drawable.back2;
                strings[0] = "ผู้ถูกนวด นอนคว่ำยืดขาตรง " +
                                                    "ผู้นวด นั่งคุกเข่าคู่ด้านข้างของคนไข้";
                strings[1] = "วิธีการนวด " +
                                    "นิ้วหัวแม่มือชนกัน นวดจากต้นคอลงมาจนถึงเอวหรือสะโพกช่วยทำให้คลายเส้น และลดอาการปวดหลัง";
                break;
            case 3:
                ints[0] = R.drawable.hip1;
                ints[1] = R.drawable.hip2;
                strings[0] = "ผู้นวด นั่่งคุกเข่าคู่ด้านหลังคนไข้ " +
                             "ผู้ถูกนวด นอนตะแคงหันหลังให้ผู้นวด";
                strings[1] = "วิธีการนวด " +
                        "นิ้วหัวแม่มือชนกันวางคู่ขนาน นวดบ่าลงมาจนถึงสะโพก";
                break;
            case 4:
                ints[0] = R.drawable.foot1;
                ints[1] = R.drawable.foot2;
                strings[0] = "ผู้ถูกนวด นอนหงายหรือนั่งยืดขาตรง " +
                             "ผู้นวด นั่งคุกเข่าคู่ด้านข้างคนไข้ หัน 90 องศา ไปทางฝ่าเท้าคนไข้";
                strings[1] = "วิธีการนวด " +
                                                "นิ้วหัวแม่มือชนกัน และกดลงเบาๆบนหลังเท้าและฝ่าเท้าตั้งแต่ข้อเท้าลงมายังฝ่าเท้า";
                break;
            case 5:
                ints[0] = R.drawable.arm1;
                ints[1] = R.drawable.arm1;
                strings[0] = "";
                strings[1] = "";
                break;
        }

        topImageView.setImageResource(ints[0]);
        bottonImageView.setImageResource(ints[1]);
        topTextView.setText(strings[0]);
        bottonTextView.setText(strings[1]);

    }

    private void bindWidget() {
        topImageView = (ImageView) findViewById(R.id.imageView8);
        bottonImageView = (ImageView) findViewById(R.id.imageView9);
        topTextView = (TextView) findViewById(R.id.textView9);
        bottonTextView = (TextView) findViewById(R.id.textView10);
    }

    public void ClickButton (View view) {
        startActivity(new Intent(ShowDetail.this, MainHub.class));

    }

}   // Main Class
