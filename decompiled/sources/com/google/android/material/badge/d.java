package com.google.android.material.badge;

import T0.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.D;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0771a;
import androidx.core.view.C0823k0;
import androidx.core.view.accessibility.M;
import com.google.android.material.badge.b;
import com.google.android.material.internal.n;
import com.google.android.material.internal.x;

@e
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f31429a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final String f31430b = "BadgeUtils";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Toolbar f31431E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f31432F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.badge.a f31433G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ FrameLayout f31434H;

        a(Toolbar toolbar, int i4, com.google.android.material.badge.a aVar, FrameLayout frameLayout) {
            this.f31431E = toolbar;
            this.f31432F = i4;
            this.f31433G = aVar;
            this.f31434H = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuItemView a4 = x.a(this.f31431E, this.f31432F);
            if (a4 != null) {
                d.n(this.f31433G, this.f31431E.getResources());
                d.d(this.f31433G, a4, this.f31434H);
                d.b(this.f31433G, a4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b extends C0771a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.badge.a f31435d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View.AccessibilityDelegate accessibilityDelegate, com.google.android.material.badge.a aVar) {
            super(accessibilityDelegate);
            this.f31435d = aVar;
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, M m4) {
            super.g(view, m4);
            m4.d1(this.f31435d.o());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c extends C0771a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.badge.a f31436d;

        c(com.google.android.material.badge.a aVar) {
            this.f31436d = aVar;
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, M m4) {
            super.g(view, m4);
            m4.d1(this.f31436d.o());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.badge.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0276d extends C0771a {
        C0276d(View.AccessibilityDelegate accessibilityDelegate) {
            super(accessibilityDelegate);
        }

        @Override // androidx.core.view.C0771a
        public void g(View view, M m4) {
            super.g(view, m4);
            m4.d1(null);
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(@N com.google.android.material.badge.a aVar, @N View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (Build.VERSION.SDK_INT >= 29 && C0823k0.G0(view)) {
            accessibilityDelegate = view.getAccessibilityDelegate();
            C0823k0.B1(view, new b(accessibilityDelegate, aVar));
        } else {
            C0823k0.B1(view, new c(aVar));
        }
    }

    public static void c(@N com.google.android.material.badge.a aVar, @N View view) {
        d(aVar, view, null);
    }

    public static void d(@N com.google.android.material.badge.a aVar, @N View view, @P FrameLayout frameLayout) {
        m(aVar, view, frameLayout);
        if (aVar.p() != null) {
            aVar.p().setForeground(aVar);
        } else {
            if (!f31429a) {
                view.getOverlay().add(aVar);
                return;
            }
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    public static void e(@N com.google.android.material.badge.a aVar, @N Toolbar toolbar, @D int i4) {
        f(aVar, toolbar, i4, null);
    }

    public static void f(@N com.google.android.material.badge.a aVar, @N Toolbar toolbar, @D int i4, @P FrameLayout frameLayout) {
        toolbar.post(new a(toolbar, i4, aVar, frameLayout));
    }

    @N
    public static SparseArray<com.google.android.material.badge.a> g(Context context, @N n nVar) {
        SparseArray<com.google.android.material.badge.a> sparseArray = new SparseArray<>(nVar.size());
        for (int i4 = 0; i4 < nVar.size(); i4++) {
            int keyAt = nVar.keyAt(i4);
            b.a aVar = (b.a) nVar.valueAt(i4);
            if (aVar != null) {
                sparseArray.put(keyAt, com.google.android.material.badge.a.f(context, aVar));
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    @N
    public static n h(@N SparseArray<com.google.android.material.badge.a> sparseArray) {
        n nVar = new n();
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            int keyAt = sparseArray.keyAt(i4);
            com.google.android.material.badge.a valueAt = sparseArray.valueAt(i4);
            if (valueAt != null) {
                nVar.put(keyAt, valueAt.v());
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return nVar;
    }

    private static void i(@N View view) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (Build.VERSION.SDK_INT >= 29 && C0823k0.G0(view)) {
            accessibilityDelegate = view.getAccessibilityDelegate();
            C0823k0.B1(view, new C0276d(accessibilityDelegate));
        } else {
            C0823k0.B1(view, null);
        }
    }

    public static void j(@P com.google.android.material.badge.a aVar, @N View view) {
        if (aVar == null) {
            return;
        }
        if (!f31429a && aVar.p() == null) {
            view.getOverlay().remove(aVar);
        } else {
            aVar.p().setForeground(null);
        }
    }

    public static void k(@P com.google.android.material.badge.a aVar, @N Toolbar toolbar, @D int i4) {
        if (aVar == null) {
            return;
        }
        ActionMenuItemView a4 = x.a(toolbar, i4);
        if (a4 != null) {
            l(aVar);
            j(aVar, a4);
            i(a4);
        } else {
            Log.w(f31430b, "Trying to remove badge from a null menuItemView: " + i4);
        }
    }

    @i0
    static void l(com.google.android.material.badge.a aVar) {
        aVar.K(0);
        aVar.L(0);
    }

    public static void m(@N com.google.android.material.badge.a aVar, @N View view, @P FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.i0(view, frameLayout);
    }

    @i0
    static void n(com.google.android.material.badge.a aVar, Resources resources) {
        aVar.K(resources.getDimensionPixelOffset(a.f.b6));
        aVar.L(resources.getDimensionPixelOffset(a.f.c6));
    }

    public static void o(@N Rect rect, float f4, float f5, float f6, float f7) {
        rect.set((int) (f4 - f6), (int) (f5 - f7), (int) (f4 + f6), (int) (f5 + f7));
    }
}
