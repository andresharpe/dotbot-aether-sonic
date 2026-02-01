package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.Y;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzev;
import com.google.android.gms.internal.gtm.zzew;
import com.google.android.gms.internal.gtm.zzfc;
import com.google.android.gms.internal.gtm.zzfs;
import com.google.android.gms.internal.gtm.zzft;
import com.google.android.gms.internal.gtm.zzfv;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@com.google.android.gms.common.util.D
/* renamed from: com.google.android.gms.analytics.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1157e extends j {

    /* renamed from: l, reason: collision with root package name */
    @P
    private static List f27763l = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f27764f;

    /* renamed from: g, reason: collision with root package name */
    private Set f27765g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f27766h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f27767i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f27768j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f27769k;

    @com.google.android.gms.common.util.D
    public C1157e(zzbx zzbxVar) {
        super(zzbxVar);
        this.f27765g = new HashSet();
    }

    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    @N
    public static C1157e k(@N Context context) {
        return zzbx.zzg(context).zzc();
    }

    public static void v() {
        synchronized (C1157e.class) {
            try {
                List list = f27763l;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    f27763l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(E e4) {
        this.f27765g.add(e4);
        Context zza = e().zza();
        if (zza instanceof Application) {
            i((Application) zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(E e4) {
        this.f27765g.remove(e4);
    }

    public void h() {
        e().zzf().zzc();
    }

    @TargetApi(14)
    public void i(@N Application application) {
        if (!this.f27766h) {
            application.registerActivityLifecycleCallbacks(new n(this));
            this.f27766h = true;
        }
    }

    public boolean j() {
        return this.f27768j;
    }

    @N
    @Deprecated
    public g l() {
        return zzfc.zza();
    }

    public boolean m() {
        return this.f27767i;
    }

    @N
    public i n(int i4) {
        i iVar;
        zzft zzftVar;
        synchronized (this) {
            try {
                iVar = new i(e(), null, null);
                if (i4 > 0 && (zzftVar = (zzft) new zzfs(e()).zza(i4)) != null) {
                    iVar.k1(zzftVar);
                }
                iVar.zzW();
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @N
    public i o(@N String str) {
        i iVar;
        synchronized (this) {
            iVar = new i(e(), str, null);
            iVar.zzW();
        }
        return iVar;
    }

    public void p(@N Activity activity) {
        if (!this.f27766h) {
            x(activity);
        }
    }

    public void q(@N Activity activity) {
        if (!this.f27766h) {
            y(activity);
        }
    }

    public void r(boolean z3) {
        this.f27768j = z3;
        if (this.f27768j) {
            e().zzf().zzg();
        }
    }

    public void s(boolean z3) {
        this.f27767i = z3;
    }

    public void t(int i4) {
        e().zzf().zzl(i4);
    }

    @Deprecated
    public void u(@N g gVar) {
        zzfc.zzc(gVar);
        if (!this.f27769k) {
            zzev zzevVar = zzew.zzc;
            Log.i((String) zzevVar.zzb(), "GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + ((String) zzevVar.zzb()) + " DEBUG");
            this.f27769k = true;
        }
    }

    public final void w() {
        zzfv zzq = e().zzq();
        zzq.zzf();
        if (zzq.zze()) {
            s(zzq.zzc());
        }
        zzq.zzf();
        this.f27764f = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public final void x(Activity activity) {
        Iterator it = this.f27765g.iterator();
        while (it.hasNext()) {
            ((E) it.next()).b(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @com.google.android.gms.common.util.D
    public final void y(Activity activity) {
        Iterator it = this.f27765g.iterator();
        while (it.hasNext()) {
            ((E) it.next()).c(activity);
        }
    }

    public final boolean z() {
        return this.f27764f;
    }
}
