package in.co.santhoshiot.suryaacc_v20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class f_Manger_Page extends AppCompatActivity {

    private Button Nr_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f__manger_page);

        Nr_btn = (Button)findViewById(R.id.SubmitButton);

        Nr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(f_Manger_Page.this, f_New_Report.class);
                startActivity(intent);
            }
        });




    }
}
