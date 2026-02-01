package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.N;
import androidx.appcompat.app.DialogInterfaceC0586d;
import androidx.appcompat.view.menu.n;
import androidx.core.view.C0805e0;
import d.C2042a;

/* loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, n.a {

    /* renamed from: E, reason: collision with root package name */
    private g f5360E;

    /* renamed from: F, reason: collision with root package name */
    private DialogInterfaceC0586d f5361F;

    /* renamed from: G, reason: collision with root package name */
    e f5362G;

    /* renamed from: H, reason: collision with root package name */
    private n.a f5363H;

    public h(g gVar) {
        this.f5360E = gVar;
    }

    public void a() {
        DialogInterfaceC0586d dialogInterfaceC0586d = this.f5361F;
        if (dialogInterfaceC0586d != null) {
            dialogInterfaceC0586d.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void b(@N g gVar, boolean z3) {
        if (z3 || gVar == this.f5360E) {
            a();
        }
        n.a aVar = this.f5363H;
        if (aVar != null) {
            aVar.b(gVar, z3);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean c(@N g gVar) {
        n.a aVar = this.f5363H;
        if (aVar != null) {
            return aVar.c(gVar);
        }
        return false;
    }

    public void d(n.a aVar) {
        this.f5363H = aVar;
    }

    public void e(IBinder iBinder) {
        g gVar = this.f5360E;
        DialogInterfaceC0586d.a aVar = new DialogInterfaceC0586d.a(gVar.x());
        e eVar = new e(aVar.b(), C2042a.j.f49701q);
        this.f5362G = eVar;
        eVar.h(this);
        this.f5360E.b(this.f5362G);
        aVar.c(this.f5362G.a(), this);
        View B3 = gVar.B();
        if (B3 != null) {
            aVar.f(B3);
        } else {
            aVar.h(gVar.z()).K(gVar.A());
        }
        aVar.A(this);
        DialogInterfaceC0586d a4 = aVar.a();
        this.f5361F = a4;
        a4.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f5361F.getWindow().getAttributes();
        attributes.type = C0805e0.f13470f;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f5361F.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i4) {
        this.f5360E.O((j) this.f5362G.a().getItem(i4), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f5362G.b(this.f5360E, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i4 == 82 || i4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f5361F.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f5361F.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f5360E.f(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f5360E.performShortcut(i4, keyEvent, 0);
    }
}
