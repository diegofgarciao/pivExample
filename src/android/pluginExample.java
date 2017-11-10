package com.piv.example;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.util.Log;
import android.*;


public class pluginExample extends CordovaPlugin {

private CallbackContext callbackContext;
private String vuelta = "PIV";
private String rta;

  @Override
    public boolean execute (String action, final JSONArray args, CallbackContext callbackContext){

      if(action.equals("funcionJava")){
        rta = args + vuelta;
        callbackContext.success(rta);
      }
        return true;
      }
}
