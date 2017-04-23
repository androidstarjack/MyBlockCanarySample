package cv.yyh.com.yyhtoastefs;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/4/23 0023.
 */
public class GetToast {

    public static void showToast(Context context ,String msg){
        Toast toast = null;
        if(toast == null){
            toast =  Toast.makeText(context,msg,Toast.LENGTH_SHORT);
            if(!TextUtils.isEmpty(msg)){
                toast.show();
            }
        }else{
            toast.show();
        }

    }
}
