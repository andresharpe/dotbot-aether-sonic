package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AbstractC0583a;
import androidx.appcompat.widget.LinearLayoutCompat;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class Y extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: P, reason: collision with root package name */
    private static final String f6021P = "ScrollingTabContainerView";

    /* renamed from: Q, reason: collision with root package name */
    private static final Interpolator f6022Q = new DecelerateInterpolator();

    /* renamed from: R, reason: collision with root package name */
    private static final int f6023R = 200;

    /* renamed from: E, reason: collision with root package name */
    Runnable f6024E;

    /* renamed from: F, reason: collision with root package name */
    private c f6025F;

    /* renamed from: G, reason: collision with root package name */
    LinearLayoutCompat f6026G;

    /* renamed from: H, reason: collision with root package name */
    private Spinner f6027H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f6028I;

    /* renamed from: J, reason: collision with root package name */
    int f6029J;

    /* renamed from: K, reason: collision with root package name */
    int f6030K;

    /* renamed from: L, reason: collision with root package name */
    private int f6031L;

    /* renamed from: M, reason: collision with root package name */
    private int f6032M;

    /* renamed from: N, reason: collision with root package name */
    protected ViewPropertyAnimator f6033N;

    /* renamed from: O, reason: collision with root package name */
    protected final e f6034O;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View f6035E;

        a(View view) {
            this.f6035E = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            Y.this.smoothScrollTo(this.f6035E.getLeft() - ((Y.this.getWidth() - this.f6035E.getWidth()) / 2), 0);
            Y.this.f6024E = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return Y.this.f6026G.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return ((d) Y.this.f6026G.getChildAt(i4)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                return Y.this.g((AbstractC0583a.f) getItem(i4), true);
            }
            ((d) view).a((AbstractC0583a.f) getItem(i4));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z3;
            ((d) view).b().g();
            int childCount = Y.this.f6026G.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = Y.this.f6026G.getChildAt(i4);
                if (childAt == view) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                childAt.setSelected(z3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: K, reason: collision with root package name */
        private static final String f6039K = "androidx.appcompat.app.ActionBar$Tab";

        /* renamed from: E, reason: collision with root package name */
        private final int[] f6040E;

        /* renamed from: F, reason: collision with root package name */
        private AbstractC0583a.f f6041F;

        /* renamed from: G, reason: collision with root package name */
        private TextView f6042G;

        /* renamed from: H, reason: collision with root package name */
        private ImageView f6043H;

        /* renamed from: I, reason: collision with root package name */
        private View f6044I;

        public d(Context context, AbstractC0583a.f fVar, boolean z3) {
            super(context, null, C2042a.b.f49230h);
            int[] iArr = {R.attr.background};
            this.f6040E = iArr;
            this.f6041F = fVar;
            g0 G3 = g0.G(context, null, iArr, C2042a.b.f49230h, 0);
            if (G3.C(0)) {
                setBackgroundDrawable(G3.h(0));
            }
            G3.I();
            if (z3) {
                setGravity(8388627);
            }
            c();
        }

        public void a(AbstractC0583a.f fVar) {
            this.f6041F = fVar;
            c();
        }

        public AbstractC0583a.f b() {
            return this.f6041F;
        }

        public void c() {
            AbstractC0583a.f fVar = this.f6041F;
            View b4 = fVar.b();
            CharSequence charSequence = null;
            if (b4 != null) {
                ViewParent parent = b4.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b4);
                    }
                    addView(b4);
                }
                this.f6044I = b4;
                TextView textView = this.f6042G;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f6043H;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f6043H.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f6044I;
            if (view != null) {
                removeView(view);
                this.f6044I = null;
            }
            Drawable c4 = fVar.c();
            CharSequence f4 = fVar.f();
            if (c4 != null) {
                if (this.f6043H == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f6043H = appCompatImageView;
                }
                this.f6043H.setImageDrawable(c4);
                this.f6043H.setVisibility(0);
            } else {
                ImageView imageView2 = this.f6043H;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f6043H.setImageDrawable(null);
                }
            }
            boolean z3 = !TextUtils.isEmpty(f4);
            if (z3) {
                if (this.f6042G == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C2042a.b.f49235i);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f6042G = appCompatTextView;
                }
                this.f6042G.setText(f4);
                this.f6042G.setVisibility(0);
            } else {
                TextView textView2 = this.f6042G;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f6042G.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f6043H;
            if (imageView3 != null) {
                imageView3.setContentDescription(fVar.a());
            }
            if (!z3) {
                charSequence = fVar.a();
            }
            k0.a(this, charSequence);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(f6039K);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(f6039K);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i4, int i5) {
            super.onMeasure(i4, i5);
            if (Y.this.f6029J > 0) {
                int measuredWidth = getMeasuredWidth();
                int i6 = Y.this.f6029J;
                if (measuredWidth > i6) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i5);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z3) {
            boolean z4;
            if (isSelected() != z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            super.setSelected(z3);
            if (z4 && z3) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* loaded from: classes.dex */
    protected class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private boolean f6046a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f6047b;

        protected e() {
        }

        public e a(ViewPropertyAnimator viewPropertyAnimator, int i4) {
            this.f6047b = i4;
            Y.this.f6033N = viewPropertyAnimator;
            return this;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6046a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6046a) {
                return;
            }
            Y y3 = Y.this;
            y3.f6033N = null;
            y3.setVisibility(this.f6047b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Y.this.setVisibility(0);
            this.f6046a = false;
        }
    }

    public Y(@androidx.annotation.N Context context) {
        super(context);
        this.f6034O = new e();
        setHorizontalScrollBarEnabled(false);
        androidx.appcompat.view.a b4 = androidx.appcompat.view.a.b(context);
        setContentHeight(b4.f());
        this.f6030K = b4.e();
        LinearLayoutCompat f4 = f();
        this.f6026G = f4;
        addView(f4, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner e() {
        C0611y c0611y = new C0611y(getContext(), null, C2042a.b.f49255m);
        c0611y.setLayoutParams(new LinearLayoutCompat.b(-2, -1));
        c0611y.setOnItemSelectedListener(this);
        return c0611y;
    }

    private LinearLayoutCompat f() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, C2042a.b.f49225g);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.b(-2, -1));
        return linearLayoutCompat;
    }

    private boolean h() {
        Spinner spinner = this.f6027H;
        if (spinner != null && spinner.getParent() == this) {
            return true;
        }
        return false;
    }

    private void i() {
        if (h()) {
            return;
        }
        if (this.f6027H == null) {
            this.f6027H = e();
        }
        removeView(this.f6026G);
        addView(this.f6027H, new ViewGroup.LayoutParams(-2, -1));
        if (this.f6027H.getAdapter() == null) {
            this.f6027H.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f6024E;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f6024E = null;
        }
        this.f6027H.setSelection(this.f6032M);
    }

    private boolean j() {
        if (!h()) {
            return false;
        }
        removeView(this.f6027H);
        addView(this.f6026G, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f6027H.getSelectedItemPosition());
        return false;
    }

    public void a(AbstractC0583a.f fVar, int i4, boolean z3) {
        d g4 = g(fVar, false);
        this.f6026G.addView(g4, i4, new LinearLayoutCompat.b(0, -1, 1.0f));
        Spinner spinner = this.f6027H;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z3) {
            g4.setSelected(true);
        }
        if (this.f6028I) {
            requestLayout();
        }
    }

    public void b(AbstractC0583a.f fVar, boolean z3) {
        d g4 = g(fVar, false);
        this.f6026G.addView(g4, new LinearLayoutCompat.b(0, -1, 1.0f));
        Spinner spinner = this.f6027H;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z3) {
            g4.setSelected(true);
        }
        if (this.f6028I) {
            requestLayout();
        }
    }

    public void c(int i4) {
        View childAt = this.f6026G.getChildAt(i4);
        Runnable runnable = this.f6024E;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f6024E = aVar;
        post(aVar);
    }

    public void d(int i4) {
        ViewPropertyAnimator viewPropertyAnimator = this.f6033N;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i4 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ViewPropertyAnimator alpha = animate().alpha(1.0f);
            alpha.setDuration(200L);
            alpha.setInterpolator(f6022Q);
            alpha.setListener(this.f6034O.a(alpha, i4));
            alpha.start();
            return;
        }
        ViewPropertyAnimator alpha2 = animate().alpha(0.0f);
        alpha2.setDuration(200L);
        alpha2.setInterpolator(f6022Q);
        alpha2.setListener(this.f6034O.a(alpha2, i4));
        alpha2.start();
    }

    d g(AbstractC0583a.f fVar, boolean z3) {
        d dVar = new d(getContext(), fVar, z3);
        if (z3) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f6031L));
        } else {
            dVar.setFocusable(true);
            if (this.f6025F == null) {
                this.f6025F = new c();
            }
            dVar.setOnClickListener(this.f6025F);
        }
        return dVar;
    }

    public void k() {
        this.f6026G.removeAllViews();
        Spinner spinner = this.f6027H;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f6028I) {
            requestLayout();
        }
    }

    public void l(int i4) {
        this.f6026G.removeViewAt(i4);
        Spinner spinner = this.f6027H;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f6028I) {
            requestLayout();
        }
    }

    public void m(int i4) {
        ((d) this.f6026G.getChildAt(i4)).c();
        Spinner spinner = this.f6027H;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f6028I) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f6024E;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a b4 = androidx.appcompat.view.a.b(getContext());
        setContentHeight(b4.f());
        this.f6030K = b4.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f6024E;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
        ((d) view).b().g();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        boolean z3;
        int mode = View.MeasureSpec.getMode(i4);
        if (mode == 1073741824) {
            z3 = true;
        } else {
            z3 = false;
        }
        setFillViewport(z3);
        int childCount = this.f6026G.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f6029J = (int) (View.MeasureSpec.getSize(i4) * 0.4f);
            } else {
                this.f6029J = View.MeasureSpec.getSize(i4) / 2;
            }
            this.f6029J = Math.min(this.f6029J, this.f6030K);
        } else {
            this.f6029J = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f6031L, 1073741824);
        if (!z3 && this.f6028I) {
            this.f6026G.measure(0, makeMeasureSpec);
            if (this.f6026G.getMeasuredWidth() > View.MeasureSpec.getSize(i4)) {
                i();
            } else {
                j();
            }
        } else {
            j();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i4, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z3 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f6032M);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z3) {
        this.f6028I = z3;
    }

    public void setContentHeight(int i4) {
        this.f6031L = i4;
        requestLayout();
    }

    public void setTabSelected(int i4) {
        boolean z3;
        this.f6032M = i4;
        int childCount = this.f6026G.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = this.f6026G.getChildAt(i5);
            if (i5 == i4) {
                z3 = true;
            } else {
                z3 = false;
            }
            childAt.setSelected(z3);
            if (z3) {
                c(i4);
            }
        }
        Spinner spinner = this.f6027H;
        if (spinner != null && i4 >= 0) {
            spinner.setSelection(i4);
        }
    }
}
