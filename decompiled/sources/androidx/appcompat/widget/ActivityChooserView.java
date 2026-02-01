package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0591d;
import androidx.core.view.AbstractC0795b;
import androidx.core.view.C0823k0;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup implements C0591d.a {

    /* renamed from: E, reason: collision with root package name */
    final f f5567E;

    /* renamed from: F, reason: collision with root package name */
    private final g f5568F;

    /* renamed from: G, reason: collision with root package name */
    private final View f5569G;

    /* renamed from: H, reason: collision with root package name */
    private final Drawable f5570H;

    /* renamed from: I, reason: collision with root package name */
    final FrameLayout f5571I;

    /* renamed from: J, reason: collision with root package name */
    private final ImageView f5572J;

    /* renamed from: K, reason: collision with root package name */
    final FrameLayout f5573K;

    /* renamed from: L, reason: collision with root package name */
    private final ImageView f5574L;

    /* renamed from: M, reason: collision with root package name */
    private final int f5575M;

    /* renamed from: N, reason: collision with root package name */
    AbstractC0795b f5576N;

    /* renamed from: O, reason: collision with root package name */
    final DataSetObserver f5577O;

    /* renamed from: P, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f5578P;

    /* renamed from: Q, reason: collision with root package name */
    private Q f5579Q;

    /* renamed from: R, reason: collision with root package name */
    PopupWindow.OnDismissListener f5580R;

    /* renamed from: S, reason: collision with root package name */
    boolean f5581S;

    /* renamed from: T, reason: collision with root package name */
    int f5582T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f5583U;

    /* renamed from: V, reason: collision with root package name */
    private int f5584V;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayout {

        /* renamed from: E, reason: collision with root package name */
        private static final int[] f5585E = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            g0 F3 = g0.F(context, attributeSet, f5585E);
            setBackgroundDrawable(F3.h(0));
            F3.I();
        }
    }

    /* loaded from: classes.dex */
    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.f5567E.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.f5567E.notifyDataSetInvalidated();
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ActivityChooserView.this.b()) {
                if (!ActivityChooserView.this.isShown()) {
                    ActivityChooserView.this.getListPopupWindow().dismiss();
                    return;
                }
                ActivityChooserView.this.getListPopupWindow().a();
                AbstractC0795b abstractC0795b = ActivityChooserView.this.f5576N;
                if (abstractC0795b != null) {
                    abstractC0795b.m(true);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends View.AccessibilityDelegate {
        c() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            androidx.core.view.accessibility.M.c2(accessibilityNodeInfo).W0(true);
        }
    }

    /* loaded from: classes.dex */
    class d extends P {
        d(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.P
        public androidx.appcompat.view.menu.q b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        @Override // androidx.appcompat.widget.P
        protected boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        @Override // androidx.appcompat.widget.P
        protected boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f extends BaseAdapter {

        /* renamed from: K, reason: collision with root package name */
        public static final int f5591K = Integer.MAX_VALUE;

        /* renamed from: L, reason: collision with root package name */
        public static final int f5592L = 4;

        /* renamed from: M, reason: collision with root package name */
        private static final int f5593M = 0;

        /* renamed from: N, reason: collision with root package name */
        private static final int f5594N = 1;

        /* renamed from: O, reason: collision with root package name */
        private static final int f5595O = 3;

        /* renamed from: E, reason: collision with root package name */
        private C0591d f5596E;

        /* renamed from: F, reason: collision with root package name */
        private int f5597F = 4;

        /* renamed from: G, reason: collision with root package name */
        private boolean f5598G;

        /* renamed from: H, reason: collision with root package name */
        private boolean f5599H;

        /* renamed from: I, reason: collision with root package name */
        private boolean f5600I;

        f() {
        }

        public int a() {
            return this.f5596E.f();
        }

        public C0591d b() {
            return this.f5596E;
        }

        public ResolveInfo c() {
            return this.f5596E.h();
        }

        public int d() {
            return this.f5596E.j();
        }

        public boolean e() {
            return this.f5598G;
        }

        public int f() {
            int i4 = this.f5597F;
            this.f5597F = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i5 = 0;
            View view = null;
            for (int i6 = 0; i6 < count; i6++) {
                view = getView(i6, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i5 = Math.max(i5, view.getMeasuredWidth());
            }
            this.f5597F = i4;
            return i5;
        }

        public void g(C0591d c0591d) {
            C0591d b4 = ActivityChooserView.this.f5567E.b();
            if (b4 != null && ActivityChooserView.this.isShown()) {
                b4.unregisterObserver(ActivityChooserView.this.f5577O);
            }
            this.f5596E = c0591d;
            if (c0591d != null && ActivityChooserView.this.isShown()) {
                c0591d.registerObserver(ActivityChooserView.this.f5577O);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int f4 = this.f5596E.f();
            if (!this.f5598G && this.f5596E.h() != null) {
                f4--;
            }
            int min = Math.min(f4, this.f5597F);
            if (this.f5600I) {
                return min + 1;
            }
            return min;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            int itemViewType = getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.f5598G && this.f5596E.h() != null) {
                i4++;
            }
            return this.f5596E.e(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            if (this.f5600I && i4 == getCount() - 1) {
                return 1;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view == null || view.getId() != 1) {
                        View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C2042a.j.f49692h, viewGroup, false);
                        inflate.setId(1);
                        ((TextView) inflate.findViewById(C2042a.g.f49653s0)).setText(ActivityChooserView.this.getContext().getString(C2042a.k.f49717e));
                        return inflate;
                    }
                    return view;
                }
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != C2042a.g.f49597H) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C2042a.j.f49692h, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(C2042a.g.f49594E);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i4);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(C2042a.g.f49653s0)).setText(resolveInfo.loadLabel(packageManager));
            if (this.f5598G && i4 == 0 && this.f5599H) {
                view.setActivated(true);
            } else {
                view.setActivated(false);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i4) {
            if (this.f5597F != i4) {
                this.f5597F = i4;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z3, boolean z4) {
            if (this.f5598G != z3 || this.f5599H != z4) {
                this.f5598G = z3;
                this.f5599H = z4;
                notifyDataSetChanged();
            }
        }

        public void j(boolean z3) {
            if (this.f5600I != z3) {
                this.f5600I = z3;
                notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        g() {
        }

        private void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f5580R;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f5573K) {
                activityChooserView.a();
                Intent b4 = ActivityChooserView.this.f5567E.b().b(ActivityChooserView.this.f5567E.b().g(ActivityChooserView.this.f5567E.c()));
                if (b4 != null) {
                    b4.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b4);
                    return;
                }
                return;
            }
            if (view == activityChooserView.f5571I) {
                activityChooserView.f5581S = false;
                activityChooserView.d(activityChooserView.f5582T);
                return;
            }
            throw new IllegalArgumentException();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            AbstractC0795b abstractC0795b = ActivityChooserView.this.f5576N;
            if (abstractC0795b != null) {
                abstractC0795b.m(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ActivityChooserView.this.d(Integer.MAX_VALUE);
                    return;
                }
                throw new IllegalArgumentException();
            }
            ActivityChooserView.this.a();
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (activityChooserView.f5581S) {
                if (i4 > 0) {
                    activityChooserView.f5567E.b().r(i4);
                    return;
                }
                return;
            }
            if (!activityChooserView.f5567E.e()) {
                i4++;
            }
            Intent b4 = ActivityChooserView.this.f5567E.b().b(i4);
            if (b4 != null) {
                b4.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(b4);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.f5573K) {
                if (activityChooserView.f5567E.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f5581S = true;
                    activityChooserView2.d(activityChooserView2.f5582T);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(@androidx.annotation.N Context context) {
        this(context, null);
    }

    public boolean a() {
        if (b()) {
            getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f5578P);
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean b() {
        return getListPopupWindow().c();
    }

    public boolean c() {
        if (b() || !this.f5583U) {
            return false;
        }
        this.f5581S = false;
        d(this.f5582T);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int, boolean] */
    void d(int i4) {
        ?? r02;
        if (this.f5567E.b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f5578P);
            if (this.f5573K.getVisibility() == 0) {
                r02 = 1;
            } else {
                r02 = 0;
            }
            int a4 = this.f5567E.a();
            if (i4 != Integer.MAX_VALUE && a4 > i4 + r02) {
                this.f5567E.j(true);
                this.f5567E.h(i4 - 1);
            } else {
                this.f5567E.j(false);
                this.f5567E.h(i4);
            }
            Q listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.c()) {
                if (!this.f5581S && r02 != 0) {
                    this.f5567E.i(false, false);
                } else {
                    this.f5567E.i(true, r02);
                }
                listPopupWindow.U(Math.min(this.f5567E.f(), this.f5575M));
                listPopupWindow.a();
                AbstractC0795b abstractC0795b = this.f5576N;
                if (abstractC0795b != null) {
                    abstractC0795b.m(true);
                }
                listPopupWindow.k().setContentDescription(getContext().getString(C2042a.k.f49718f));
                listPopupWindow.k().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    void e() {
        if (this.f5567E.getCount() > 0) {
            this.f5571I.setEnabled(true);
        } else {
            this.f5571I.setEnabled(false);
        }
        int a4 = this.f5567E.a();
        int d4 = this.f5567E.d();
        if (a4 != 1 && (a4 <= 1 || d4 <= 0)) {
            this.f5573K.setVisibility(8);
        } else {
            this.f5573K.setVisibility(0);
            ResolveInfo c4 = this.f5567E.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.f5574L.setImageDrawable(c4.loadIcon(packageManager));
            if (this.f5584V != 0) {
                this.f5573K.setContentDescription(getContext().getString(this.f5584V, c4.loadLabel(packageManager)));
            }
        }
        if (this.f5573K.getVisibility() == 0) {
            this.f5569G.setBackgroundDrawable(this.f5570H);
        } else {
            this.f5569G.setBackgroundDrawable(null);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C0591d getDataModel() {
        return this.f5567E.b();
    }

    Q getListPopupWindow() {
        if (this.f5579Q == null) {
            Q q4 = new Q(getContext());
            this.f5579Q = q4;
            q4.q(this.f5567E);
            this.f5579Q.S(this);
            this.f5579Q.d0(true);
            this.f5579Q.f0(this.f5568F);
            this.f5579Q.e0(this.f5568F);
        }
        return this.f5579Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0591d b4 = this.f5567E.b();
        if (b4 != null) {
            b4.registerObserver(this.f5577O);
        }
        this.f5583U = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0591d b4 = this.f5567E.b();
        if (b4 != null) {
            b4.unregisterObserver(this.f5577O);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f5578P);
        }
        if (b()) {
            a();
        }
        this.f5583U = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        this.f5569G.layout(0, 0, i6 - i4, i7 - i5);
        if (!b()) {
            a();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        View view = this.f5569G;
        if (this.f5573K.getVisibility() != 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5), 1073741824);
        }
        measureChild(view, i4, i5);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.C0591d.a
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setActivityChooserModel(C0591d c0591d) {
        this.f5567E.g(c0591d);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i4) {
        this.f5584V = i4;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i4) {
        this.f5572J.setContentDescription(getContext().getString(i4));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f5572J.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i4) {
        this.f5582T = i4;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f5580R = onDismissListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setProvider(AbstractC0795b abstractC0795b) {
        this.f5576N = abstractC0795b;
    }

    public ActivityChooserView(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5577O = new a();
        this.f5578P = new b();
        this.f5582T = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042a.m.f50030Q, i4, 0);
        C0823k0.z1(this, context, C2042a.m.f50030Q, attributeSet, obtainStyledAttributes, i4, 0);
        this.f5582T = obtainStyledAttributes.getInt(C2042a.m.f50038S, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C2042a.m.f50034R);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C2042a.j.f49691g, (ViewGroup) this, true);
        g gVar = new g();
        this.f5568F = gVar;
        View findViewById = findViewById(C2042a.g.f49642n);
        this.f5569G = findViewById;
        this.f5570H = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(C2042a.g.f49664y);
        this.f5573K = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        this.f5574L = (ImageView) frameLayout.findViewById(C2042a.g.f49595F);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(C2042a.g.f49590A);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.f5571I = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(C2042a.g.f49595F);
        this.f5572J = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.f5567E = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.f5575M = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2042a.e.f49495x));
    }
}
