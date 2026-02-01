package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC1378d6;
import java.util.Map;

/* loaded from: classes2.dex */
final class V1 implements InterfaceC1378d6 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f30441a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ W1 f30442b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public V1(W1 w12, String str) {
        this.f30442b = w12;
        this.f30441a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1378d6
    public final String zza(String str) {
        Map map;
        map = this.f30442b.f30456d;
        Map map2 = (Map) map.get(this.f30441a);
        if (map2 != null && map2.containsKey(str)) {
            return (String) map2.get(str);
        }
        return null;
    }
}
