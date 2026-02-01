package androidx.coordinatorlayout.widget;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.collection.l;
import androidx.core.util.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final t.a<ArrayList<T>> f11503a = new t.b(10);

    /* renamed from: b, reason: collision with root package name */
    private final l<T, ArrayList<T>> f11504b = new l<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f11505c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<T> f11506d = new HashSet<>();

    private void e(T t3, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t3)) {
            return;
        }
        if (!hashSet.contains(t3)) {
            hashSet.add(t3);
            ArrayList<T> arrayList2 = this.f11504b.get(t3);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    e(arrayList2.get(i4), arrayList, hashSet);
                }
            }
            hashSet.remove(t3);
            arrayList.add(t3);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    @N
    private ArrayList<T> f() {
        ArrayList<T> b4 = this.f11503a.b();
        if (b4 == null) {
            return new ArrayList<>();
        }
        return b4;
    }

    private void l(@N ArrayList<T> arrayList) {
        arrayList.clear();
        this.f11503a.a(arrayList);
    }

    public void a(@N T t3, @N T t4) {
        if (this.f11504b.containsKey(t3) && this.f11504b.containsKey(t4)) {
            ArrayList<T> arrayList = this.f11504b.get(t3);
            if (arrayList == null) {
                arrayList = f();
                this.f11504b.put(t3, arrayList);
            }
            arrayList.add(t4);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void b(@N T t3) {
        if (!this.f11504b.containsKey(t3)) {
            this.f11504b.put(t3, null);
        }
    }

    public void c() {
        int size = this.f11504b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList<T> q4 = this.f11504b.q(i4);
            if (q4 != null) {
                l(q4);
            }
        }
        this.f11504b.clear();
    }

    public boolean d(@N T t3) {
        return this.f11504b.containsKey(t3);
    }

    @P
    public List<T> g(@N T t3) {
        ArrayList<T> h4 = h(t3);
        if (h4 == null) {
            return null;
        }
        return new ArrayList(h4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public ArrayList<T> h(@N T t3) {
        return this.f11504b.get(t3);
    }

    @P
    public List<T> i(@N T t3) {
        int size = this.f11504b.size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList<T> q4 = this.f11504b.q(i4);
            if (q4 != null && q4.contains(t3)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f11504b.m(i4));
            }
        }
        return arrayList;
    }

    @N
    public ArrayList<T> j() {
        this.f11505c.clear();
        this.f11506d.clear();
        int size = this.f11504b.size();
        for (int i4 = 0; i4 < size; i4++) {
            e(this.f11504b.m(i4), this.f11505c, this.f11506d);
        }
        return this.f11505c;
    }

    public boolean k(@N T t3) {
        int size = this.f11504b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList<T> q4 = this.f11504b.q(i4);
            if (q4 != null && q4.contains(t3)) {
                return true;
            }
        }
        return false;
    }

    int m() {
        return this.f11504b.size();
    }
}
