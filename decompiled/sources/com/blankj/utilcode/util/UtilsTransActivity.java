package com.blankj.utilcode.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.appcompat.app.ActivityC0587e;
import com.blankj.utilcode.util.E0;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class UtilsTransActivity extends ActivityC0587e {

    /* renamed from: h0, reason: collision with root package name */
    private static final Map<UtilsTransActivity, TransActivityDelegate> f24969h0 = new HashMap();

    /* renamed from: i0, reason: collision with root package name */
    protected static final String f24970i0 = "extra_delegate";

    /* loaded from: classes.dex */
    public static abstract class TransActivityDelegate implements Serializable {
        public boolean a(@androidx.annotation.N UtilsTransActivity utilsTransActivity, MotionEvent motionEvent) {
            return false;
        }

        public void b(@androidx.annotation.N UtilsTransActivity utilsTransActivity, int i4, int i5, Intent intent) {
        }

        public void c(@androidx.annotation.N UtilsTransActivity utilsTransActivity, @androidx.annotation.P Bundle bundle) {
        }

        public void d(@androidx.annotation.N UtilsTransActivity utilsTransActivity, @androidx.annotation.P Bundle bundle) {
        }

        public void e(@androidx.annotation.N UtilsTransActivity utilsTransActivity) {
        }

        public void f(@androidx.annotation.N UtilsTransActivity utilsTransActivity) {
        }

        public void g(@androidx.annotation.N UtilsTransActivity utilsTransActivity, int i4, @androidx.annotation.N String[] strArr, @androidx.annotation.N int[] iArr) {
        }

        public void h(@androidx.annotation.N UtilsTransActivity utilsTransActivity) {
        }

        public void i(@androidx.annotation.N UtilsTransActivity utilsTransActivity, Bundle bundle) {
        }

        public void j(@androidx.annotation.N UtilsTransActivity utilsTransActivity) {
        }

        public void k(@androidx.annotation.N UtilsTransActivity utilsTransActivity) {
        }
    }

    public static void E0(Activity activity, E0.b<Intent> bVar, TransActivityDelegate transActivityDelegate) {
        F0(activity, bVar, transActivityDelegate, UtilsTransActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void F0(Activity activity, E0.b<Intent> bVar, TransActivityDelegate transActivityDelegate, Class<?> cls) {
        if (transActivityDelegate == null) {
            return;
        }
        Intent intent = new Intent(E0.a(), cls);
        intent.putExtra(f24970i0, transActivityDelegate);
        if (bVar != null) {
            bVar.accept(intent);
        }
        if (activity == null) {
            intent.addFlags(268435456);
            E0.a().startActivity(intent);
        } else {
            activity.startActivity(intent);
        }
    }

    public static void G0(Activity activity, TransActivityDelegate transActivityDelegate) {
        F0(activity, null, transActivityDelegate, UtilsTransActivity.class);
    }

    public static void H0(E0.b<Intent> bVar, TransActivityDelegate transActivityDelegate) {
        F0(null, bVar, transActivityDelegate, UtilsTransActivity.class);
    }

    public static void I0(TransActivityDelegate transActivityDelegate) {
        F0(null, null, transActivityDelegate, UtilsTransActivity.class);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TransActivityDelegate transActivityDelegate = f24969h0.get(this);
        if (transActivityDelegate == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (transActivityDelegate.a(this, motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        TransActivityDelegate transActivityDelegate = f24969h0.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.b(this, i4, i5, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onCreate(@androidx.annotation.P Bundle bundle) {
        overridePendingTransition(0, 0);
        Serializable serializableExtra = getIntent().getSerializableExtra(f24970i0);
        if (!(serializableExtra instanceof TransActivityDelegate)) {
            super.onCreate(bundle);
            finish();
            return;
        }
        TransActivityDelegate transActivityDelegate = (TransActivityDelegate) serializableExtra;
        f24969h0.put(this, transActivityDelegate);
        transActivityDelegate.c(this, bundle);
        super.onCreate(bundle);
        transActivityDelegate.d(this, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0587e, androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Map<UtilsTransActivity, TransActivityDelegate> map = f24969h0;
        TransActivityDelegate transActivityDelegate = map.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.e(this);
        map.remove(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
        TransActivityDelegate transActivityDelegate = f24969h0.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.f(this);
    }

    @Override // androidx.fragment.app.ActivityC0889g, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i4, @androidx.annotation.N String[] strArr, @androidx.annotation.N int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        TransActivityDelegate transActivityDelegate = f24969h0.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.g(this, i4, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onResume() {
        super.onResume();
        TransActivityDelegate transActivityDelegate = f24969h0.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.h(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0637l, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TransActivityDelegate transActivityDelegate = f24969h0.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.i(this, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0587e, androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onStart() {
        super.onStart();
        TransActivityDelegate transActivityDelegate = f24969h0.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.j(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0587e, androidx.fragment.app.ActivityC0889g, android.app.Activity
    public void onStop() {
        super.onStop();
        TransActivityDelegate transActivityDelegate = f24969h0.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.k(this);
    }
}
