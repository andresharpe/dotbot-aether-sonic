package com.google.firebase.abt;

import android.content.Context;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.annotation.j0;
import com.google.firebase.analytics.connector.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    @i0
    static final String f34501d = "com.google.firebase.abt";

    /* renamed from: e, reason: collision with root package name */
    @i0
    static final String f34502e = "%s_lastKnownExperimentStartTime";

    /* renamed from: a, reason: collision with root package name */
    private final C1.b<com.google.firebase.analytics.connector.a> f34503a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34504b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private Integer f34505c = null;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {

        /* renamed from: J, reason: collision with root package name */
        public static final String f34506J = "frc";

        /* renamed from: K, reason: collision with root package name */
        public static final String f34507K = "fiam";
    }

    public c(Context context, C1.b<com.google.firebase.analytics.connector.a> bVar, String str) {
        this.f34503a = bVar;
        this.f34504b = str;
    }

    private void a(a.c cVar) {
        this.f34503a.get().b(cVar);
    }

    private void b(List<com.google.firebase.abt.a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(e());
        int h4 = h();
        for (com.google.firebase.abt.a aVar : list) {
            while (arrayDeque.size() >= h4) {
                j(((a.c) arrayDeque.pollFirst()).f34824b);
            }
            a.c i4 = aVar.i(this.f34504b);
            a(i4);
            arrayDeque.offer(i4);
        }
    }

    private static List<com.google.firebase.abt.a> c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.abt.a.b(it.next()));
        }
        return arrayList;
    }

    @j0
    private List<a.c> e() {
        return this.f34503a.get().e(this.f34504b, "");
    }

    private ArrayList<com.google.firebase.abt.a> f(List<com.google.firebase.abt.a> list, Set<String> set) {
        ArrayList<com.google.firebase.abt.a> arrayList = new ArrayList<>();
        for (com.google.firebase.abt.a aVar : list) {
            if (!set.contains(aVar.c())) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private ArrayList<a.c> g(List<a.c> list, Set<String> set) {
        ArrayList<a.c> arrayList = new ArrayList<>();
        for (a.c cVar : list) {
            if (!set.contains(cVar.f34824b)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    @j0
    private int h() {
        if (this.f34505c == null) {
            this.f34505c = Integer.valueOf(this.f34503a.get().d(this.f34504b));
        }
        return this.f34505c.intValue();
    }

    private void j(String str) {
        this.f34503a.get().clearConditionalUserProperty(str, null, null);
    }

    private void k(Collection<a.c> collection) {
        Iterator<a.c> it = collection.iterator();
        while (it.hasNext()) {
            j(it.next().f34824b);
        }
    }

    private void m(List<com.google.firebase.abt.a> list) throws AbtException {
        if (list.isEmpty()) {
            i();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<com.google.firebase.abt.a> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().c());
        }
        List<a.c> e4 = e();
        HashSet hashSet2 = new HashSet();
        Iterator<a.c> it2 = e4.iterator();
        while (it2.hasNext()) {
            hashSet2.add(it2.next().f34824b);
        }
        k(g(e4, hashSet));
        b(f(list, hashSet2));
    }

    private void o() throws AbtException {
        if (this.f34503a.get() != null) {
        } else {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    @j0
    public List<com.google.firebase.abt.a> d() throws AbtException {
        o();
        List<a.c> e4 = e();
        ArrayList arrayList = new ArrayList();
        Iterator<a.c> it = e4.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.firebase.abt.a.a(it.next()));
        }
        return arrayList;
    }

    @j0
    public void i() throws AbtException {
        o();
        k(e());
    }

    @j0
    public void l(List<Map<String, String>> list) throws AbtException {
        o();
        if (list != null) {
            m(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    @j0
    public void n(com.google.firebase.abt.a aVar) throws AbtException {
        o();
        com.google.firebase.abt.a.k(aVar);
        ArrayList arrayList = new ArrayList();
        Map<String, String> j4 = aVar.j();
        j4.remove("triggerEvent");
        arrayList.add(com.google.firebase.abt.a.b(j4));
        b(arrayList);
    }

    @j0
    public void p(List<com.google.firebase.abt.a> list) throws AbtException {
        o();
        HashSet hashSet = new HashSet();
        Iterator<com.google.firebase.abt.a> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().c());
        }
        k(g(e(), hashSet));
    }
}
