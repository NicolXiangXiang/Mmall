package mmall.com.mmall.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import mmall.com.mmall.R;
import mmall.com.mmall.models.UserModel;
import mmall.com.mmall.services.UserService;

public class LoginActivity extends BaseActivity implements TextWatcher {

    private ProgressDialog progressDialog;
    private EditText txtEmail;
    private EditText txtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin=(Button)findViewById(R.id.btn_login);
        txtEmail=(EditText)findViewById(R.id.etxt_email);
        txtPassword=(EditText)findViewById(R.id.etxt_password);

        findViewById(R.id.btn_registration).setOnClickListener(this);
        findViewById(R.id.btn_login).setOnClickListener(this);
        txtEmail.addTextChangedListener(this);
        txtPassword.addTextChangedListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        int viewId=v.getId();
        switch (viewId){
            case R.id.btn_registration:
                Intent intentLogin = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(intentLogin);
                LoginActivity.this.finish();
                break;
            case R.id.btn_login:
                new LoginTask(txtEmail.getText().toString(),txtPassword.getText().toString()).execute();
                break;
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        btnLogin.setEnabled(false);
        String email=txtEmail.getText().toString();
        String password=txtPassword.getText().toString();
        if(!email.isEmpty()&&!password.toString().isEmpty()&&Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            btnLogin.setEnabled(true);
        }
    }

    public class LoginTask extends
            AsyncTask<String,UserModel,UserModel>{

        private String email;
        private String password;
        public LoginTask(String email,String password){
            this.email=email;
            this.password=password;
        }

        @Override
        protected void onPreExecute() {
            progressDialog=ProgressDialog.show(LoginActivity.this,"","Loading");
        }

        @Override
        protected UserModel doInBackground(String... params) {
            UserService userService=new UserService();
            return userService.signIn(email,password);
        }

        @Override
        protected void onPostExecute(UserModel userModel) {
            if(progressDialog!=null)
                progressDialog.dismiss();
        }
    }
}
