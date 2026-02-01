package X0;

import T0.a;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.InterfaceC0562e;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.U;
import androidx.annotation.c0;
import androidx.annotation.d0;
import androidx.annotation.r;
import androidx.appcompat.app.DialogInterfaceC0586d;
import androidx.appcompat.view.d;
import androidx.core.view.C0823k0;
import com.google.android.material.color.s;
import com.google.android.material.shape.j;
import d1.C2044a;

/* loaded from: classes2.dex */
public class b extends DialogInterfaceC0586d.a {

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f3814e = a.c.f1845L;

    /* renamed from: f, reason: collision with root package name */
    @d0
    private static final int f3815f = a.n.w4;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC0563f
    private static final int f3816g = a.c.Fa;

    /* renamed from: c, reason: collision with root package name */
    @P
    private Drawable f3817c;

    /* renamed from: d, reason: collision with root package name */
    @N
    @r
    private final Rect f3818d;

    public b(@N Context context) {
        this(context, 0);
    }

    private static Context P(@N Context context) {
        int R3 = R(context);
        Context c4 = C2044a.c(context, null, f3814e, f3815f);
        if (R3 == 0) {
            return c4;
        }
        return new d(c4, R3);
    }

    private static int R(@N Context context) {
        TypedValue a4 = com.google.android.material.resources.b.a(context, f3816g);
        if (a4 == null) {
            return 0;
        }
        return a4.data;
    }

    private static int S(@N Context context, int i4) {
        if (i4 == 0) {
            return R(context);
        }
        return i4;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public b G(@P Cursor cursor, int i4, @N String str, @P DialogInterface.OnClickListener onClickListener) {
        return (b) super.G(cursor, i4, str, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public b H(@P ListAdapter listAdapter, int i4, @P DialogInterface.OnClickListener onClickListener) {
        return (b) super.H(listAdapter, i4, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public b I(@P CharSequence[] charSequenceArr, int i4, @P DialogInterface.OnClickListener onClickListener) {
        return (b) super.I(charSequenceArr, i4, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public b J(@c0 int i4) {
        return (b) super.J(i4);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public b K(@P CharSequence charSequence) {
        return (b) super.K(charSequence);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public b L(int i4) {
        return (b) super.L(i4);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public b M(@P View view) {
        return (b) super.M(view);
    }

    @P
    public Drawable Q() {
        return this.f3817c;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public b c(@P ListAdapter listAdapter, @P DialogInterface.OnClickListener onClickListener) {
        return (b) super.c(listAdapter, onClickListener);
    }

    @N
    public b U(@P Drawable drawable) {
        this.f3817c = drawable;
        return this;
    }

    @N
    public b V(@U int i4) {
        this.f3818d.bottom = i4;
        return this;
    }

    @N
    public b W(@U int i4) {
        if (b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f3818d.left = i4;
        } else {
            this.f3818d.right = i4;
        }
        return this;
    }

    @N
    public b X(@U int i4) {
        if (b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f3818d.right = i4;
        } else {
            this.f3818d.left = i4;
        }
        return this;
    }

    @N
    public b Y(@U int i4) {
        this.f3818d.top = i4;
        return this;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b d(boolean z3) {
        return (b) super.d(z3);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    public DialogInterfaceC0586d a() {
        DialogInterfaceC0586d a4 = super.a();
        Window window = a4.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f3817c;
        if (drawable instanceof j) {
            ((j) drawable).n0(C0823k0.R(decorView));
        }
        window.setBackgroundDrawable(c.b(this.f3817c, this.f3818d));
        decorView.setOnTouchListener(new a(a4, this.f3818d));
        return a4;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public b e(@P Cursor cursor, @P DialogInterface.OnClickListener onClickListener, @N String str) {
        return (b) super.e(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public b f(@P View view) {
        return (b) super.f(view);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public b g(@InterfaceC0578v int i4) {
        return (b) super.g(i4);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b h(@P Drawable drawable) {
        return (b) super.h(drawable);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b i(@InterfaceC0563f int i4) {
        return (b) super.i(i4);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b k(@InterfaceC0562e int i4, @P DialogInterface.OnClickListener onClickListener) {
        return (b) super.k(i4, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public b l(@P CharSequence[] charSequenceArr, @P DialogInterface.OnClickListener onClickListener) {
        return (b) super.l(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public b m(@c0 int i4) {
        return (b) super.m(i4);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public b n(@P CharSequence charSequence) {
        return (b) super.n(charSequence);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public b o(@InterfaceC0562e int i4, @P boolean[] zArr, @P DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.o(i4, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public b p(@P Cursor cursor, @N String str, @N String str2, @P DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.p(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public b q(@P CharSequence[] charSequenceArr, @P boolean[] zArr, @P DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.q(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public b r(@c0 int i4, @P DialogInterface.OnClickListener onClickListener) {
        return (b) super.r(i4, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public b s(@P CharSequence charSequence, @P DialogInterface.OnClickListener onClickListener) {
        return (b) super.s(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public b t(@P Drawable drawable) {
        return (b) super.t(drawable);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public b u(@c0 int i4, @P DialogInterface.OnClickListener onClickListener) {
        return (b) super.u(i4, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public b v(@P CharSequence charSequence, @P DialogInterface.OnClickListener onClickListener) {
        return (b) super.v(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public b w(@P Drawable drawable) {
        return (b) super.w(drawable);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public b x(@P DialogInterface.OnCancelListener onCancelListener) {
        return (b) super.x(onCancelListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public b y(@P DialogInterface.OnDismissListener onDismissListener) {
        return (b) super.y(onDismissListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public b z(@P AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (b) super.z(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public b A(@P DialogInterface.OnKeyListener onKeyListener) {
        return (b) super.A(onKeyListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public b B(@c0 int i4, @P DialogInterface.OnClickListener onClickListener) {
        return (b) super.B(i4, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public b C(@P CharSequence charSequence, @P DialogInterface.OnClickListener onClickListener) {
        return (b) super.C(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public b D(@P Drawable drawable) {
        return (b) super.D(drawable);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0586d.a
    @N
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public b F(@InterfaceC0562e int i4, int i5, @P DialogInterface.OnClickListener onClickListener) {
        return (b) super.F(i4, i5, onClickListener);
    }

    public b(@N Context context, int i4) {
        super(P(context), S(context, i4));
        Context b4 = b();
        Resources.Theme theme = b4.getTheme();
        int i5 = f3814e;
        int i6 = f3815f;
        this.f3818d = c.a(b4, i5, i6);
        int c4 = s.c(b4, a.c.f1979o3, getClass().getCanonicalName());
        j jVar = new j(b4, null, i5, i6);
        jVar.Z(b4);
        jVar.o0(ColorStateList.valueOf(c4));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                jVar.k0(dimension);
            }
        }
        this.f3817c = jVar;
    }
}
