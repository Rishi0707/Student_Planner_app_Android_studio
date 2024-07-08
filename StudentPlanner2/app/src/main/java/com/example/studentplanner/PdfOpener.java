package com.example.studentplanner;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfOpener extends AppCompatActivity {

    PDFView myPDFViewer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_opener);

        myPDFViewer = (PDFView) findViewById(R.id.pdfView);
        String getitems = getIntent().getStringExtra("pdfFileName");

        if(getitems.equals("ARTIFICIAL INTELLIGENCE"))   {
            myPDFViewer.fromAsset("ARTIFICIAL INTELLIGENCE.pdf").load();
        }
        if(getitems.equals("COMPUTER NETWORK"))   {
            myPDFViewer.fromAsset("COMPUTER NETWORK.pdf").load();
        }
        if(getitems.equals("CRYPTOGRAPHY"))   {
            myPDFViewer.fromAsset("CRYPTOGRAPHY.pdf").load();
        }
        if(getitems.equals("OPERATING SYSTEMS"))   {
            myPDFViewer.fromAsset("OPERATING SYSTEMS.pdf").load();
        }
        if(getitems.equals("DATA STRUCTURES AND ALGORITHMS"))   {
            myPDFViewer.fromAsset("DATA STRUCTURES AND ALGORITHMS.pdf").load();
        }
        if(getitems.equals("OBJECT ORIENTED PROGRAMMING"))   {
            myPDFViewer.fromAsset("OBJECT ORIENTED PROGRAMMING.pdf").load();
        }
        if(getitems.equals("DESIGN AND ANALYSIS OF ALGORITHM"))   {
            myPDFViewer.fromAsset("DESIGN AND ANALYSIS OF ALGORITHM.pdf").load();
        }
        if(getitems.equals("DATABASE MANAGEMENT SYSTEMS"))   {
            myPDFViewer.fromAsset("DATABASE MANAGEMENT SYSTEMS.pdf").load();
        }
        if(getitems.equals("THEORY OF COMPUTATION"))   {
            myPDFViewer.fromAsset("THEORY OF COMPUTATION.pdf").load();
        }
    }
}
