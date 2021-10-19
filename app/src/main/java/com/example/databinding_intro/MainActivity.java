package com.example.databinding_intro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding_intro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        //activityMainBinding.setMyVariable("DataBinding Text..."); // "setMyVariable" method ta Automatically generated by DATABINDING Class

        Custom_User user = new Custom_User("Akash",23,true, "https://i.picsum.photos/id/237/200/200.jpg");

        activityMainBinding.setCustomUser(user); // "setUser" method ta Automatically generated by DATABINDING Class


        //1st Way of Adding Listener to Button
        activityMainBinding.buttonId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"First Way of ButtonClick",Toast.LENGTH_SHORT).show();
            }
        });

    }
}