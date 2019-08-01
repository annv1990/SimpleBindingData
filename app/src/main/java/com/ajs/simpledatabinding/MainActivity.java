package com.ajs.simpledatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ajs.simpledatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    User mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mUser = new User();
        mUser.setName("An Huong");
        mUser.setEmail("annv1990@gmail.com");
        binding.setUser(mUser);
        User user1 = new User();
        user1.setName("dfdfdf");
        user1.setEmail("ABC, xys dfff");
        binding.content.setUser1(user1);
    }
}
