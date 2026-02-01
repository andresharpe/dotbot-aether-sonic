package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
class t {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final C1792f<?> f34931a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<b> f34932b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set<b> f34933c = new HashSet();

        b(C1792f<?> c1792f) {
            this.f34931a = c1792f;
        }

        void a(b bVar) {
            this.f34932b.add(bVar);
        }

        void b(b bVar) {
            this.f34933c.add(bVar);
        }

        C1792f<?> c() {
            return this.f34931a;
        }

        Set<b> d() {
            return this.f34932b;
        }

        boolean e() {
            return this.f34932b.isEmpty();
        }

        boolean f() {
            return this.f34933c.isEmpty();
        }

        void g(b bVar) {
            this.f34933c.remove(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f34934a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f34935b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.f34934a.equals(this.f34934a) || cVar.f34935b != this.f34935b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f34934a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f34935b).hashCode();
        }

        private c(Class<?> cls, boolean z3) {
            this.f34934a = cls;
            this.f34935b = z3;
        }
    }

    t() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List<C1792f<?>> list) {
        Set<b> c4 = c(list);
        Set<b> b4 = b(c4);
        int i4 = 0;
        while (!b4.isEmpty()) {
            b next = b4.iterator().next();
            b4.remove(next);
            i4++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b4.add(bVar);
                }
            }
        }
        if (i4 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : c4) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<C1792f<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<C1792f<?>> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                C1792f<?> next = it.next();
                b bVar = new b(next);
                for (Class<? super Object> cls : next.i()) {
                    c cVar = new c(cls, !next.p());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (!set2.isEmpty() && !cVar.f34935b) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                    }
                    set2.add(bVar);
                }
            } else {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar2 : (Set) it2.next()) {
                        for (u uVar : bVar2.c().f()) {
                            if (uVar.e() && (set = (Set) hashMap.get(new c(uVar.c(), uVar.g()))) != null) {
                                for (b bVar3 : set) {
                                    bVar2.a(bVar3);
                                    bVar3.b(bVar2);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
        }
    }
}
