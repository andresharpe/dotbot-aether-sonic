package com.harman.jbl.partybox.ui.effectlab;

import android.content.Intent;
import android.content.res.Configuration;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.appcompat.app.ActivityC0587e;
import com.harman.jbl.partybox.j;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class j extends ActivityC0587e {

    /* renamed from: l0, reason: collision with root package name */
    @l3.d
    public static final a f43536l0 = new a(null);

    /* renamed from: m0, reason: collision with root package name */
    @l3.d
    private static final String f43537m0;

    /* renamed from: h0, reason: collision with root package name */
    @l3.e
    private SensorManager f43538h0;

    /* renamed from: i0, reason: collision with root package name */
    @l3.e
    private Sensor f43539i0;

    /* renamed from: j0, reason: collision with root package name */
    @l3.e
    private SensorEventListener f43540j0;

    /* renamed from: k0, reason: collision with root package name */
    @l3.d
    private final Handler f43541k0 = new Handler(Looper.getMainLooper());

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        @l3.d
        public final String a() {
            return j.f43537m0;
        }

        private a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements SensorEventListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SensorManager f43543b;

        b(SensorManager sensorManager) {
            this.f43543b = sensorManager;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(@l3.e Sensor sensor, int i4) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(@l3.d SensorEvent event) {
            F.p(event, "event");
            if (event.sensor.getType() == 11) {
                float[] fArr = new float[16];
                SensorManager.getRotationMatrixFromVector(fArr, event.values);
                SensorManager.getOrientation(fArr, new float[3]);
                float degrees = (float) Math.toDegrees(r6[0]);
                float degrees2 = (float) Math.toDegrees(r6[1]);
                float degrees3 = (float) Math.toDegrees(r6[2]);
                if (Math.abs(degrees3) > 30.0f) {
                    j.this.startActivity(new Intent(j.this, (Class<?>) EffectLabActivity.class));
                    this.f43543b.unregisterListener(this);
                    j.this.finish();
                }
                Log.d(j.f43536l0.a(), "onSensorChanged azimuthDegrees: " + degrees + ", pitchDegrees: " + degrees2 + ", rollDegrees: " + degrees3);
            }
        }
    }

    static {
        String simpleName = j.class.getSimpleName();
        F.o(simpleName, "getSimpleName(...)");
        f43537m0 = simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(j this$0) {
        SensorManager sensorManager;
        F.p(this$0, "this$0");
        this$0.startActivity(new Intent(this$0, (Class<?>) EffectLabActivity.class));
        SensorEventListener sensorEventListener = this$0.f43540j0;
        if (sensorEventListener != null && (sensorManager = this$0.f43538h0) != null) {
            sensorManager.unregisterListener(sensorEventListener);
        }
        this$0.finish();
    }

    @l3.e
    public final Sensor G0() {
        return this.f43539i0;
    }

    @l3.e
    public final SensorEventListener H0() {
        return this.f43540j0;
    }

    @l3.e
    public final SensorManager I0() {
        return this.f43538h0;
    }

    public final void K0(@l3.e Sensor sensor) {
        this.f43539i0 = sensor;
    }

    public final void L0(@l3.e SensorEventListener sensorEventListener) {
        this.f43540j0 = sensorEventListener;
    }

    public final void M0(@l3.e SensorManager sensorManager) {
        this.f43538h0 = sensorManager;
    }

    @Override // androidx.appcompat.app.ActivityC0587e, androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@l3.d Configuration newConfig) {
        F.p(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Log.d(f43537m0, "onConfigurationChanged  orientation: " + newConfig.orientation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onCreate(@l3.e Bundle bundle) {
        Log.d(f43537m0, "page:onCreate" + f43536l0.getClass().getSimpleName());
        super.onCreate(bundle);
        setContentView(j.i.f41462Y);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onPause() {
        SensorManager sensorManager;
        super.onPause();
        SensorEventListener sensorEventListener = this.f43540j0;
        if (sensorEventListener != null && (sensorManager = this.f43538h0) != null) {
            sensorManager.unregisterListener(sensorEventListener);
        }
        this.f43541k0.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onResume() {
        super.onResume();
        Object systemService = getSystemService("sensor");
        F.n(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.f43538h0 = sensorManager;
        Log.d(f43537m0, "onSensorChanged sensorManager: " + sensorManager);
        SensorManager sensorManager2 = this.f43538h0;
        if (sensorManager2 != null) {
            this.f43539i0 = sensorManager2.getDefaultSensor(11);
            b bVar = new b(sensorManager2);
            this.f43540j0 = bVar;
            sensorManager2.registerListener(bVar, this.f43539i0, 3);
            this.f43541k0.postDelayed(new Runnable() { // from class: com.harman.jbl.partybox.ui.effectlab.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.J0(j.this);
                }
            }, 2000L);
        }
    }
}
