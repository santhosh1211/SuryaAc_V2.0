package in.co.santhoshiot.suryaacc_v20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class f_Manger_Page_Tamil extends AppCompatActivity {

    private Button Nr_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f__manger_page_tamil);

        Nr_btn = (Button)findViewById(R.id.SubmitButton);

        Nr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(f_Manger_Page_Tamil.this, f_New_Report_tamil.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.abt:
                Intent intent1 = new Intent(this,f_About.class);
                this.startActivity(intent1);
                return true;

            case R.id.log:
                    Intent intent2 = new Intent(this,f_Login_Activity.class);
                    this.startActivity(intent2);
                    return true;

            case R.id.lan:
                Intent intent3 = new Intent(this,f_language.class);
                this.startActivity(intent3);
                return true;
        default:
                return super.onOptionsItemSelected(item);
        }
    }
}






















