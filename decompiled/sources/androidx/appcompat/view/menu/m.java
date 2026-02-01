package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.annotation.d0;
import androidx.appcompat.view.menu.n;
import androidx.core.view.C;
import androidx.core.view.C0823k0;
import d.C2042a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class m implements i {

    /* renamed from: m, reason: collision with root package name */
    private static final int f5418m = 48;

    /* renamed from: a, reason: collision with root package name */
    private final Context f5419a;

    /* renamed from: b, reason: collision with root package name */
    private final g f5420b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5421c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5422d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5423e;

    /* renamed from: f, reason: collision with root package name */
    private View f5424f;

    /* renamed from: g, reason: collision with root package name */
    private int f5425g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5426h;

    /* renamed from: i, reason: collision with root package name */
    private n.a f5427i;

    /* renamed from: j, reason: collision with root package name */
    private l f5428j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f5429k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f5430l;

    /* loaded from: classes.dex */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @W(17)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @InterfaceC0577u
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public m(@N Context context, @N g gVar) {
        this(context, gVar, null, false, C2042a.b.f49317z2, 0);
    }

    @N
    private l b() {
        l rVar;
        Display defaultDisplay = ((WindowManager) this.f5419a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        if (Math.min(point.x, point.y) >= this.f5419a.getResources().getDimensionPixelSize(C2042a.e.f49493w)) {
            rVar = new d(this.f5419a, this.f5424f, this.f5422d, this.f5423e, this.f5421c);
        } else {
            rVar = new r(this.f5419a, this.f5420b, this.f5424f, this.f5422d, this.f5423e, this.f5421c);
        }
        rVar.o(this.f5420b);
        rVar.x(this.f5430l);
        rVar.s(this.f5424f);
        rVar.h(this.f5427i);
        rVar.u(this.f5426h);
        rVar.v(this.f5425g);
        return rVar;
    }

    private void n(int i4, int i5, boolean z3, boolean z4) {
        l e4 = e();
        e4.y(z4);
        if (z3) {
            if ((C.d(this.f5425g, C0823k0.Z(this.f5424f)) & 7) == 5) {
                i4 -= this.f5424f.getWidth();
            }
            e4.w(i4);
            e4.z(i5);
            int i6 = (int) ((this.f5419a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            e4.t(new Rect(i4 - i6, i5 - i6, i4 + i6, i5 + i6));
        }
        e4.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void a(@P n.a aVar) {
        this.f5427i = aVar;
        l lVar = this.f5428j;
        if (lVar != null) {
            lVar.h(aVar);
        }
    }

    public int c() {
        return this.f5425g;
    }

    public ListView d() {
        return e().k();
    }

    @Override // androidx.appcompat.view.menu.i
    public void dismiss() {
        if (f()) {
            this.f5428j.dismiss();
        }
    }

    @N
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public l e() {
        if (this.f5428j == null) {
            this.f5428j = b();
        }
        return this.f5428j;
    }

    public boolean f() {
        l lVar = this.f5428j;
        if (lVar != null && lVar.c()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        this.f5428j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f5429k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void h(@N View view) {
        this.f5424f = view;
    }

    public void i(boolean z3) {
        this.f5426h = z3;
        l lVar = this.f5428j;
        if (lVar != null) {
            lVar.u(z3);
        }
    }

    public void j(int i4) {
        this.f5425g = i4;
    }

    public void k(@P PopupWindow.OnDismissListener onDismissListener) {
        this.f5429k = onDismissListener;
    }

    public void l() {
        if (o()) {
        } else {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void m(int i4, int i5) {
        if (p(i4, i5)) {
        } else {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean o() {
        if (f()) {
            return true;
        }
        if (this.f5424f == null) {
            return false;
        }
        n(0, 0, false, false);
        return true;
    }

    public boolean p(int i4, int i5) {
        if (f()) {
            return true;
        }
        if (this.f5424f == null) {
            return false;
        }
        n(i4, i5, true, true);
        return true;
    }

    public m(@N Context context, @N g gVar, @N View view) {
        this(context, gVar, view, false, C2042a.b.f49317z2, 0);
    }

    public m(@N Context context, @N g gVar, @N View view, boolean z3, @InterfaceC0563f int i4) {
        this(context, gVar, view, z3, i4, 0);
    }

    public m(@N Context context, @N g gVar, @N View view, boolean z3, @InterfaceC0563f int i4, @d0 int i5) {
        this.f5425g = C.f13101b;
        this.f5430l = new a();
        this.f5419a = context;
        this.f5420b = gVar;
        this.f5424f = view;
        this.f5421c = z3;
        this.f5422d = i4;
        this.f5423e = i5;
    }
}
