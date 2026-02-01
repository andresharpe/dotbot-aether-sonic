package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.P;
import androidx.annotation.W;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
interface B {

    /* loaded from: classes.dex */
    public static final class a implements B {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f26416a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f26417b;

        /* renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f26418c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(InputStream inputStream, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f26417b = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.l.d(bVar);
            this.f26418c = (List) com.bumptech.glide.util.l.d(list);
            this.f26416a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public int a() throws IOException {
            return com.bumptech.glide.load.b.b(this.f26418c, this.f26416a.a(), this.f26417b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        @P
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f26416a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public void c() {
            this.f26416a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.b.e(this.f26418c, this.f26416a.a(), this.f26417b);
        }
    }

    @W(21)
    /* loaded from: classes.dex */
    public static final class b implements B {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f26419a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f26420b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f26421c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f26419a = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.l.d(bVar);
            this.f26420b = (List) com.bumptech.glide.util.l.d(list);
            this.f26421c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public int a() throws IOException {
            return com.bumptech.glide.load.b.a(this.f26420b, this.f26421c, this.f26419a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        @P
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f26421c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public void c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.B
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.b.d(this.f26420b, this.f26421c, this.f26419a);
        }
    }

    int a() throws IOException;

    @P
    Bitmap b(BitmapFactory.Options options) throws IOException;

    void c();

    ImageHeaderParser.ImageType d() throws IOException;
}
