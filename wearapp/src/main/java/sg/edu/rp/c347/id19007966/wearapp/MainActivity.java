package sg.edu.rp.c347.id19007966.wearapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import sg.edu.rp.c347.id19007966.wearapp.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
    }
}