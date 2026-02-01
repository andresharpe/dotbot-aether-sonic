package androidx.viewpager2.widget;

import android.view.View;
import androidx.annotation.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends ViewPager2.j {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayoutManager f20699a;

    /* renamed from: b, reason: collision with root package name */
    private ViewPager2.m f20700b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(LinearLayoutManager linearLayoutManager) {
        this.f20699a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void a(int i4) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void b(int i4, float f4, int i5) {
        if (this.f20700b == null) {
            return;
        }
        float f5 = -f4;
        for (int i6 = 0; i6 < this.f20699a.Q(); i6++) {
            View P3 = this.f20699a.P(i6);
            if (P3 != null) {
                this.f20700b.a(P3, (this.f20699a.s0(P3) - i4) + f5);
            } else {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i6), Integer.valueOf(this.f20699a.Q())));
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void c(int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewPager2.m d() {
        return this.f20700b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(@P ViewPager2.m mVar) {
        this.f20700b = mVar;
    }
}
