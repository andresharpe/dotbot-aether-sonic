package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import d.C2042a;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class e implements n, AdapterView.OnItemClickListener {

    /* renamed from: O, reason: collision with root package name */
    private static final String f5309O = "ListMenuPresenter";

    /* renamed from: P, reason: collision with root package name */
    public static final String f5310P = "android:menu:list";

    /* renamed from: E, reason: collision with root package name */
    Context f5311E;

    /* renamed from: F, reason: collision with root package name */
    LayoutInflater f5312F;

    /* renamed from: G, reason: collision with root package name */
    g f5313G;

    /* renamed from: H, reason: collision with root package name */
    ExpandedMenuView f5314H;

    /* renamed from: I, reason: collision with root package name */
    int f5315I;

    /* renamed from: J, reason: collision with root package name */
    int f5316J;

    /* renamed from: K, reason: collision with root package name */
    int f5317K;

    /* renamed from: L, reason: collision with root package name */
    private n.a f5318L;

    /* renamed from: M, reason: collision with root package name */
    a f5319M;

    /* renamed from: N, reason: collision with root package name */
    private int f5320N;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: E, reason: collision with root package name */
        private int f5321E = -1;

        public a() {
            a();
        }

        void a() {
            j y3 = e.this.f5313G.y();
            if (y3 != null) {
                ArrayList<j> C3 = e.this.f5313G.C();
                int size = C3.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (C3.get(i4) == y3) {
                        this.f5321E = i4;
                        return;
                    }
                }
            }
            this.f5321E = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j getItem(int i4) {
            ArrayList<j> C3 = e.this.f5313G.C();
            int i5 = i4 + e.this.f5315I;
            int i6 = this.f5321E;
            if (i6 >= 0 && i5 >= i6) {
                i5++;
            }
            return C3.get(i5);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f5313G.C().size() - e.this.f5315I;
            if (this.f5321E < 0) {
                return size;
            }
            return size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f5312F.inflate(eVar.f5317K, viewGroup, false);
            }
            ((o.a) view).h(getItem(i4), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i4) {
        this(i4, 0);
        this.f5311E = context;
        this.f5312F = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f5319M == null) {
            this.f5319M = new a();
        }
        return this.f5319M;
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar, boolean z3) {
        n.a aVar = this.f5318L;
        if (aVar != null) {
            aVar.b(gVar, z3);
        }
    }

    int c() {
        return this.f5315I;
    }

    @Override // androidx.appcompat.view.menu.n
    public void d(boolean z3) {
        a aVar = this.f5319M;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean f(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f5320N;
    }

    @Override // androidx.appcompat.view.menu.n
    public void h(n.a aVar) {
        this.f5318L = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void i(Context context, g gVar) {
        if (this.f5316J != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f5316J);
            this.f5311E = contextThemeWrapper;
            this.f5312F = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f5311E != null) {
            this.f5311E = context;
            if (this.f5312F == null) {
                this.f5312F = LayoutInflater.from(context);
            }
        }
        this.f5313G = gVar;
        a aVar = this.f5319M;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(Parcelable parcelable) {
        k((Bundle) parcelable);
    }

    public void k(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(f5310P);
        if (sparseParcelableArray != null) {
            this.f5314H.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean l(s sVar) {
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        new h(sVar).e(null);
        n.a aVar = this.f5318L;
        if (aVar != null) {
            aVar.c(sVar);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public o m(ViewGroup viewGroup) {
        if (this.f5314H == null) {
            this.f5314H = (ExpandedMenuView) this.f5312F.inflate(C2042a.j.f49698n, viewGroup, false);
            if (this.f5319M == null) {
                this.f5319M = new a();
            }
            this.f5314H.setAdapter((ListAdapter) this.f5319M);
            this.f5314H.setOnItemClickListener(this);
        }
        return this.f5314H;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable n() {
        if (this.f5314H == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        o(bundle);
        return bundle;
    }

    public void o(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f5314H;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(f5310P, sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
        this.f5313G.P(this.f5319M.getItem(i4), this, 0);
    }

    public void p(int i4) {
        this.f5320N = i4;
    }

    public void q(int i4) {
        this.f5315I = i4;
        if (this.f5314H != null) {
            d(false);
        }
    }

    public e(int i4, int i5) {
        this.f5317K = i4;
        this.f5316J = i5;
    }
}
