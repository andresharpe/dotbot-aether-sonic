package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.InterfaceC1203m;

/* loaded from: classes.dex */
public abstract class V implements DialogInterface.OnClickListener {
    public static V b(Activity activity, @androidx.annotation.P Intent intent, int i4) {
        return new S(intent, activity, i4);
    }

    public static V c(@androidx.annotation.N Fragment fragment, @androidx.annotation.P Intent intent, int i4) {
        return new T(intent, fragment, i4);
    }

    public static V d(@androidx.annotation.N InterfaceC1203m interfaceC1203m, @androidx.annotation.P Intent intent, int i4) {
        return new U(intent, interfaceC1203m, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        try {
            a();
        } catch (ActivityNotFoundException e4) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e4);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
