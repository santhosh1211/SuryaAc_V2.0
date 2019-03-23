package in.co.santhoshiot.suryaacc_v20;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Manager_page_Activity extends AppCompatActivity {

    private Button Login1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_page_);

        Login1 = (Button)findViewById(R.id.btn_login1);
        Login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Manager_page_Activity.this, Report_Activity.class);
                startActivity(intent);
            }
        });


       final TextView d_time1 = (TextView)findViewById(R.id.d_time);

        final Handler someHandler = new Handler(getMainLooper());
        someHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                d_time1.setText(new SimpleDateFormat("dd-MM-yyyy  hh:mm a", Locale.US).format(new Date()));
                someHandler.postDelayed(this,1000);

            }
        },10);
    }
}











