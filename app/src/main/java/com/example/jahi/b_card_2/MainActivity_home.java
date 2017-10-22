package com.example.jahi.b_card_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ojste.rss_reader.MainActivity_rss_reader_0;
import com.example.ojste.tab_view_3.MainActivity;

public class MainActivity_home extends AppCompatActivity {

    private View.OnClickListener start_up = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked

            Intent intent = new Intent(v.getContext(),MainActivity.class);


            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
        Button button_1 = (Button)findViewById(R.id.button);
        button_1.setOnClickListener(start_up);
    }

}
