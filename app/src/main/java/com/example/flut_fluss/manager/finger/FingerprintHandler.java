package com.example.flut_fluss.manager.finger;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.widget.TextView;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.flut_fluss.R;
import com.example.flut_fluss.view.activity.main.MainActivity;

@TargetApi(Build.VERSION_CODES.N)
public class FingerprintHandler extends FingerprintManager.AuthenticationCallback {

    CancellationSignal cancellationSignal;

    private Context context;

    public FingerprintHandler(Context context) {

        this.context = context;
    }

    public void startAuthentication(FingerprintManager fingerprintManager, FingerprintManager.CryptoObject cryptoObject) {

        CancellationSignal cancellationSignal = new CancellationSignal();

        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.USE_FINGERPRINT) != PackageManager.PERMISSION_GRANTED) {

            return;
        }

        fingerprintManager.authenticate(cryptoObject, cancellationSignal, 0, this, null);
    }

    //------------------------

    @Override
    public void onAuthenticationError(int errorCode, CharSequence errString) {

        this.update("인증 에러 발생" + errString, false);
    }

    @Override
    public void onAuthenticationFailed() {

        this.update("인증 실패", false);
    }

    @Override
    public void onAuthenticationHelp(int helpCode, CharSequence helpString) {

        this.update("Error : "+ helpString, false);
    }

    @Override
    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult result) {
        super.onAuthenticationSucceeded(result);

        this.update("앱 접근이 허용 되었습니다.", true);
    }

    private void update(String s, boolean b) {

        final TextView tv_message = ((Activity)context).findViewById(R.id.tv_message);

        //안내 메세지 출력
        tv_message.setText(s);

        if (!b) {

            tv_message.setTextColor(ContextCompat.getColor(context, R.color.red));
        }
        else {

            //지문인증 성공
            tv_message.setTextColor(ContextCompat.getColor(context, R.color.login_button_first_gradation));

            context.startActivity(new Intent(context.getApplicationContext(), MainActivity.class));

            /*
            //sound effect
            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Ringtone r = RingtoneManager.getRingtone((Activity)context, notification);
            r.play();
             */
        }
    }
}
