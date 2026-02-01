package com.google.android.material.textfield;

import T0.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.annotation.I;
import androidx.annotation.InterfaceC0562e;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.C0592e;
import androidx.appcompat.widget.Q;
import com.google.android.material.internal.w;
import d1.C2044a;

/* loaded from: classes2.dex */
public class i extends C0592e {

    /* renamed from: M, reason: collision with root package name */
    private static final int f33789M = 15;

    /* renamed from: I, reason: collision with root package name */
    @N
    private final Q f33790I;

    /* renamed from: J, reason: collision with root package name */
    @P
    private final AccessibilityManager f33791J;

    /* renamed from: K, reason: collision with root package name */
    @N
    private final Rect f33792K;

    /* renamed from: L, reason: collision with root package name */
    @I
    private final int f33793L;

    /* loaded from: classes2.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            Object item;
            i iVar = i.this;
            if (i4 < 0) {
                item = iVar.f33790I.C();
            } else {
                item = iVar.getAdapter().getItem(i4);
            }
            i.this.g(item);
            AdapterView.OnItemClickListener onItemClickListener = i.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i4 < 0) {
                    view = i.this.f33790I.F();
                    i4 = i.this.f33790I.E();
                    j4 = i.this.f33790I.D();
                }
                onItemClickListener.onItemClick(i.this.f33790I.k(), view, i4, j4);
            }
            i.this.f33790I.dismiss();
        }
    }

    public i(@N Context context) {
        this(context, null);
    }

    @P
    private TextInputLayout e() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int f() {
        ListAdapter adapter = getAdapter();
        TextInputLayout e4 = e();
        int i4 = 0;
        if (adapter == null || e4 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f33790I.E()) + 15);
        View view = null;
        int i5 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(max, view, e4);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        Drawable i6 = this.f33790I.i();
        if (i6 != null) {
            i6.getPadding(this.f33792K);
            Rect rect = this.f33792K;
            i5 += rect.left + rect.right;
        }
        return i5 + e4.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void g(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    @P
    public CharSequence getHint() {
        TextInputLayout e4 = e();
        if (e4 != null && e4.Z()) {
            return e4.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout e4 = e();
        if (e4 != null && e4.Z() && super.getHint() == null && com.google.android.material.internal.i.c()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), f()), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@P T t3) {
        super.setAdapter(t3);
        this.f33790I.q(getAdapter());
    }

    public void setSimpleItems(@InterfaceC0562e int i4) {
        setSimpleItems(getResources().getStringArray(i4));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f33791J;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f33790I.a();
        } else {
            super.showDropDown();
        }
    }

    public i(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f1897Y);
    }

    public void setSimpleItems(@N String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f33793L, strArr));
    }

    public i(@N Context context, @P AttributeSet attributeSet, int i4) {
        super(C2044a.c(context, attributeSet, i4, 0), attributeSet, i4);
        this.f33792K = new Rect();
        Context context2 = getContext();
        TypedArray j4 = w.j(context2, attributeSet, a.o.Vk, i4, a.n.Nc, new int[0]);
        if (j4.hasValue(a.o.Wk) && j4.getInt(a.o.Wk, 0) == 0) {
            setKeyListener(null);
        }
        this.f33793L = j4.getResourceId(a.o.Xk, a.k.f3017q0);
        this.f33791J = (AccessibilityManager) context2.getSystemService("accessibility");
        Q q4 = new Q(context2);
        this.f33790I = q4;
        q4.d0(true);
        q4.S(this);
        q4.a0(2);
        q4.q(getAdapter());
        q4.f0(new a());
        if (j4.hasValue(a.o.Yk)) {
            setSimpleItems(j4.getResourceId(a.o.Yk, 0));
        }
        j4.recycle();
    }
}
