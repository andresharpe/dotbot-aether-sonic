package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.N;
import androidx.annotation.U;
import androidx.core.util.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class e implements ViewPager2.m {

    /* renamed from: a, reason: collision with root package name */
    private final int f20698a;

    public e(@U int i4) {
        u.j(i4, "Margin must be non-negative");
        this.f20698a = i4;
    }

    private ViewPager2 b(@N View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.m
    public void a(@N View view, float f4) {
        ViewPager2 b4 = b(view);
        float f5 = this.f20698a * f4;
        if (b4.getOrientation() == 0) {
            if (b4.k()) {
                f5 = -f5;
            }
            view.setTranslationX(f5);
            return;
        }
        view.setTranslationY(f5);
    }
}
