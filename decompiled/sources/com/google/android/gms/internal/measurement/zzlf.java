package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzlf extends LinkedHashMap {

    /* renamed from: F, reason: collision with root package name */
    private static final zzlf f29853F;

    /* renamed from: E, reason: collision with root package name */
    private boolean f29854E;

    static {
        zzlf zzlfVar = new zzlf();
        f29853F = zzlfVar;
        zzlfVar.f29854E = false;
    }

    private zzlf() {
        this.f29854E = true;
    }

    public static zzlf a() {
        return f29853F;
    }

    private static int k(Object obj) {
        if (obj instanceof byte[]) {
            return C1503t4.b((byte[]) obj);
        }
        if (!(obj instanceof InterfaceC1456n4)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private final void l() {
        if (this.f29854E) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        l();
        super.clear();
    }

    public final zzlf e() {
        if (isEmpty()) {
            return new zzlf();
        }
        return new zzlf(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (map.containsKey(entry.getKey())) {
                            Object value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                                equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                            } else {
                                equals = value.equals(obj2);
                            }
                            if (!equals) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void h() {
        this.f29854E = false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i4 += k(entry.getValue()) ^ k(entry.getKey());
        }
        return i4;
    }

    public final void i(zzlf zzlfVar) {
        l();
        if (!zzlfVar.isEmpty()) {
            putAll(zzlfVar);
        }
    }

    public final boolean j() {
        return this.f29854E;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        l();
        C1503t4.e(obj);
        C1503t4.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        l();
        for (Object obj : map.keySet()) {
            C1503t4.e(obj);
            C1503t4.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        l();
        return super.remove(obj);
    }

    private zzlf(Map map) {
        super(map);
        this.f29854E = true;
    }
}
