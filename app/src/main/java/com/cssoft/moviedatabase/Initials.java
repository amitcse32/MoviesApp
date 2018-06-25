package com.cssoft.moviedatabase;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class Initials {

    static String CURRENT_MODE=ProductionModes.DEVELOPMENT.name();

    public static void showToast(Context context,String message)
    {
        if(CURRENT_MODE==ProductionModes.DEVELOPMENT.name()) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }


    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }




}
