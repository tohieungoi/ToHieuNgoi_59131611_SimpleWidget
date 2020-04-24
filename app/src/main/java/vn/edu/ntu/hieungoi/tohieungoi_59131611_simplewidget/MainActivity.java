package vn.edu.ntu.hieungoi.tohieungoi_59131611_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtname,edtdate,edtstk;
    RadioGroup grb;
    RadioButton grb1,grb2;
    Button btn;
    CheckBox cb1,cb2,cb3,cb4,cb5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvents();
    }

    private void addView()
    {
      edtname = findViewById(R.id.edtname);
      edtdate = findViewById(R.id.edtdate);
      edtstk = findViewById(R.id.edtstk);
      grb = findViewById(R.id.grb);
      btn = findViewById(R.id.btn);
      cb1 = findViewById(R.id.cb1);
      cb2 = findViewById(R.id.cb2);
      cb3 = findViewById(R.id.cb3);
      cb4 = findViewById(R.id.cb4);
      cb5 = findViewById(R.id.cb5);
      grb1 = findViewById(R.id.grb1);
      grb2 = findViewById(R.id.grb2);



    }
    private void addEvents()
    {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                String text = "";

                text +="Tên : "+edtname.getText().toString();
                text +="\nNgày Sinh : "+edtdate.getText().toString();

                switch (grb.getCheckedRadioButtonId())
                {
                    case R.id.grb1 :  text+="\nGiới Tính : Nam"; break;
                    case R.id.grb2 :  text+="\nGiới Tính : Nữ"; break;
                }
                text +="\nSở thích : ";
                if(cb1.isChecked()) text +=cb1.getText().toString()+"; ";
                if(cb2.isChecked()) text +=cb2.getText().toString()+"; ";
                if(cb3.isChecked()) text +=cb3.getText().toString()+"; ";
                if(cb4.isChecked()) text +=cb4.getText().toString()+"; ";
                if(cb5.isChecked()) text +=cb5.getText().toString()+"; ";
                text+= edtstk.getText().toString();


                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });
    }

}
