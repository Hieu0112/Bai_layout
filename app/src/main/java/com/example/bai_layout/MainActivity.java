package com.example.bai_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    private Spinner sp,sp1;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.test5);
//        sp=findViewById(R.id.sp2);
//        sp1=findViewById(R.id.sp1);
//        String[]list={
//                "PTIT",
//                "HUST",
//                "NEU",
//                "FTU"
//        };
//        ArrayAdapter<String>adapter=new ArrayAdapter<>(this,R.layout.item,list);
//        sp.setAdapter(adapter);
//        String[]list1=getResources().getStringArray(R.array.dat_nuoc);
//        ArrayAdapter<String>adapter1=new ArrayAdapter<>(this,R.layout.item,list1);
//        sp1.setAdapter(adapter1);
//    }

    private CheckBox ck1,ck2,ck3;
    private RadioButton g1,g2;
    private RatingBar rt;
    private Spinner sp1;
    private TextView kq;
    private Button btht;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test5);
        initView();
        initSpinner();
        btht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss="check box: ";
                if(ck1.isChecked()){
                    ss+=ck1.getText()+", ";
                }
                if(ck2.isChecked()){
                    ss+=ck2.getText()+", ";
                }
                if(ck3.isChecked()){
                    ss+=ck3.getText()+", ";
                }
                if(ss.endsWith(", ")){
                    ss=ss.substring(0,ss.length()-2);
                }
                ss+="\nGioi tinh: ";
                if(g1.isChecked()){
                    ss+=g1.getText()+".";
                }
                if(g2.isChecked()){
                    ss+=g2.getText()+".";
                }
                ss+="\nRating: "+rt.getRating();
                ss+="\nSpin: "+sp1.getSelectedItem().toString();
                kq.setText(ss);
            }
        });
    }

    private void initSpinner() {
        String[] list=getResources().getStringArray(R.array.dat_nuoc);
        ArrayAdapter<String>adapter= new ArrayAdapter<>(this,R.layout.item,list);
        sp1.setAdapter(adapter);
    }

    private void initView() {
        ck1=findViewById(R.id.ck1);
        ck2=findViewById(R.id.ck2);
        ck3=findViewById(R.id.ck3);
        g1=findViewById(R.id.gnam);
        g2=findViewById(R.id.gnu);
        rt=findViewById(R.id.rating);
        btht=findViewById(R.id.bt);
        kq=findViewById(R.id.kq);
        sp1=findViewById(R.id.sp1);
    }
}