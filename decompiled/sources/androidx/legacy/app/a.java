package androidx.legacy.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.c0;
import androidx.core.content.C0669d;
import androidx.core.view.C;
import androidx.core.view.C0823k0;
import androidx.drawerlayout.widget.a;
import java.lang.reflect.Method;

@Deprecated
/* loaded from: classes.dex */
public class a implements a.e {

    /* renamed from: m, reason: collision with root package name */
    private static final String f15387m = "ActionBarDrawerToggle";

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f15388n = {R.attr.homeAsUpIndicator};

    /* renamed from: o, reason: collision with root package name */
    private static final float f15389o = 0.33333334f;

    /* renamed from: p, reason: collision with root package name */
    private static final int f15390p = 16908332;

    /* renamed from: a, reason: collision with root package name */
    final Activity f15391a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0133a f15392b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.drawerlayout.widget.a f15393c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f15394d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15395e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f15396f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f15397g;

    /* renamed from: h, reason: collision with root package name */
    private d f15398h;

    /* renamed from: i, reason: collision with root package name */
    private final int f15399i;

    /* renamed from: j, reason: collision with root package name */
    private final int f15400j;

    /* renamed from: k, reason: collision with root package name */
    private final int f15401k;

    /* renamed from: l, reason: collision with root package name */
    private c f15402l;

    @Deprecated
    /* renamed from: androidx.legacy.app.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0133a {
        void a(Drawable drawable, @c0 int i4);

        @P
        Drawable b();

        void c(@c0 int i4);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b {
        @P
        InterfaceC0133a a();
    }

    /* loaded from: classes.dex */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        Method f15403a;

        /* renamed from: b, reason: collision with root package name */
        Method f15404b;

        /* renamed from: c, reason: collision with root package name */
        ImageView f15405c;

        c(Activity activity) {
            try {
                this.f15403a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f15404b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f15405c = (ImageView) childAt;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d extends InsetDrawable implements Drawable.Callback {

        /* renamed from: E, reason: collision with root package name */
        private final boolean f15406E;

        /* renamed from: F, reason: collision with root package name */
        private final Rect f15407F;

        /* renamed from: G, reason: collision with root package name */
        private float f15408G;

        /* renamed from: H, reason: collision with root package name */
        private float f15409H;

        d(Drawable drawable) {
            super(drawable, 0);
            this.f15406E = true;
            this.f15407F = new Rect();
        }

        public float a() {
            return this.f15408G;
        }

        public void b(float f4) {
            this.f15409H = f4;
            invalidateSelf();
        }

        public void c(float f4) {
            this.f15408G = f4;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(@N Canvas canvas) {
            boolean z3;
            copyBounds(this.f15407F);
            canvas.save();
            int i4 = 1;
            if (C0823k0.Z(a.this.f15391a.getWindow().getDecorView()) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i4 = -1;
            }
            float width = this.f15407F.width();
            canvas.translate((-this.f15409H) * width * this.f15408G * i4, 0.0f);
            if (z3 && !this.f15406E) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public a(Activity activity, androidx.drawerlayout.widget.a aVar, @InterfaceC0578v int i4, @c0 int i5, @c0 int i6) {
        this(activity, aVar, !e(activity), i4, i5, i6);
    }

    private static boolean e(Context context) {
        if (context.getApplicationInfo().targetSdkVersion >= 21) {
            return true;
        }
        return false;
    }

    private Drawable f() {
        Context context;
        InterfaceC0133a interfaceC0133a = this.f15392b;
        if (interfaceC0133a != null) {
            return interfaceC0133a.b();
        }
        ActionBar actionBar = this.f15391a.getActionBar();
        if (actionBar != null) {
            context = actionBar.getThemedContext();
        } else {
            context = this.f15391a;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f15388n, R.attr.actionBarStyle, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    private void j(int i4) {
        InterfaceC0133a interfaceC0133a = this.f15392b;
        if (interfaceC0133a != null) {
            interfaceC0133a.c(i4);
            return;
        }
        ActionBar actionBar = this.f15391a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i4);
        }
    }

    private void k(Drawable drawable, int i4) {
        InterfaceC0133a interfaceC0133a = this.f15392b;
        if (interfaceC0133a != null) {
            interfaceC0133a.a(drawable, i4);
            return;
        }
        ActionBar actionBar = this.f15391a.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i4);
        }
    }

    @Override // androidx.drawerlayout.widget.a.e
    public void a(View view) {
        this.f15398h.c(1.0f);
        if (this.f15394d) {
            j(this.f15401k);
        }
    }

    @Override // androidx.drawerlayout.widget.a.e
    public void b(View view) {
        this.f15398h.c(0.0f);
        if (this.f15394d) {
            j(this.f15400j);
        }
    }

    @Override // androidx.drawerlayout.widget.a.e
    public void c(int i4) {
    }

    @Override // androidx.drawerlayout.widget.a.e
    public void d(View view, float f4) {
        float min;
        float a4 = this.f15398h.a();
        if (f4 > 0.5f) {
            min = Math.max(a4, Math.max(0.0f, f4 - 0.5f) * 2.0f);
        } else {
            min = Math.min(a4, f4 * 2.0f);
        }
        this.f15398h.c(min);
    }

    public boolean g() {
        return this.f15394d;
    }

    public void h(Configuration configuration) {
        if (!this.f15395e) {
            this.f15396f = f();
        }
        this.f15397g = C0669d.i(this.f15391a, this.f15399i);
        o();
    }

    public boolean i(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.f15394d) {
            if (this.f15393c.F(C.f13101b)) {
                this.f15393c.d(C.f13101b);
                return true;
            }
            this.f15393c.K(C.f13101b);
            return true;
        }
        return false;
    }

    public void l(boolean z3) {
        int i4;
        if (z3 != this.f15394d) {
            if (z3) {
                d dVar = this.f15398h;
                if (this.f15393c.C(C.f13101b)) {
                    i4 = this.f15401k;
                } else {
                    i4 = this.f15400j;
                }
                k(dVar, i4);
            } else {
                k(this.f15396f, 0);
            }
            this.f15394d = z3;
        }
    }

    public void m(int i4) {
        Drawable drawable;
        if (i4 != 0) {
            drawable = C0669d.i(this.f15391a, i4);
        } else {
            drawable = null;
        }
        n(drawable);
    }

    public void n(Drawable drawable) {
        if (drawable == null) {
            this.f15396f = f();
            this.f15395e = false;
        } else {
            this.f15396f = drawable;
            this.f15395e = true;
        }
        if (!this.f15394d) {
            k(this.f15396f, 0);
        }
    }

    public void o() {
        int i4;
        if (this.f15393c.C(C.f13101b)) {
            this.f15398h.c(1.0f);
        } else {
            this.f15398h.c(0.0f);
        }
        if (this.f15394d) {
            d dVar = this.f15398h;
            if (this.f15393c.C(C.f13101b)) {
                i4 = this.f15401k;
            } else {
                i4 = this.f15400j;
            }
            k(dVar, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Activity activity, androidx.drawerlayout.widget.a aVar, boolean z3, @InterfaceC0578v int i4, @c0 int i5, @c0 int i6) {
        this.f15394d = true;
        this.f15391a = activity;
        if (activity instanceof b) {
            this.f15392b = ((b) activity).a();
        } else {
            this.f15392b = null;
        }
        this.f15393c = aVar;
        this.f15399i = i4;
        this.f15400j = i5;
        this.f15401k = i6;
        this.f15396f = f();
        this.f15397g = C0669d.i(activity, i4);
        d dVar = new d(this.f15397g);
        this.f15398h = dVar;
        dVar.b(z3 ? f15389o : 0.0f);
    }
}
