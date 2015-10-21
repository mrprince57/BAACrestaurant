package th.or.baac.klinkul.prin.baacrestaurant;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    // Explicit
    private ImageView monkeyImageView;
    private AnimationDrawable objAnimationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Show Animate
        monkeyImageView = (ImageView) findViewById(R.id.imvMonkey);
        monkeyImageView.setBackgroundResource(R.anim.monkey);
        objAnimationDrawable = (AnimationDrawable) monkeyImageView.getBackground();
        objAnimationDrawable.start();

        // Auto Thread
        Handler objHandler = new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        }, 5000);

        // Sound Effect
        MediaPlayer introPlayer = MediaPlayer.create(getBaseContext(), R.raw.bird_maxican);
        introPlayer.start();

    } // onCreate

} // Main Class
