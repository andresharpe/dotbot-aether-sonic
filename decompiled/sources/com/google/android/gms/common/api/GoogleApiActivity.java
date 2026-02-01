package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.cloudmessaging.AbstractC1159b;
import com.google.android.gms.common.C1231c;
import com.google.android.gms.common.C1236h;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.C1193i;
import com.google.android.gms.common.internal.C1285y;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: E, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    protected int f28021E = 0;

    @N
    public static Intent a(@N Context context, @N PendingIntent pendingIntent, int i4, boolean z3) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra(AbstractC1159b.C0262b.f27899a, pendingIntent);
        intent.putExtra("failing_client_id", i4);
        intent.putExtra("notify_manager", z3);
        return intent;
    }

    private final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get(AbstractC1159b.C0262b.f27899a);
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                this.f28021E = 1;
                return;
            } catch (ActivityNotFoundException e4) {
                if (extras.getBoolean("notify_manager", true)) {
                    C1193i.z(this).M(new C1231c(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String obj = pendingIntent.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 36);
                    sb.append("Activity not found while launching ");
                    sb.append(obj);
                    sb.append(".");
                    String sb2 = sb.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        sb2 = sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", sb2, e4);
                }
                this.f28021E = 1;
                finish();
                return;
            } catch (IntentSender.SendIntentException e5) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e5);
                finish();
                return;
            }
        }
        C1236h.x().B(this, ((Integer) C1285y.l(num)).intValue(), 2, this);
        this.f28021E = 1;
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i4, int i5, @N Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f28021E = 0;
            setResult(i5, intent);
            if (booleanExtra) {
                C1193i z3 = C1193i.z(this);
                if (i5 != -1) {
                    if (i5 == 0) {
                        z3.M(new C1231c(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    z3.b();
                }
            }
        } else if (i4 == 2) {
            this.f28021E = 0;
            setResult(i5, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(@N DialogInterface dialogInterface) {
        this.f28021E = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(@P Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f28021E = bundle.getInt("resolution");
        }
        if (this.f28021E != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(@N Bundle bundle) {
        bundle.putInt("resolution", this.f28021E);
        super.onSaveInstanceState(bundle);
    }
}
