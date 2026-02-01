package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.InterfaceC0577u;

/* renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0612z {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.N
    private TextView f6364a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.P
    private TextClassifier f6365b;

    @androidx.annotation.W(26)
    /* renamed from: androidx.appcompat.widget.z$a */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        @InterfaceC0577u
        @androidx.annotation.N
        static TextClassifier a(@androidx.annotation.N TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0612z(@androidx.annotation.N TextView textView) {
        this.f6364a = (TextView) androidx.core.util.u.l(textView);
    }

    @androidx.annotation.N
    @androidx.annotation.W(api = 26)
    public TextClassifier a() {
        TextClassifier textClassifier = this.f6365b;
        if (textClassifier == null) {
            return a.a(this.f6364a);
        }
        return textClassifier;
    }

    @androidx.annotation.W(api = 26)
    public void b(@androidx.annotation.P TextClassifier textClassifier) {
        this.f6365b = textClassifier;
    }
}
