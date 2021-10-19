package com.example.databinding_intro;

import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class Custom_User {
    private static final String TAG = "Tag";

    private String name;
    private int age;
    private boolean active;
    private String imageUrl;

    public Custom_User(String name, int age, boolean active, String imageUrl) {
        this.name = name;
        this.age = age;
        this.active = active;
        this.imageUrl = imageUrl;
    }

    public void handleClick_Method2(){
        Log.d(TAG,"handleClick_Method2: "+this.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Custom_User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", active=" + active +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }

    @BindingAdapter("android:my_image_load")
    public static void loadImage(ImageView imageView, String imageUrl){
        Glide.with(imageView)
                .load(imageUrl)
                .into(imageView);
    }


}
