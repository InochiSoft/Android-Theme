package com.inochi.theme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Setting setting;
    private final String THEME_NAME = "THEME_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setting = new Setting(this, getPackageName());
        int theme = setting.getIntSetting(THEME_NAME, R.style.Theme_Red_NoActionBar);

        setTheme(theme);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnRed = findViewById(R.id.btnRed);
        Button btnGreen = findViewById(R.id.btnGreen);
        Button btnBlue = findViewById(R.id.btnBlue);
        Button btnBrown = findViewById(R.id.btnBrown);
        Button btnGrey = findViewById(R.id.btnGrey);
        Button btnPink = findViewById(R.id.btnPink);
        Button btnPurple = findViewById(R.id.btnPurple);
        Button btnTeal = findViewById(R.id.btnTeal);
        Button btnIndigo = findViewById(R.id.btnIndigo);
        Button btnAmber = findViewById(R.id.btnAmber);
        Button btnLime = findViewById(R.id.btnLime);
        Button btnOrange = findViewById(R.id.btnOrange);
        Button btnYellow = findViewById(R.id.btnYellow);
        Button btnCyan = findViewById(R.id.btnCyan);
        Button btnLightGreen = findViewById(R.id.btnLightGreen);
        Button btnLightBlue = findViewById(R.id.btnLightBlue);
        Button btnBlueGrey = findViewById(R.id.btnBlueGrey);
        Button btnDeepPurple = findViewById(R.id.btnDeepPurple);
        Button btnDeepOrange = findViewById(R.id.btnDeepOrange);

        btnRed.setOnClickListener(buttonClick);
        btnGreen.setOnClickListener(buttonClick);
        btnBlue.setOnClickListener(buttonClick);
        btnBrown.setOnClickListener(buttonClick);
        btnGrey.setOnClickListener(buttonClick);
        btnPink.setOnClickListener(buttonClick);
        btnPurple.setOnClickListener(buttonClick);
        btnTeal.setOnClickListener(buttonClick);
        btnIndigo.setOnClickListener(buttonClick);
        btnAmber.setOnClickListener(buttonClick);
        btnLime.setOnClickListener(buttonClick);
        btnOrange.setOnClickListener(buttonClick);
        btnYellow.setOnClickListener(buttonClick);
        btnCyan.setOnClickListener(buttonClick);
        btnLightGreen.setOnClickListener(buttonClick);
        btnLightBlue.setOnClickListener(buttonClick);
        btnBlueGrey.setOnClickListener(buttonClick);
        btnDeepPurple.setOnClickListener(buttonClick);
        btnDeepOrange.setOnClickListener(buttonClick);
    }

    private void rerunActivity(){
        finish();
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        intent.putExtras(getIntent());
        startActivity(intent);
    }

    private View.OnClickListener buttonClick = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            int id = v.getId();
            switch (id){
                case R.id.btnRed:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Red_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnGreen:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Green_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnBlue:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Blue_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnBrown:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Brown_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnGrey:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Grey_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnPink:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Pink_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnPurple:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Purple_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnTeal:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Teal_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnIndigo:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Indigo_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnAmber:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Amber_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnLime:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Lime_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnOrange:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Orange_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnYellow:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Yellow_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnCyan:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_Cyan_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnLightGreen:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_LightGreen_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnLightBlue:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_LightBlue_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnBlueGrey:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_BlueGrey_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnDeepPurple:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_DeepPurple_NoActionBar);
                    rerunActivity();
                    break;
                case R.id.btnDeepOrange:
                    setting.setIntSetting(THEME_NAME, R.style.Theme_DeepOrange_NoActionBar);
                    rerunActivity();
                    break;
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
