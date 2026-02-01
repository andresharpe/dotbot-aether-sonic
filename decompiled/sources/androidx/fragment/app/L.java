package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
final class L extends Writer {

    /* renamed from: E, reason: collision with root package name */
    private final String f15193E;

    /* renamed from: F, reason: collision with root package name */
    private StringBuilder f15194F = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public L(String str) {
        this.f15193E = str;
    }

    private void a() {
        if (this.f15194F.length() > 0) {
            Log.d(this.f15193E, this.f15194F.toString());
            StringBuilder sb = this.f15194F;
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
                this.f15194F.append(c4);
            }
        }
    }
}
