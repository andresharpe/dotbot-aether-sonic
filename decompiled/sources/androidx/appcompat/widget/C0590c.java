package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC0795b;
import d.C2042a;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0590c extends androidx.appcompat.view.menu.b implements AbstractC0795b.a {

    /* renamed from: i0, reason: collision with root package name */
    private static final String f6110i0 = "ActionMenuPresenter";

    /* renamed from: O, reason: collision with root package name */
    d f6111O;

    /* renamed from: P, reason: collision with root package name */
    private Drawable f6112P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f6113Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f6114R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f6115S;

    /* renamed from: T, reason: collision with root package name */
    private int f6116T;

    /* renamed from: U, reason: collision with root package name */
    private int f6117U;

    /* renamed from: V, reason: collision with root package name */
    private int f6118V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f6119W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f6120X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f6121Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f6122Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f6123a0;

    /* renamed from: b0, reason: collision with root package name */
    private final SparseBooleanArray f6124b0;

    /* renamed from: c0, reason: collision with root package name */
    e f6125c0;

    /* renamed from: d0, reason: collision with root package name */
    a f6126d0;

    /* renamed from: e0, reason: collision with root package name */
    RunnableC0049c f6127e0;

    /* renamed from: f0, reason: collision with root package name */
    private b f6128f0;

    /* renamed from: g0, reason: collision with root package name */
    final f f6129g0;

    /* renamed from: h0, reason: collision with root package name */
    int f6130h0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$a */
    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.m {
        public a(Context context, androidx.appcompat.view.menu.s sVar, View view) {
            super(context, sVar, view, false, C2042a.b.f49115G);
            if (!((androidx.appcompat.view.menu.j) sVar.getItem()).o()) {
                View view2 = C0590c.this.f6111O;
                h(view2 == null ? (View) ((androidx.appcompat.view.menu.b) C0590c.this).f5264M : view2);
            }
            a(C0590c.this.f6129g0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.m
        public void g() {
            C0590c c0590c = C0590c.this;
            c0590c.f6126d0 = null;
            c0590c.f6130h0 = 0;
            super.g();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.q a() {
            a aVar = C0590c.this.f6126d0;
            if (aVar != null) {
                return aVar.e();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0049c implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        private e f6133E;

        public RunnableC0049c(e eVar) {
            this.f6133E = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) C0590c.this).f5258G != null) {
                ((androidx.appcompat.view.menu.b) C0590c.this).f5258G.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) C0590c.this).f5264M;
            if (view != null && view.getWindowToken() != null && this.f6133E.o()) {
                C0590c.this.f6125c0 = this.f6133E;
            }
            C0590c.this.f6127e0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$d */
    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.c$d$a */
        /* loaded from: classes.dex */
        class a extends P {

            /* renamed from: N, reason: collision with root package name */
            final /* synthetic */ C0590c f6136N;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C0590c c0590c) {
                super(view);
                this.f6136N = c0590c;
            }

            @Override // androidx.appcompat.widget.P
            public androidx.appcompat.view.menu.q b() {
                e eVar = C0590c.this.f6125c0;
                if (eVar == null) {
                    return null;
                }
                return eVar.e();
            }

            @Override // androidx.appcompat.widget.P
            public boolean c() {
                C0590c.this.Q();
                return true;
            }

            @Override // androidx.appcompat.widget.P
            public boolean d() {
                C0590c c0590c = C0590c.this;
                if (c0590c.f6127e0 != null) {
                    return false;
                }
                c0590c.E();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, C2042a.b.f49111F);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            k0.a(this, getContentDescription());
            setOnTouchListener(new a(this, C0590c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean d() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0590c.this.Q();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i4, int i5, int i6, int i7) {
            boolean frame = super.setFrame(i4, i5, i6, i7);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.d.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$e */
    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.m {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z3) {
            super(context, gVar, view, z3, C2042a.b.f49115G);
            j(androidx.core.view.C.f13102c);
            a(C0590c.this.f6129g0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.m
        public void g() {
            if (((androidx.appcompat.view.menu.b) C0590c.this).f5258G != null) {
                ((androidx.appcompat.view.menu.b) C0590c.this).f5258G.close();
            }
            C0590c.this.f6125c0 = null;
            super.g();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$f */
    /* loaded from: classes.dex */
    private class f implements n.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void b(@androidx.annotation.N androidx.appcompat.view.menu.g gVar, boolean z3) {
            if (gVar instanceof androidx.appcompat.view.menu.s) {
                gVar.G().f(false);
            }
            n.a q4 = C0590c.this.q();
            if (q4 != null) {
                q4.b(gVar, z3);
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean c(@androidx.annotation.N androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) C0590c.this).f5258G) {
                return false;
            }
            C0590c.this.f6130h0 = ((androidx.appcompat.view.menu.s) gVar).getItem().getItemId();
            n.a q4 = C0590c.this.q();
            if (q4 == null) {
                return false;
            }
            return q4.c(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.appcompat.widget.c$g */
    /* loaded from: classes.dex */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        public int f6140E;

        /* renamed from: androidx.appcompat.widget.c$g$a */
        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i4) {
                return new g[i4];
            }
        }

        g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f6140E);
        }

        g(Parcel parcel) {
            this.f6140E = parcel.readInt();
        }
    }

    public C0590c(Context context) {
        super(context, C2042a.j.f49688d, C2042a.j.f49687c);
        this.f6124b0 = new SparseBooleanArray();
        this.f6129g0 = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f5264M;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if ((childAt instanceof o.a) && ((o.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean B() {
        return E() | F();
    }

    public Drawable D() {
        d dVar = this.f6111O;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f6113Q) {
            return this.f6112P;
        }
        return null;
    }

    public boolean E() {
        Object obj;
        RunnableC0049c runnableC0049c = this.f6127e0;
        if (runnableC0049c != null && (obj = this.f5264M) != null) {
            ((View) obj).removeCallbacks(runnableC0049c);
            this.f6127e0 = null;
            return true;
        }
        e eVar = this.f6125c0;
        if (eVar != null) {
            eVar.dismiss();
            return true;
        }
        return false;
    }

    public boolean F() {
        a aVar = this.f6126d0;
        if (aVar != null) {
            aVar.dismiss();
            return true;
        }
        return false;
    }

    public boolean G() {
        if (this.f6127e0 == null && !H()) {
            return false;
        }
        return true;
    }

    public boolean H() {
        e eVar = this.f6125c0;
        if (eVar != null && eVar.f()) {
            return true;
        }
        return false;
    }

    public boolean I() {
        return this.f6114R;
    }

    public void J(Configuration configuration) {
        if (!this.f6119W) {
            this.f6118V = androidx.appcompat.view.a.b(this.f5257F).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f5258G;
        if (gVar != null) {
            gVar.N(true);
        }
    }

    public void K(boolean z3) {
        this.f6122Z = z3;
    }

    public void L(int i4) {
        this.f6118V = i4;
        this.f6119W = true;
    }

    public void M(ActionMenuView actionMenuView) {
        this.f5264M = actionMenuView;
        actionMenuView.e(this.f5258G);
    }

    public void N(Drawable drawable) {
        d dVar = this.f6111O;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f6113Q = true;
            this.f6112P = drawable;
        }
    }

    public void O(boolean z3) {
        this.f6114R = z3;
        this.f6115S = true;
    }

    public void P(int i4, boolean z3) {
        this.f6116T = i4;
        this.f6120X = z3;
        this.f6121Y = true;
    }

    public boolean Q() {
        androidx.appcompat.view.menu.g gVar;
        if (this.f6114R && !H() && (gVar = this.f5258G) != null && this.f5264M != null && this.f6127e0 == null && !gVar.C().isEmpty()) {
            RunnableC0049c runnableC0049c = new RunnableC0049c(new e(this.f5257F, this.f5258G, this.f6111O, true));
            this.f6127e0 = runnableC0049c;
            ((View) this.f5264M).post(runnableC0049c);
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.AbstractC0795b.a
    public void a(boolean z3) {
        if (z3) {
            super.l(null);
            return;
        }
        androidx.appcompat.view.menu.g gVar = this.f5258G;
        if (gVar != null) {
            gVar.f(false);
        }
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void b(androidx.appcompat.view.menu.g gVar, boolean z3) {
        B();
        super.b(gVar, z3);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void d(boolean z3) {
        ArrayList<androidx.appcompat.view.menu.j> arrayList;
        int size;
        super.d(z3);
        ((View) this.f5264M).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f5258G;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.j> v3 = gVar.v();
            int size2 = v3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AbstractC0795b b4 = v3.get(i4).b();
                if (b4 != null) {
                    b4.k(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f5258G;
        if (gVar2 != null) {
            arrayList = gVar2.C();
        } else {
            arrayList = null;
        }
        if (this.f6114R && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : (!arrayList.get(0).isActionViewExpanded()))) {
            if (this.f6111O == null) {
                this.f6111O = new d(this.f5256E);
            }
            ViewGroup viewGroup = (ViewGroup) this.f6111O.getParent();
            if (viewGroup != this.f5264M) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f6111O);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f5264M;
                actionMenuView.addView(this.f6111O, actionMenuView.J());
            }
        } else {
            d dVar = this.f6111O;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f5264M;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f6111O);
                }
            }
        }
        ((ActionMenuView) this.f5264M).setOverflowReserved(this.f6114R);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public boolean e() {
        ArrayList<androidx.appcompat.view.menu.j> arrayList;
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        boolean z5;
        C0590c c0590c = this;
        androidx.appcompat.view.menu.g gVar = c0590c.f5258G;
        View view = null;
        ?? r32 = 0;
        if (gVar != null) {
            arrayList = gVar.H();
            i4 = arrayList.size();
        } else {
            arrayList = null;
            i4 = 0;
        }
        int i8 = c0590c.f6118V;
        int i9 = c0590c.f6117U;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0590c.f5264M;
        boolean z6 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i4; i12++) {
            androidx.appcompat.view.menu.j jVar = arrayList.get(i12);
            if (jVar.d()) {
                i10++;
            } else if (jVar.q()) {
                i11++;
            } else {
                z6 = true;
            }
            if (c0590c.f6122Z && jVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (c0590c.f6114R && (z6 || i11 + i10 > i8)) {
            i8--;
        }
        int i13 = i8 - i10;
        SparseBooleanArray sparseBooleanArray = c0590c.f6124b0;
        sparseBooleanArray.clear();
        if (c0590c.f6120X) {
            int i14 = c0590c.f6123a0;
            i6 = i9 / i14;
            i5 = i14 + ((i9 % i14) / i6);
        } else {
            i5 = 0;
            i6 = 0;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < i4) {
            androidx.appcompat.view.menu.j jVar2 = arrayList.get(i15);
            if (jVar2.d()) {
                View r4 = c0590c.r(jVar2, view, viewGroup);
                if (c0590c.f6120X) {
                    i6 -= ActionMenuView.P(r4, i5, i6, makeMeasureSpec, r32);
                } else {
                    r4.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = r4.getMeasuredWidth();
                i9 -= measuredWidth;
                if (i16 == 0) {
                    i16 = measuredWidth;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.x(true);
                z3 = r32;
                i7 = i4;
            } else if (jVar2.q()) {
                int groupId2 = jVar2.getGroupId();
                boolean z7 = sparseBooleanArray.get(groupId2);
                if ((i13 > 0 || z7) && i9 > 0 && (!c0590c.f6120X || i6 > 0)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z8 = z4;
                i7 = i4;
                if (z4) {
                    View r5 = c0590c.r(jVar2, null, viewGroup);
                    if (c0590c.f6120X) {
                        int P3 = ActionMenuView.P(r5, i5, i6, makeMeasureSpec, 0);
                        i6 -= P3;
                        if (P3 == 0) {
                            z8 = false;
                        }
                    } else {
                        r5.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z9 = z8;
                    int measuredWidth2 = r5.getMeasuredWidth();
                    i9 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    if (!c0590c.f6120X ? i9 + i16 > 0 : i9 >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z4 = z9 & z5;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z7) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i17 = 0; i17 < i15; i17++) {
                        androidx.appcompat.view.menu.j jVar3 = arrayList.get(i17);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.o()) {
                                i13++;
                            }
                            jVar3.x(false);
                        }
                    }
                }
                if (z4) {
                    i13--;
                }
                jVar2.x(z4);
                z3 = false;
            } else {
                z3 = r32;
                i7 = i4;
                jVar2.x(z3);
            }
            i15++;
            r32 = z3;
            i4 = i7;
            view = null;
            c0590c = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public void i(@androidx.annotation.N Context context, @androidx.annotation.P androidx.appcompat.view.menu.g gVar) {
        super.i(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b4 = androidx.appcompat.view.a.b(context);
        if (!this.f6115S) {
            this.f6114R = b4.h();
        }
        if (!this.f6121Y) {
            this.f6116T = b4.c();
        }
        if (!this.f6119W) {
            this.f6118V = b4.d();
        }
        int i4 = this.f6116T;
        if (this.f6114R) {
            if (this.f6111O == null) {
                d dVar = new d(this.f5256E);
                this.f6111O = dVar;
                if (this.f6113Q) {
                    dVar.setImageDrawable(this.f6112P);
                    this.f6112P = null;
                    this.f6113Q = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f6111O.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f6111O.getMeasuredWidth();
        } else {
            this.f6111O = null;
        }
        this.f6117U = i4;
        this.f6123a0 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(Parcelable parcelable) {
        int i4;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i4 = ((g) parcelable).f6140E) > 0 && (findItem = this.f5258G.findItem(i4)) != null) {
            l((androidx.appcompat.view.menu.s) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.b
    public void k(androidx.appcompat.view.menu.j jVar, o.a aVar) {
        aVar.h(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f5264M);
        if (this.f6128f0 == null) {
            this.f6128f0 = new b();
        }
        actionMenuItemView.setPopupCallback(this.f6128f0);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public boolean l(androidx.appcompat.view.menu.s sVar) {
        boolean z3 = false;
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.s sVar2 = sVar;
        while (sVar2.n0() != this.f5258G) {
            sVar2 = (androidx.appcompat.view.menu.s) sVar2.n0();
        }
        View C3 = C(sVar2.getItem());
        if (C3 == null) {
            return false;
        }
        this.f6130h0 = sVar.getItem().getItemId();
        int size = sVar.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            MenuItem item = sVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z3 = true;
                break;
            }
            i4++;
        }
        a aVar = new a(this.f5257F, sVar, C3);
        this.f6126d0 = aVar;
        aVar.i(z3);
        this.f6126d0.l();
        super.l(sVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.n
    public androidx.appcompat.view.menu.o m(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.o oVar = this.f5264M;
        androidx.appcompat.view.menu.o m4 = super.m(viewGroup);
        if (oVar != m4) {
            ((ActionMenuView) m4).setPresenter(this);
        }
        return m4;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable n() {
        g gVar = new g();
        gVar.f6140E = this.f6130h0;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean p(ViewGroup viewGroup, int i4) {
        if (viewGroup.getChildAt(i4) == this.f6111O) {
            return false;
        }
        return super.p(viewGroup, i4);
    }

    @Override // androidx.appcompat.view.menu.b
    public View r(androidx.appcompat.view.menu.j jVar, View view, ViewGroup viewGroup) {
        int i4;
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.m()) {
            actionView = super.r(jVar, view, viewGroup);
        }
        if (jVar.isActionViewExpanded()) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        actionView.setVisibility(i4);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean t(int i4, androidx.appcompat.view.menu.j jVar) {
        return jVar.o();
    }
}
