package com.example.shafayat.loginregister.HelperClass;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shafayat on 8/18/17.
 */

public class RegisterRequest extends StringRequest {

    private static final String url = "http://localhost/AndroidLoginRegister/register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, String email, String password,  Response.Listener<String> listener) {
        super(Method.POST, url, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("email", email);
        params.put("password", password);
    }

    @Override
    protected Map<String, String> getParams(){
        return params;
    }
}
