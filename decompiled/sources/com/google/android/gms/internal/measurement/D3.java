package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class D3 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzjd zzjdVar = (zzjd) obj;
        zzjd zzjdVar2 = (zzjd) obj2;
        C3 c32 = new C3(zzjdVar);
        C3 c33 = new C3(zzjdVar2);
        while (c32.hasNext() && c33.hasNext()) {
            int compareTo = Integer.valueOf(c32.zza() & 255).compareTo(Integer.valueOf(c33.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzjdVar.d()).compareTo(Integer.valueOf(zzjdVar2.d()));
    }
}
