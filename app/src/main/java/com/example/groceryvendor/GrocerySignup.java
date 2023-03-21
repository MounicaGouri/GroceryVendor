package com.example.groceryvendor;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class GrocerySignup extends GroceryBase {

    EditText edtName, edtMobile, edtEmail, edtPassword;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grocery_signup);

        edtName = findViewById(R.id.edtname);
        edtMobile = findViewById(R.id.edtcontact);
        edtEmail = findViewById(R.id.edtemail);
        edtPassword = findViewById(R.id.edtpass);

        edtName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    edtName.setHintTextColor(getColor(R.color.app_color));
                }else {
                    edtName.setHintTextColor(getColor(R.color.grey));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edtMobile.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    edtMobile.setHintTextColor(getColor(R.color.app_color));
                }else {
                    edtMobile.setHintTextColor(getColor(R.color.grey));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edtEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    edtEmail.setHintTextColor(getColor(R.color.app_color));
                }else {
                    edtEmail.setHintTextColor(getColor(R.color.app_color));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edtPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    edtPassword.setHintTextColor(getColor(R.color.app_color));
                }else {
                    edtPassword.setHintTextColor(getColor(R.color.grey));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.login:
                startActivity(new Intent(this, GrocerySignup.class));
                break;

            case R.id.txtSignup:
                if (TextUtils.isEmpty(edtName.getText().toString().trim())) {
                    toast("Please enter Name");
                }else if (TextUtils.isEmpty((edtMobile.getText().toString())) ||
                        !isValidPhoneNumber(edtMobile.getText())) {
                    toast("Please enter valid mobile");
                }else if (TextUtils.isEmpty(edtEmail.getText().toString().trim())
                        || !isValidEmail(edtEmail.getText())) {
                    toast("Please enter valid email");
                }else if (TextUtils.isEmpty(edtPassword.getText().toString().trim())) {
                    toast("Please enter password");
                }else {
                    startActivity(new Intent(this, GroceryOtp.class));
                }
                break;

            default:
                break;
        }
    }
}
