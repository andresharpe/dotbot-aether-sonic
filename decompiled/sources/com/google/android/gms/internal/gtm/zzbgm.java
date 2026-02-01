package com.google.android.gms.internal.gtm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzbgm extends LinkedHashMap {
    private static final zzbgm zza;
    private boolean zzb;

    static {
        zzbgm zzbgmVar = new zzbgm();
        zza = zzbgmVar;
        zzbgmVar.zzb = false;
    }

    private zzbgm() {
        this.zzb = true;
    }

    public static zzbgm zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            return zzbfq.zzb((byte[]) obj);
        }
        if (!(obj instanceof zzbfh)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private final void zzg() {
        if (this.zzb) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
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

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i4 += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i4;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zzg();
        zzbfq.zze(obj);
        zzbfq.zze(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzg();
        for (Object obj : map.keySet()) {
            zzbfq.zze(obj);
            zzbfq.zze(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzbgm zzb() {
        if (isEmpty()) {
            return new zzbgm();
        }
        return new zzbgm(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzbgm zzbgmVar) {
        zzg();
        if (!zzbgmVar.isEmpty()) {
            putAll(zzbgmVar);
        }
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzbgm(Map map) {
        super(map);
        this.zzb = true;
    }
}
