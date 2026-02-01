package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.N;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public class j implements com.bumptech.glide.load.g<InputStream, c> {

    /* renamed from: d, reason: collision with root package name */
    private static final String f26628d = "StreamGifDecoder";

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f26629a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.g<ByteBuffer, c> f26630b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f26631c;

    public j(List<ImageHeaderParser> list, com.bumptech.glide.load.g<ByteBuffer, c> gVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f26629a = list;
        this.f26630b = gVar;
        this.f26631c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e4) {
            if (Log.isLoggable(f26628d, 5)) {
                Log.w(f26628d, "Error reading data from stream", e4);
                return null;
            }
            return null;
        }
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public u<c> b(@N InputStream inputStream, int i4, int i5, @N com.bumptech.glide.load.f fVar) throws IOException {
        byte[] e4 = e(inputStream);
        if (e4 == null) {
            return null;
        }
        return this.f26630b.b(ByteBuffer.wrap(e4), i4, i5, fVar);
    }

    @Override // com.bumptech.glide.load.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N InputStream inputStream, @N com.bumptech.glide.load.f fVar) throws IOException {
        if (!((Boolean) fVar.c(i.f26627b)).booleanValue() && com.bumptech.glide.load.b.e(this.f26629a, inputStream, this.f26631c) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }
}
