package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j {

    /* renamed from: c, reason: collision with root package name */
    public static final int f11426c = -1;

    /* renamed from: a, reason: collision with root package name */
    private SparseIntArray f11427a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private HashMap<Integer, HashSet<WeakReference<a>>> f11428b = new HashMap<>();

    /* loaded from: classes.dex */
    public interface a {
        void a(int i4, int i5, int i6);
    }

    public void a(int i4, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.f11428b.get(Integer.valueOf(i4));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f11428b.put(Integer.valueOf(i4), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }

    public void b() {
        this.f11428b.clear();
    }

    public void c(int i4, int i5) {
        int i6 = this.f11427a.get(i4, -1);
        if (i6 == i5) {
            return;
        }
        this.f11427a.put(i4, i5);
        HashSet<WeakReference<a>> hashSet = this.f11428b.get(Integer.valueOf(i4));
        if (hashSet == null) {
            return;
        }
        Iterator<WeakReference<a>> it = hashSet.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            a aVar = it.next().get();
            if (aVar != null) {
                aVar.a(i4, i5, i6);
            } else {
                z3 = true;
            }
        }
        if (z3) {
            ArrayList arrayList = new ArrayList();
            Iterator<WeakReference<a>> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                WeakReference<a> next = it2.next();
                if (next.get() == null) {
                    arrayList.add(next);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }

    public int d(int i4) {
        return this.f11427a.get(i4, -1);
    }

    public void e(int i4, a aVar) {
        HashSet<WeakReference<a>> hashSet = this.f11428b.get(Integer.valueOf(i4));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<a>> it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference<a> next = it.next();
            a aVar2 = next.get();
            if (aVar2 == null || aVar2 == aVar) {
                arrayList.add(next);
            }
        }
        hashSet.removeAll(arrayList);
    }

    public void f(a aVar) {
        Iterator<Integer> it = this.f11428b.keySet().iterator();
        while (it.hasNext()) {
            e(it.next().intValue(), aVar);
        }
    }
}
