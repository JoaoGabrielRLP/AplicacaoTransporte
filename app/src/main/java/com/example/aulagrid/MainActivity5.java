package com.example.aulagrid;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity5 extends AppCompatActivity {
    private Button tela;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main5);
        VideoView meuvideo = (VideoView) findViewById(R.id.videoView);
        String uri = "android.resource://" + getPackageName() + "/" + R.raw.video;
        if (meuvideo != null) {
            meuvideo.setVideoURI(Uri.parse(uri));
            meuvideo.start();
            //controladores
            meuvideo.setMediaController(new MediaController(this));


        }
    }

    public void voltarSim (View view)
    {
        Intent b = new Intent(MainActivity5.this, MainActivity.class);
        startActivity(b);
    }
}
