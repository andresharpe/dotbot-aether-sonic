package androidx.appcompat.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import androidx.annotation.c0;
import androidx.appcompat.app.C0585c;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.a;

/* renamed from: androidx.appcompat.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0584b implements a.e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0042b f4818a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.drawerlayout.widget.a f4819b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.appcompat.graphics.drawable.d f4820c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4821d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f4822e;

    /* renamed from: f, reason: collision with root package name */
    boolean f4823f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4824g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4825h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4826i;

    /* renamed from: j, reason: collision with root package name */
    View.OnClickListener f4827j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f4828k;

    /* renamed from: androidx.appcompat.app.b$a */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0584b c0584b = C0584b.this;
            if (c0584b.f4823f) {
                c0584b.v();
                return;
            }
            View.OnClickListener onClickListener = c0584b.f4827j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0042b {
        void a(Drawable drawable, @c0 int i4);

        Drawable b();

        void c(@c0 int i4);

        boolean d();

        Context e();
    }

    /* renamed from: androidx.appcompat.app.b$c */
    /* loaded from: classes.dex */
    public interface c {
        @P
        InterfaceC0042b a();
    }

    /* renamed from: androidx.appcompat.app.b$d */
    /* loaded from: classes.dex */
    private static class d implements InterfaceC0042b {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f4830a;

        /* renamed from: b, reason: collision with root package name */
        private C0585c.a f4831b;

        @W(18)
        /* renamed from: androidx.appcompat.app.b$d$a */
        /* loaded from: classes.dex */
        static class a {
            private a() {
            }

            @InterfaceC0577u
            static void a(ActionBar actionBar, int i4) {
                actionBar.setHomeActionContentDescription(i4);
            }

            @InterfaceC0577u
            static void b(ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        d(Activity activity) {
            this.f4830a = activity;
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public void a(Drawable drawable, int i4) {
            ActionBar actionBar = this.f4830a.getActionBar();
            if (actionBar != null) {
                a.b(actionBar, drawable);
                a.a(actionBar, i4);
            }
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public Drawable b() {
            TypedArray obtainStyledAttributes = e().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public void c(int i4) {
            ActionBar actionBar = this.f4830a.getActionBar();
            if (actionBar != null) {
                a.a(actionBar, i4);
            }
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public boolean d() {
            ActionBar actionBar = this.f4830a.getActionBar();
            if (actionBar != null && (actionBar.getDisplayOptions() & 4) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public Context e() {
            ActionBar actionBar = this.f4830a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f4830a;
        }
    }

    /* renamed from: androidx.appcompat.app.b$e */
    /* loaded from: classes.dex */
    static class e implements InterfaceC0042b {

        /* renamed from: a, reason: collision with root package name */
        final Toolbar f4832a;

        /* renamed from: b, reason: collision with root package name */
        final Drawable f4833b;

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f4834c;

        e(Toolbar toolbar) {
            this.f4832a = toolbar;
            this.f4833b = toolbar.getNavigationIcon();
            this.f4834c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public void a(Drawable drawable, @c0 int i4) {
            this.f4832a.setNavigationIcon(drawable);
            c(i4);
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public Drawable b() {
            return this.f4833b;
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public void c(@c0 int i4) {
            if (i4 == 0) {
                this.f4832a.setNavigationContentDescription(this.f4834c);
            } else {
                this.f4832a.setNavigationContentDescription(i4);
            }
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public boolean d() {
            return true;
        }

        @Override // androidx.appcompat.app.C0584b.InterfaceC0042b
        public Context e() {
            return this.f4832a.getContext();
        }
    }

    public C0584b(Activity activity, androidx.drawerlayout.widget.a aVar, @c0 int i4, @c0 int i5) {
        this(activity, null, aVar, null, i4, i5);
    }

    private void s(float f4) {
        if (f4 == 1.0f) {
            this.f4820c.u(true);
        } else if (f4 == 0.0f) {
            this.f4820c.u(false);
        }
        this.f4820c.s(f4);
    }

    @Override // androidx.drawerlayout.widget.a.e
    public void a(View view) {
        s(1.0f);
        if (this.f4823f) {
            l(this.f4826i);
        }
    }

    @Override // androidx.drawerlayout.widget.a.e
    public void b(View view) {
        s(0.0f);
        if (this.f4823f) {
            l(this.f4825h);
        }
    }

    @Override // androidx.drawerlayout.widget.a.e
    public void c(int i4) {
    }

    @Override // androidx.drawerlayout.widget.a.e
    public void d(View view, float f4) {
        if (this.f4821d) {
            s(Math.min(1.0f, Math.max(0.0f, f4)));
        } else {
            s(0.0f);
        }
    }

    @N
    public androidx.appcompat.graphics.drawable.d e() {
        return this.f4820c;
    }

    Drawable f() {
        return this.f4818a.b();
    }

    public View.OnClickListener g() {
        return this.f4827j;
    }

    public boolean h() {
        return this.f4823f;
    }

    public boolean i() {
        return this.f4821d;
    }

    public void j(Configuration configuration) {
        if (!this.f4824g) {
            this.f4822e = f();
        }
        u();
    }

    public boolean k(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.f4823f) {
            v();
            return true;
        }
        return false;
    }

    void l(int i4) {
        this.f4818a.c(i4);
    }

    void m(Drawable drawable, int i4) {
        if (!this.f4828k && !this.f4818a.d()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f4828k = true;
        }
        this.f4818a.a(drawable, i4);
    }

    public void n(@N androidx.appcompat.graphics.drawable.d dVar) {
        this.f4820c = dVar;
        u();
    }

    public void o(boolean z3) {
        int i4;
        if (z3 != this.f4823f) {
            if (z3) {
                androidx.appcompat.graphics.drawable.d dVar = this.f4820c;
                if (this.f4819b.C(androidx.core.view.C.f13101b)) {
                    i4 = this.f4826i;
                } else {
                    i4 = this.f4825h;
                }
                m(dVar, i4);
            } else {
                m(this.f4822e, 0);
            }
            this.f4823f = z3;
        }
    }

    public void p(boolean z3) {
        this.f4821d = z3;
        if (!z3) {
            s(0.0f);
        }
    }

    public void q(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = this.f4819b.getResources().getDrawable(i4);
        } else {
            drawable = null;
        }
        r(drawable);
    }

    public void r(Drawable drawable) {
        if (drawable == null) {
            this.f4822e = f();
            this.f4824g = false;
        } else {
            this.f4822e = drawable;
            this.f4824g = true;
        }
        if (!this.f4823f) {
            m(this.f4822e, 0);
        }
    }

    public void t(View.OnClickListener onClickListener) {
        this.f4827j = onClickListener;
    }

    public void u() {
        int i4;
        if (this.f4819b.C(androidx.core.view.C.f13101b)) {
            s(1.0f);
        } else {
            s(0.0f);
        }
        if (this.f4823f) {
            androidx.appcompat.graphics.drawable.d dVar = this.f4820c;
            if (this.f4819b.C(androidx.core.view.C.f13101b)) {
                i4 = this.f4826i;
            } else {
                i4 = this.f4825h;
            }
            m(dVar, i4);
        }
    }

    void v() {
        int q4 = this.f4819b.q(androidx.core.view.C.f13101b);
        if (this.f4819b.F(androidx.core.view.C.f13101b) && q4 != 2) {
            this.f4819b.d(androidx.core.view.C.f13101b);
        } else if (q4 != 1) {
            this.f4819b.K(androidx.core.view.C.f13101b);
        }
    }

    public C0584b(Activity activity, androidx.drawerlayout.widget.a aVar, Toolbar toolbar, @c0 int i4, @c0 int i5) {
        this(activity, toolbar, aVar, null, i4, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    C0584b(Activity activity, Toolbar toolbar, androidx.drawerlayout.widget.a aVar, androidx.appcompat.graphics.drawable.d dVar, @c0 int i4, @c0 int i5) {
        this.f4821d = true;
        this.f4823f = true;
        this.f4828k = false;
        if (toolbar != null) {
            this.f4818a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f4818a = ((c) activity).a();
        } else {
            this.f4818a = new d(activity);
        }
        this.f4819b = aVar;
        this.f4825h = i4;
        this.f4826i = i5;
        if (dVar == null) {
            this.f4820c = new androidx.appcompat.graphics.drawable.d(this.f4818a.e());
        } else {
            this.f4820c = dVar;
        }
        this.f4822e = f();
    }
}
