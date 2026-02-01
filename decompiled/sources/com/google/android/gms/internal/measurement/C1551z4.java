package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1551z4 extends D4 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f29847c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C1551z4(C1543y4 c1543y4) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D4
    public final void a(Object obj, long j4) {
        Object unmodifiableList;
        List list = (List) B5.k(obj, j4);
        if (list instanceof InterfaceC1535x4) {
            unmodifiableList = ((InterfaceC1535x4) list).zze();
        } else {
            if (f29847c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof W4) && (list instanceof InterfaceC1495s4)) {
                InterfaceC1495s4 interfaceC1495s4 = (InterfaceC1495s4) list;
                if (interfaceC1495s4.zzc()) {
                    interfaceC1495s4.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        B5.x(obj, j4, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.D4
    public final void b(Object obj, Object obj2, long j4) {
        C1527w4 c1527w4;
        List list = (List) B5.k(obj2, j4);
        int size = list.size();
        List list2 = (List) B5.k(obj, j4);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC1535x4) {
                list2 = new C1527w4(size);
            } else if ((list2 instanceof W4) && (list2 instanceof InterfaceC1495s4)) {
                list2 = ((InterfaceC1495s4) list2).zzd(size);
            } else {
                list2 = new ArrayList(size);
            }
            B5.x(obj, j4, list2);
        } else {
            if (f29847c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                B5.x(obj, j4, arrayList);
                c1527w4 = arrayList;
            } else if (list2 instanceof C1528w5) {
                C1527w4 c1527w42 = new C1527w4(list2.size() + size);
                c1527w42.addAll(c1527w42.size(), (C1528w5) list2);
                B5.x(obj, j4, c1527w42);
                c1527w4 = c1527w42;
            } else if ((list2 instanceof W4) && (list2 instanceof InterfaceC1495s4)) {
                InterfaceC1495s4 interfaceC1495s4 = (InterfaceC1495s4) list2;
                if (!interfaceC1495s4.zzc()) {
                    list2 = interfaceC1495s4.zzd(list2.size() + size);
                    B5.x(obj, j4, list2);
                }
            }
            list2 = c1527w4;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        B5.x(obj, j4, list);
    }

    private C1551z4() {
        super(null);
    }
}
