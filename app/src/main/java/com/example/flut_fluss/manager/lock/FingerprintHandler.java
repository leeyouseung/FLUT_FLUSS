package com.example.flut_fluss.manager.lock;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;

import androidx.core.app.ActivityCompat;

import com.example.flut_fluss.R;
import com.example.flut_fluss.databinding.FingerPrintActivityBinding;
import com.example.flut_fluss.view.activity.main.MainActivity;

public class FingerprintHandler extends FingerprintManager.AuthenticationCallback {

    private FingerPrintActivityBinding binding;

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

//        binding.tvMessage.setTextColor(context.getColor(R.color.red));
//        binding.tvMessage.setText("지문 인식에 실패 했습니다.");
    }

    @Override
    public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult result) {
        super.onAuthenticationSucceeded(result);

        context.startActivity(new Intent(context, MainActivity.class));
    }
}
