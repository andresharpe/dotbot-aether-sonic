package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.d0;
import androidx.lifecycle.E;
import androidx.lifecycle.G;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.s0;
import kotlin.jvm.internal.C2197u;
import kotlin.jvm.internal.F;

/* loaded from: classes.dex */
public class i extends Dialog implements E, o {

    /* renamed from: E, reason: collision with root package name */
    @l3.e
    private G f4497E;

    /* renamed from: F, reason: collision with root package name */
    @l3.d
    private final OnBackPressedDispatcher f4498F;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @W2.j
    public i(@l3.d Context context) {
        this(context, 0, 2, null);
        F.p(context, "context");
    }

    private final G b() {
        G g4 = this.f4497E;
        if (g4 == null) {
            G g5 = new G(this);
            this.f4497E = g5;
            return g5;
        }
        return g4;
    }

    private static /* synthetic */ void c() {
    }

    private final void e() {
        Window window = getWindow();
        F.m(window);
        s0.b(window.getDecorView(), this);
        Window window2 = getWindow();
        F.m(window2);
        View decorView = window2.getDecorView();
        F.o(decorView, "window!!.decorView");
        t.b(decorView, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(i this$0) {
        F.p(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@l3.d View view, @l3.e ViewGroup.LayoutParams layoutParams) {
        F.p(view, "view");
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.o
    @l3.d
    public final OnBackPressedDispatcher d() {
        return this.f4498F;
    }

    @Override // androidx.lifecycle.E
    @l3.d
    public final Lifecycle getLifecycle() {
        return b();
    }

    @Override // android.app.Dialog
    @InterfaceC0566i
    public void onBackPressed() {
        this.f4498F.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    @InterfaceC0566i
    public void onCreate(@l3.e Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f4498F;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackPressedDispatcher.h(onBackInvokedDispatcher);
        }
        b().l(Lifecycle.Event.ON_CREATE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    @InterfaceC0566i
    public void onStart() {
        super.onStart();
        b().l(Lifecycle.Event.ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    @InterfaceC0566i
    public void onStop() {
        b().l(Lifecycle.Event.ON_DESTROY);
        this.f4497E = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i4) {
        e();
        super.setContentView(i4);
    }

    public /* synthetic */ i(Context context, int i4, int i5, C2197u c2197u) {
        this(context, (i5 & 2) != 0 ? 0 : i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @W2.j
    public i(@l3.d Context context, @d0 int i4) {
        super(context, i4);
        F.p(context, "context");
        this.f4498F = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.h
            @Override // java.lang.Runnable
            public final void run() {
                i.f(i.this);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(@l3.d View view) {
        F.p(view, "view");
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@l3.d View view, @l3.e ViewGroup.LayoutParams layoutParams) {
        F.p(view, "view");
        e();
        super.setContentView(view, layoutParams);
    }
}
