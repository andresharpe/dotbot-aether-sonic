package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: E, reason: collision with root package name */
    private boolean f5484E;

    /* renamed from: F, reason: collision with root package name */
    private View f5485F;

    /* renamed from: G, reason: collision with root package name */
    private View f5486G;

    /* renamed from: H, reason: collision with root package name */
    private View f5487H;

    /* renamed from: I, reason: collision with root package name */
    Drawable f5488I;

    /* renamed from: J, reason: collision with root package name */
    Drawable f5489J;

    /* renamed from: K, reason: collision with root package name */
    Drawable f5490K;

    /* renamed from: L, reason: collision with root package name */
    boolean f5491L;

    /* renamed from: M, reason: collision with root package name */
    boolean f5492M;

    /* renamed from: N, reason: collision with root package name */
    private int f5493N;

    @androidx.annotation.W(21)
    /* loaded from: classes.dex */
    private static class a {
        private a() {
        }

        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        if (view != null && view.getVisibility() != 8 && view.getMeasuredHeight() != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5488I;
        if (drawable != null && drawable.isStateful()) {
            this.f5488I.setState(getDrawableState());
        }
        Drawable drawable2 = this.f5489J;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f5489J.setState(getDrawableState());
        }
        Drawable drawable3 = this.f5490K;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f5490K.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f5485F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5488I;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f5489J;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f5490K;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f5486G = findViewById(C2042a.g.f49616a);
        this.f5487H = findViewById(C2042a.g.f49630h);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f5484E && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        boolean z4;
        Drawable drawable;
        super.onLayout(z3, i4, i5, i6, i7);
        View view = this.f5485F;
        boolean z5 = true;
        if (view != null && view.getVisibility() != 8) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i8 = layoutParams.bottomMargin;
            view.layout(i4, measuredHeight2 - i8, i6, measuredHeight - i8);
        }
        if (this.f5491L) {
            Drawable drawable2 = this.f5490K;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                return;
            }
        } else {
            if (this.f5488I != null) {
                if (this.f5486G.getVisibility() == 0) {
                    this.f5488I.setBounds(this.f5486G.getLeft(), this.f5486G.getTop(), this.f5486G.getRight(), this.f5486G.getBottom());
                } else {
                    View view2 = this.f5487H;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f5488I.setBounds(this.f5487H.getLeft(), this.f5487H.getTop(), this.f5487H.getRight(), this.f5487H.getBottom());
                    } else {
                        this.f5488I.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z5 = false;
            }
            this.f5492M = z4;
            if (z4 && (drawable = this.f5489J) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else if (!z5) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        if (this.f5486G == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i8 = this.f5493N) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i8, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.f5486G == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        View view = this.f5485F;
        if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
            if (!b(this.f5486G)) {
                i6 = a(this.f5486G);
            } else if (!b(this.f5487H)) {
                i6 = a(this.f5487H);
            } else {
                i6 = 0;
            }
            if (mode == Integer.MIN_VALUE) {
                i7 = View.MeasureSpec.getSize(i5);
            } else {
                i7 = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(i6 + a(this.f5485F), i7));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f5488I;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f5488I);
        }
        this.f5488I = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f5486G;
            if (view != null) {
                this.f5488I.setBounds(view.getLeft(), this.f5486G.getTop(), this.f5486G.getRight(), this.f5486G.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f5491L ? !(this.f5488I != null || this.f5489J != null) : this.f5490K == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f5490K;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f5490K);
        }
        this.f5490K = drawable;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f5491L && (drawable2 = this.f5490K) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f5491L ? !(this.f5488I != null || this.f5489J != null) : this.f5490K == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f5489J;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f5489J);
        }
        this.f5489J = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f5492M && (drawable2 = this.f5489J) != null) {
                drawable2.setBounds(this.f5485F.getLeft(), this.f5485F.getTop(), this.f5485F.getRight(), this.f5485F.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f5491L ? !(this.f5488I != null || this.f5489J != null) : this.f5490K == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(Y y3) {
        View view = this.f5485F;
        if (view != null) {
            removeView(view);
        }
        this.f5485F = y3;
        if (y3 != null) {
            addView(y3);
            ViewGroup.LayoutParams layoutParams = y3.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            y3.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z3) {
        int i4;
        this.f5484E = z3;
        if (z3) {
            i4 = 393216;
        } else {
            i4 = 262144;
        }
        setDescendantFocusability(i4);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        boolean z3;
        super.setVisibility(i4);
        if (i4 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable = this.f5488I;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f5489J;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f5490K;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if ((drawable == this.f5488I && !this.f5491L) || ((drawable == this.f5489J && this.f5492M) || ((drawable == this.f5490K && this.f5491L) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0823k0.I1(this, new C0589b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042a.m.f50070a);
        this.f5488I = obtainStyledAttributes.getDrawable(C2042a.m.f50075b);
        this.f5489J = obtainStyledAttributes.getDrawable(C2042a.m.f50085d);
        this.f5493N = obtainStyledAttributes.getDimensionPixelSize(C2042a.m.f50140o, -1);
        boolean z3 = true;
        if (getId() == C2042a.g.f49635j0) {
            this.f5491L = true;
            this.f5490K = obtainStyledAttributes.getDrawable(C2042a.m.f50080c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f5491L ? this.f5488I != null || this.f5489J != null : this.f5490K != null) {
            z3 = false;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }
}
