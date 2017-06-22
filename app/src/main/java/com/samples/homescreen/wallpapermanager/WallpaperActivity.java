package com.samples.homescreen.wallpapermanager;

import android.app.Activity;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class WallpaperActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);
    }

    @Override
    public void onClick(View view) {
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());

        try{
            wallpaperManager.setResource(R.drawable.nyc);
            Toast.makeText(this, "Wallpaper has been changed", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
