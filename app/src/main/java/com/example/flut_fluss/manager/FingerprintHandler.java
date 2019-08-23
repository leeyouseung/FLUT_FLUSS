package com.example.flut_fluss.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.fingerprint.FingerprintManager;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.example.flut_fluss.R;
import com.example.flut_fluss.view.activity.FingerPrintActivity;
import com.example.flut_fluss.view.activity.MainActivity;

@TargetApi(Build.VERSION_CODES.M)
public class FingerprintHandler extends FingerprintManager.AuthenticationCallback {

    CancellationSignal cancellationSignal;
    private Context context;

    public FingerprintHandler(Context context) {

        this.context = context;
    }

    //메소드들 정의
    public void startAutho(FingerprintManager fingerprintManager, FingerprintManager.CryptoObject cryptoObject) {

        cancellationSignal = new CancellationSignal();

        fingerprintManager.authenticate(cryptoObject, cancellationSignal, 0, this, null);
    }

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

        this.update("Error: "+ helpString, false);
    }

    @Override
    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult result) {

        this.update("앱 접근이 허용되었습니다.", true);
    }

    public void stopFingerAuth() {

        if(cancellationSignal != null && !cancellationSignal.isCanceled()) {

            cancellationSignal.cancel();
        }
    }

    private void update(String s, boolean b) {

        final TextView tv_message = ((Activity)context).findViewById(R.id.tv_message);
        final ImageView iv_fingerprint = ((Activity)context).findViewById(R.id.iv_fingerprint);
//        final LinearLayout linearLayout = ((Activity)context).findViewById(R.id.ll_secure);

        //안내 메세지 출력
//        iv_fingerpr.setText(s);

        if(!b) {

            tv_message.setTextColor(ContextCompat.getColor(context, R.color.colorAccent));

        }
        else {    //지문인증 성공

//            tv_message.setTextColor(ContextCompat.getColor(context, R.color.colorPrimaryDark));
//            iv_fingerprint.setImageResource(R.drawable.finger_print_done_icon);
//            linearLayout.setVisibility(LinearLayout.VISIBLE);

            //sound effect
//            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
//            Ringtone r = RingtoneManager.getRingtone((Activity)context, notification);
//
//            r.play();

            Intent intent = new Intent((Activity)context, MainActivity.class);
        }
    }
}