package com.example.studentplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.HashMap;
import java.util.Locale;

public class TT extends AppCompatActivity {

    Dialog dialog;
    EditText editText;
    Button delete_subject,add_subject;

    String timetable_subject;

    TextView Sun1,Sun2,Sun3,Sun4,Sun5,Sun6,Sun7,
            Mon1,Mon2,Mon3,Mon4,Mon5,Mon6,Mon7,
            Tue1,Tue2,Tue3,Tue4,Tue5,Tue6,Tue7,
            Wed1,Wed2,Wed3,Wed4,Wed5,Wed6,Wed7,
            Thu1,Thu2,Thu3,Thu4,Thu5,Thu6,Thu7,
            Fri1,Fri2,Fri3,Fri4,Fri5,Fri6,Fri7,
            Sat1,Sat2,Sat3,Sat4,Sat5,Sat6,Sat7;

    TextView timeslot1,timeslot2,timeslot3,timeslot4,
            timeslot5,timeslot6,timeslot7,timeslot8,
            timeslot9,timeslot10,timeslot11,timeslot12,
            timeslot13,timeslot14;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tt);


        //levels.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        dialog=new Dialog(TT.this);
        dialog.setContentView(R.layout.custom_popup_dialog);
        //dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.baji));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);



        editText=dialog.findViewById(R.id.po);
        add_subject=dialog.findViewById(R.id.add_subject);
        delete_subject=dialog.findViewById(R.id.delete_subject);



        //--------timeslots-------------------------------------
        timeslot1=findViewById(R.id.timeslot1);
        timeslot2=findViewById(R.id.timeslot2);
        timeslot3=findViewById(R.id.timeslot3);
        timeslot4=findViewById(R.id.timeslot4);
        timeslot5=findViewById(R.id.timeslot5);
        timeslot6=findViewById(R.id.timeslot6);
        timeslot7=findViewById(R.id.timeslot7);
        timeslot8=findViewById(R.id.timeslot8);
        timeslot9=findViewById(R.id.timeslot9);
        timeslot10=findViewById(R.id.timeslot10);
        timeslot11=findViewById(R.id.timeslot11);
        timeslot12=findViewById(R.id.timeslot12);
        timeslot13=findViewById(R.id.timeslot13);
        timeslot14=findViewById(R.id.timeslot14);

        timeslot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot1,"timeslot1");


            }
        });
        timeslot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot2,"timeslot2");

            }
        });
        timeslot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot3,"timeslot3");

            }
        });
        timeslot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot4,"timeslot4");

            }
        });
        timeslot5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot5,"timeslot5");

            }
        });
        timeslot6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot6,"timeslot6");

            }
        });
        timeslot7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot7,"timeslot7");

            }
        });
        timeslot8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot8,"timeslot8");

            }
        });
        timeslot9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot9,"timeslot9");

            }
        });
        timeslot10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot10,"timeslot10");

            }
        });
        timeslot11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot11,"timeslot11");

            }
        });
        timeslot12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot12,"timeslot12");

            }
        });
        timeslot13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot13,"timeslot13");

            }
        });
        timeslot14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pickTime(timeslot14,"timeslot14");

            }
        });











        Sun1=findViewById(R.id.Sunday1);
        Sun2=findViewById(R.id.Sunday2);
        Sun3=findViewById(R.id.Sunday3);
        Sun4=findViewById(R.id.Sunday4);
        Sun5=findViewById(R.id.Sunday5);
        Sun6=findViewById(R.id.Sunday6);
        Sun7=findViewById(R.id.Sunday7);

        Mon1=findViewById(R.id.Monday1);
        Mon2=findViewById(R.id.Monday2);
        Mon3=findViewById(R.id.Monday3);
        Mon4=findViewById(R.id.Monday4);
        Mon5=findViewById(R.id.Monday5);
        Mon6=findViewById(R.id.Monday6);
        Mon7=findViewById(R.id.Monday7);

        Tue1=findViewById(R.id.Tuesday1);
        Tue2=findViewById(R.id.Tuesday2);
        Tue3=findViewById(R.id.Tuesday3);
        Tue4=findViewById(R.id.Tuesday4);
        Tue5=findViewById(R.id.Tuesday5);
        Tue6=findViewById(R.id.Tuesday6);
        Tue7=findViewById(R.id.Tuesday7);

        Wed1=findViewById(R.id.Wednesday1);
        Wed2=findViewById(R.id.Wednesday2);
        Wed3=findViewById(R.id.Wednesday3);
        Wed4=findViewById(R.id.Wednesday4);
        Wed5=findViewById(R.id.Wednesday5);
        Wed6=findViewById(R.id.Wednesday6);
        Wed7=findViewById(R.id.Wednesday7);


        Thu1=findViewById(R.id.Thursday1);
        Thu2=findViewById(R.id.Thursday2);
        Thu3=findViewById(R.id.Thursday3);
        Thu4=findViewById(R.id.Thursday4);
        Thu5=findViewById(R.id.Thursday5);
        Thu6=findViewById(R.id.Thursday6);
        Thu7=findViewById(R.id.Thursday7);


        Fri1=findViewById(R.id.Friday1);
        Fri2=findViewById(R.id.Friday2);
        Fri3=findViewById(R.id.Friday3);
        Fri4=findViewById(R.id.Friday4);
        Fri5=findViewById(R.id.Friday5);
        Fri6=findViewById(R.id.Friday6);
        Fri7=findViewById(R.id.Friday7);


        Sat1=findViewById(R.id.Saturday1);
        Sat2=findViewById(R.id.Saturday2);
        Sat3=findViewById(R.id.Saturday3);
        Sat4=findViewById(R.id.Saturday4);
        Sat5=findViewById(R.id.Saturday5);
        Sat6=findViewById(R.id.Saturday6);
        Sat7=findViewById(R.id.Saturday7);





        //click listerns -----------------------------------------------------------------
        Sun1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                show(Sun1,"Sunday1");






            }
        });
        Sun2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Sun2,"Sunday2");


            }
        });
        Sun3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Sun3,"Sunday3");


            }
        });
        Sun4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Sun4,"Sunday4");


            }
        });
        Sun5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Sun5,"Sunday5");


            }
        });
        Sun6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Sun6,"Sunday6");




            }
        });
        Sun7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Sun7,"Sunday7");

            }
        });

        Mon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Mon1,"Monday1");

            }
        });
        Mon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Mon2,"Monday2");


            }
        });
        Mon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Mon3,"Monday3");

            }
        });
        Mon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Mon4,"Monday4");


            }
        });
        Mon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Mon5,"Monday5");


            }
        });
        Mon6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Mon6,"Monday6");

            }
        });
        Mon7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Mon7,"Monday7");

            }
        });

        Tue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Tue1,"Tuesday1");

            }
        });
        Tue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Tue2,"Tuesday2");

            }
        });
        Tue3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Tue3,"Tuesday3");

            }
        });
        Tue4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Tue4,"Tuesday4");

            }
        });
        Tue5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Tue5,"Tuesday5");

            }
        });
        Tue6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Tue6,"Tuesday6");

            }
        });
        Tue7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Tue7,"Tuesday7");

            }
        });


        Wed1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Wed1,"Wednesday1");

            }
        });
        Wed2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Wed2,"Wednesday2");

            }
        });
        Wed3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Wed3,"Wednesday3");

            }
        });
        Wed4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Wed4,"Wednesday4");

            }
        });
        Wed5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Wed5,"Wednesday5");

            }
        });
        Wed6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Wed6,"Wednesday6");

            }
        });
        Wed7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Wed7,"Wednesday7");

            }
        });

        Thu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Thu1,"Thursday1");

            }
        });
        Thu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Thu2,"Thursday2");

            }
        });
        Thu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Thu3,"Thursday3");

            }
        });
        Thu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Thu4,"Thursday4");

            }
        });
        Thu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Thu5,"Thursday5");

            }
        });
        Thu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Thu6,"Thursday6");

            }
        });
        Thu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Thu7,"Thursday7");

            }
        });


        Fri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Fri1,"Friday1");

            }
        });
        Fri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Fri2,"Friday2");

            }
        });
        Fri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Fri3,"Friday3");

            }
        });
        Fri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Fri4,"Friday4");

            }
        });
        Fri5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Fri5,"Friday5");

            }
        });
        Fri6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Fri6,"Friday6");

            }
        });
        Fri7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Fri7,"Friday7");

            }
        });

        Sat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Sat1,"Saturday1");

            }
        });
        Sat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Sat2,"Saturday2");

            }
        });
        Sat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Sat3,"Saturday3");

            }
        });
        Sat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Sat4,"Saturday4");

            }
        });
        Sat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Sat5,"Saturday5");

            }
        });
        Sat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Sat6,"Saturday6");

            }
        });
        Sat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show(Sat7,"Saturday7");

            }
        });




    }
    public void show(TextView textView,String dayname){
        timetable_subject=null;

        dialog.show();








        add_subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timetable_subject=editText.getText().toString();

                if(timetable_subject.isEmpty()){
                    editText.requestFocus();
                    editText.setError("field is empty");
                }else{
                    HashMap<String, Object> values = new HashMap<>();
                    values.put(dayname, timetable_subject);

                    textView.setText(timetable_subject);
                    editText.setText("");
                    dialog.dismiss();}
            }
        });
        delete_subject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                textView.setText("");
                dialog.dismiss();
            }
        });
    }
    public void pickTime(TextView textView,String slotname){


        TimePickerDialog timePickerDialog=new TimePickerDialog(TT.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int h, int m) {
                String time=String.format(Locale.getDefault(),"%02d:%02d",h,m);
                HashMap<String, Object> values = new HashMap<>();
                values.put(slotname, time);

                textView.setText(time);

            }
        },0,0,true);
        timePickerDialog.show();
    }

    @Override
    protected void onPause() {

        super.onPause();
    }}


