package in.co.santhoshiot.suryaacc_v20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class f_Login_Activity extends AppCompatActivity {

    private static final String TAG = "f_Login_Activity";

    private EditText username;
    private EditText password;
    private Button Login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_login__page);

        username = (EditText) findViewById(R.id.ed_username);
        password = (EditText) findViewById(R.id.ed_password);
        Login = (Button) findViewById(R.id.btn_login);








/*
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(f_Login_Activity.this, Report_Activity.class);
                startActivity(intent);
                validate(username.getText().toString(),password.getText().toString());
            }
        });
 */
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(username.getText().toString(),password.getText().toString());
            }
        });


    }

    private void validate(String username, String password){
       // if((username.equals("user")) && (password.equals("user2"))){
            Intent intent = new Intent(f_Login_Activity.this, f_Manger_Page_Tamil.class);
            startActivity(intent);
       // }
    }


}


















































