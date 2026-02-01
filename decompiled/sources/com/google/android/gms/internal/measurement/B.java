package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class B extends AbstractC1538y {
    /* JADX INFO: Access modifiers changed from: protected */
    public B() {
        this.f29837a.add(zzbl.APPLY);
        this.f29837a.add(zzbl.BLOCK);
        this.f29837a.add(zzbl.BREAK);
        this.f29837a.add(zzbl.CASE);
        this.f29837a.add(zzbl.DEFAULT);
        this.f29837a.add(zzbl.CONTINUE);
        this.f29837a.add(zzbl.DEFINE_FUNCTION);
        this.f29837a.add(zzbl.FN);
        this.f29837a.add(zzbl.IF);
        this.f29837a.add(zzbl.QUOTE);
        this.f29837a.add(zzbl.RETURN);
        this.f29837a.add(zzbl.SWITCH);
        this.f29837a.add(zzbl.TERNARY);
    }

    private static r c(C1398g2 c1398g2, List list) {
        H2.i(zzbl.FN.name(), 2, list);
        r b4 = c1398g2.b((r) list.get(0));
        r b5 = c1398g2.b((r) list.get(1));
        if (b5 instanceof C1387f) {
            List n4 = ((C1387f) b5).n();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C1475q(b4.zzi(), n4, arrayList, c1398g2);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b5.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0129, code lost:
    
        if (r8.equals("continue") == false) goto L64;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC1538y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.r a(java.lang.String r8, com.google.android.gms.internal.measurement.C1398g2 r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.B.a(java.lang.String, com.google.android.gms.internal.measurement.g2, java.util.List):com.google.android.gms.internal.measurement.r");
    }
}
