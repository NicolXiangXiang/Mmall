package mmall.com.mmall.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.lidroid.xutils.db.annotation.Check;

import mmall.com.mmall.R;
import mmall.com.mmall.models.UserModel;
import mmall.com.mmall.services.UserService;

public class RegistrationActivity extends BaseActivity {
    private ProgressDialog progressDialog;
    private EditText txtEmail;
    private EditText txtPassword;
    private Button btnSubmit;
    private CheckBox chkPolicy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        findViewById(R.id.btn_login).setOnClickListener(this);

        txtEmail=(EditText)findViewById(R.id.etxt_email);
        txtPassword=(EditText)findViewById(R.id.etxt_password);
        btnSubmit=(Button)findViewById(R.id.btn_submit);
        chkPolicy=(CheckBox)findViewById(R.id.chk_policy);
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
            case R.id.btn_submit:
                new RegistrationTask(txtEmail.getText().toString(),txtPassword.getText().toString()).execute();
                break;
        }
    }

    protected class RegistrationTask extends AsyncTask<String,UserModel,UserModel>{

        private String email;
        private String password;
        public RegistrationTask(String email,String password){
            this.email=email;
            this.password=password;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected UserModel doInBackground(String... params) {
            UserService userService=new UserService();
            return userService.signUp(email,password);
        }

        @Override
        protected void onPostExecute(UserModel userModel) {
            super.onPostExecute(userModel);
        }
    }
}
