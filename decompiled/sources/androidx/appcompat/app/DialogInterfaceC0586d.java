package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.InterfaceC0562e;
import androidx.annotation.InterfaceC0563f;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.c0;
import androidx.annotation.d0;
import androidx.appcompat.app.AlertController;
import d.C2042a;

/* renamed from: androidx.appcompat.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceC0586d extends t implements DialogInterface {

    /* renamed from: J, reason: collision with root package name */
    static final int f4840J = 0;

    /* renamed from: K, reason: collision with root package name */
    static final int f4841K = 1;

    /* renamed from: I, reason: collision with root package name */
    final AlertController f4842I;

    /* renamed from: androidx.appcompat.app.d$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.f f4843a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4844b;

        public a(@N Context context) {
            this(context, DialogInterfaceC0586d.p(context, 0));
        }

        public a A(DialogInterface.OnKeyListener onKeyListener) {
            this.f4843a.f4697u = onKeyListener;
            return this;
        }

        public a B(@c0 int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4685i = fVar.f4677a.getText(i4);
            this.f4843a.f4687k = onClickListener;
            return this;
        }

        public a C(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4685i = charSequence;
            fVar.f4687k = onClickListener;
            return this;
        }

        public a D(Drawable drawable) {
            this.f4843a.f4686j = drawable;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public a E(boolean z3) {
            this.f4843a.f4676Q = z3;
            return this;
        }

        public a F(@InterfaceC0562e int i4, int i5, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4698v = fVar.f4677a.getResources().getTextArray(i4);
            AlertController.f fVar2 = this.f4843a;
            fVar2.f4700x = onClickListener;
            fVar2.f4668I = i5;
            fVar2.f4667H = true;
            return this;
        }

        public a G(Cursor cursor, int i4, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4670K = cursor;
            fVar.f4700x = onClickListener;
            fVar.f4668I = i4;
            fVar.f4671L = str;
            fVar.f4667H = true;
            return this;
        }

        public a H(ListAdapter listAdapter, int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4699w = listAdapter;
            fVar.f4700x = onClickListener;
            fVar.f4668I = i4;
            fVar.f4667H = true;
            return this;
        }

        public a I(CharSequence[] charSequenceArr, int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4698v = charSequenceArr;
            fVar.f4700x = onClickListener;
            fVar.f4668I = i4;
            fVar.f4667H = true;
            return this;
        }

        public a J(@c0 int i4) {
            AlertController.f fVar = this.f4843a;
            fVar.f4682f = fVar.f4677a.getText(i4);
            return this;
        }

        public a K(@P CharSequence charSequence) {
            this.f4843a.f4682f = charSequence;
            return this;
        }

        public a L(int i4) {
            AlertController.f fVar = this.f4843a;
            fVar.f4702z = null;
            fVar.f4701y = i4;
            fVar.f4664E = false;
            return this;
        }

        public a M(View view) {
            AlertController.f fVar = this.f4843a;
            fVar.f4702z = view;
            fVar.f4701y = 0;
            fVar.f4664E = false;
            return this;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @Deprecated
        public a N(View view, int i4, int i5, int i6, int i7) {
            AlertController.f fVar = this.f4843a;
            fVar.f4702z = view;
            fVar.f4701y = 0;
            fVar.f4664E = true;
            fVar.f4660A = i4;
            fVar.f4661B = i5;
            fVar.f4662C = i6;
            fVar.f4663D = i7;
            return this;
        }

        public DialogInterfaceC0586d O() {
            DialogInterfaceC0586d a4 = a();
            a4.show();
            return a4;
        }

        @N
        public DialogInterfaceC0586d a() {
            DialogInterfaceC0586d dialogInterfaceC0586d = new DialogInterfaceC0586d(this.f4843a.f4677a, this.f4844b);
            this.f4843a.a(dialogInterfaceC0586d.f4842I);
            dialogInterfaceC0586d.setCancelable(this.f4843a.f4694r);
            if (this.f4843a.f4694r) {
                dialogInterfaceC0586d.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0586d.setOnCancelListener(this.f4843a.f4695s);
            dialogInterfaceC0586d.setOnDismissListener(this.f4843a.f4696t);
            DialogInterface.OnKeyListener onKeyListener = this.f4843a.f4697u;
            if (onKeyListener != null) {
                dialogInterfaceC0586d.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0586d;
        }

        @N
        public Context b() {
            return this.f4843a.f4677a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4699w = listAdapter;
            fVar.f4700x = onClickListener;
            return this;
        }

        public a d(boolean z3) {
            this.f4843a.f4694r = z3;
            return this;
        }

        public a e(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.f fVar = this.f4843a;
            fVar.f4670K = cursor;
            fVar.f4671L = str;
            fVar.f4700x = onClickListener;
            return this;
        }

        public a f(@P View view) {
            this.f4843a.f4683g = view;
            return this;
        }

        public a g(@InterfaceC0578v int i4) {
            this.f4843a.f4679c = i4;
            return this;
        }

        public a h(@P Drawable drawable) {
            this.f4843a.f4680d = drawable;
            return this;
        }

        public a i(@InterfaceC0563f int i4) {
            TypedValue typedValue = new TypedValue();
            this.f4843a.f4677a.getTheme().resolveAttribute(i4, typedValue, true);
            this.f4843a.f4679c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a j(boolean z3) {
            this.f4843a.f4673N = z3;
            return this;
        }

        public a k(@InterfaceC0562e int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4698v = fVar.f4677a.getResources().getTextArray(i4);
            this.f4843a.f4700x = onClickListener;
            return this;
        }

        public a l(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4698v = charSequenceArr;
            fVar.f4700x = onClickListener;
            return this;
        }

        public a m(@c0 int i4) {
            AlertController.f fVar = this.f4843a;
            fVar.f4684h = fVar.f4677a.getText(i4);
            return this;
        }

        public a n(@P CharSequence charSequence) {
            this.f4843a.f4684h = charSequence;
            return this;
        }

        public a o(@InterfaceC0562e int i4, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4698v = fVar.f4677a.getResources().getTextArray(i4);
            AlertController.f fVar2 = this.f4843a;
            fVar2.f4669J = onMultiChoiceClickListener;
            fVar2.f4665F = zArr;
            fVar2.f4666G = true;
            return this;
        }

        public a p(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4670K = cursor;
            fVar.f4669J = onMultiChoiceClickListener;
            fVar.f4672M = str;
            fVar.f4671L = str2;
            fVar.f4666G = true;
            return this;
        }

        public a q(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4698v = charSequenceArr;
            fVar.f4669J = onMultiChoiceClickListener;
            fVar.f4665F = zArr;
            fVar.f4666G = true;
            return this;
        }

        public a r(@c0 int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4688l = fVar.f4677a.getText(i4);
            this.f4843a.f4690n = onClickListener;
            return this;
        }

        public a s(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4688l = charSequence;
            fVar.f4690n = onClickListener;
            return this;
        }

        public a t(Drawable drawable) {
            this.f4843a.f4689m = drawable;
            return this;
        }

        public a u(@c0 int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4691o = fVar.f4677a.getText(i4);
            this.f4843a.f4693q = onClickListener;
            return this;
        }

        public a v(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f4843a;
            fVar.f4691o = charSequence;
            fVar.f4693q = onClickListener;
            return this;
        }

        public a w(Drawable drawable) {
            this.f4843a.f4692p = drawable;
            return this;
        }

        public a x(DialogInterface.OnCancelListener onCancelListener) {
            this.f4843a.f4695s = onCancelListener;
            return this;
        }

        public a y(DialogInterface.OnDismissListener onDismissListener) {
            this.f4843a.f4696t = onDismissListener;
            return this;
        }

        public a z(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f4843a.f4674O = onItemSelectedListener;
            return this;
        }

        public a(@N Context context, @d0 int i4) {
            this.f4843a = new AlertController.f(new ContextThemeWrapper(context, DialogInterfaceC0586d.p(context, i4)));
            this.f4844b = i4;
        }
    }

    protected DialogInterfaceC0586d(@N Context context) {
        this(context, 0);
    }

    static int p(@N Context context, @d0 int i4) {
        if (((i4 >>> 24) & 255) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2042a.b.f49143N, typedValue, true);
        return typedValue.resourceId;
    }

    public void A(View view) {
        this.f4842I.u(view);
    }

    public void B(View view, int i4, int i5, int i6, int i7) {
        this.f4842I.v(view, i4, i5, i6, i7);
    }

    public Button n(int i4) {
        return this.f4842I.c(i4);
    }

    public ListView o() {
        return this.f4842I.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.t, androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4842I.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (this.f4842I.h(i4, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (this.f4842I.i(i4, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    public void q(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f4842I.l(i4, charSequence, onClickListener, null, null);
    }

    public void r(int i4, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.f4842I.l(i4, charSequence, onClickListener, null, drawable);
    }

    @Override // androidx.appcompat.app.t, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f4842I.s(charSequence);
    }

    public void t(int i4, CharSequence charSequence, Message message) {
        this.f4842I.l(i4, charSequence, null, message, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    void u(int i4) {
        this.f4842I.m(i4);
    }

    public void v(View view) {
        this.f4842I.n(view);
    }

    public void w(int i4) {
        this.f4842I.o(i4);
    }

    public void x(Drawable drawable) {
        this.f4842I.p(drawable);
    }

    public void y(int i4) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i4, typedValue, true);
        this.f4842I.o(typedValue.resourceId);
    }

    public void z(CharSequence charSequence) {
        this.f4842I.q(charSequence);
    }

    protected DialogInterfaceC0586d(@N Context context, @d0 int i4) {
        super(context, p(context, i4));
        this.f4842I = new AlertController(getContext(), this, getWindow());
    }

    protected DialogInterfaceC0586d(@N Context context, boolean z3, @P DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z3);
        setOnCancelListener(onCancelListener);
    }
}
