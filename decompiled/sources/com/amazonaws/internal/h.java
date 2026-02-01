package com.amazonaws.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class h extends DigestInputStream implements c {

    /* renamed from: E, reason: collision with root package name */
    private static final int f23756E = 2048;

    /* renamed from: F, reason: collision with root package name */
    static final /* synthetic */ boolean f23757F = false;

    public h(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream, messageDigest);
    }

    @Override // com.amazonaws.internal.c
    @Deprecated
    public final boolean a() {
        if (((DigestInputStream) this).in instanceof c) {
            return ((c) ((DigestInputStream) this).in).a();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j4) throws IOException {
        if (j4 <= 0) {
            return j4;
        }
        int min = (int) Math.min(PlaybackStateCompat.f4287b0, j4);
        byte[] bArr = new byte[min];
        long j5 = j4;
        while (j5 > 0) {
            int read = read(bArr, 0, (int) Math.min(j5, min));
            if (read == -1) {
                if (j5 == j4) {
                    return -1L;
                }
                return j4 - j5;
            }
            j5 -= read;
        }
        return j4;
    }
}
