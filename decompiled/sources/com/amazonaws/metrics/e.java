package com.amazonaws.metrics;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.InputStreamEntity;

/* loaded from: classes.dex */
public class e extends InputStreamEntity {

    /* renamed from: b, reason: collision with root package name */
    private static final int f23824b = 2048;

    /* renamed from: a, reason: collision with root package name */
    private final a f23825a;

    public e(o oVar, InputStream inputStream, long j4) {
        super(inputStream, j4);
        this.f23825a = new a(oVar);
    }

    private void a(OutputStream outputStream) throws IOException {
        int read;
        if (outputStream != null) {
            InputStream content = getContent();
            long contentLength = getContentLength();
            try {
                byte[] bArr = new byte[2048];
                if (contentLength < 0) {
                    while (true) {
                        int read2 = content.read(bArr);
                        if (read2 == -1) {
                            break;
                        }
                        long h4 = this.f23825a.h();
                        outputStream.write(bArr, 0, read2);
                        this.f23825a.e(read2, h4);
                    }
                } else {
                    while (contentLength > 0 && (read = content.read(bArr, 0, (int) Math.min(PlaybackStateCompat.f4287b0, contentLength))) != -1) {
                        long h5 = this.f23825a.h();
                        outputStream.write(bArr, 0, read);
                        this.f23825a.e(read, h5);
                        contentLength -= read;
                    }
                }
                return;
            } finally {
                this.f23825a.g();
                content.close();
            }
        }
        throw new IllegalArgumentException("Output stream may not be null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.http.entity.InputStreamEntity, org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        if ((outputStream instanceof com.amazonaws.internal.c) && ((com.amazonaws.internal.c) outputStream).a()) {
            super.writeTo(outputStream);
        } else {
            a(outputStream);
        }
    }
}
