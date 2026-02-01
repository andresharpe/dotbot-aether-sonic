package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.N;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class t implements com.bumptech.glide.load.a<InputStream> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f26385b = "StreamEncoder";

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f26386a;

    public t(com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f26386a = bVar;
    }

    @Override // com.bumptech.glide.load.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@N InputStream inputStream, @N File file, @N com.bumptech.glide.load.f fVar) {
        byte[] bArr = (byte[]) this.f26386a.e(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e4) {
                        e = e4;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable(f26385b, 3)) {
                            Log.d(f26385b, "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        this.f26386a.put(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f26386a.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                this.f26386a.put(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
        }
    }
}
