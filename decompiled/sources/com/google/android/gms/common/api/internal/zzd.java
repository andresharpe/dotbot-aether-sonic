package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.ActivityC0889g;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zzd extends Fragment implements InterfaceC1203m {

    /* renamed from: Q0, reason: collision with root package name */
    private static final WeakHashMap f28455Q0 = new WeakHashMap();

    /* renamed from: N0, reason: collision with root package name */
    private final Map f28456N0 = Collections.synchronizedMap(new androidx.collection.a());

    /* renamed from: O0, reason: collision with root package name */
    private int f28457O0 = 0;

    /* renamed from: P0, reason: collision with root package name */
    @androidx.annotation.P
    private Bundle f28458P0;

    public static zzd zzc(ActivityC0889g activityC0889g) {
        zzd zzdVar;
        WeakHashMap weakHashMap = f28455Q0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activityC0889g);
        if (weakReference != null && (zzdVar = (zzd) weakReference.get()) != null) {
            return zzdVar;
        }
        try {
            zzd zzdVar2 = (zzd) activityC0889g.S().o0("SupportLifecycleFragmentImpl");
            if (zzdVar2 == null || zzdVar2.isRemoving()) {
                zzdVar2 = new zzd();
                activityC0889g.S().q().k(zzdVar2, "SupportLifecycleFragmentImpl").r();
            }
            weakHashMap.put(activityC0889g, new WeakReference(zzdVar2));
            return zzdVar2;
        } catch (ClassCastException e4) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1203m
    public final void addCallback(String str, @androidx.annotation.N LifecycleCallback lifecycleCallback) {
        if (!this.f28456N0.containsKey(str)) {
            this.f28456N0.put(str, lifecycleCallback);
            if (this.f28457O0 > 0) {
                new com.google.android.gms.internal.common.r(Looper.getMainLooper()).post(new J1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, @androidx.annotation.P FileDescriptor fileDescriptor, PrintWriter printWriter, @androidx.annotation.P String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f28456N0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1203m
    @androidx.annotation.P
    public final <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
        return cls.cast(this.f28456N0.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1203m
    @androidx.annotation.P
    public final /* synthetic */ Activity getLifecycleActivity() {
        return getActivity();
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1203m
    public final boolean isCreated() {
        return this.f28457O0 > 0;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1203m
    public final boolean isStarted() {
        return this.f28457O0 >= 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i4, int i5, @androidx.annotation.P Intent intent) {
        super.onActivityResult(i4, i5, intent);
        Iterator it = this.f28456N0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).f(i4, i5, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@androidx.annotation.P Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f28457O0 = 1;
        this.f28458P0 = bundle;
        for (Map.Entry entry : this.f28456N0.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.g(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f28457O0 = 5;
        Iterator it = this.f28456N0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f28457O0 = 3;
        Iterator it = this.f28456N0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f28456N0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).j(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f28457O0 = 2;
        Iterator it = this.f28456N0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f28457O0 = 4;
        Iterator it = this.f28456N0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).l();
        }
    }
}
