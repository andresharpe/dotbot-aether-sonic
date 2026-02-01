package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.N;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.model.n;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class d implements n<File, ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26279a = "ByteBufferFileLoader";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: E, reason: collision with root package name */
        private final File f26280E;

        a(File file) {
            this.f26280E = file;
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        @N
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(@N Priority priority, @N d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(com.bumptech.glide.util.a.a(this.f26280E));
            } catch (IOException e4) {
                if (Log.isLoggable(d.f26279a, 3)) {
                    Log.d(d.f26279a, "Failed to obtain ByteBuffer for file", e4);
                }
                aVar.c(e4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.model.o
        public void a() {
        }

        @Override // com.bumptech.glide.load.model.o
        @N
        public n<File, ByteBuffer> c(@N r rVar) {
            return new d();
        }
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<ByteBuffer> b(@N File file, int i4, int i5, @N com.bumptech.glide.load.f fVar) {
        return new n.a<>(new com.bumptech.glide.signature.e(file), new a(file));
    }

    @Override // com.bumptech.glide.load.model.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@N File file) {
        return true;
    }
}
