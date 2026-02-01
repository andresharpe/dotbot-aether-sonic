package okio;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface z extends Closeable {
    long P0(C2385c c2385c, long j4) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    A timeout();
}
