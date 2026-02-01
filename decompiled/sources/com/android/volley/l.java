package com.android.volley;

import androidx.annotation.P;
import androidx.recyclerview.widget.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f24493a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f24494b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final Map<String, String> f24495c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final List<i> f24496d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24497e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24498f;

    @Deprecated
    public l(int i4, byte[] bArr, @P Map<String, String> map, boolean z3, long j4) {
        this(i4, bArr, map, a(map), z3, j4);
    }

    @P
    private static List<i> a(@P Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new i(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @P
    private static Map<String, String> b(@P List<i> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (i iVar : list) {
            treeMap.put(iVar.a(), iVar.b());
        }
        return treeMap;
    }

    public l(int i4, byte[] bArr, boolean z3, long j4, @P List<i> list) {
        this(i4, bArr, b(list), list, z3, j4);
    }

    @Deprecated
    public l(int i4, byte[] bArr, @P Map<String, String> map, boolean z3) {
        this(i4, bArr, map, z3, 0L);
    }

    public l(byte[] bArr) {
        this(n.f.f18255b, bArr, false, 0L, (List<i>) Collections.emptyList());
    }

    @Deprecated
    public l(byte[] bArr, @P Map<String, String> map) {
        this(n.f.f18255b, bArr, map, false, 0L);
    }

    private l(int i4, byte[] bArr, @P Map<String, String> map, @P List<i> list, boolean z3, long j4) {
        this.f24493a = i4;
        this.f24494b = bArr;
        this.f24495c = map;
        if (list == null) {
            this.f24496d = null;
        } else {
            this.f24496d = Collections.unmodifiableList(list);
        }
        this.f24497e = z3;
        this.f24498f = j4;
    }
}
