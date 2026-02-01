package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.W;
import androidx.core.os.C0742e;

/* renamed from: androidx.core.content.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0667b {

    @W(16)
    /* renamed from: androidx.core.content.b$a */
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @InterfaceC0577u
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }

    private C0667b() {
    }

    @androidx.annotation.P
    public static Cursor a(@androidx.annotation.N ContentResolver contentResolver, @androidx.annotation.N Uri uri, @androidx.annotation.P String[] strArr, @androidx.annotation.P String str, @androidx.annotation.P String[] strArr2, @androidx.annotation.P String str2, @androidx.annotation.P C0742e c0742e) {
        Object b4;
        if (c0742e != null) {
            try {
                b4 = c0742e.b();
            } catch (Exception e4) {
                if (e4 instanceof OperationCanceledException) {
                    throw new androidx.core.os.OperationCanceledException();
                }
                throw e4;
            }
        } else {
            b4 = null;
        }
        return a.a(contentResolver, uri, strArr, str, strArr2, str2, (CancellationSignal) b4);
    }
}
