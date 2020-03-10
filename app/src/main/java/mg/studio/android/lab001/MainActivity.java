package mg.studio.android.lab001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mouth, arms, ears, eyebrows, eyes, glasses, hat, mustache, nose, shoes;
     CheckBox cbmouth, cbarms, cbears, cbeyebrows, cbeyes, cbglasses, cbhat, cbmustache, cbnose, cbshoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mouth = findViewById(R.id.mouth);
        arms = findViewById(R.id.arms);
        ears = findViewById(R.id.ears);
        eyebrows = findViewById(R.id.eyebrows);
        eyes = findViewById(R.id.eyes);
        glasses = findViewById(R.id.glasses);
        hat = findViewById(R.id.hat);
        mustache = findViewById(R.id.mustache);
        nose = findViewById(R.id.nose);
        shoes = findViewById(R.id.shoes);

        cbmouth = findViewById(R.id.cb_mouth);
        cbarms = findViewById(R.id.cb_arms);
        cbears = findViewById(R.id.cb_ears);
        cbeyebrows = findViewById(R.id.cb_eyebrow);
        cbeyes = findViewById(R.id.cb_eye);
        cbglasses = findViewById(R.id.cb_glasses);
        cbhat = findViewById(R.id.cb_hat);
        cbmustache = findViewById(R.id.cb_mustache);
        cbnose = findViewById(R.id.cb_nose);
        cbshoes = findViewById(R.id.cb_shoes);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);

    }

    public void cbMouth(View view){
        if(cbmouth.isChecked()){
            mouth.setVisibility(View.VISIBLE);

        }
        else {
            mouth.setVisibility(View.GONE);
        }

    }


    public void cbArms(View view){
        if(cbarms.isChecked()){
            cbarms.setVisibility(View.VISIBLE);

        }
        else {
            arms.setVisibility(View.GONE);
        }
    }

    public void cbEars(View view){
        if(cbears.isChecked()){
            ears.setVisibility(View.VISIBLE);

        }
        else {
            ears.setVisibility(View.GONE);
        }
    }

    public void cbHat(View view){
        if(cbhat.isChecked()){
            hat.setVisibility(View.VISIBLE);

        }
        else {
            hat.setVisibility(View.GONE);
        }
    }

    public void cbEyebrow(View view){
        if(cbeyebrows.isChecked()){
            eyebrows.setVisibility(View.VISIBLE);

        }
        else {
            eyebrows.setVisibility(View.GONE);
        }
    }

    public void cbEye(View view){
        if(cbeyes.isChecked()){
            eyes.setVisibility(View.VISIBLE);

        }
        else {
            eyes.setVisibility(View.GONE);
        }
    }

    public void cbGlasses(View view){
        if(cbglasses.isChecked()){
            glasses.setVisibility(View.VISIBLE);

        }
        else {
            glasses.setVisibility(View.GONE);
        }
    }

    public void cbMustache(View view){
        if(cbmustache.isChecked()){
            mustache.setVisibility(View.VISIBLE);

        }
        else {
            mustache.setVisibility(View.GONE);
        }
    }

    public void cbNose(View view){
        if(cbnose.isChecked()){
            nose.setVisibility(View.VISIBLE);

        }
        else {
            nose.setVisibility(View.GONE);
        }
    }

    public void cbShoes(View view){
        if(cbshoes.isChecked()){
            shoes.setVisibility(View.VISIBLE);

        }
        else {
            shoes.setVisibility(View.GONE);
        }
    }

    public void ScreenDirection() {
        if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            Log.i("info","landscape");

        }
        else if(this.getResources().getConfiguration().orientation==Configuration.ORIENTATION_PORTRAIT)
        {
            Log.i("info", "portrait");
        }
    }




}
