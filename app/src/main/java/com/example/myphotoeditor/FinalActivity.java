package com.example.myphotoeditor;

import static com.example.myphotoeditor.MainActivity.imgUri;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.dsphotoeditor.sdk.activity.DsPhotoEditorActivity;
import com.dsphotoeditor.sdk.utils.DsPhotoEditorConstants;
import com.example.myphotoeditor.databinding.ActivityFinalBinding;

public class FinalActivity extends AppCompatActivity {
ActivityFinalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFinalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        Log.d("toast123", getIntent().getData().toString() );
        binding.imageView3.setImageURI(getIntent().getData());
    }
}