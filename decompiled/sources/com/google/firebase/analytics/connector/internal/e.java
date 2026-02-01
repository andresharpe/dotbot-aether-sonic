package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.C1285y;
import com.google.firebase.analytics.connector.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    final Set f34853a;

    /* renamed from: b, reason: collision with root package name */
    private final a.b f34854b;

    /* renamed from: c, reason: collision with root package name */
    private final N0.a f34855c;

    /* renamed from: d, reason: collision with root package name */
    private final d f34856d;

    public e(N0.a aVar, a.b bVar) {
        this.f34854b = bVar;
        this.f34855c = aVar;
        d dVar = new d(this);
        this.f34856d = dVar;
        aVar.s(dVar);
        this.f34853a = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void a(Set set) {
        this.f34853a.clear();
        Set set2 = this.f34853a;
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.size() >= 50) {
                break;
            }
            if (c.f(str) && c.g(str)) {
                String d4 = c.d(str);
                C1285y.l(d4);
                hashSet.add(d4);
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final a.b zza() {
        return this.f34854b;
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void zzc() {
        this.f34853a.clear();
    }
}
