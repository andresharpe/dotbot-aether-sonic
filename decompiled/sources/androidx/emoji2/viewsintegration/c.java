package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.F;
import androidx.annotation.N;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;

@RestrictTo({RestrictTo.Scope.LIBRARY})
@W(19)
/* loaded from: classes.dex */
final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f14575a;

    /* renamed from: b, reason: collision with root package name */
    private final a f14576b;

    /* loaded from: classes.dex */
    public static class a {
        public boolean a(@N InputConnection inputConnection, @N Editable editable, @F(from = 0) int i4, @F(from = 0) int i5, boolean z3) {
            return androidx.emoji2.text.g.g(inputConnection, editable, i4, i5, z3);
        }

        public void b(@N EditorInfo editorInfo) {
            if (androidx.emoji2.text.g.n()) {
                androidx.emoji2.text.g.b().D(editorInfo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(@N TextView textView, @N InputConnection inputConnection, @N EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    private Editable a() {
        return this.f14575a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i4, int i5) {
        if (!this.f14576b.a(this, a(), i4, i5, false) && !super.deleteSurroundingText(i4, i5)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i4, int i5) {
        if (!this.f14576b.a(this, a(), i4, i5, true) && !super.deleteSurroundingTextInCodePoints(i4, i5)) {
            return false;
        }
        return true;
    }

    c(@N TextView textView, @N InputConnection inputConnection, @N EditorInfo editorInfo, @N a aVar) {
        super(inputConnection, false);
        this.f14575a = textView;
        this.f14576b = aVar;
        aVar.b(editorInfo);
    }
}
