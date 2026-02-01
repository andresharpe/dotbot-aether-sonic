package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0823k0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class B implements D {

    /* renamed from: a, reason: collision with root package name */
    protected a f32493a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ViewConstructor", "PrivateApi"})
    /* loaded from: classes2.dex */
    public static class a extends ViewGroup {

        /* renamed from: J, reason: collision with root package name */
        static Method f32494J;

        /* renamed from: E, reason: collision with root package name */
        ViewGroup f32495E;

        /* renamed from: F, reason: collision with root package name */
        View f32496F;

        /* renamed from: G, reason: collision with root package name */
        ArrayList<Drawable> f32497G;

        /* renamed from: H, reason: collision with root package name */
        B f32498H;

        /* renamed from: I, reason: collision with root package name */
        private boolean f32499I;

        static {
            try {
                Class cls = Integer.TYPE;
                f32494J = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        a(Context context, ViewGroup viewGroup, View view, B b4) {
            super(context);
            this.f32497G = null;
            this.f32495E = viewGroup;
            this.f32496F = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f32498H = b4;
        }

        private void c() {
            if (!this.f32499I) {
            } else {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f32497G;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f32499I = true;
                    this.f32495E.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f32495E.getLocationOnScreen(iArr2);
            this.f32496F.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.f32497G == null) {
                this.f32497G = new ArrayList<>();
            }
            if (!this.f32497G.contains(drawable)) {
                this.f32497G.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f32495E && viewGroup.getParent() != null && C0823k0.O0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f32495E.getLocationOnScreen(iArr2);
                    C0823k0.e1(view, iArr[0] - iArr2[0]);
                    C0823k0.f1(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int size;
            this.f32495E.getLocationOnScreen(new int[2]);
            this.f32496F.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f32496F.getWidth(), this.f32496F.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f32497G;
            if (arrayList == null) {
                size = 0;
            } else {
                size = arrayList.size();
            }
            for (int i4 = 0; i4 < size; i4++) {
                this.f32497G.get(i4).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected ViewParent f(int i4, int i5, Rect rect) {
            if (this.f32495E != null && f32494J != null) {
                try {
                    e(new int[2]);
                    f32494J.invoke(this.f32495E, Integer.valueOf(i4), Integer.valueOf(i5), rect);
                    return null;
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                    return null;
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                    return null;
                }
            }
            return null;
        }

        public void g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f32497G;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void h(View view) {
            super.removeView(view);
            d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f32495E != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f32495E != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    e(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
                return null;
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@N Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(@N Drawable drawable) {
            ArrayList<Drawable> arrayList;
            if (!super.verifyDrawable(drawable) && ((arrayList = this.f32497G) == null || !arrayList.contains(drawable))) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(Context context, ViewGroup viewGroup, View view) {
        this.f32493a = new a(context, viewGroup, view, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static B e(View view) {
        ViewGroup g4 = E.g(view);
        if (g4 != null) {
            int childCount = g4.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = g4.getChildAt(i4);
                if (childAt instanceof a) {
                    return ((a) childAt).f32498H;
                }
            }
            return new y(g4.getContext(), g4, view);
        }
        return null;
    }

    @Override // com.google.android.material.internal.D
    public void a(@N Drawable drawable) {
        this.f32493a.a(drawable);
    }

    @Override // com.google.android.material.internal.D
    public void b(@N Drawable drawable) {
        this.f32493a.g(drawable);
    }
}
