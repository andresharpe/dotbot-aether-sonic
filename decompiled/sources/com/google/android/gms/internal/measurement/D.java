package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class D implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC1427k f29301a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1398g2 f29302b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(AbstractC1427k abstractC1427k, C1398g2 c1398g2) {
        this.f29301a = abstractC1427k;
        this.f29302b = c1398g2;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        AbstractC1427k abstractC1427k = this.f29301a;
        C1398g2 c1398g2 = this.f29302b;
        if (rVar instanceof C1522w) {
            if (rVar2 instanceof C1522w) {
                return 0;
            }
            return 1;
        }
        if (rVar2 instanceof C1522w) {
            return -1;
        }
        if (abstractC1427k == null) {
            return rVar.zzi().compareTo(rVar2.zzi());
        }
        return (int) H2.a(abstractC1427k.a(c1398g2, Arrays.asList(rVar, rVar2)).zzh().doubleValue());
    }
}
