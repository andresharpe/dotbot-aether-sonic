package androidx.viewpager2.widget;

import androidx.annotation.N;
import androidx.annotation.U;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends ViewPager2.j {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final List<ViewPager2.j> f20688a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i4) {
        this.f20688a = new ArrayList(i4);
    }

    private void f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void a(int i4) {
        try {
            Iterator<ViewPager2.j> it = this.f20688a.iterator();
            while (it.hasNext()) {
                it.next().a(i4);
            }
        } catch (ConcurrentModificationException e4) {
            f(e4);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void b(int i4, float f4, @U int i5) {
        try {
            Iterator<ViewPager2.j> it = this.f20688a.iterator();
            while (it.hasNext()) {
                it.next().b(i4, f4, i5);
            }
        } catch (ConcurrentModificationException e4) {
            f(e4);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void c(int i4) {
        try {
            Iterator<ViewPager2.j> it = this.f20688a.iterator();
            while (it.hasNext()) {
                it.next().c(i4);
            }
        } catch (ConcurrentModificationException e4) {
            f(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ViewPager2.j jVar) {
        this.f20688a.add(jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(ViewPager2.j jVar) {
        this.f20688a.remove(jVar);
    }
}
