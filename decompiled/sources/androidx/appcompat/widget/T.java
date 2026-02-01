package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class T extends Q implements S {

    /* renamed from: y0, reason: collision with root package name */
    private static final String f5915y0 = "MenuPopupWindow";

    /* renamed from: z0, reason: collision with root package name */
    private static Method f5916z0;

    /* renamed from: x0, reason: collision with root package name */
    private S f5917x0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(23)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @InterfaceC0577u
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @InterfaceC0577u
        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static void a(PopupWindow popupWindow, boolean z3) {
            popupWindow.setTouchModal(z3);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class c extends M {

        /* renamed from: T, reason: collision with root package name */
        final int f5918T;

        /* renamed from: U, reason: collision with root package name */
        final int f5919U;

        /* renamed from: V, reason: collision with root package name */
        private S f5920V;

        /* renamed from: W, reason: collision with root package name */
        private MenuItem f5921W;

        @androidx.annotation.W(17)
        /* loaded from: classes.dex */
        static class a {
            private a() {
            }

            @InterfaceC0577u
            static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z3) {
            super(context, z3);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f5918T = 21;
                this.f5919U = 22;
            } else {
                this.f5918T = 22;
                this.f5919U = 21;
            }
        }

        @Override // androidx.appcompat.widget.M
        public /* bridge */ /* synthetic */ int d(int i4, boolean z3) {
            return super.d(i4, z3);
        }

        @Override // androidx.appcompat.widget.M
        public /* bridge */ /* synthetic */ int e(int i4, int i5, int i6, int i7, int i8) {
            return super.e(i4, i5, i6, i7, i8);
        }

        @Override // androidx.appcompat.widget.M
        public /* bridge */ /* synthetic */ boolean f(MotionEvent motionEvent, int i4) {
            return super.f(motionEvent, i4);
        }

        @Override // androidx.appcompat.widget.M, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.M, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.M, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.M, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.M, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.f fVar;
            int i4;
            androidx.appcompat.view.menu.j jVar;
            int pointToPosition;
            int i5;
            if (this.f5920V != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    fVar = (androidx.appcompat.view.menu.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (androidx.appcompat.view.menu.f) adapter;
                    i4 = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i5 = pointToPosition - i4) >= 0 && i5 < fVar.getCount()) {
                    jVar = fVar.getItem(i5);
                } else {
                    jVar = null;
                }
                MenuItem menuItem = this.f5921W;
                if (menuItem != jVar) {
                    androidx.appcompat.view.menu.g b4 = fVar.b();
                    if (menuItem != null) {
                        this.f5920V.h(b4, menuItem);
                    }
                    this.f5921W = jVar;
                    if (jVar != null) {
                        this.f5920V.e(b4, jVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i4, KeyEvent keyEvent) {
            androidx.appcompat.view.menu.f fVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i4 == this.f5918T) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && i4 == this.f5919U) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    fVar = (androidx.appcompat.view.menu.f) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    fVar = (androidx.appcompat.view.menu.f) adapter;
                }
                fVar.b().f(false);
                return true;
            }
            return super.onKeyDown(i4, keyEvent);
        }

        @Override // androidx.appcompat.widget.M, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void p() {
            setSelection(-1);
        }

        public void setHoverListener(S s4) {
            this.f5920V = s4;
        }

        @Override // androidx.appcompat.widget.M, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f5916z0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i(f5915y0, "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public T(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
    }

    @Override // androidx.appcompat.widget.S
    public void e(@androidx.annotation.N androidx.appcompat.view.menu.g gVar, @androidx.annotation.N MenuItem menuItem) {
        S s4 = this.f5917x0;
        if (s4 != null) {
            s4.e(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.S
    public void h(@androidx.annotation.N androidx.appcompat.view.menu.g gVar, @androidx.annotation.N MenuItem menuItem) {
        S s4 = this.f5917x0;
        if (s4 != null) {
            s4.h(gVar, menuItem);
        }
    }

    public void p0(Object obj) {
        a.a(this.f5772j0, (Transition) obj);
    }

    public void q0(Object obj) {
        a.b(this.f5772j0, (Transition) obj);
    }

    public void r0(S s4) {
        this.f5917x0 = s4;
    }

    public void s0(boolean z3) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f5916z0;
            if (method != null) {
                try {
                    method.invoke(this.f5772j0, Boolean.valueOf(z3));
                    return;
                } catch (Exception unused) {
                    Log.i(f5915y0, "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        b.a(this.f5772j0, z3);
    }

    @Override // androidx.appcompat.widget.Q
    @androidx.annotation.N
    M u(Context context, boolean z3) {
        c cVar = new c(context, z3);
        cVar.setHoverListener(this);
        return cVar;
    }
}
