package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.InterfaceC0566i;
import androidx.annotation.RestrictTo;
import androidx.core.os.C0738a;
import androidx.core.view.E;
import androidx.lifecycle.Lifecycle;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC0637l extends Activity implements androidx.lifecycle.E, E.a {

    /* renamed from: E, reason: collision with root package name */
    private androidx.collection.l<Class<? extends a>, a> f11962E = new androidx.collection.l<>();

    /* renamed from: F, reason: collision with root package name */
    private androidx.lifecycle.G f11963F = new androidx.lifecycle.G(this);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    /* renamed from: androidx.core.app.l$a */
    /* loaded from: classes.dex */
    public static class a {
    }

    @androidx.annotation.S(markerClass = {C0738a.InterfaceC0093a.class})
    private static boolean F(@androidx.annotation.P String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c4 = 0;
                    break;
                }
                break;
            case 100470631:
                if (str.equals("--dump-dumpable")) {
                    c4 = 1;
                    break;
                }
                break;
            case 472614934:
                if (str.equals("--list-dumpables")) {
                    c4 = 2;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c4 = 3;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c4 = 4;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                if (Build.VERSION.SDK_INT < 31) {
                    return false;
                }
                return true;
            case 1:
            case 2:
                return C0738a.k();
            case 3:
                if (Build.VERSION.SDK_INT < 29) {
                    return false;
                }
                return true;
            case 4:
                if (Build.VERSION.SDK_INT < 26) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public <T extends a> T C(Class<T> cls) {
        return (T) this.f11962E.get(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public void D(a aVar) {
        this.f11962E.put(aVar.getClass(), aVar);
    }

    protected final boolean E(@androidx.annotation.P String[] strArr) {
        return !F(strArr);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && androidx.core.view.E.d(decorView, keyEvent)) {
            return true;
        }
        return androidx.core.view.E.e(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && androidx.core.view.E.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @androidx.annotation.N
    public Lifecycle getLifecycle() {
        return this.f11963F;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(@androidx.annotation.P Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.X.g(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @InterfaceC0566i
    public void onSaveInstanceState(@androidx.annotation.N Bundle bundle) {
        this.f11963F.n(Lifecycle.State.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.core.view.E.a
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean u(@androidx.annotation.N KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
