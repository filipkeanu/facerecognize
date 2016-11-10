package cordovafacedetect;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class facedetect extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("startfacedetect")) {

            String name = data.getString(0);
            String message = "Hello, " + name;
            callbackContext.success(message);

            return true;

        } else {

            return false;

        }
    }
    
     @Override
    public void initialize(CordovaInterface cordova, final CordovaWebView webView) {
        myActivity=cordova.getActivity();
        cordova.setActivityResultCallback(this);
    }

    public void startfacedetect(){
        Log.d("startdetect", "Starting detection");
    }

}
