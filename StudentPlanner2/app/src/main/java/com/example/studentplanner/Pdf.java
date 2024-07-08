package com.example.studentplanner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Pdf extends AppCompatActivity {


    ListView pdfListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        pdfListView=(ListView) findViewById(R.id.myPDFList);


        String[] pdfFiles = {"ARTIFICIAL INTELLIGENCE","COMPUTER NETWORK","CRYPTOGRAPHY","OPERATING SYSTEMS","DATA STRUCTURES AND ALGORITHMS","DATABASE MANAGEMENT SYSTEMS","THEORY OF COMPUTATION","DESIGN AND ANALYSIS OF ALGORITHM","OBJECT ORIENTED PROGRAMMING"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pdfFiles){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position,convertView, parent);
                TextView syText = (TextView) view.findViewById(android.R.id.text1);
                return view ;
            }
        };

        pdfListView.setAdapter(adapter);

        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = pdfListView.getItemAtPosition(1).toString();
                Intent start = new Intent(getApplicationContext(),PdfOpener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}