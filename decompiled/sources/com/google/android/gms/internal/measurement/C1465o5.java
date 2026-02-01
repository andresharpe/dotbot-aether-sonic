package com.google.android.gms.internal.measurement;

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
/* renamed from: com.google.android.gms.internal.measurement.o5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1465o5 extends AbstractMap {

    /* renamed from: E, reason: collision with root package name */
    private final int f29728E;

    /* renamed from: H, reason: collision with root package name */
    private boolean f29731H;

    /* renamed from: I, reason: collision with root package name */
    private volatile C1449m5 f29732I;

    /* renamed from: F, reason: collision with root package name */
    private List f29729F = Collections.emptyList();

    /* renamed from: G, reason: collision with root package name */
    private Map f29730G = Collections.emptyMap();

    /* renamed from: J, reason: collision with root package name */
    private Map f29733J = Collections.emptyMap();

    private final int o(Comparable comparable) {
        int size = this.f29729F.size();
        int i4 = size - 1;
        int i5 = 0;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((C1417i5) this.f29729F.get(i4)).b());
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return i4;
            }
        }
        while (i5 <= i4) {
            int i6 = (i5 + i4) / 2;
            int compareTo2 = comparable.compareTo(((C1417i5) this.f29729F.get(i6)).b());
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
    public final Object p(int i4) {
        r();
        Object value = ((C1417i5) this.f29729F.remove(i4)).getValue();
        if (!this.f29730G.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            List list = this.f29729F;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C1417i5(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap q() {
        r();
        if (this.f29730G.isEmpty() && !(this.f29730G instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f29730G = treeMap;
            this.f29733J = treeMap.descendingMap();
        }
        return (SortedMap) this.f29730G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        if (!this.f29731H) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f29731H) {
            if (this.f29730G.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f29730G);
            }
            this.f29730G = unmodifiableMap;
            if (this.f29733J.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.f29733J);
            }
            this.f29733J = unmodifiableMap2;
            this.f29731H = true;
        }
    }

    public final int c() {
        return this.f29729F.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        r();
        if (!this.f29729F.isEmpty()) {
            this.f29729F.clear();
        }
        if (!this.f29730G.isEmpty()) {
            this.f29730G.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (o(comparable) < 0 && !this.f29730G.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Iterable e() {
        if (this.f29730G.isEmpty()) {
            return C1409h5.a();
        }
        return this.f29730G.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f29732I == null) {
            this.f29732I = new C1449m5(this, null);
        }
        return this.f29732I;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1465o5)) {
            return super.equals(obj);
        }
        C1465o5 c1465o5 = (C1465o5) obj;
        int size = size();
        if (size != c1465o5.size()) {
            return false;
        }
        int c4 = c();
        if (c4 == c1465o5.c()) {
            for (int i4 = 0; i4 < c4; i4++) {
                if (!k(i4).equals(c1465o5.k(i4))) {
                    return false;
                }
            }
            if (c4 == size) {
                return true;
            }
            return this.f29730G.equals(c1465o5.f29730G);
        }
        return entrySet().equals(c1465o5.entrySet());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int o4 = o(comparable);
        if (o4 >= 0) {
            return ((C1417i5) this.f29729F.get(o4)).getValue();
        }
        return this.f29730G.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int c4 = c();
        int i4 = 0;
        for (int i5 = 0; i5 < c4; i5++) {
            i4 += ((C1417i5) this.f29729F.get(i5)).hashCode();
        }
        if (this.f29730G.size() > 0) {
            return i4 + this.f29730G.hashCode();
        }
        return i4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        r();
        int o4 = o(comparable);
        if (o4 >= 0) {
            return ((C1417i5) this.f29729F.get(o4)).setValue(obj);
        }
        r();
        if (this.f29729F.isEmpty() && !(this.f29729F instanceof ArrayList)) {
            this.f29729F = new ArrayList(this.f29728E);
        }
        int i4 = -(o4 + 1);
        if (i4 >= this.f29728E) {
            return q().put(comparable, obj);
        }
        int size = this.f29729F.size();
        int i5 = this.f29728E;
        if (size == i5) {
            C1417i5 c1417i5 = (C1417i5) this.f29729F.remove(i5 - 1);
            q().put(c1417i5.b(), c1417i5.getValue());
        }
        this.f29729F.add(i4, new C1417i5(this, comparable, obj));
        return null;
    }

    public final Map.Entry k(int i4) {
        return (Map.Entry) this.f29729F.get(i4);
    }

    public final boolean n() {
        return this.f29731H;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        r();
        Comparable comparable = (Comparable) obj;
        int o4 = o(comparable);
        if (o4 >= 0) {
            return p(o4);
        }
        if (this.f29730G.isEmpty()) {
            return null;
        }
        return this.f29730G.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f29729F.size() + this.f29730G.size();
    }
}
