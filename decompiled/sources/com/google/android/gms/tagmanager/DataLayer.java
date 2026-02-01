package com.google.android.gms.tagmanager;

import android.util.Log;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.util.D;
import com.harman.jbl.partybox.ui.party.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.dataflow.qual.SideEffectFree;

@D
/* loaded from: classes2.dex */
public class DataLayer {

    @N
    public static final String EVENT_KEY = "event";

    @N
    public static final Object OBJECT_NOT_PRESENT = new Object();
    static final String[] zza = "gtm.lifetime".split("\\.");
    private static final Pattern zzb = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap zzc;
    private final Map zzd;
    private final ReentrantLock zze;
    private final LinkedList zzf;
    private final zzaw zzg;
    private final CountDownLatch zzh;

    @D
    DataLayer() {
        this(new zzar());
    }

    @N
    @D
    public static List<Object> listOf(@N Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    @N
    @D
    public static Map<String, Object> mapOf(@N Object... objArr) {
        if ((objArr.length & 1) == 0) {
            HashMap hashMap = new HashMap();
            for (int i4 = 0; i4 < objArr.length; i4 += 2) {
                Object obj = objArr[i4];
                if (obj instanceof String) {
                    hashMap.put((String) obj, objArr[i4 + 1]);
                } else {
                    throw new IllegalArgumentException("key is not a string: ".concat(String.valueOf(obj)));
                }
            }
            return hashMap;
        }
        throw new IllegalArgumentException("expected even number of key-value pairs");
    }

    private final void zzh(Map map, String str, Collection collection) {
        String str2;
        for (Map.Entry entry : map.entrySet()) {
            if (str.length() == 0) {
                str2 = "";
            } else {
                str2 = ".";
            }
            String str3 = str + str2 + ((String) entry.getKey());
            if (entry.getValue() instanceof Map) {
                zzh((Map) entry.getValue(), str3, collection);
            } else if (!str3.equals("gtm.lifetime")) {
                collection.add(new zzat(str3, entry.getValue()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzi(Map map) {
        Long l4;
        long j4;
        this.zze.lock();
        try {
            this.zzf.offer(map);
            if (this.zze.getHoldCount() == 1) {
                int i4 = 0;
                do {
                    Map map2 = (Map) this.zzf.poll();
                    if (map2 != null) {
                        synchronized (this.zzd) {
                            try {
                                for (String str : map2.keySet()) {
                                    zzf(zza(str, map2.get(str)), this.zzd);
                                }
                            } finally {
                            }
                        }
                        Iterator it = this.zzc.keySet().iterator();
                        while (it.hasNext()) {
                            ((zzau) it.next()).zza(map2);
                        }
                        i4++;
                    }
                } while (i4 <= 500);
                this.zzf.clear();
                throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
            }
            String[] strArr = zza;
            int length = strArr.length;
            Object obj = map;
            int i5 = 0;
            while (true) {
                l4 = null;
                if (i5 >= length) {
                    break;
                }
                String str2 = strArr[i5];
                if (!(obj instanceof Map)) {
                    obj = null;
                    break;
                } else {
                    obj = ((Map) obj).get(str2);
                    i5++;
                }
            }
            if (obj != null) {
                String obj2 = obj.toString();
                Matcher matcher = zzb.matcher(obj2);
                if (!matcher.matches()) {
                    zzdg.zzb.zzb("unknown _lifetime: ".concat(String.valueOf(obj2)));
                } else {
                    try {
                        String group = matcher.group(1);
                        C1285y.l(group);
                        j4 = Long.parseLong(group);
                    } catch (NumberFormatException unused) {
                        Log.w("GoogleTagManager", "illegal number in _lifetime value: ".concat(String.valueOf(obj2)));
                        j4 = 0;
                    }
                    if (j4 <= 0) {
                        zzdg.zzb.zzb("non-positive _lifetime: ".concat(String.valueOf(obj2)));
                    } else {
                        String group2 = matcher.group(2);
                        C1285y.l(group2);
                        if (group2.length() == 0) {
                            l4 = Long.valueOf(j4);
                        } else {
                            char charAt = group2.charAt(0);
                            if (charAt != 'd') {
                                if (charAt != 'h') {
                                    if (charAt != 'm') {
                                        if (charAt != 's') {
                                            Log.w("GoogleTagManager", "unknown units in _lifetime: ".concat(String.valueOf(obj2)));
                                        } else {
                                            l4 = Long.valueOf(j4 * 1000);
                                        }
                                    } else {
                                        l4 = Long.valueOf(j4 * b.f44883c);
                                    }
                                } else {
                                    l4 = Long.valueOf(j4 * 3600000);
                                }
                            } else {
                                l4 = Long.valueOf(j4 * 86400000);
                            }
                        }
                    }
                }
            }
            if (l4 != null) {
                ArrayList arrayList = new ArrayList();
                zzh(map, "", arrayList);
                this.zzg.zzc(arrayList, l4.longValue());
            }
            this.zze.unlock();
        } catch (Throwable th) {
            this.zze.unlock();
            throw th;
        }
    }

    @P
    public Object get(@N String str) {
        synchronized (this.zzd) {
            try {
                Object obj = this.zzd;
                for (String str2 : str.split("\\.")) {
                    if (!(obj instanceof Map)) {
                        return null;
                    }
                    obj = ((Map) obj).get(str2);
                    if (obj == null) {
                        return null;
                    }
                }
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void push(@N String str, @P Object obj) {
        push(zza(str, obj));
    }

    public void pushEvent(@N String str, @N Map<String, Object> map) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("event", str);
        push(hashMap);
    }

    @N
    public String toString() {
        String sb;
        synchronized (this.zzd) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (Map.Entry entry : this.zzd.entrySet()) {
                    sb2.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", entry.getKey(), entry.getValue()));
                }
                sb = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return sb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zza(String str, @P Object obj) {
        HashMap hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i4 = 0;
        HashMap hashMap2 = hashMap;
        while (true) {
            int length = split.length - 1;
            if (i4 < length) {
                HashMap hashMap3 = new HashMap();
                hashMap2.put(split[i4], hashMap3);
                i4++;
                hashMap2 = hashMap3;
            } else {
                hashMap2.put(split[length], obj);
                return hashMap;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(String str) {
        push(str, null);
        this.zzg.zza(str);
    }

    @D
    final void zze(List list, List list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            Object obj = list.get(i4);
            if (obj instanceof List) {
                if (!(list2.get(i4) instanceof List)) {
                    list2.set(i4, new ArrayList());
                }
                Object obj2 = list2.get(i4);
                C1285y.l(obj2);
                zze((List) obj, (List) obj2);
            } else if (obj instanceof Map) {
                if (!(list2.get(i4) instanceof Map)) {
                    list2.set(i4, new HashMap());
                }
                Object obj3 = list2.get(i4);
                C1285y.l(obj3);
                zzf((Map) obj, (Map) obj3);
            } else if (obj != OBJECT_NOT_PRESENT) {
                list2.set(i4, obj);
            }
        }
    }

    @D
    final void zzf(Map map, Map map2) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                if (!(map2.get(str) instanceof List)) {
                    map2.put(str, new ArrayList());
                }
                Object obj2 = map2.get(str);
                C1285y.l(obj2);
                zze((List) obj, (List) obj2);
            } else if (obj instanceof Map) {
                if (!(map2.get(str) instanceof Map)) {
                    map2.put(str, new HashMap());
                }
                Object obj3 = map2.get(str);
                C1285y.l(obj3);
                zzf((Map) obj, (Map) obj3);
            } else {
                map2.put(str, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(zzau zzauVar) {
        this.zzc.put(zzauVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataLayer(zzaw zzawVar) {
        this.zzg = zzawVar;
        this.zzc = new ConcurrentHashMap();
        this.zzd = new HashMap();
        this.zze = new ReentrantLock();
        this.zzf = new LinkedList();
        this.zzh = new CountDownLatch(1);
        zzawVar.zzb(new zzas(this));
    }

    @SideEffectFree
    public void push(@N Map<String, Object> map) {
        try {
            this.zzh.await();
        } catch (InterruptedException unused) {
            Log.w("GoogleTagManager", "DataLayer.push: unexpected InterruptedException");
        }
        zzi(map);
    }
}
