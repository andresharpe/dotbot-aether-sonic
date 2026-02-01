package com.harman.jbl.partybox.ui.customviews.scrollpageindicator;

import androidx.annotation.N;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes2.dex */
public class b extends com.harman.jbl.partybox.ui.customviews.scrollpageindicator.a<ViewPager2> {

    /* renamed from: a, reason: collision with root package name */
    private RecyclerView.i f42820a;

    /* renamed from: b, reason: collision with root package name */
    private RecyclerView.Adapter<?> f42821b;

    /* renamed from: c, reason: collision with root package name */
    private ViewPager2.j f42822c;

    /* renamed from: d, reason: collision with root package name */
    private ViewPager2 f42823d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f42824e = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends RecyclerView.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewPagerIndicator f42825a;

        a(ViewPagerIndicator viewPagerIndicator) {
            this.f42825a = viewPagerIndicator;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            this.f42825a.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.harman.jbl.partybox.ui.customviews.scrollpageindicator.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0369b extends ViewPager2.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewPagerIndicator f42827a;

        C0369b(ViewPagerIndicator viewPagerIndicator) {
            this.f42827a = viewPagerIndicator;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void a(int i4) {
            boolean z3;
            b bVar = b.this;
            if (i4 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            bVar.f42824e = z3;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void b(int i4, float f4, int i5) {
            b.this.c(this.f42827a, i4, f4);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i4) {
            b.this.f(this.f42827a);
        }
    }

    @Override // com.harman.jbl.partybox.ui.customviews.scrollpageindicator.ViewPagerIndicator.c
    public void a() {
        this.f42821b.N(this.f42820a);
        this.f42823d.x(this.f42822c);
    }

    @Override // com.harman.jbl.partybox.ui.customviews.scrollpageindicator.ViewPagerIndicator.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void b(@N ViewPagerIndicator viewPagerIndicator, @N ViewPager2 viewPager2) {
        RecyclerView.Adapter<?> adapter = viewPager2.getAdapter();
        this.f42821b = adapter;
        if (adapter != null) {
            this.f42823d = viewPager2;
            f(viewPagerIndicator);
            a aVar = new a(viewPagerIndicator);
            this.f42820a = aVar;
            this.f42821b.K(aVar);
            C0369b c0369b = new C0369b(viewPagerIndicator);
            this.f42822c = c0369b;
            viewPager2.n(c0369b);
            return;
        }
        throw new IllegalStateException("Set adapter before call attachToPager() method");
    }

    public void f(ViewPagerIndicator viewPagerIndicator) {
        if (this.f42824e) {
            viewPagerIndicator.setDotCount(this.f42821b.l());
            viewPagerIndicator.setCurrentPosition(this.f42823d.getCurrentItem());
        }
    }
}
