package com.google.android.material.tabs;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final TabLayout f33567a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final ViewPager2 f33568b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33569c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33570d;

    /* renamed from: e, reason: collision with root package name */
    private final b f33571e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private RecyclerView.Adapter<?> f33572f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f33573g;

    /* renamed from: h, reason: collision with root package name */
    @P
    private c f33574h;

    /* renamed from: i, reason: collision with root package name */
    @P
    private TabLayout.f f33575i;

    /* renamed from: j, reason: collision with root package name */
    @P
    private RecyclerView.i f33576j;

    /* loaded from: classes2.dex */
    private class a extends RecyclerView.i {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            d.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void b(int i4, int i5) {
            d.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void c(int i4, int i5, @P Object obj) {
            d.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void d(int i4, int i5) {
            d.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void e(int i4, int i5, int i6) {
            d.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void f(int i4, int i5) {
            d.this.d();
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(@N TabLayout.i iVar, int i4);
    }

    /* loaded from: classes2.dex */
    private static class c extends ViewPager2.j {

        /* renamed from: a, reason: collision with root package name */
        @N
        private final WeakReference<TabLayout> f33578a;

        /* renamed from: b, reason: collision with root package name */
        private int f33579b;

        /* renamed from: c, reason: collision with root package name */
        private int f33580c;

        c(TabLayout tabLayout) {
            this.f33578a = new WeakReference<>(tabLayout);
            d();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void a(int i4) {
            this.f33579b = this.f33580c;
            this.f33580c = i4;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void b(int i4, float f4, int i5) {
            boolean z3;
            TabLayout tabLayout = this.f33578a.get();
            if (tabLayout != null) {
                int i6 = this.f33580c;
                boolean z4 = false;
                if (i6 == 2 && this.f33579b != 1) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (i6 != 2 || this.f33579b != 0) {
                    z4 = true;
                }
                tabLayout.R(i4, f4, z3, z4);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i4) {
            boolean z3;
            TabLayout tabLayout = this.f33578a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i4 && i4 < tabLayout.getTabCount()) {
                int i5 = this.f33580c;
                if (i5 != 0 && (i5 != 2 || this.f33579b != 0)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                tabLayout.O(tabLayout.z(i4), z3);
            }
        }

        void d() {
            this.f33580c = 0;
            this.f33579b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static class C0299d implements TabLayout.f {

        /* renamed from: a, reason: collision with root package name */
        private final ViewPager2 f33581a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f33582b;

        C0299d(ViewPager2 viewPager2, boolean z3) {
            this.f33581a = viewPager2;
            this.f33582b = z3;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@N TabLayout.i iVar) {
            this.f33581a.s(iVar.k(), this.f33582b);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.i iVar) {
        }
    }

    public d(@N TabLayout tabLayout, @N ViewPager2 viewPager2, @N b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    public void a() {
        if (!this.f33573g) {
            RecyclerView.Adapter<?> adapter = this.f33568b.getAdapter();
            this.f33572f = adapter;
            if (adapter != null) {
                this.f33573g = true;
                c cVar = new c(this.f33567a);
                this.f33574h = cVar;
                this.f33568b.n(cVar);
                C0299d c0299d = new C0299d(this.f33568b, this.f33570d);
                this.f33575i = c0299d;
                this.f33567a.d(c0299d);
                if (this.f33569c) {
                    a aVar = new a();
                    this.f33576j = aVar;
                    this.f33572f.K(aVar);
                }
                d();
                this.f33567a.Q(this.f33568b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public void b() {
        RecyclerView.Adapter<?> adapter;
        if (this.f33569c && (adapter = this.f33572f) != null) {
            adapter.N(this.f33576j);
            this.f33576j = null;
        }
        this.f33567a.J(this.f33575i);
        this.f33568b.x(this.f33574h);
        this.f33575i = null;
        this.f33574h = null;
        this.f33572f = null;
        this.f33573g = false;
    }

    public boolean c() {
        return this.f33573g;
    }

    void d() {
        this.f33567a.H();
        RecyclerView.Adapter<?> adapter = this.f33572f;
        if (adapter != null) {
            int l4 = adapter.l();
            for (int i4 = 0; i4 < l4; i4++) {
                TabLayout.i E3 = this.f33567a.E();
                this.f33571e.a(E3, i4);
                this.f33567a.h(E3, false);
            }
            if (l4 > 0) {
                int min = Math.min(this.f33568b.getCurrentItem(), this.f33567a.getTabCount() - 1);
                if (min != this.f33567a.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f33567a;
                    tabLayout.N(tabLayout.z(min));
                }
            }
        }
    }

    public d(@N TabLayout tabLayout, @N ViewPager2 viewPager2, boolean z3, @N b bVar) {
        this(tabLayout, viewPager2, z3, true, bVar);
    }

    public d(@N TabLayout tabLayout, @N ViewPager2 viewPager2, boolean z3, boolean z4, @N b bVar) {
        this.f33567a = tabLayout;
        this.f33568b = viewPager2;
        this.f33569c = z3;
        this.f33570d = z4;
        this.f33571e = bVar;
    }
}
