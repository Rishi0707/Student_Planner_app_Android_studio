package com.example.studentplanner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;
    Toolbar t;

    FirebaseAuth auth;
    TextView textView1;
    TextView textView2;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        auth=FirebaseAuth.getInstance();
        textView1=findViewById(R.id.uemail);
        textView2=findViewById(R.id.name);
        user= auth.getCurrentUser();
        if(user==null){
            Intent intent=new Intent(MainActivity.this, Login.class);
            startActivity(intent);
            finish();
        }
        else{
            textView1.setText(user.getDisplayName()+user.getDisplayName());
            textView2.setText(user.getEmail());
        }

        drawerLayout = findViewById(R.id.drwerlayout);
        navigationView = findViewById(R.id.navmenu);
        t=findViewById(R.id.materialToolbar);
        setSupportActionBar(t);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.start, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(this);



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return true;

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.todo){
            Toast.makeText(this, "todo", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this, todo.class);
            startActivity(intent);
        } else if (item.getItemId()==R.id.tt) {
            Toast.makeText(this, "tt", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this, TT.class);
            startActivity(intent);

        }else if (item.getItemId()==R.id.juno) {
            Toast.makeText(this, "juno", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this, juno.class);
            startActivity(intent);

        }else if (item.getItemId()==R.id.PYQ) {
            Toast.makeText(this, "pyq", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this, Pdf.class);
            startActivity(intent);

        }else if (item.getItemId()==R.id.Members) {
            Toast.makeText(this, "members", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this, Members.class);
            startActivity(intent);

        }
        else if (item.getItemId()==R.id.notices) {
            Toast.makeText(this, "notices", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(MainActivity.this, NoticeActivity.class);
            startActivity(intent);

        }else if (item.getItemId()==R.id.logout) {
            FirebaseAuth.getInstance().signOut();
            Intent intent=new Intent(MainActivity.this, Login.class);
            startActivity(intent);
            finish();

        }
        return true;
    }
}