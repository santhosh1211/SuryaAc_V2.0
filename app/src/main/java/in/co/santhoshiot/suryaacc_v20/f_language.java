package in.co.santhoshiot.suryaacc_v20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class f_language extends AppCompatActivity {

    private TextView tamil;
    private TextView english;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_language);

        tamil = findViewById(R.id.tv_tamil);
        english = findViewById(R.id.tv_english);


      tamil.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
             Intent intent = new Intent(f_language.this,f_Manger_Page_Tamil.class);
             startActivity(intent);
          }
      });

      english.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent1 = new Intent(f_language.this,f_Manger_Page.class);
              startActivity(intent1);
          }
      });



    }


}
