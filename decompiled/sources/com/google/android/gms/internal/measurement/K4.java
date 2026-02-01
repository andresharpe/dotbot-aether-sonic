package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class K4 {
    public static final int a(int i4, Object obj, Object obj2) {
        zzlf zzlfVar = (zzlf) obj;
        if (!zzlfVar.isEmpty()) {
            Iterator it = zzlfVar.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final Object b(Object obj, Object obj2) {
        zzlf zzlfVar = (zzlf) obj;
        zzlf zzlfVar2 = (zzlf) obj2;
        if (!zzlfVar2.isEmpty()) {
            if (!zzlfVar.j()) {
                zzlfVar = zzlfVar.e();
            }
            zzlfVar.i(zzlfVar2);
        }
        return zzlfVar;
    }
}
