package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1368c4 {

    /* renamed from: d, reason: collision with root package name */
    private static final C1368c4 f29603d = new C1368c4(true);

    /* renamed from: a, reason: collision with root package name */
    final C1465o5 f29604a = new C1377d5(16);

    /* renamed from: b, reason: collision with root package name */
    private boolean f29605b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29606c;

    private C1368c4() {
    }

    public static C1368c4 a() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(com.google.android.gms.internal.measurement.InterfaceC1360b4 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zznd r0 = r2.zzb()
            com.google.android.gms.internal.measurement.C1503t4.e(r3)
            com.google.android.gms.internal.measurement.zznd r1 = com.google.android.gms.internal.measurement.zznd.zza
            com.google.android.gms.internal.measurement.zzne r1 = com.google.android.gms.internal.measurement.zzne.INT
            com.google.android.gms.internal.measurement.zzne r0 = r0.b()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.P4
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.C1511u4
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.InterfaceC1456n4
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.zzjd
            if (r0 != 0) goto L45
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r2.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.zznd r2 = r2.zzb()
            com.google.android.gms.internal.measurement.zzne r2 = r2.b()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1368c4.d(com.google.android.gms.internal.measurement.b4, java.lang.Object):void");
    }

    public final void b() {
        if (this.f29605b) {
            return;
        }
        this.f29604a.a();
        this.f29605b = true;
    }

    public final void c(InterfaceC1360b4 interfaceC1360b4, Object obj) {
        if (interfaceC1360b4.zzc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    d(interfaceC1360b4, arrayList.get(i4));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            d(interfaceC1360b4, obj);
        }
        if (obj instanceof C1511u4) {
            this.f29606c = true;
        }
        this.f29604a.put(interfaceC1360b4, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C1368c4 c1368c4 = new C1368c4();
        for (int i4 = 0; i4 < this.f29604a.c(); i4++) {
            Map.Entry k4 = this.f29604a.k(i4);
            c1368c4.c((InterfaceC1360b4) k4.getKey(), k4.getValue());
        }
        for (Map.Entry entry : this.f29604a.e()) {
            c1368c4.c((InterfaceC1360b4) entry.getKey(), entry.getValue());
        }
        c1368c4.f29606c = this.f29606c;
        return c1368c4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1368c4)) {
            return false;
        }
        return this.f29604a.equals(((C1368c4) obj).f29604a);
    }

    public final int hashCode() {
        return this.f29604a.hashCode();
    }

    private C1368c4(boolean z3) {
        b();
        b();
    }
}
