package androidx.fragment.app;

import A.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C0897o implements LayoutInflater.Factory2 {

    /* renamed from: F, reason: collision with root package name */
    private static final String f15323F = "FragmentManager";

    /* renamed from: E, reason: collision with root package name */
    final FragmentManager f15324E;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$a */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ B f15325E;

        a(B b4) {
            this.f15325E = b4;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k4 = this.f15325E.k();
            this.f15325E.m();
            M.n((ViewGroup) k4.f15026m0.getParent(), LayoutInflaterFactory2C0897o.this.f15324E).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflaterFactory2C0897o(FragmentManager fragmentManager) {
        this.f15324E = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    @androidx.annotation.P
    public View onCreateView(@androidx.annotation.N String str, @androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @androidx.annotation.P
    public View onCreateView(@androidx.annotation.P View view, @androidx.annotation.N String str, @androidx.annotation.N Context context, @androidx.annotation.N AttributeSet attributeSet) {
        B z3;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f15324E);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d.f18a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(a.d.f19b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(a.d.f20c, -1);
        String string = obtainStyledAttributes.getString(a.d.f21d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0893k.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment n02 = resourceId != -1 ? this.f15324E.n0(resourceId) : null;
        if (n02 == null && string != null) {
            n02 = this.f15324E.o0(string);
        }
        if (n02 == null && id != -1) {
            n02 = this.f15324E.n0(id);
        }
        if (n02 == null) {
            n02 = this.f15324E.C0().a(context.getClassLoader(), attributeValue);
            n02.f15006S = true;
            n02.f15015b0 = resourceId != 0 ? resourceId : id;
            n02.f15016c0 = id;
            n02.f15017d0 = string;
            n02.f15007T = true;
            FragmentManager fragmentManager = this.f15324E;
            n02.f15011X = fragmentManager;
            n02.f15012Y = fragmentManager.F0();
            n02.onInflate(this.f15324E.F0().g(), attributeSet, n02.f14993F);
            z3 = this.f15324E.j(n02);
            if (FragmentManager.S0(2)) {
                Log.v("FragmentManager", "Fragment " + n02 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!n02.f15007T) {
            n02.f15007T = true;
            FragmentManager fragmentManager2 = this.f15324E;
            n02.f15011X = fragmentManager2;
            n02.f15012Y = fragmentManager2.F0();
            n02.onInflate(this.f15324E.F0().g(), attributeSet, n02.f14993F);
            z3 = this.f15324E.z(n02);
            if (FragmentManager.S0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + n02 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        FragmentStrictMode.j(n02, viewGroup);
        n02.f15025l0 = viewGroup;
        z3.m();
        z3.j();
        View view2 = n02.f15026m0;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (n02.f15026m0.getTag() == null) {
            n02.f15026m0.setTag(string);
        }
        n02.f15026m0.addOnAttachStateChangeListener(new a(z3));
        return n02.f15026m0;
    }
}
