package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class I1 extends Fragment implements InterfaceC1203m {

    /* renamed from: H, reason: collision with root package name */
    private static final WeakHashMap f28166H = new WeakHashMap();

    /* renamed from: E, reason: collision with root package name */
    private final Map f28167E = Collections.synchronizedMap(new androidx.collection.a());

    /* renamed from: F, reason: collision with root package name */
    private int f28168F = 0;

    /* renamed from: G, reason: collision with root package name */
    @androidx.annotation.P
    private Bundle f28169G;

    public static I1 c(Activity activity) {
        I1 i12;
        WeakHashMap weakHashMap = f28166H;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (i12 = (I1) weakReference.get()) != null) {
            return i12;
        }
        try {
            I1 i13 = (I1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (i13 == null || i13.isRemoving()) {
                i13 = new I1();
                activity.getFragmentManager().beginTransaction().add(i13, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(i13));
            return i13;
        } catch (ClassCastException e4) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1203m
    public final void addCallback(String str, @androidx.annotation.N LifecycleCallback lifecycleCallback) {
        if (!this.f28167E.containsKey(str)) {
            this.f28167E.put(str, lifecycleCallback);
            if (this.f28168F > 0) {
                new com.google.android.gms.internal.common.r(Looper.getMainLooper()).post(new H1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // android.app.Fragment
    public final void dump(String str, @androidx.annotation.P FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.P String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f28167E.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1203m
    @androidx.annotation.P
    public final <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
        return cls.cast(this.f28167E.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1203m
    @androidx.annotation.P
    public final Activity getLifecycleActivity() {
        return getActivity();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1203m
    public final boolean isCreated() {
        return this.f28168F > 0;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1203m
    public final boolean isStarted() {
        return this.f28168F >= 2;
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i4, int i5, @androidx.annotation.P Intent intent) {
        super.onActivityResult(i4, i5, intent);
        Iterator it = this.f28167E.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).f(i4, i5, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(@androidx.annotation.P Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f28168F = 1;
        this.f28169G = bundle;
        for (Map.Entry entry : this.f28167E.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.g(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f28168F = 5;
        Iterator it = this.f28167E.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f28168F = 3;
        Iterator it = this.f28167E.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).i();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f28167E.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).j(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f28168F = 2;
        Iterator it = this.f28167E.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f28168F = 4;
        Iterator it = this.f28167E.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).l();
        }
    }
}
