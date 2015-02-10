package mmall.com.mmall.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import mmall.com.mmall.R;

public class SettingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_setting);

        this.findViewById(R.id.ll_profile).setOnClickListener(this);
        this.findViewById(R.id.ll_modify_pwd).setOnClickListener(this);
        this.findViewById(R.id.ll_mepay_bind).setOnClickListener(this);
        this.findViewById(R.id.ll_spay_bind).setOnClickListener(this);
        this.findViewById(R.id.ll_about_mmall).setOnClickListener(this);
        this.findViewById(R.id.ll_clear_cache).setOnClickListener(this);
        this.findViewById(R.id.btn_logout).setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_my_setting, menu);
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

    @Override
    public void onClick(View v) {
        super.onClick(v);
        int viewId=v.getId();
        switch (viewId){
            case R.id.ll_profile:
                Intent intentProfile=new Intent(this,ProfileActivity.class);
                this.startActivity(intentProfile);
                break;
            case R.id.ll_modify_pwd:
                Intent intentChangePwd=new Intent(this,ChangePasswordActivity.class);
                this.startActivity(intentChangePwd);
                break;
            case R.id.ll_mepay_bind:
                break;
            case R.id.ll_spay_bind:
                break;
            case R.id.ll_about_mmall:
                break;
            case R.id.ll_clear_cache:
                break;
            case R.id.btn_logout:
                Intent intentLogin=new Intent(this,LoginActivity.class);
                this.startActivity(intentLogin);
                break;
        }
    }
}
