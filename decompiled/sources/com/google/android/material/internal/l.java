package com.google.android.material.internal;

import T0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.I;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.U;
import androidx.annotation.d0;
import androidx.appcompat.view.menu.n;
import androidx.core.view.C0823k0;
import androidx.core.view.Y0;
import androidx.core.view.accessibility.M;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class l implements androidx.appcompat.view.menu.n {

    /* renamed from: h0, reason: collision with root package name */
    public static final int f32633h0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    private static final String f32634i0 = "android:menu:list";

    /* renamed from: j0, reason: collision with root package name */
    private static final String f32635j0 = "android:menu:adapter";

    /* renamed from: k0, reason: collision with root package name */
    private static final String f32636k0 = "android:menu:header";

    /* renamed from: E, reason: collision with root package name */
    private NavigationMenuView f32637E;

    /* renamed from: F, reason: collision with root package name */
    LinearLayout f32638F;

    /* renamed from: G, reason: collision with root package name */
    private n.a f32639G;

    /* renamed from: H, reason: collision with root package name */
    androidx.appcompat.view.menu.g f32640H;

    /* renamed from: I, reason: collision with root package name */
    private int f32641I;

    /* renamed from: J, reason: collision with root package name */
    c f32642J;

    /* renamed from: K, reason: collision with root package name */
    LayoutInflater f32643K;

    /* renamed from: M, reason: collision with root package name */
    @P
    ColorStateList f32645M;

    /* renamed from: O, reason: collision with root package name */
    ColorStateList f32647O;

    /* renamed from: P, reason: collision with root package name */
    ColorStateList f32648P;

    /* renamed from: Q, reason: collision with root package name */
    Drawable f32649Q;

    /* renamed from: R, reason: collision with root package name */
    RippleDrawable f32650R;

    /* renamed from: S, reason: collision with root package name */
    int f32651S;

    /* renamed from: T, reason: collision with root package name */
    @U
    int f32652T;

    /* renamed from: U, reason: collision with root package name */
    int f32653U;

    /* renamed from: V, reason: collision with root package name */
    int f32654V;

    /* renamed from: W, reason: collision with root package name */
    @U
    int f32655W;

    /* renamed from: X, reason: collision with root package name */
    @U
    int f32656X;

    /* renamed from: Y, reason: collision with root package name */
    @U
    int f32657Y;

    /* renamed from: Z, reason: collision with root package name */
    @U
    int f32658Z;

    /* renamed from: a0, reason: collision with root package name */
    boolean f32659a0;

    /* renamed from: c0, reason: collision with root package name */
    private int f32661c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f32662d0;

    /* renamed from: e0, reason: collision with root package name */
    int f32663e0;

    /* renamed from: L, reason: collision with root package name */
    int f32644L = 0;

    /* renamed from: N, reason: collision with root package name */
    int f32646N = 0;

    /* renamed from: b0, reason: collision with root package name */
    boolean f32660b0 = true;

    /* renamed from: f0, reason: collision with root package name */
    private int f32664f0 = -1;

    /* renamed from: g0, reason: collision with root package name */
    final View.OnClickListener f32665g0 = new a();

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z3 = true;
            l.this.Z(true);
            androidx.appcompat.view.menu.j itemData = ((NavigationMenuItemView) view).getItemData();
            l lVar = l.this;
            boolean P3 = lVar.f32640H.P(itemData, lVar, 0);
            if (itemData != null && itemData.isCheckable() && P3) {
                l.this.f32642J.X(itemData);
            } else {
                z3 = false;
            }
            l.this.Z(false);
            if (z3) {
                l.this.d(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b extends AbstractC0289l {
        public b(View view) {
            super(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c extends RecyclerView.Adapter<AbstractC0289l> {

        /* renamed from: h, reason: collision with root package name */
        private static final String f32667h = "android:menu:checked";

        /* renamed from: i, reason: collision with root package name */
        private static final String f32668i = "android:menu:action_views";

        /* renamed from: j, reason: collision with root package name */
        private static final int f32669j = 0;

        /* renamed from: k, reason: collision with root package name */
        private static final int f32670k = 1;

        /* renamed from: l, reason: collision with root package name */
        private static final int f32671l = 2;

        /* renamed from: m, reason: collision with root package name */
        private static final int f32672m = 3;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList<e> f32673d = new ArrayList<>();

        /* renamed from: e, reason: collision with root package name */
        private androidx.appcompat.view.menu.j f32674e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f32675f;

        c() {
            V();
        }

        private void O(int i4, int i5) {
            while (i4 < i5) {
                ((g) this.f32673d.get(i4)).f32680b = true;
                i4++;
            }
        }

        private void V() {
            if (this.f32675f) {
                return;
            }
            boolean z3 = true;
            this.f32675f = true;
            this.f32673d.clear();
            this.f32673d.add(new d());
            int size = l.this.f32640H.H().size();
            int i4 = -1;
            int i5 = 0;
            boolean z4 = false;
            int i6 = 0;
            while (i5 < size) {
                androidx.appcompat.view.menu.j jVar = l.this.f32640H.H().get(i5);
                if (jVar.isChecked()) {
                    X(jVar);
                }
                if (jVar.isCheckable()) {
                    jVar.w(false);
                }
                if (jVar.hasSubMenu()) {
                    SubMenu subMenu = jVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i5 != 0) {
                            this.f32673d.add(new f(l.this.f32663e0, 0));
                        }
                        this.f32673d.add(new g(jVar));
                        int size2 = this.f32673d.size();
                        int size3 = subMenu.size();
                        int i7 = 0;
                        boolean z5 = false;
                        while (i7 < size3) {
                            androidx.appcompat.view.menu.j jVar2 = (androidx.appcompat.view.menu.j) subMenu.getItem(i7);
                            if (jVar2.isVisible()) {
                                if (!z5 && jVar2.getIcon() != null) {
                                    z5 = z3;
                                }
                                if (jVar2.isCheckable()) {
                                    jVar2.w(false);
                                }
                                if (jVar.isChecked()) {
                                    X(jVar);
                                }
                                this.f32673d.add(new g(jVar2));
                            }
                            i7++;
                            z3 = true;
                        }
                        if (z5) {
                            O(size2, this.f32673d.size());
                        }
                    }
                } else {
                    int groupId = jVar.getGroupId();
                    if (groupId != i4) {
                        i6 = this.f32673d.size();
                        if (jVar.getIcon() != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (i5 != 0) {
                            i6++;
                            ArrayList<e> arrayList = this.f32673d;
                            int i8 = l.this.f32663e0;
                            arrayList.add(new f(i8, i8));
                        }
                    } else if (!z4 && jVar.getIcon() != null) {
                        O(i6, this.f32673d.size());
                        z4 = true;
                    }
                    g gVar = new g(jVar);
                    gVar.f32680b = z4;
                    this.f32673d.add(gVar);
                    i4 = groupId;
                }
                i5++;
                z3 = true;
            }
            this.f32675f = false;
        }

        @N
        public Bundle P() {
            View view;
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.j jVar = this.f32674e;
            if (jVar != null) {
                bundle.putInt(f32667h, jVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f32673d.size();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar = this.f32673d.get(i4);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.j a4 = ((g) eVar).a();
                    if (a4 != null) {
                        view = a4.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        n nVar = new n();
                        view.saveHierarchyState(nVar);
                        sparseArray.put(a4.getItemId(), nVar);
                    }
                }
            }
            bundle.putSparseParcelableArray(f32668i, sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.j Q() {
            return this.f32674e;
        }

        int R() {
            int i4;
            if (l.this.f32638F.getChildCount() == 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            for (int i5 = 0; i5 < l.this.f32642J.l(); i5++) {
                if (l.this.f32642J.n(i5) == 0) {
                    i4++;
                }
            }
            return i4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public void C(@N AbstractC0289l abstractC0289l, int i4) {
            Drawable drawable;
            int n4 = n(i4);
            if (n4 != 0) {
                if (n4 != 1) {
                    if (n4 == 2) {
                        f fVar = (f) this.f32673d.get(i4);
                        abstractC0289l.f17770a.setPadding(l.this.f32655W, fVar.b(), l.this.f32656X, fVar.a());
                        return;
                    }
                    return;
                }
                TextView textView = (TextView) abstractC0289l.f17770a;
                textView.setText(((g) this.f32673d.get(i4)).a().getTitle());
                int i5 = l.this.f32644L;
                if (i5 != 0) {
                    androidx.core.widget.r.E(textView, i5);
                }
                textView.setPadding(l.this.f32657Y, textView.getPaddingTop(), l.this.f32658Z, textView.getPaddingBottom());
                ColorStateList colorStateList = l.this.f32645M;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                    return;
                }
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) abstractC0289l.f17770a;
            navigationMenuItemView.setIconTintList(l.this.f32648P);
            int i6 = l.this.f32646N;
            if (i6 != 0) {
                navigationMenuItemView.setTextAppearance(i6);
            }
            ColorStateList colorStateList2 = l.this.f32647O;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable2 = l.this.f32649Q;
            if (drawable2 != null) {
                drawable = drawable2.getConstantState().newDrawable();
            } else {
                drawable = null;
            }
            C0823k0.I1(navigationMenuItemView, drawable);
            RippleDrawable rippleDrawable = l.this.f32650R;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.f32673d.get(i4);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f32680b);
            l lVar = l.this;
            int i7 = lVar.f32651S;
            int i8 = lVar.f32652T;
            navigationMenuItemView.setPadding(i7, i8, i7, i8);
            navigationMenuItemView.setIconPadding(l.this.f32653U);
            l lVar2 = l.this;
            if (lVar2.f32659a0) {
                navigationMenuItemView.setIconSize(lVar2.f32654V);
            }
            navigationMenuItemView.setMaxLines(l.this.f32661c0);
            navigationMenuItemView.h(gVar.a(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @P
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public AbstractC0289l E(ViewGroup viewGroup, int i4) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            return null;
                        }
                        return new b(l.this.f32638F);
                    }
                    return new j(l.this.f32643K, viewGroup);
                }
                return new k(l.this.f32643K, viewGroup);
            }
            l lVar = l.this;
            return new i(lVar.f32643K, viewGroup, lVar.f32665g0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public void J(AbstractC0289l abstractC0289l) {
            if (abstractC0289l instanceof i) {
                ((NavigationMenuItemView) abstractC0289l.f17770a).H();
            }
        }

        public void W(@N Bundle bundle) {
            androidx.appcompat.view.menu.j a4;
            View actionView;
            n nVar;
            androidx.appcompat.view.menu.j a5;
            int i4 = bundle.getInt(f32667h, 0);
            if (i4 != 0) {
                this.f32675f = true;
                int size = this.f32673d.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    e eVar = this.f32673d.get(i5);
                    if ((eVar instanceof g) && (a5 = ((g) eVar).a()) != null && a5.getItemId() == i4) {
                        X(a5);
                        break;
                    }
                    i5++;
                }
                this.f32675f = false;
                V();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f32668i);
            if (sparseParcelableArray != null) {
                int size2 = this.f32673d.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    e eVar2 = this.f32673d.get(i6);
                    if ((eVar2 instanceof g) && (a4 = ((g) eVar2).a()) != null && (actionView = a4.getActionView()) != null && (nVar = (n) sparseParcelableArray.get(a4.getItemId())) != null) {
                        actionView.restoreHierarchyState(nVar);
                    }
                }
            }
        }

        public void X(@N androidx.appcompat.view.menu.j jVar) {
            if (this.f32674e != jVar && jVar.isCheckable()) {
                androidx.appcompat.view.menu.j jVar2 = this.f32674e;
                if (jVar2 != null) {
                    jVar2.setChecked(false);
                }
                this.f32674e = jVar;
                jVar.setChecked(true);
            }
        }

        public void Y(boolean z3) {
            this.f32675f = z3;
        }

        public void Z() {
            V();
            r();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int l() {
            return this.f32673d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long m(int i4) {
            return i4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int n(int i4) {
            e eVar = this.f32673d.get(i4);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                if (((g) eVar).a().hasSubMenu()) {
                    return 1;
                }
                return 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class d implements e {
        d() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface e {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class f implements e {

        /* renamed from: a, reason: collision with root package name */
        private final int f32677a;

        /* renamed from: b, reason: collision with root package name */
        private final int f32678b;

        public f(int i4, int i5) {
            this.f32677a = i4;
            this.f32678b = i5;
        }

        public int a() {
            return this.f32678b;
        }

        public int b() {
            return this.f32677a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class g implements e {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.appcompat.view.menu.j f32679a;

        /* renamed from: b, reason: collision with root package name */
        boolean f32680b;

        g(androidx.appcompat.view.menu.j jVar) {
            this.f32679a = jVar;
        }

        public androidx.appcompat.view.menu.j a() {
            return this.f32679a;
        }
    }

    /* loaded from: classes2.dex */
    private class h extends androidx.recyclerview.widget.A {
        h(@N RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.A, androidx.core.view.C0771a
        public void g(View view, @N M m4) {
            super.g(view, m4);
            m4.b1(M.c.e(l.this.f32642J.R(), 0, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class i extends AbstractC0289l {
        public i(@N LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(a.k.f2938K, viewGroup, false));
            this.f17770a.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class j extends AbstractC0289l {
        public j(@N LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(a.k.f2942M, viewGroup, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class k extends AbstractC0289l {
        public k(@N LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(a.k.f2944N, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.l$l, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC0289l extends RecyclerView.F {
        public AbstractC0289l(View view) {
            super(view);
        }
    }

    private void a0() {
        int i4;
        if (this.f32638F.getChildCount() == 0 && this.f32660b0) {
            i4 = this.f32662d0;
        } else {
            i4 = 0;
        }
        NavigationMenuView navigationMenuView = this.f32637E;
        navigationMenuView.setPadding(0, i4, 0, navigationMenuView.getPaddingBottom());
    }

    @U
    public int A() {
        return this.f32658Z;
    }

    @U
    public int B() {
        return this.f32657Y;
    }

    public View C(@I int i4) {
        View inflate = this.f32643K.inflate(i4, (ViewGroup) this.f32638F, false);
        c(inflate);
        return inflate;
    }

    public boolean D() {
        return this.f32660b0;
    }

    public void E(@N View view) {
        this.f32638F.removeView(view);
        if (this.f32638F.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.f32637E;
            navigationMenuView.setPadding(0, this.f32662d0, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void F(boolean z3) {
        if (this.f32660b0 != z3) {
            this.f32660b0 = z3;
            a0();
        }
    }

    public void G(@N androidx.appcompat.view.menu.j jVar) {
        this.f32642J.X(jVar);
    }

    public void H(@U int i4) {
        this.f32656X = i4;
        d(false);
    }

    public void I(@U int i4) {
        this.f32655W = i4;
        d(false);
    }

    public void J(int i4) {
        this.f32641I = i4;
    }

    public void K(@P Drawable drawable) {
        this.f32649Q = drawable;
        d(false);
    }

    public void L(@P RippleDrawable rippleDrawable) {
        this.f32650R = rippleDrawable;
        d(false);
    }

    public void M(int i4) {
        this.f32651S = i4;
        d(false);
    }

    public void N(int i4) {
        this.f32653U = i4;
        d(false);
    }

    public void O(@androidx.annotation.r int i4) {
        if (this.f32654V != i4) {
            this.f32654V = i4;
            this.f32659a0 = true;
            d(false);
        }
    }

    public void P(@P ColorStateList colorStateList) {
        this.f32648P = colorStateList;
        d(false);
    }

    public void Q(int i4) {
        this.f32661c0 = i4;
        d(false);
    }

    public void R(@d0 int i4) {
        this.f32646N = i4;
        d(false);
    }

    public void S(@P ColorStateList colorStateList) {
        this.f32647O = colorStateList;
        d(false);
    }

    public void T(@U int i4) {
        this.f32652T = i4;
        d(false);
    }

    public void U(int i4) {
        this.f32664f0 = i4;
        NavigationMenuView navigationMenuView = this.f32637E;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i4);
        }
    }

    public void V(@P ColorStateList colorStateList) {
        this.f32645M = colorStateList;
        d(false);
    }

    public void W(@U int i4) {
        this.f32658Z = i4;
        d(false);
    }

    public void X(@U int i4) {
        this.f32657Y = i4;
        d(false);
    }

    public void Y(@d0 int i4) {
        this.f32644L = i4;
        d(false);
    }

    public void Z(boolean z3) {
        c cVar = this.f32642J;
        if (cVar != null) {
            cVar.Y(z3);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(androidx.appcompat.view.menu.g gVar, boolean z3) {
        n.a aVar = this.f32639G;
        if (aVar != null) {
            aVar.b(gVar, z3);
        }
    }

    public void c(@N View view) {
        this.f32638F.addView(view);
        NavigationMenuView navigationMenuView = this.f32637E;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.n
    public void d(boolean z3) {
        c cVar = this.f32642J;
        if (cVar != null) {
            cVar.Z();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f32641I;
    }

    @Override // androidx.appcompat.view.menu.n
    public void h(n.a aVar) {
        this.f32639G = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void i(@N Context context, @N androidx.appcompat.view.menu.g gVar) {
        this.f32643K = LayoutInflater.from(context);
        this.f32640H = gVar;
        this.f32663e0 = context.getResources().getDimensionPixelOffset(a.f.f2463u1);
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f32637E.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(f32635j0);
            if (bundle2 != null) {
                this.f32642J.W(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(f32636k0);
            if (sparseParcelableArray2 != null) {
                this.f32638F.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public void k(@N Y0 y02) {
        int r4 = y02.r();
        if (this.f32662d0 != r4) {
            this.f32662d0 = r4;
            a0();
        }
        NavigationMenuView navigationMenuView = this.f32637E;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, y02.o());
        C0823k0.p(this.f32638F, y02);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean l(androidx.appcompat.view.menu.s sVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public androidx.appcompat.view.menu.o m(ViewGroup viewGroup) {
        if (this.f32637E == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f32643K.inflate(a.k.f2946O, viewGroup, false);
            this.f32637E = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f32637E));
            if (this.f32642J == null) {
                this.f32642J = new c();
            }
            int i4 = this.f32664f0;
            if (i4 != -1) {
                this.f32637E.setOverScrollMode(i4);
            }
            this.f32638F = (LinearLayout) this.f32643K.inflate(a.k.f2940L, (ViewGroup) this.f32637E, false);
            this.f32637E.setAdapter(this.f32642J);
        }
        return this.f32637E;
    }

    @Override // androidx.appcompat.view.menu.n
    @N
    public Parcelable n() {
        Bundle bundle = new Bundle();
        if (this.f32637E != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f32637E.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f32642J;
        if (cVar != null) {
            bundle.putBundle(f32635j0, cVar.P());
        }
        if (this.f32638F != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f32638F.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(f32636k0, sparseArray2);
        }
        return bundle;
    }

    @P
    public androidx.appcompat.view.menu.j o() {
        return this.f32642J.Q();
    }

    @U
    public int p() {
        return this.f32656X;
    }

    @U
    public int q() {
        return this.f32655W;
    }

    public int r() {
        return this.f32638F.getChildCount();
    }

    public View s(int i4) {
        return this.f32638F.getChildAt(i4);
    }

    @P
    public Drawable t() {
        return this.f32649Q;
    }

    public int u() {
        return this.f32651S;
    }

    public int v() {
        return this.f32653U;
    }

    public int w() {
        return this.f32661c0;
    }

    @P
    public ColorStateList x() {
        return this.f32647O;
    }

    @P
    public ColorStateList y() {
        return this.f32648P;
    }

    @U
    public int z() {
        return this.f32652T;
    }
}
