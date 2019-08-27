package com.example.flut_fluss.lockManager.handler;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.flut_fluss.R;
import com.example.flut_fluss.view.activity.main.MainActivity;

public class FingerprintHandler extends FingerprintManager.AuthenticationCallback {

    private Context context;

    public FingerprintHandler(Context context) {

        this.context = context;
    }

    public void startAuthentication(FingerprintManager fingerprintManager, FingerprintManager.CryptoObject cryptoObject) {

        CancellationSignal cancellationSignal = new CancellationSignal();

        if(ActivityCompat.checkSelfPermission(context, Manifest.permission.USE_FINGERPRINT) != PackageManager.PERMISSION_GRANTED) {

            return;
        }

        fingerprintManager.authenticate(cryptoObject, cancellationSignal, 0, this, null);
    }

    @Override
    public void onAuthenticationFailed() {
        super.onAuthenticationFailed();

        final TextView tv_message = ((Activity)context).findViewById(R.id.tv_message);
        final ImageView iv_fingerprint = ((Activity) context).findViewById(R.id.iv_fingerprint);

        tv_message.setTextColor(ContextCompat.getColor(context, R.color.red));
        tv_message.setText("지문 인식에 실패 했습니다.");

        iv_fingerprint.setImageAlpha(R.drawable.fingerprint_icon_error);
    }

    @Override
    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult result) {
        super.onAuthenticationSucceeded(result);

        context.startActivity(new Intent(context, MainActivity.class));
    }
}
