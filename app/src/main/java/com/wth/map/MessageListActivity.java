package com.wth.map;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MessageListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_list);
    }

    public void addChat(View view) {
        LinearLayout linearLayout = findViewById(R.id.layoutchat);
        EditText chatbox = findViewById(R.id.edittext_chatbox);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(10,10,10,10);

//        TextView tv = findViewById(R.id.textView7);
        TextView tv = new TextView(this);
        tv.setText(chatbox.getText());
        tv.setBackgroundResource(R.drawable.rounded_rectangle_green);
        tv.setMaxWidth(300);
        tv.setPadding(10, 10, 10,10);
        tv.setLayoutParams(params);
        tv.setGravity(Gravity.RIGHT);
        linearLayout.addView(tv);

        TextView tv2 = new TextView(this);
        tv2.setText("Maaf sistem masih dalam tahap pengembangan");
        tv2.setBackgroundResource(R.drawable.rounded_rectangle_orange);
        tv2.setMaxWidth(300);
        tv2.setPadding(10, 10, 10,10);
        tv2.setLayoutParams(params);
        tv2.setGravity(Gravity.LEFT);
        linearLayout.addView(tv2);
    }
}
