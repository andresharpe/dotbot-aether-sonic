package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import d.C2042a;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: E, reason: collision with root package name */
    private int f6006E;

    /* renamed from: F, reason: collision with root package name */
    private int f6007F;

    /* renamed from: G, reason: collision with root package name */
    private WeakReference<View> f6008G;

    /* renamed from: H, reason: collision with root package name */
    private LayoutInflater f6009H;

    /* renamed from: I, reason: collision with root package name */
    private a f6010I;

    /* loaded from: classes.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f6006E != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f6009H;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f6006E, viewGroup, false);
                int i4 = this.f6007F;
                if (i4 != -1) {
                    inflate.setId(i4);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f6008G = new WeakReference<>(inflate);
                a aVar = this.f6010I;
                if (aVar != null) {
                    aVar.a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f6007F;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f6009H;
    }

    public int getLayoutResource() {
        return this.f6006E;
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.f6007F = i4;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f6009H = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.f6006E = i4;
    }

    public void setOnInflateListener(a aVar) {
        this.f6010I = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        WeakReference<View> weakReference = this.f6008G;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i4);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i4);
        if (i4 == 0 || i4 == 4) {
            a();
        }
    }

    public ViewStubCompat(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f6006E = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042a.m.U6, i4, 0);
        this.f6007F = obtainStyledAttributes.getResourceId(C2042a.m.X6, -1);
        this.f6006E = obtainStyledAttributes.getResourceId(C2042a.m.W6, 0);
        setId(obtainStyledAttributes.getResourceId(C2042a.m.V6, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
