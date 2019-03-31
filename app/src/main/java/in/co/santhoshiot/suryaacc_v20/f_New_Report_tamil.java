package in.co.santhoshiot.suryaacc_v20;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class f_New_Report_tamil extends AppCompatActivity {


    private static final String TAG = "f_New_Report_tamil";

    private TextView mDisplayData;
    private TextView mDisplayData1;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    private DatePickerDialog.OnDateSetListener mDateSetListener1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f__new__report_tamil);

        mDisplayData = (TextView) findViewById(R.id.tv_date);
        mDisplayData1 = (TextView) findViewById(R.id.tv_date1);


        mDisplayData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DATE);
                mDisplayData.setTextColor(Color.parseColor("#963019"));

                DatePickerDialog dialog = new DatePickerDialog(
                        f_New_Report_tamil.this,
                    R.style.AppTheme,
                    mDateSetListener,
                    year,month,day
                );
               // dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG,"OnDateSet: mm/dd/yyy:" + month + "/" + day + "/" + year);
                String date = day + "/" + month + "/" + year;
                mDisplayData.setText(date);

            }
        };


        mDisplayData1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DATE);
                mDisplayData1.setTextColor(Color.parseColor("#963019"));

                DatePickerDialog dialog1 = new DatePickerDialog(
                        f_New_Report_tamil.this,
                        R.style.AppTheme,
                        mDateSetListener1,
                        year,month,day
                );
                // dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog1.show();
            }
        });

        mDateSetListener1 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG,"OnDateSet: mm/dd/yyy:" + month + "/" + day + "/" + year);
                String date = day + "/" + month + "/" + year;
                mDisplayData1.setText(date);

            }
        };


    }
}
