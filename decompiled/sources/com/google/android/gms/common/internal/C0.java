package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class C0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.P
    private Object f28608a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28609b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC1246e f28610c;

    public C0(AbstractC1246e abstractC1246e, Object obj) {
        this.f28610c = abstractC1246e;
        this.f28608a = obj;
    }

    protected abstract void a(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f28608a;
                if (this.f28609b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f28609b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f28608a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f28610c.f28713t;
        synchronized (arrayList) {
            arrayList2 = this.f28610c.f28713t;
            arrayList2.remove(this);
        }
    }
}
