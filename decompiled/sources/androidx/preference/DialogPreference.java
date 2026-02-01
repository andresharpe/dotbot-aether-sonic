package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.preference.q;
import e.C2046a;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: A0, reason: collision with root package name */
    private CharSequence f16663A0;

    /* renamed from: B0, reason: collision with root package name */
    private CharSequence f16664B0;

    /* renamed from: C0, reason: collision with root package name */
    private int f16665C0;

    /* renamed from: x0, reason: collision with root package name */
    private CharSequence f16666x0;

    /* renamed from: y0, reason: collision with root package name */
    private CharSequence f16667y0;

    /* renamed from: z0, reason: collision with root package name */
    private Drawable f16668z0;

    /* loaded from: classes.dex */
    public interface a {
        @P
        <T extends Preference> T findPreference(@N CharSequence charSequence);
    }

    public DialogPreference(@N Context context, @P AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.k.f17204k, i4, i5);
        String o4 = androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17234u, q.k.f17207l);
        this.f16666x0 = o4;
        if (o4 == null) {
            this.f16666x0 = M();
        }
        this.f16667y0 = androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17231t, q.k.f17210m);
        this.f16668z0 = androidx.core.content.res.n.c(obtainStyledAttributes, q.k.f17225r, q.k.f17213n);
        this.f16663A0 = androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17240w, q.k.f17216o);
        this.f16664B0 = androidx.core.content.res.n.o(obtainStyledAttributes, q.k.f17237v, q.k.f17219p);
        this.f16665C0 = androidx.core.content.res.n.n(obtainStyledAttributes, q.k.f17228s, q.k.f17222q, 0);
        obtainStyledAttributes.recycle();
    }

    public void A1(@P CharSequence charSequence) {
        this.f16664B0 = charSequence;
    }

    public void B1(int i4) {
        C1(m().getString(i4));
    }

    public void C1(@P CharSequence charSequence) {
        this.f16663A0 = charSequence;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    public void e0() {
        H().I(this);
    }

    @P
    public Drawable m1() {
        return this.f16668z0;
    }

    public int n1() {
        return this.f16665C0;
    }

    @P
    public CharSequence o1() {
        return this.f16667y0;
    }

    @P
    public CharSequence p1() {
        return this.f16666x0;
    }

    @P
    public CharSequence q1() {
        return this.f16664B0;
    }

    @P
    public CharSequence r1() {
        return this.f16663A0;
    }

    public void s1(int i4) {
        this.f16668z0 = C2046a.b(m(), i4);
    }

    public void t1(@P Drawable drawable) {
        this.f16668z0 = drawable;
    }

    public void u1(int i4) {
        this.f16665C0 = i4;
    }

    public void v1(int i4) {
        w1(m().getString(i4));
    }

    public void w1(@P CharSequence charSequence) {
        this.f16667y0 = charSequence;
    }

    public void x1(int i4) {
        y1(m().getString(i4));
    }

    public void y1(@P CharSequence charSequence) {
        this.f16666x0 = charSequence;
    }

    public void z1(int i4) {
        A1(m().getString(i4));
    }

    public DialogPreference(@N Context context, @P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public DialogPreference(@N Context context, @P AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.n.a(context, q.a.f17017k, R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(@N Context context) {
        this(context, null);
    }
}
