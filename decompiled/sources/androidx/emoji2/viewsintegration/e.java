package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@W(19)
/* loaded from: classes.dex */
final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    private final KeyListener f14581a;

    /* renamed from: b, reason: collision with root package name */
    private final a f14582b;

    /* loaded from: classes.dex */
    public static class a {
        public boolean a(@N Editable editable, int i4, @N KeyEvent keyEvent) {
            return androidx.emoji2.text.g.h(editable, i4, keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i4) {
        this.f14581a.clearMetaKeyState(view, editable, i4);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f14581a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i4, KeyEvent keyEvent) {
        if (!this.f14582b.a(editable, i4, keyEvent) && !this.f14581a.onKeyDown(view, editable, i4, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f14581a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i4, KeyEvent keyEvent) {
        return this.f14581a.onKeyUp(view, editable, i4, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f14581a = keyListener;
        this.f14582b = aVar;
    }
}
