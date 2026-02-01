package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.view.C0807f;
import androidx.core.view.InterfaceC0796b0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class s implements InterfaceC0796b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13842a = "ReceiveContent";

    /* JADX INFO: Access modifiers changed from: private */
    @W(16)
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        static CharSequence a(@N Context context, @N ClipData.Item item, int i4) {
            if ((i4 & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                if (coerceToText instanceof Spanned) {
                    return coerceToText.toString();
                }
                return coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        static CharSequence a(@N Context context, @N ClipData.Item item, int i4) {
            CharSequence coerceToText = item.coerceToText(context);
            if ((i4 & 1) != 0 && (coerceToText instanceof Spanned)) {
                return coerceToText.toString();
            }
            return coerceToText;
        }
    }

    private static CharSequence b(@N Context context, @N ClipData.Item item, int i4) {
        return a.a(context, item, i4);
    }

    private static void c(@N Editable editable, @N CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.InterfaceC0796b0
    @P
    public C0807f a(@N View view, @N C0807f c0807f) {
        if (Log.isLoggable(f13842a, 3)) {
            Log.d(f13842a, "onReceive: " + c0807f);
        }
        if (c0807f.g() == 2) {
            return c0807f;
        }
        ClipData c4 = c0807f.c();
        int e4 = c0807f.e();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z3 = false;
        for (int i4 = 0; i4 < c4.getItemCount(); i4++) {
            CharSequence b4 = b(context, c4.getItemAt(i4), e4);
            if (b4 != null) {
                if (!z3) {
                    c(editable, b4);
                    z3 = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b4);
                }
            }
        }
        return null;
    }
}
