package com.google.android.gms.internal.gtm;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzbhs extends AbstractMap {
    private final int zza;
    private boolean zzd;
    private volatile zzbhq zze;
    private List zzb = Collections.emptyList();
    private Map zzc = Collections.emptyMap();
    private Map zzf = Collections.emptyMap();

    private final int zzk(Comparable comparable) {
        int size = this.zzb.size();
        int i4 = size - 1;
        int i5 = 0;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((zzbhm) this.zzb.get(i4)).zza());
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return i4;
            }
        }
        while (i5 <= i4) {
            int i6 = (i5 + i4) / 2;
            int compareTo2 = comparable.compareTo(((zzbhm) this.zzb.get(i6)).zza());
            if (compareTo2 < 0) {
                i4 = i6 - 1;
            } else if (compareTo2 > 0) {
                i5 = i6 + 1;
            } else {
                return i6;
            }
        }
        return -(i5 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzl(int i4) {
        zzn();
        Object value = ((zzbhm) this.zzb.remove(i4)).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator it = zzm().entrySet().iterator();
            List list = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzbhm(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap zzm() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn() {
        if (!this.zzd) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zzk(comparable) < 0 && !this.zzc.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzbhq(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbhs)) {
            return super.equals(obj);
        }
        zzbhs zzbhsVar = (zzbhs) obj;
        int size = size();
        if (size != zzbhsVar.size()) {
            return false;
        }
        int zzb = zzb();
        if (zzb == zzbhsVar.zzb()) {
            for (int i4 = 0; i4 < zzb; i4++) {
                if (!zzg(i4).equals(zzbhsVar.zzg(i4))) {
                    return false;
                }
            }
            if (zzb == size) {
                return true;
            }
            return this.zzc.equals(zzbhsVar.zzc);
        }
        return entrySet().equals(zzbhsVar.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return ((zzbhm) this.zzb.get(zzk)).getValue();
        }
        return this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int zzb = zzb();
        int i4 = 0;
        for (int i5 = 0; i5 < zzb; i5++) {
            i4 += ((zzbhm) this.zzb.get(i5)).hashCode();
        }
        if (this.zzc.size() > 0) {
            return i4 + this.zzc.hashCode();
        }
        return i4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzn();
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return zzl(zzk);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb.size() + this.zzc.size();
    }

    public void zza() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.zzd) {
            if (this.zzc.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.zzc);
            }
            this.zzc = unmodifiableMap;
            if (this.zzf.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.zzf);
            }
            this.zzf = unmodifiableMap2;
            this.zzd = true;
        }
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final Iterable zzc() {
        if (this.zzc.isEmpty()) {
            return zzbhl.zza();
        }
        return this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzn();
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return ((zzbhm) this.zzb.get(zzk)).setValue(obj);
        }
        zzn();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i4 = -(zzk + 1);
        if (i4 >= this.zza) {
            return zzm().put(comparable, obj);
        }
        int size = this.zzb.size();
        int i5 = this.zza;
        if (size == i5) {
            zzbhm zzbhmVar = (zzbhm) this.zzb.remove(i5 - 1);
            zzm().put(zzbhmVar.zza(), zzbhmVar.getValue());
        }
        this.zzb.add(i4, new zzbhm(this, comparable, obj));
        return null;
    }

    public final Map.Entry zzg(int i4) {
        return (Map.Entry) this.zzb.get(i4);
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
