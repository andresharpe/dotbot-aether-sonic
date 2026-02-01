package com.harman.jbl.partybox.ui.party.stereo.ui;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.U;
import androidx.core.view.C0823k0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes2.dex */
public final class b implements ViewPager2.m {

    /* renamed from: e, reason: collision with root package name */
    @l3.d
    public static final a f45353e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @l3.d
    private static final String f45354f = "OffsetPageTransformer";

    /* renamed from: g, reason: collision with root package name */
    private static final float f45355g = 0.8f;

    /* renamed from: h, reason: collision with root package name */
    private static final float f45356h = 0.4f;

    /* renamed from: a, reason: collision with root package name */
    private final float f45357a;

    /* renamed from: b, reason: collision with root package name */
    private final float f45358b;

    /* renamed from: c, reason: collision with root package name */
    private final float f45359c;

    /* renamed from: d, reason: collision with root package name */
    private final float f45360d;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C2197u c2197u) {
            this();
        }

        private a() {
        }
    }

    public b(@U float f4, @U float f5, float f6, float f7) {
        this.f45357a = f4;
        this.f45358b = f5;
        this.f45359c = f6;
        this.f45360d = f7;
        if (0.0f > f7 || f7 > 1.0f || 0.0f > f6 || f6 > 1.0f) {
            throw new IllegalArgumentException("Invalid minAlpha[" + f7 + "] or minScale[" + f6 + "], must in [0f, 1f]");
        }
    }

    private final ViewPager2 b(View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }

    @Override // androidx.viewpager2.widget.ViewPager2.m
    public void a(@l3.d View page, float f4) {
        float f5;
        float f6;
        F.p(page, "page");
        ViewPager2 b4 = b(page);
        float f7 = 2;
        float f8 = (-((this.f45357a * f7) + this.f45358b)) * f4;
        if (C0823k0.Z(b4) == 1) {
            page.setTranslationX(-f8);
        } else {
            page.setTranslationX(f8);
        }
        if (-1.0f <= f4 && f4 <= 1.0f) {
            float f9 = 1;
            f5 = f9 - ((f9 - this.f45359c) * Math.abs(f4));
        } else {
            f5 = this.f45359c;
        }
        if (-1.0f <= f4 && f4 <= 1.0f) {
            float f10 = 1;
            f6 = f10 - ((f10 - this.f45360d) * Math.abs(f4));
        } else {
            f6 = this.f45360d;
        }
        page.setScaleX(f5);
        page.setScaleY(f5);
        page.setTranslationY((page.getHeight() * (1 - f5)) / f7);
        page.setAlpha(f6);
    }

    public /* synthetic */ b(float f4, float f5, float f6, float f7, int i4, C2197u c2197u) {
        this(f4, f5, (i4 & 4) != 0 ? f45355g : f6, (i4 & 8) != 0 ? f45356h : f7);
    }
}
