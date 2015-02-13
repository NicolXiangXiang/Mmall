package mmall.com.mmall.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import mmall.com.mmall.R;

public class RegistrationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        findViewById(R.id.btn_login).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        int viewId=v.getId();
        switch (viewId){
            case R.id.btn_login:
                Intent intentLogin = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(intentLogin);
                RegistrationActivity.this.finish();
                break;
        }
    }
}
