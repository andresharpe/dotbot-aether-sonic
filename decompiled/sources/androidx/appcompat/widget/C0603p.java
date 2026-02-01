package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0603p {
    private C0603p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof r0) {
                    editorInfo.hintText = ((r0) parent).a();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }
}
