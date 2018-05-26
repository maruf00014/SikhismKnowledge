package com.sikhismknowledge.sikhismknowledge;

import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import static android.content.ContentValues.TAG;

/**
 * Created by Maruf on 06-May-18.
 */

public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        Looper.prepare();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("REG_TOKEN", refreshedToken);
        Toast.makeText(this,refreshedToken,Toast.LENGTH_LONG).show();

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        //sendRegistrationToServer(refreshedToken);
    }
}
