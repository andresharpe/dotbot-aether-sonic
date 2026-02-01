package androidx.recyclerview.widget;

import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.G;
import androidx.recyclerview.widget.L;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0962h implements w.b {

    /* renamed from: a, reason: collision with root package name */
    private final ConcatAdapter f18027a;

    /* renamed from: b, reason: collision with root package name */
    private final L f18028b;

    /* renamed from: c, reason: collision with root package name */
    private List<WeakReference<RecyclerView>> f18029c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final IdentityHashMap<RecyclerView.F, w> f18030d = new IdentityHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private List<w> f18031e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private a f18032f = new a();

    /* renamed from: g, reason: collision with root package name */
    @N
    private final ConcatAdapter.Config.StableIdMode f18033g;

    /* renamed from: h, reason: collision with root package name */
    private final G f18034h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.h$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        w f18035a;

        /* renamed from: b, reason: collision with root package name */
        int f18036b;

        /* renamed from: c, reason: collision with root package name */
        boolean f18037c;

        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0962h(ConcatAdapter concatAdapter, ConcatAdapter.Config config) {
        this.f18027a = concatAdapter;
        if (config.f17430a) {
            this.f18028b = new L.a();
        } else {
            this.f18028b = new L.b();
        }
        ConcatAdapter.Config.StableIdMode stableIdMode = config.f17431b;
        this.f18033g = stableIdMode;
        if (stableIdMode == ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.f18034h = new G.b();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            this.f18034h = new G.a();
        } else {
            if (stableIdMode == ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
                this.f18034h = new G.c();
                return;
            }
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    private void H(a aVar) {
        aVar.f18037c = false;
        aVar.f18035a = null;
        aVar.f18036b = -1;
        this.f18032f = aVar;
    }

    private void j() {
        RecyclerView.Adapter.StateRestorationPolicy l4 = l();
        if (l4 != this.f18027a.o()) {
            this.f18027a.R(l4);
        }
    }

    private RecyclerView.Adapter.StateRestorationPolicy l() {
        for (w wVar : this.f18031e) {
            RecyclerView.Adapter.StateRestorationPolicy o4 = wVar.f18351c.o();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (o4 == stateRestorationPolicy) {
                return stateRestorationPolicy;
            }
            if (o4 == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && wVar.b() == 0) {
                return stateRestorationPolicy;
            }
        }
        return RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
    }

    private int m(w wVar) {
        w next;
        Iterator<w> it = this.f18031e.iterator();
        int i4 = 0;
        while (it.hasNext() && (next = it.next()) != wVar) {
            i4 += next.b();
        }
        return i4;
    }

    @N
    private a n(int i4) {
        a aVar = this.f18032f;
        if (aVar.f18037c) {
            aVar = new a();
        } else {
            aVar.f18037c = true;
        }
        Iterator<w> it = this.f18031e.iterator();
        int i5 = i4;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            w next = it.next();
            if (next.b() > i5) {
                aVar.f18035a = next;
                aVar.f18036b = i5;
                break;
            }
            i5 -= next.b();
        }
        if (aVar.f18035a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i4);
    }

    @P
    private w o(RecyclerView.Adapter<RecyclerView.F> adapter) {
        int x3 = x(adapter);
        if (x3 == -1) {
            return null;
        }
        return this.f18031e.get(x3);
    }

    @N
    private w v(RecyclerView.F f4) {
        w wVar = this.f18030d.get(f4);
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f4 + ", seems like it is not bound by this adapter: " + this);
    }

    private int x(RecyclerView.Adapter<RecyclerView.F> adapter) {
        int size = this.f18031e.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f18031e.get(i4).f18351c == adapter) {
                return i4;
            }
        }
        return -1;
    }

    private boolean y(RecyclerView recyclerView) {
        Iterator<WeakReference<RecyclerView>> it = this.f18029c.iterator();
        while (it.hasNext()) {
            if (it.next().get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void A(RecyclerView.F f4, int i4) {
        a n4 = n(i4);
        this.f18030d.put(f4, n4.f18035a);
        n4.f18035a.e(f4, n4.f18036b);
        H(n4);
    }

    public RecyclerView.F B(ViewGroup viewGroup, int i4) {
        return this.f18028b.a(i4).f(viewGroup, i4);
    }

    public void C(RecyclerView recyclerView) {
        int size = this.f18029c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.f18029c.get(size);
            if (weakReference.get() == null) {
                this.f18029c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f18029c.remove(size);
                break;
            }
            size--;
        }
        Iterator<w> it = this.f18031e.iterator();
        while (it.hasNext()) {
            it.next().f18351c.F(recyclerView);
        }
    }

    public boolean D(RecyclerView.F f4) {
        w wVar = this.f18030d.get(f4);
        if (wVar != null) {
            boolean G3 = wVar.f18351c.G(f4);
            this.f18030d.remove(f4);
            return G3;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f4 + ", seems like it is not bound by this adapter: " + this);
    }

    public void E(RecyclerView.F f4) {
        v(f4).f18351c.H(f4);
    }

    public void F(RecyclerView.F f4) {
        v(f4).f18351c.I(f4);
    }

    public void G(RecyclerView.F f4) {
        w wVar = this.f18030d.get(f4);
        if (wVar != null) {
            wVar.f18351c.J(f4);
            this.f18030d.remove(f4);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + f4 + ", seems like it is not bound by this adapter: " + this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean I(RecyclerView.Adapter<RecyclerView.F> adapter) {
        int x3 = x(adapter);
        if (x3 == -1) {
            return false;
        }
        w wVar = this.f18031e.get(x3);
        int m4 = m(wVar);
        this.f18031e.remove(x3);
        this.f18027a.z(m4, wVar.b());
        Iterator<WeakReference<RecyclerView>> it = this.f18029c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                adapter.F(recyclerView);
            }
        }
        wVar.a();
        j();
        return true;
    }

    @Override // androidx.recyclerview.widget.w.b
    public void a(w wVar) {
        j();
    }

    @Override // androidx.recyclerview.widget.w.b
    public void b(@N w wVar, int i4, int i5, @P Object obj) {
        this.f18027a.x(i4 + m(wVar), i5, obj);
    }

    @Override // androidx.recyclerview.widget.w.b
    public void c(@N w wVar, int i4, int i5) {
        this.f18027a.w(i4 + m(wVar), i5);
    }

    @Override // androidx.recyclerview.widget.w.b
    public void d(@N w wVar, int i4, int i5) {
        this.f18027a.y(i4 + m(wVar), i5);
    }

    @Override // androidx.recyclerview.widget.w.b
    public void e(@N w wVar, int i4, int i5) {
        int m4 = m(wVar);
        this.f18027a.v(i4 + m4, i5 + m4);
    }

    @Override // androidx.recyclerview.widget.w.b
    public void f(@N w wVar) {
        this.f18027a.r();
        j();
    }

    @Override // androidx.recyclerview.widget.w.b
    public void g(@N w wVar, int i4, int i5) {
        this.f18027a.z(i4 + m(wVar), i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(int i4, RecyclerView.Adapter<RecyclerView.F> adapter) {
        if (i4 >= 0 && i4 <= this.f18031e.size()) {
            if (w()) {
                androidx.core.util.u.b(adapter.q(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
            } else if (adapter.q()) {
                Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
            }
            if (o(adapter) != null) {
                return false;
            }
            w wVar = new w(adapter, this, this.f18028b, this.f18034h.a());
            this.f18031e.add(i4, wVar);
            Iterator<WeakReference<RecyclerView>> it = this.f18029c.iterator();
            while (it.hasNext()) {
                RecyclerView recyclerView = it.next().get();
                if (recyclerView != null) {
                    adapter.B(recyclerView);
                }
            }
            if (wVar.b() > 0) {
                this.f18027a.y(m(wVar), wVar.b());
            }
            j();
            return true;
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f18031e.size() + ". Given:" + i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(RecyclerView.Adapter<RecyclerView.F> adapter) {
        return h(this.f18031e.size(), adapter);
    }

    public boolean k() {
        Iterator<w> it = this.f18031e.iterator();
        while (it.hasNext()) {
            if (!it.next().f18351c.i()) {
                return false;
            }
        }
        return true;
    }

    @P
    public RecyclerView.Adapter<? extends RecyclerView.F> p(RecyclerView.F f4) {
        w wVar = this.f18030d.get(f4);
        if (wVar == null) {
            return null;
        }
        return wVar.f18351c;
    }

    public List<RecyclerView.Adapter<? extends RecyclerView.F>> q() {
        if (this.f18031e.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f18031e.size());
        Iterator<w> it = this.f18031e.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f18351c);
        }
        return arrayList;
    }

    public long r(int i4) {
        a n4 = n(i4);
        long c4 = n4.f18035a.c(n4.f18036b);
        H(n4);
        return c4;
    }

    public int s(int i4) {
        a n4 = n(i4);
        int d4 = n4.f18035a.d(n4.f18036b);
        H(n4);
        return d4;
    }

    public int t(RecyclerView.Adapter<? extends RecyclerView.F> adapter, RecyclerView.F f4, int i4) {
        w wVar = this.f18030d.get(f4);
        if (wVar == null) {
            return -1;
        }
        int m4 = i4 - m(wVar);
        int l4 = wVar.f18351c.l();
        if (m4 >= 0 && m4 < l4) {
            return wVar.f18351c.k(adapter, f4, m4);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + m4 + " which is out of bounds for the adapter with size " + l4 + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + f4 + "adapter:" + adapter);
    }

    public int u() {
        Iterator<w> it = this.f18031e.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().b();
        }
        return i4;
    }

    public boolean w() {
        if (this.f18033g != ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            return true;
        }
        return false;
    }

    public void z(RecyclerView recyclerView) {
        if (y(recyclerView)) {
            return;
        }
        this.f18029c.add(new WeakReference<>(recyclerView));
        Iterator<w> it = this.f18031e.iterator();
        while (it.hasNext()) {
            it.next().f18351c.B(recyclerView);
        }
    }
}
