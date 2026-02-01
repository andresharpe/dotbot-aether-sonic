package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1475q extends AbstractC1427k implements InterfaceC1451n {

    /* renamed from: G, reason: collision with root package name */
    protected final List f29744G;

    /* renamed from: H, reason: collision with root package name */
    protected final List f29745H;

    /* renamed from: I, reason: collision with root package name */
    protected C1398g2 f29746I;

    private C1475q(C1475q c1475q) {
        super(c1475q.f29699E);
        ArrayList arrayList = new ArrayList(c1475q.f29744G.size());
        this.f29744G = arrayList;
        arrayList.addAll(c1475q.f29744G);
        ArrayList arrayList2 = new ArrayList(c1475q.f29745H.size());
        this.f29745H = arrayList2;
        arrayList2.addAll(c1475q.f29745H);
        this.f29746I = c1475q.f29746I;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1427k
    public final r a(C1398g2 c1398g2, List list) {
        C1398g2 a4 = this.f29746I.a();
        for (int i4 = 0; i4 < this.f29744G.size(); i4++) {
            if (i4 < list.size()) {
                a4.e((String) this.f29744G.get(i4), c1398g2.b((r) list.get(i4)));
            } else {
                a4.e((String) this.f29744G.get(i4), r.f29754h);
            }
        }
        for (r rVar : this.f29745H) {
            r b4 = a4.b(rVar);
            if (b4 instanceof C1490s) {
                b4 = a4.b(rVar);
            }
            if (b4 instanceof C1403h) {
                return ((C1403h) b4).a();
            }
        }
        return r.f29754h;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1427k, com.google.android.gms.internal.measurement.r
    public final r zzd() {
        return new C1475q(this);
    }

    public C1475q(String str, List list, List list2, C1398g2 c1398g2) {
        super(str);
        this.f29744G = new ArrayList();
        this.f29746I = c1398g2;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f29744G.add(((r) it.next()).zzi());
            }
        }
        this.f29745H = new ArrayList(list2);
    }
}
