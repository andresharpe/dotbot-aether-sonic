package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.InterfaceC0577u;
import androidx.core.view.C0807f;
import androidx.core.view.C0823k0;

/* renamed from: androidx.appcompat.widget.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0608v {

    /* renamed from: a, reason: collision with root package name */
    private static final String f6322a = "ReceiveContent";

    @androidx.annotation.W(24)
    /* renamed from: androidx.appcompat.widget.v$a */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        @InterfaceC0577u
        static boolean a(@androidx.annotation.N DragEvent dragEvent, @androidx.annotation.N TextView textView, @androidx.annotation.N Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C0823k0.m1(textView, new C0807f.b(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        @InterfaceC0577u
        static boolean b(@androidx.annotation.N DragEvent dragEvent, @androidx.annotation.N View view, @androidx.annotation.N Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C0823k0.m1(view, new C0807f.b(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    private C0608v() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(@androidx.annotation.N View view, @androidx.annotation.N DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C0823k0.h0(view) != null) {
            Activity c4 = c(view);
            if (c4 == null) {
                Log.i(f6322a, "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                if (view instanceof TextView) {
                    return a.a(dragEvent, (TextView) view, c4);
                }
                return a.b(dragEvent, view, c4);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(@androidx.annotation.N TextView textView, int i4) {
        ClipData primaryClip;
        int i5 = 0;
        if (Build.VERSION.SDK_INT >= 31 || C0823k0.h0(textView) == null || (i4 != 16908322 && i4 != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            primaryClip = null;
        } else {
            primaryClip = clipboardManager.getPrimaryClip();
        }
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C0807f.b bVar = new C0807f.b(primaryClip, 1);
            if (i4 != 16908322) {
                i5 = 1;
            }
            C0823k0.m1(textView, bVar.d(i5).a());
        }
        return true;
    }

    @androidx.annotation.P
    static Activity c(@androidx.annotation.N View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
