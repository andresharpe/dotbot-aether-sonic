package org.junit.runners;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import org.junit.rules.l;
import org.junit.runner.Description;
import org.junit.runners.model.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: d, reason: collision with root package name */
    static final Comparator<b> f55817d = new a();

    /* renamed from: a, reason: collision with root package name */
    private final IdentityHashMap<Object, Integer> f55818a = new IdentityHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final List<l> f55819b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<org.junit.rules.f> f55820c = new ArrayList();

    /* loaded from: classes2.dex */
    static class a implements Comparator<b> {
        a() {
        }

        private int b(int i4, int i5) {
            if (i4 < i5) {
                return 1;
            }
            return i4 == i5 ? 0 : -1;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            int b4 = b(bVar.f55825c, bVar2.f55825c);
            if (b4 == 0) {
                return bVar.f55824b - bVar2.f55824b;
            }
            return b4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: d, reason: collision with root package name */
        static final int f55821d = 1;

        /* renamed from: e, reason: collision with root package name */
        static final int f55822e = 0;

        /* renamed from: a, reason: collision with root package name */
        final Object f55823a;

        /* renamed from: b, reason: collision with root package name */
        final int f55824b;

        /* renamed from: c, reason: collision with root package name */
        final int f55825c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Object obj, int i4, Integer num) {
            int i5;
            this.f55823a = obj;
            this.f55824b = i4;
            if (num != null) {
                i5 = num.intValue();
            } else {
                i5 = -1;
            }
            this.f55825c = i5;
        }
    }

    private List<b> d() {
        ArrayList arrayList = new ArrayList(this.f55820c.size() + this.f55819b.size());
        for (org.junit.rules.f fVar : this.f55820c) {
            arrayList.add(new b(fVar, 0, this.f55818a.get(fVar)));
        }
        for (l lVar : this.f55819b) {
            arrayList.add(new b(lVar, 1, this.f55818a.get(lVar)));
        }
        Collections.sort(arrayList, f55817d);
        return arrayList;
    }

    public void a(org.junit.rules.f fVar) {
        this.f55820c.add(fVar);
    }

    public void b(l lVar) {
        this.f55819b.add(lVar);
    }

    public i c(org.junit.runners.model.d dVar, Description description, Object obj, i iVar) {
        if (this.f55820c.isEmpty() && this.f55819b.isEmpty()) {
            return iVar;
        }
        for (b bVar : d()) {
            if (bVar.f55824b == 1) {
                iVar = ((l) bVar.f55823a).a(iVar, description);
            } else {
                iVar = ((org.junit.rules.f) bVar.f55823a).a(iVar, dVar, obj);
            }
        }
        return iVar;
    }

    List<Object> e() {
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = d().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f55823a);
        }
        return arrayList;
    }

    public void f(Object obj, int i4) {
        this.f55818a.put(obj, Integer.valueOf(i4));
    }
}
