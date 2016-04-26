package chat.com.chat.data;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

import chat.com.chat.model.User;

/**
 * Created by root on 4/25/16.
 */
public class RegisterRequest extends StringRequest {
    public static final String REQUEST_URL = "http://192.168.1.101/chat/register.php";
    private Map<String ,String > params;

    public RegisterRequest(User user , Response.Listener<String> listener){
        super(Method.POST ,REQUEST_URL , listener ,null);
        params = new HashMap<>();
        params.put("username" , user.getUsername() );
        params.put("email" , user.getEmail());
        params.put("age" , ""+ user.getAge() );
        params.put("password" ,user.getPassword() );


    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
