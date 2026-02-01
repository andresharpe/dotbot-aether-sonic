package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.N;
import androidx.annotation.Y;
import androidx.annotation.a0;
import androidx.annotation.j0;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import com.google.android.gms.internal.measurement.C1421j1;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.connector.a;
import com.google.firebase.analytics.connector.internal.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import y1.C2444a;

/* loaded from: classes2.dex */
public class b implements com.google.firebase.analytics.connector.a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile com.google.firebase.analytics.connector.a f34838c;

    /* renamed from: a, reason: collision with root package name */
    @D
    final N0.a f34839a;

    /* renamed from: b, reason: collision with root package name */
    @D
    final Map f34840b;

    /* loaded from: classes2.dex */
    class a implements a.InterfaceC0309a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f34841a;

        a(String str) {
            this.f34841a = str;
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC0309a
        public final void a() {
            if (!b.this.m(this.f34841a)) {
                return;
            }
            a.b zza = ((com.google.firebase.analytics.connector.internal.a) b.this.f34840b.get(this.f34841a)).zza();
            if (zza != null) {
                zza.a(0, null);
            }
            b.this.f34840b.remove(this.f34841a);
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC0309a
        @I0.a
        public void b() {
            if (b.this.m(this.f34841a) && this.f34841a.equals("fiam")) {
                ((com.google.firebase.analytics.connector.internal.a) b.this.f34840b.get(this.f34841a)).zzc();
            }
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC0309a
        @I0.a
        public void c(Set<String> set) {
            if (b.this.m(this.f34841a) && this.f34841a.equals("fiam") && set != null && !set.isEmpty()) {
                ((com.google.firebase.analytics.connector.internal.a) b.this.f34840b.get(this.f34841a)).a(set);
            }
        }
    }

    b(N0.a aVar) {
        C1285y.l(aVar);
        this.f34839a = aVar;
        this.f34840b = new ConcurrentHashMap();
    }

    @I0.a
    @N
    public static com.google.firebase.analytics.connector.a h() {
        return i(com.google.firebase.e.p());
    }

    @I0.a
    @N
    public static com.google.firebase.analytics.connector.a i(@N com.google.firebase.e eVar) {
        return (com.google.firebase.analytics.connector.a) eVar.l(com.google.firebase.analytics.connector.a.class);
    }

    @I0.a
    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @N
    public static com.google.firebase.analytics.connector.a j(@N com.google.firebase.e eVar, @N Context context, @N y1.d dVar) {
        C1285y.l(eVar);
        C1285y.l(context);
        C1285y.l(dVar);
        C1285y.l(context.getApplicationContext());
        if (f34838c == null) {
            synchronized (b.class) {
                try {
                    if (f34838c == null) {
                        Bundle bundle = new Bundle(1);
                        if (eVar.B()) {
                            dVar.b(com.google.firebase.b.class, new Executor() { // from class: com.google.firebase.analytics.connector.d
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new y1.b() { // from class: com.google.firebase.analytics.connector.e
                                @Override // y1.b
                                public final void a(C2444a c2444a) {
                                    b.k(c2444a);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", eVar.A());
                        }
                        f34838c = new b(C1421j1.C(context, null, null, null, bundle).z());
                    }
                } finally {
                }
            }
        }
        return f34838c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void k(C2444a c2444a) {
        boolean z3 = ((com.google.firebase.b) c2444a.a()).f34861a;
        synchronized (b.class) {
            ((b) C1285y.l(f34838c)).f34839a.B(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m(@N String str) {
        if (!str.isEmpty() && this.f34840b.containsKey(str) && this.f34840b.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.analytics.connector.a
    @I0.a
    @j0
    @N
    public Map<String, Object> a(boolean z3) {
        return this.f34839a.n(null, null, z3);
    }

    @Override // com.google.firebase.analytics.connector.a
    @I0.a
    public void b(@N a.c cVar) {
        if (!com.google.firebase.analytics.connector.internal.c.i(cVar)) {
            return;
        }
        this.f34839a.t(com.google.firebase.analytics.connector.internal.c.a(cVar));
    }

    @Override // com.google.firebase.analytics.connector.a
    @I0.a
    public void c(@N String str, @N String str2, @N Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!com.google.firebase.analytics.connector.internal.c.l(str) || !com.google.firebase.analytics.connector.internal.c.j(str2, bundle) || !com.google.firebase.analytics.connector.internal.c.h(str, str2, bundle)) {
            return;
        }
        com.google.firebase.analytics.connector.internal.c.e(str, str2, bundle);
        this.f34839a.o(str, str2, bundle);
    }

    @Override // com.google.firebase.analytics.connector.a
    @I0.a
    public void clearConditionalUserProperty(@N @a0(max = 24, min = 1) String str, @N String str2, @N Bundle bundle) {
        if (str2 != null && !com.google.firebase.analytics.connector.internal.c.j(str2, bundle)) {
            return;
        }
        this.f34839a.b(str, str2, bundle);
    }

    @Override // com.google.firebase.analytics.connector.a
    @I0.a
    @j0
    public int d(@N @a0(min = 1) String str) {
        return this.f34839a.m(str);
    }

    @Override // com.google.firebase.analytics.connector.a
    @I0.a
    @j0
    @N
    public List<a.c> e(@N String str, @N @a0(max = 23, min = 1) String str2) {
        ArrayList arrayList = new ArrayList();
        Iterator<Bundle> it = this.f34839a.g(str, str2).iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.analytics.connector.internal.c.b(it.next()));
        }
        return arrayList;
    }

    @Override // com.google.firebase.analytics.connector.a
    @I0.a
    public void f(@N String str, @N String str2, @N Object obj) {
        if (!com.google.firebase.analytics.connector.internal.c.l(str) || !com.google.firebase.analytics.connector.internal.c.m(str, str2)) {
            return;
        }
        this.f34839a.z(str, str2, obj);
    }

    @Override // com.google.firebase.analytics.connector.a
    @I0.a
    @j0
    @N
    public a.InterfaceC0309a g(@N String str, @N a.b bVar) {
        com.google.firebase.analytics.connector.internal.a gVar;
        C1285y.l(bVar);
        if (!com.google.firebase.analytics.connector.internal.c.l(str) || m(str)) {
            return null;
        }
        N0.a aVar = this.f34839a;
        if ("fiam".equals(str)) {
            gVar = new com.google.firebase.analytics.connector.internal.e(aVar, bVar);
        } else if (!AppMeasurement.f30086b.equals(str) && !"clx".equals(str)) {
            gVar = null;
        } else {
            gVar = new g(aVar, bVar);
        }
        if (gVar == null) {
            return null;
        }
        this.f34840b.put(str, gVar);
        return new a(str);
    }
}
