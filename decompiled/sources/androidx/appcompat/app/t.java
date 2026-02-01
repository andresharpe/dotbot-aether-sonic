package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.I;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.b;
import androidx.core.view.E;
import d.C2042a;

/* loaded from: classes.dex */
public class t extends androidx.activity.i implements f {

    /* renamed from: G, reason: collision with root package name */
    private i f4985G;

    /* renamed from: H, reason: collision with root package name */
    private final E.a f4986H;

    public t(@N Context context) {
        this(context, 0);
    }

    private static int k(Context context, int i4) {
        if (i4 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C2042a.b.f49192Z0, typedValue, true);
            return typedValue.resourceId;
        }
        return i4;
    }

    @Override // androidx.activity.i, android.app.Dialog
    public void addContentView(@N View view, ViewGroup.LayoutParams layoutParams) {
        i().f(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        i().N();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.E.e(this.f4986H, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @P
    public <T extends View> T findViewById(@androidx.annotation.D int i4) {
        return (T) i().s(i4);
    }

    @Override // androidx.appcompat.app.f
    public void g(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.f
    public void h(androidx.appcompat.view.b bVar) {
    }

    @N
    public i i() {
        if (this.f4985G == null) {
            this.f4985G = i.o(this, this);
        }
        return this.f4985G;
    }

    @Override // android.app.Dialog
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void invalidateOptionsMenu() {
        i().F();
    }

    public AbstractC0583a j() {
        return i().C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean m(int i4) {
        return i().V(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        i().E();
        super.onCreate(bundle);
        i().M(bundle);
    }

    @Override // androidx.activity.i, android.app.Dialog
    protected void onStop() {
        super.onStop();
        i().S();
    }

    @Override // androidx.appcompat.app.f
    @P
    public androidx.appcompat.view.b s(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.i, android.app.Dialog
    public void setContentView(@I int i4) {
        i().Z(i4);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        i().j0(charSequence);
    }

    public t(@N Context context, int i4) {
        super(context, k(context, i4));
        this.f4986H = new E.a() { // from class: androidx.appcompat.app.s
            @Override // androidx.core.view.E.a
            public final boolean u(KeyEvent keyEvent) {
                return t.this.l(keyEvent);
            }
        };
        i i5 = i();
        i5.i0(k(context, i4));
        i5.M(null);
    }

    @Override // androidx.activity.i, android.app.Dialog
    public void setContentView(@N View view) {
        i().a0(view);
    }

    @Override // androidx.activity.i, android.app.Dialog
    public void setContentView(@N View view, ViewGroup.LayoutParams layoutParams) {
        i().b0(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i4) {
        super.setTitle(i4);
        i().j0(getContext().getString(i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public t(@N Context context, boolean z3, @P DialogInterface.OnCancelListener onCancelListener) {
        super(context);
        this.f4986H = new E.a() { // from class: androidx.appcompat.app.s
            @Override // androidx.core.view.E.a
            public final boolean u(KeyEvent keyEvent) {
                return t.this.l(keyEvent);
            }
        };
        setCancelable(z3);
        setOnCancelListener(onCancelListener);
    }
}
