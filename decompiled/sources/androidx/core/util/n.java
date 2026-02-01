package androidx.core.util;

import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.Writer;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
/* loaded from: classes.dex */
public class n extends Writer {

    /* renamed from: E, reason: collision with root package name */
    private final String f13019E;

    /* renamed from: F, reason: collision with root package name */
    private StringBuilder f13020F = new StringBuilder(128);

    public n(String str) {
        this.f13019E = str;
    }

    private void a() {
        if (this.f13020F.length() > 0) {
            Log.d(this.f13019E, this.f13020F.toString());
            StringBuilder sb = this.f13020F;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i4, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c4 = cArr[i4 + i6];
            if (c4 == '\n') {
                a();
            } else {
                this.f13020F.append(c4);
            }
        }
    }
}
