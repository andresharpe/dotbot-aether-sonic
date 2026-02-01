package com.bumptech.glide.load;

import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.W;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.F;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f25774a = 5242880;

    /* loaded from: classes.dex */
    class a implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f25775a;

        a(InputStream inputStream) {
            this.f25775a = inputStream;
        }

        @Override // com.bumptech.glide.load.b.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f25775a);
            } finally {
                this.f25775a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0223b implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f25776a;

        C0223b(ByteBuffer byteBuffer) {
            this.f25776a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.b.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.a(this.f25776a);
        }
    }

    /* loaded from: classes.dex */
    class c implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f25777a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f25778b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f25777a = parcelFileDescriptorRewinder;
            this.f25778b = bVar;
        }

        @Override // com.bumptech.glide.load.b.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            F f4 = null;
            try {
                F f5 = new F(new FileInputStream(this.f25777a.a().getFileDescriptor()), this.f25778b);
                try {
                    ImageHeaderParser.ImageType c4 = imageHeaderParser.c(f5);
                    try {
                        f5.close();
                    } catch (IOException unused) {
                    }
                    this.f25777a.a();
                    return c4;
                } catch (Throwable th) {
                    th = th;
                    f4 = f5;
                    if (f4 != null) {
                        try {
                            f4.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f25777a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f25779a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f25780b;

        d(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f25779a = inputStream;
            this.f25780b = bVar;
        }

        @Override // com.bumptech.glide.load.b.f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f25779a, this.f25780b);
            } finally {
                this.f25779a.reset();
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f25781a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f25782b;

        e(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f25781a = parcelFileDescriptorRewinder;
            this.f25782b = bVar;
        }

        @Override // com.bumptech.glide.load.b.f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            F f4 = null;
            try {
                F f5 = new F(new FileInputStream(this.f25781a.a().getFileDescriptor()), this.f25782b);
                try {
                    int d4 = imageHeaderParser.d(f5, this.f25782b);
                    try {
                        f5.close();
                    } catch (IOException unused) {
                    }
                    this.f25781a.a();
                    return d4;
                } catch (Throwable th) {
                    th = th;
                    f4 = f5;
                    if (f4 != null) {
                        try {
                            f4.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f25781a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface f {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface g {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private b() {
    }

    @W(21)
    public static int a(@N List<ImageHeaderParser> list, @N ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @N com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return c(list, new e(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(@N List<ImageHeaderParser> list, @P InputStream inputStream, @N com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new F(inputStream, bVar);
        }
        inputStream.mark(f25774a);
        return c(list, new d(inputStream, bVar));
    }

    private static int c(@N List<ImageHeaderParser> list, f fVar) throws IOException {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int a4 = fVar.a(list.get(i4));
            if (a4 != -1) {
                return a4;
            }
        }
        return -1;
    }

    @N
    @W(21)
    public static ImageHeaderParser.ImageType d(@N List<ImageHeaderParser> list, @N ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @N com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return g(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    @N
    public static ImageHeaderParser.ImageType e(@N List<ImageHeaderParser> list, @P InputStream inputStream, @N com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new F(inputStream, bVar);
        }
        inputStream.mark(f25774a);
        return g(list, new a(inputStream));
    }

    @N
    public static ImageHeaderParser.ImageType f(@N List<ImageHeaderParser> list, @P ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return g(list, new C0223b(byteBuffer));
    }

    @N
    private static ImageHeaderParser.ImageType g(@N List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ImageHeaderParser.ImageType a4 = gVar.a(list.get(i4));
            if (a4 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a4;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
